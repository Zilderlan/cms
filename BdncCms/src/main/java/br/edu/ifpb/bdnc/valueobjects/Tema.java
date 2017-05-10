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
public class Tema {
    private String idBlog;
    private String id;
    private String nome;
    private String descricao;
    private String img;

    public Tema() {
    }
    
    public String getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(String idBlog) {
        this.idBlog = idBlog;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Tema{" + "idBlog=" + idBlog + ", id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", img=" + img + '}';
    }
    
    
    
}
