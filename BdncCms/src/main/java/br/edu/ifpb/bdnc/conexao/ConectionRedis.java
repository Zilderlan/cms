/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.conexao;

import com.google.gson.Gson;
import redis.clients.jedis.Jedis;

/**
 *
 * @author PC-CASA
 */
public class ConectionRedis {

    public static Jedis abrirConexao() {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        return jedis;
    }

}
