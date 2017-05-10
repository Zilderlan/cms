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
public class Blog {

    private String idUser;
    private String idTema;
    private int id;
    private String titulo;
    private String descricao;
    private String msgBoasVindas;
    private String img;

    public String getIdTema() {
        return idTema;
    }

    public void setIdTema(String idTema) {
        this.idTema = idTema;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMsgBoasVindas() {
        return msgBoasVindas;
    }

    public void setMsgBoasVindas(String msgBoasVindas) {
        this.msgBoasVindas = msgBoasVindas;
    }

    @Override
    public String toString() {
        return "Blog{" + "idUser=" + idUser + ", id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", msgBoasVindas=" + msgBoasVindas + '}';
    }

}
