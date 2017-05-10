/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.daos;

import br.edu.ifpb.bdnc.conexao.ConectionPostgre;
import br.edu.ifpb.bdnc.interfaces.BlogDaoIf;
import br.edu.ifpb.bdnc.valueobjects.Blog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC-CASA
 */
public class BlogDao implements BlogDaoIf {
    Connection conn = null;
    PreparedStatement stm = null;
    private Blog tema;

    @Override
    public boolean add(String email, String id) {
        try {
            conn = ConectionPostgre.conexao();
            String sql = "insert into Blog (idUser, idTema) values(?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, id);
            pst.executeUpdate();
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
    public boolean atualizar(Blog t) {
        try {
            conn = ConectionPostgre.conexao();
            String sql = "UPDATE Blog SET titulo = ?, descricao = ?, msgboasvindas = ? WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, t.getTitulo());
            pst.setString(2, t.getDescricao());
            pst.setString(3, t.getMsgBoasVindas());
            pst.setInt(4, t.getId());
            pst.executeUpdate();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Erro " + e.getMessage());
            e.printStackTrace();

        } finally {
            ConectionPostgre.closeConnection(conn);
        }
        return false;
    }

    public boolean updateDefault(int i) {
        try {
            conn = ConectionPostgre.conexao();
            String sql = "UPDATE Blog SET idTema = default WHERE id != ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, i);

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

    @Override
    public Blog buscar(int id) {
        List list = new ArrayList();
        String sql = "Select * from Temas where id = ?";
        try {
            conn = ConectionPostgre.conexao();
            stm = conn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet result = stm.executeQuery();
            if (result.next()) {
                tema = new Blog();
                tema.setTitulo(result.getString("titulo"));
                tema.setDescricao(result.getString("descricao"));
                tema.setId(result.getInt("id"));
                tema.setIdUser(result.getString("idUser"));
                tema.setMsgBoasVindas(result.getString("msgboasvindas"));
                return tema;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Blog> buscarTodos() {
        List list = new ArrayList();
        String sql = "Select * from Temas ";
        try {
            conn = ConectionPostgre.conexao();
            stm = conn.prepareStatement(sql);
            ResultSet result = stm.executeQuery();
            while (result.next()) {
                tema = new Blog();
                tema.setTitulo(result.getString("titulo"));
                tema.setDescricao(result.getString("descricao"));
                tema.setId(result.getInt("id"));
                tema.setIdUser(result.getString("idUser"));
                tema.setMsgBoasVindas(result.getString("msgboasvindas"));
                list.add(tema);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TemaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Blog verificarExistencia(String email) {
        String sql = "SELECT * FROM Blog WHERE idUser ~* ?";
        try {
            conn = ConectionPostgre.conexao();
            stm = conn.prepareStatement(sql);
            stm.setString(1, email);
            ResultSet result = stm.executeQuery();
            if (result.next()) {
                tema = new Blog();
                tema.setTitulo(result.getString("titulo"));
                tema.setDescricao(result.getString("descricao"));
                tema.setId(result.getInt("id"));
                tema.setIdUser(result.getString("idUser"));
                tema.setMsgBoasVindas(result.getString("msgboasvindas"));
                return tema;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.getMessage();
        }
        return null;
    }

}
