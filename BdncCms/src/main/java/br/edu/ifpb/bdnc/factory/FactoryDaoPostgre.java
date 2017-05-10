/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.factory;

import br.edu.ifpb.bdnc.daos.BlogDao;
import br.edu.ifpb.bdnc.daos.TemaDao;
import br.edu.ifpb.bdnc.daos.UserDao;
import br.edu.ifpb.bdnc.interfaces.UserDaoIf;
import br.edu.ifpb.bdnc.interfaces.FactoryDaoPostgresrIf;
import br.edu.ifpb.bdnc.interfaces.BlogDaoIf;
import br.edu.ifpb.bdnc.interfaces.TemaDaoIf;

/**
 *
 * @author PC-CASA
 */
public class FactoryDaoPostgre implements FactoryDaoPostgresrIf{
    
    private FactoryDaoPostgre instance;

    @Override
    public UserDaoIf criaUserDao() {
        return new UserDao();
    }
    
    @Override
    public BlogDaoIf criaBlogDao() {
        return new BlogDao();
    }
    
    @Override
    public TemaDaoIf criaTemaDao() {
        return new TemaDao();
    }


    
    
    
    
    
}
