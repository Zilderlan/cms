/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.interfaces;

/**
 *
 * @author PC-CASA
 */
public interface FactoryDaoPostgresrIf {
    
    public UserDaoIf criaUserDao();
    
    public TemaDaoIf criaTemaDao();
    
    public BlogDaoIf criaBlogDao();
    
    
    
}
