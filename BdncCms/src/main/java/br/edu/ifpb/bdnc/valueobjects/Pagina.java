/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.valueobjects;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author PC-CASA
 */
public class Pagina {

    private long id;
    private int idBlog;
    private String titulo;
    private String descricao;
    private String conteudo;
    private String foto;
    private List<PalavraChave> palavraChave;
    private List<Categoria> cat;
    private int view;
    private List<Comentario> comment;

    public Pagina() {
        comment = new ArrayList();
        this.palavraChave = new ArrayList();
        this.cat = new ArrayList();
    }

    public Pagina(long id, int idBlog, String titulo, String descricao, String conteudo) {
        this.id = id;
        this.idBlog = idBlog;
        this.titulo = titulo;
        this.descricao = descricao;
        this.conteudo = conteudo;
        
        this.palavraChave = new ArrayList();
        this.cat = new ArrayList();
    }

    public int getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(int idBlog) {
        this.idBlog = idBlog;
    }

    public List<PalavraChave> getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(List<PalavraChave> palavraChave) {
        this.palavraChave = palavraChave;
    }

    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Comentario> getComment() {
        return comment;
    }

    public boolean addComment(Comentario c) {
        return comment.add(c);
    }
    
    public boolean addPalavraChave(PalavraChave p) {
        return palavraChave.add(p);
    }
    
    public boolean addCategoria(Categoria c) {
        return cat.add(c);
    }

    @Override
    public String toString() {
        return "Pagina{" + "id=" + id + ", idBlog : " +idBlog + ", titulo=" + titulo + ", conteudo=" + conteudo + ", foto=" + foto + ", comment=" + comment + '}';
    }

    public Document toDocument() {
        Document doc = new Document("_id", id).
                append("idBlog", idBlog).
                append("titulo", titulo).
                append("descricao", descricao).
                append("conteudo", conteudo).
                append("foto", foto);

        List<Document> listPalavras = new ArrayList<>();
        for (PalavraChave c : palavraChave) {
            listPalavras.add(c.toDocument());
        }
        doc.append("listPalavras", listPalavras);
        
        List<Document> listCateg = new ArrayList<>();
        for (Categoria c : cat) {
            listCateg.add(c.toDocument());
        }
        doc.append("listCateg", listCateg);
        return doc;
    }

    public Pagina fromDocument(Document doc) {
        id = doc.getLong("_id");
        idBlog = doc.getInteger("idBlog");
        titulo = doc.getString("titulo");
        descricao = doc.getString("descricao");
        conteudo = doc.getString("conteudo");
        foto = doc.getString("foto");
        return this;
    }

}
