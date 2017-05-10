/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.manager;

import br.edu.ifpb.bdnc.factory.FactoryDao;
import br.edu.ifpb.bdnc.valueobjects.Pagina;
import java.util.List;

/**
 *
 * @author PC-CASA
 */
public class PaginaManager {
    
    public boolean addPag(Pagina p){
        return FactoryDao.createFactoryMongo().criaPaginaDao().salvar(p);
    }
    
    public List<Pagina> listarPorNome(String nome){
        return FactoryDao.createFactoryMongo().criaPaginaDao().search(nome);
    }
    public List<Pagina> listar(int id){
        return FactoryDao.createFactoryMongo().criaPaginaDao().searchAll(id);
    }
    
    public Pagina searchOne(long id){
        return FactoryDao.createFactoryMongo().criaPaginaDao().searchOne(id);
    }
    
}
