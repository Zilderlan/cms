/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.servlets;

import br.edu.ifpb.bdnc.manager.PaginaManager;
import br.edu.ifpb.bdnc.valueobjects.Blog;
import br.edu.ifpb.bdnc.valueobjects.Categoria;
import br.edu.ifpb.bdnc.valueobjects.Pagina;
import br.edu.ifpb.bdnc.valueobjects.PalavraChave;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
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
@WebServlet(name = "CadastroPagServlet", urlPatterns = {"/cadastropagservlet.do"})
public class CadastroPagServlet extends HttpServlet {

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
        String titulo = request.getParameter("titulo");
        String descricao = request.getParameter("descricao");
        String palavrasChave = request.getParameter("palavra-chave");
        String categoria = request.getParameter("categoria");
        String conteudoPost = request.getParameter("conteudo-post");
        HttpSession ses = request.getSession();
        Blog blog = (Blog) ses.getAttribute("Blog");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Instant agora = Instant.now();
            String[] s = palavrasChave.split(",");
            String[] c = categoria.split(",");
            if (titulo.trim().equals("") ||
                conteudoPost.trim().equals("")
                    ) {
                request.setAttribute("msg", "Erro! tente mais tarde");
                request.getRequestDispatcher("setting.jsp").forward(request, response);
            }

            Pagina p = new Pagina(agora.toEpochMilli(), blog.getId(), titulo, descricao, conteudoPost);
            for (int i = 0; i < s.length; i++) {
                p.addPalavraChave(new PalavraChave(i + 1, s[i]));
            }
            for (int i = 0; i < c.length; i++) {
                p.addCategoria(new Categoria(i + 1, c[i]));
            }

            PaginaManager pm = new PaginaManager();
            boolean b = pm.addPag(p);
            List<Pagina> l1 = pm.listar(blog.getId());
            ses.setAttribute("Pag", l1);
            response.sendRedirect("setting.jsp");


            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroPagServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>titulo " + titulo + "</h1>");
            out.println("<h1>titulo " + descricao + "</h1>");
            out.println("<h1>titulo " + conteudoPost + "</h1>");
          
            out.println("<h1>Servlet CadastroPagServlet at " + request.getContextPath() + "</h1>");
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
