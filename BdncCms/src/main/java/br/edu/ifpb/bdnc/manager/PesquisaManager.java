/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.manager;

import br.edu.ifpb.bdnc.factory.FactoryDao;
import br.edu.ifpb.bdnc.valueobjects.Pesquisa;
import java.util.List;

/**
 *
 * @author PC-CASA
 */
public class PesquisaManager {
    
    public List<Pesquisa> retornar(List<String> l){
        return FactoryDao.createFactoryRedis().criaPesquisaDao().pesquisa(l);
    }
    public String add(Pesquisa p){
        return FactoryDao.createFactoryRedis().criaPesquisaDao().add(p);
    }
    
}
