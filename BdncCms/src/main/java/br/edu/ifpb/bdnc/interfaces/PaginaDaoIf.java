/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.interfaces;

import br.edu.ifpb.bdnc.valueobjects.Pagina;
import java.util.List;

/**
 *
 * @author PC-CASA
 */
public interface PaginaDaoIf {
    
    public boolean salvar(Pagina p);
    
    public boolean remover(long id);
    
    public List searchAll(int id);
    
    public Pagina searchOne(long id);
    
    public List<Pagina> searchId(int id);
    
    public List<Pagina> search(String titulo);
    
    public boolean edit(long id);
    
}
