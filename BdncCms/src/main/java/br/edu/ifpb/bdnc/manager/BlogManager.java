/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.manager;

import br.edu.ifpb.bdnc.factory.FactoryDao;
import br.edu.ifpb.bdnc.valueobjects.Blog;

/**
 *
 * @author PC-CASA
 */
public class BlogManager {
    
    public boolean criaBlog(String s1, String s2){
        return FactoryDao.createFactory().criaBlogDao().add(s1, s2);
    }
    
    public boolean atualizar(Blog b){
        return FactoryDao.createFactory().criaBlogDao().atualizar(b);
    }
    
    public Blog verificarUser(String s){
        return FactoryDao.createFactory().criaBlogDao().verificarExistencia(s);
    }
    
    public Blog buscarBlog(int i){
        return FactoryDao.createFactory().criaBlogDao().buscar(i);
    }
    
}
