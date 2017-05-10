/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.factory;

import br.edu.ifpb.bdnc.daos.PaginaDao;
import br.edu.ifpb.bdnc.interfaces.FactoryDaoMongoDbIf;
import br.edu.ifpb.bdnc.interfaces.PaginaDaoIf;
import br.edu.ifpb.bdnc.valueobjects.Pagina;

/**
 *
 * @author PC-CASA
 */
public class FactoryDaoMongoDb implements FactoryDaoMongoDbIf{

    @Override
    public PaginaDaoIf criaPaginaDao() {
        return new PaginaDao();
    }
    
  
    
    

   
    
}
