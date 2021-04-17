/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ColaboracionDao;
import Model.Colaboracion;
import Model.Emprendimiento;
import java.io.IOException;
import java.io.PrintWriter;
import static java.sql.Types.NULL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ColaboracionServlet extends HttpServlet {
    
    private ColaboracionDao colaboracionDao = new ColaboracionDao();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ColaboracionServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ColaboracionServlet at " + request.getContextPath() + "</h1>");
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
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/registrarseColab.jsp");
        dispatcher.forward(request, response);
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
        
        int id = NULL;
        String nombre = request.getParameter("nombreC");
        String apellido = request.getParameter("apellidoC");
        String correo = request.getParameter("correoC");
        String passw = request.getParameter("passw");
        
        
        Colaboracion colaboracion = new Colaboracion();
        
        colaboracion.setId(id);
        colaboracion.setNombre(nombre);
        colaboracion.setApellido(apellido);
        colaboracion.setCorreo(correo);
        colaboracion.setPassw(passw);
        
        try {
           colaboracionDao.registerColab(colaboracion);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmprendimientoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/succesRGSTR_1.jsp");
        dispatcher.forward(request, response);
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
