/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.factory;

import br.edu.ifpb.bdnc.daos.PesquisaDao;
import br.edu.ifpb.bdnc.interfaces.FactoryDaoRedisIf;
import br.edu.ifpb.bdnc.interfaces.PesquisaDaoIf;

/**
 *
 * @author PC-CASA
 */
public class FactoryDaoRedis implements FactoryDaoRedisIf{

    @Override
    public PesquisaDaoIf criaPesquisaDao() {
        return new PesquisaDao();
    }

    
}
