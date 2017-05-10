/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.manager;

import br.edu.ifpb.bdnc.factory.FactoryDao;
import br.edu.ifpb.bdnc.valueobjects.Blog;
import br.edu.ifpb.bdnc.valueobjects.Tema;
import java.util.List;

/**
 *
 * @author PC-CASA
 */
public class TemaManager {
    
    public boolean addTema(Tema t){
        return FactoryDao.createFactory().criaTemaDao().add(t);
    }
    
    public Tema buscarTema(String id){
        return FactoryDao.createFactory().criaTemaDao().buscar(id);
    }
    
    public List<Tema> buscarTodos(){
        return FactoryDao.createFactory().criaTemaDao().buscarTodos();
    }
    
}
