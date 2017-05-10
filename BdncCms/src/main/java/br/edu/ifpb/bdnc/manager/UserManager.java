/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.manager;

import br.edu.ifpb.bdnc.factory.FactoryDao;
import br.edu.ifpb.bdnc.valueobjects.User;

/**
 *
 * @author PC-CASA
 */
public class UserManager {
    public boolean addUser(User u){
        return FactoryDao.createFactory().criaUserDao().add(u);
    }
    
    public User userLogin(User u){
        return FactoryDao.createFactory().criaUserDao().login(u);
    }
}
