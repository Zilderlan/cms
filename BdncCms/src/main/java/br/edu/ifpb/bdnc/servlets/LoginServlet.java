/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.servlets;

import br.edu.ifpb.bdnc.manager.BlogManager;
import br.edu.ifpb.bdnc.manager.PaginaManager;
import br.edu.ifpb.bdnc.manager.UserManager;
import br.edu.ifpb.bdnc.valueobjects.Blog;
import br.edu.ifpb.bdnc.valueobjects.Pagina;
import br.edu.ifpb.bdnc.valueobjects.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/loginservlet.do"})
public class LoginServlet extends HttpServlet {

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
        String login = (String) request.getParameter("login");
        String password = (String) request.getParameter("password");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            User u = new User();
            u.setEmail(login);
            u.setPassword(password);
            UserManager manager = new UserManager();
            BlogManager bm = new BlogManager();
            Blog b = bm.verificarUser(login);
            PaginaManager pm = new PaginaManager();
            List<Pagina> l = pm.listar(b.getId());
            User uLogin = manager.userLogin(u);
            if (uLogin == null) {
                request.setAttribute("msg", "Email ou senha inválidos");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("Pag", l);
                session.setAttribute("User", u);
                session.setAttribute("Blog", b);
                String pag = (String) session.getAttribute("p");
                response.sendRedirect(pag);
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>User Login " + u + "</h1>");
            out.println("<h1>Servlet LoginServlet at " + uLogin + "</h1>");
            out.println("<h1>Servlet LoginServlet at " + password + "</h1>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
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
