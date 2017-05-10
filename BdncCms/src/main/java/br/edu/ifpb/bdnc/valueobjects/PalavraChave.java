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
public class PalavraChave {

    private int id;
    private String palavraChave;

    public PalavraChave(int id, String palavraChave) {
        this.id = id;
        this.palavraChave = palavraChave;
    }

    public PalavraChave() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    @Override
    public String toString() {
        return "PalavraChave{" + "id=" + id + ", palavraChave=" + palavraChave + '}';
    }

    public Document toDocument() {
        Document doc = new Document("_id", id).
                append("palavraChave", palavraChave);
        return doc;
    }

    public PalavraChave fromDocument(Document doc) {
        id = doc.getInteger("_id");
        palavraChave = doc.getString("palavraChave");
        return this;
    }

}
