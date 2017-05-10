/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.interfaces;

import br.edu.ifpb.bdnc.valueobjects.User;
import java.util.List;

/**
 *
 * @author PC-CASA
 */
public interface UserDaoIf {
    
    public boolean add(User u);
    
    public boolean remove(String s);
    
    public boolean update (String s);
    
    public List<User> list();
    
    public User login(User user);
    
    public boolean logout();
    
}
