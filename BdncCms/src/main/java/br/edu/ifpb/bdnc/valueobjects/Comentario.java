/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.valueobjects;

import java.time.LocalDate;
import org.bson.Document;

/**
 *
 * @author PC-CASA
 */
public class Comentario {

    private int id;
    private String name;
    private String email;
    private String msg;
    private LocalDate date;

    public Comentario(int id, String name, String email, String msg) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.msg = msg;
    }
    
    

    public LocalDate getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public Document toDocument(){
        Document doc = new Document().
                append("_id", id).
                append("name", name).
                append("email", email).
                append("msg", msg).
                append("date", date);
        return doc;
    }
    
    public Comentario fromDocument(Document doc){
            id = doc.getInteger("_id");
            name = doc.getString("name");
            email = doc.getString("email");
            msg = doc.getString("msg");
            
        return this;
    }

    @Override
    public String toString() {
        return "Comentario{" + "id=" + id + ", msg=" + msg + '}';
    }

}
