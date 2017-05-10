/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.interfaces;

import br.edu.ifpb.bdnc.valueobjects.Comentario;
import java.util.List;

/**
 *
 * @author PC-CASA
 */
public interface ComentarioDaoIf {
    
    public boolean add();
    
    public boolean remove();
    
    public List searchAll();
    
    public Comentario search(int id);
    
    public boolean edit(int id);
    
}
