/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.valueobjects;

/**
 *
 * @author PC-CASA
 */
public class Pesquisa {
    
    private String pesquisa;
    private String chave;

    public Pesquisa(String pesquisa, String chave) {
        this.pesquisa = pesquisa;
        this.chave = chave;
    }

    public Pesquisa() {
    }
    
    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    @Override
    public String toString() {
        return "Pesquisa{" + "pesquisa=" + pesquisa + ", chave=" + chave + '}';
    }
    
    
    
    
}
