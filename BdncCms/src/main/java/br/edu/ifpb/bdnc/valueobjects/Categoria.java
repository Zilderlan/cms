/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.valueobjects;

import org.bson.Document;

/**
 *
 * @author PC-CASA
 */
public class Categoria {

    private int id;
    private String categoria;

    public Categoria() {
    }

    public Categoria(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", categoria=" + categoria + '}';
    }

    public Document toDocument() {
        Document doc = new Document().
                append("_id", id).
                append("categoria", categoria);
        return doc;
    }

    public Categoria fromDocument(Document doc) {
        id = doc.getInteger("_id");
        categoria = doc.getString("categoria");
        return this;
    }

}
