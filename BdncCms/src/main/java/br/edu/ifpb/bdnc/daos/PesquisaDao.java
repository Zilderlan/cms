/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.daos;

import br.edu.ifpb.bdnc.conexao.ConectionRedis;
import br.edu.ifpb.bdnc.interfaces.PesquisaDaoIf;
import br.edu.ifpb.bdnc.valueobjects.Pesquisa;
import com.google.gson.Gson;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import redis.clients.jedis.Jedis;

/**
 *
 * @author PC-CASA
 */
public class PesquisaDao implements PesquisaDaoIf {

    private Instant agora = Instant.now();

    Gson gson = new Gson();
    private List<Pesquisa> pe = new ArrayList();
    private List<String> l = new ArrayList();
    private ConectionRedis conn;
    private Jedis j;
    private Pesquisa pes;

    @Override
    public List<Pesquisa> pesquisa(List<String> l) {
        pes = new Pesquisa();
        String s = agora.toEpochMilli()+"key";
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        Gson gson = new Gson();

       for (int i = 0; i < l.size(); i++){
        pes.setPesquisa(jedis.get(l.get(i)));
        pe.add(pes);
        System.out.println(pes);
       }
        
       return pe;

    }

    @Override
    public String add(Pesquisa p) {
        String s = agora.toEpochMilli()+"key";
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        Gson gson = new Gson();
        jedis.set(s, gson.toJson(p));
        return s;
        

    }

}
