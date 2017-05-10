/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.daos;

import br.edu.ifpb.bdnc.conexao.ConectionPostgre;
import br.edu.ifpb.bdnc.valueobjects.Blog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.edu.ifpb.bdnc.interfaces.BlogDaoIf;
import br.edu.ifpb.bdnc.interfaces.TemaDaoIf;
import br.edu.ifpb.bdnc.valueobjects.Tema;

/**
 *
 * @author PC-CASA
 */
public class TemaDao implements TemaDaoIf {
    
    Connection conn = null;
    PreparedStatement stm = null;
    private Tema tema;
    
    @Override
    public boolean add(Tema t) {
        
        try {
            conn = ConectionPostgre.conexao();
            String sql = "UPDATE Temas SET idBlog = ? WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, t.getIdBlog());
            pst.setString(2, t.getId());
            pst.executeUpdate();
//            updateDefault(t.getId());
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Erro " + e.getMessage());
            e.printStackTrace();
            
        } finally {
            ConectionPostgre.closeConnection(conn);
        }
        return false;
    }
    
    
    @Override
    public Tema buscar(String id) {
        List list = new ArrayList();
        String sql = "Select * from Temas where id = ?";
        try {
            conn = ConectionPostgre.conexao();
            stm = conn.prepareStatement(sql);
            stm.setString(1, id);
            ResultSet result = stm.executeQuery();
            if (result.next()) {
                tema = new Tema();
                tema.setId(result.getString("id"));
                tema.setIdBlog(result.getString("idBlog"));
                tema.setNome(result.getString("nome"));
                tema.setDescricao(result.getString("descricao"));
                tema.setImg(result.getString("img"));
                return tema;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public List<Tema> buscarTodos() {
        List list = new ArrayList();
        String sql = "Select * from Temas ";
        try {
            conn = ConectionPostgre.conexao();
            stm = conn.prepareStatement(sql);
            ResultSet result = stm.executeQuery();
            while (result.next()) {
                tema = new Tema();
                tema.setId(result.getString("id"));
                tema.setIdBlog(result.getString("idBlog"));
                tema.setNome(result.getString("nome"));
                tema.setDescricao(result.getString("descricao"));
                tema.setImg(result.getString("img"));
                list.add(tema);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
       public boolean updateDefault(String s) {
        try {
            conn = ConectionPostgre.conexao();
            String sql = "UPDATE Temas SET idBlog = "+ -1 +" WHERE id != ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, s);
            
            pst.executeUpdate();
            System.out.println("executou");
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Erro " + e.getMessage());
            e.printStackTrace();
            
        } finally {
            ConectionPostgre.closeConnection(conn);
        }
        return false;
    }
    
}
