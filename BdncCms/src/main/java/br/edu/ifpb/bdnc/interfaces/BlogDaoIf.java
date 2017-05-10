/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.interfaces;

import br.edu.ifpb.bdnc.valueobjects.Blog;
import java.util.List;

/**
 *
 * @author PC-CASA
 */
public interface BlogDaoIf {
    
    public boolean add(String s1, String s2);
    
    public boolean atualizar(Blog t);
    
    public Blog buscar(int id);
    
    public List<Blog> buscarTodos();
    
    public Blog verificarExistencia(String email);
    
}
