/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.interfaces;

import br.edu.ifpb.bdnc.valueobjects.Pesquisa;
import java.util.List;

/**
 *
 * @author PC-CASA
 */
public interface PesquisaDaoIf {
    
    public List<Pesquisa> pesquisa(List<String> l);
    public String add(Pesquisa p);
    
}
