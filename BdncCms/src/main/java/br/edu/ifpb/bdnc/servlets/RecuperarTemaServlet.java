/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.servlets;

import br.edu.ifpb.bdnc.manager.BlogManager;
import br.edu.ifpb.bdnc.manager.TemaManager;
import br.edu.ifpb.bdnc.valueobjects.Blog;
import br.edu.ifpb.bdnc.valueobjects.Tema;
import br.edu.ifpb.bdnc.valueobjects.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC-CASA
 */
@WebServlet(name = "RecuperarTemaServlet", urlPatterns = {"/recuperartemaservlet.do"})
public class RecuperarTemaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String s = request.getParameter("param");
        HttpSession ses = request.getSession();
        User u = (User) ses.getAttribute("User");
        u.getEmail();
        TemaManager tm = new TemaManager();
        BlogManager bm =  new BlogManager();
        Blog b = bm.verificarUser(u.getEmail());
        Tema t = new Tema();
        t = tm.buscarTema(s);
        tm.addTema(t);
        if (b == null){
            bm.criaBlog(u.getEmail(), t.getId());
            b = bm.verificarUser(u.getEmail());
        }
        ses.setAttribute("Blog", b);
        String psg = s;
        ses.removeAttribute(s);
        ses.setAttribute("Tema", t);
        response.sendRedirect(psg);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RecuperarTemaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RecuperarTemaServlet at " + s + "</h1>");
            out.println("<h1>Servlet RecuperarTemaServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
