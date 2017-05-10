/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.daos;

import br.edu.ifpb.bdnc.conexao.ConectionPostgre;
import br.edu.ifpb.bdnc.interfaces.UserDaoIf;
import br.edu.ifpb.bdnc.valueobjects.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zilderlan
 */
public class UserDao implements UserDaoIf {

    private User user;
    private List<User> list;
    private Connection conn;
    private PreparedStatement stm;

    @Override
    public boolean add(User u) {
        String sql = "INSERT INTO USUARIO(email, password, name)"
                + " VALUES (?, ?, ?)";
        System.out.println(u);
        try {
            conn = ConectionPostgre.conexao();
            stm = ConectionPostgre.openStatement(sql);
            stm.setString(1, u.getEmail());
            stm.setString(2, u.getPassword());
            stm.setString(3, u.getName());
            System.out.println("Funciona");
            stm.executeUpdate();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            ConectionPostgre.closeStatement(stm);
            ConectionPostgre.closeConnection(conn);
        }
        return false;
    }

    @Override
    public boolean remove(String s) {

        return false;
    }

    @Override
    public boolean update(String s) {

        return false;
    }

    @Override
    public List<User> list() {
        list = new ArrayList();

        return list;
    }

    @Override
    public User login(User user) {

        User userLogin = null;
        String sql = "Select * from Usuario where  email = ? and password = ?";
        String s;
        try {
            conn = ConectionPostgre.conexao();
            stm = conn.prepareStatement(sql);
            stm.setString(1, user.getEmail());
            stm.setString(2, user.getPassword());
            ResultSet result = stm.executeQuery();
            if (result.next()) {
                userLogin = new User();
                userLogin.setEmail(result.getString("email"));
                userLogin.setPassword(result.getString("password"));
                userLogin.setName(result.getString("name"));
                System.out.println(userLogin);
            }
        } catch (SQLException | ClassNotFoundException ex) {

        }

        return userLogin;

    }

    @Override
    public boolean logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User search() {
        User userSearch = null;

        return userSearch;
    }

}
