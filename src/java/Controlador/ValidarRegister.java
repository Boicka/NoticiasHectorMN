/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Externo;
import ModeloDAO.ExternoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ValidarRegister", urlPatterns = {"/ValidarRegister"})
public class ValidarRegister extends HttpServlet {

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
        
        String nombre, apepaterno, apematerno, pass;
        int tipo;
        nombre = request.getParameter("nombre");
        apepaterno = request.getParameter("apepaterno");
        apematerno = request.getParameter("apematerno");
        tipo = Integer.parseInt(request.getParameter("tipo"));
        pass = request.getParameter("pass");
        System.out.println(nombre + " " + tipo);
        if (tipo == 1) {
            String mensaje, paginaRespuesta;
            Externo e = new Externo();
            e.setNombre(nombre);
            e.setApepaterno(apepaterno);
            e.setApematerno(apematerno);
            e.setPass(pass);
            try {
            //Agregar empleado a la base de datos
            ExternoDAO edao = new ExternoDAO();
            edao.alta(e);
            //Enviar mensaje a la página de respuesta
            mensaje = "Alta exitosa";
        } catch (SQLException ex) {
            mensaje = "Algo ocurrio mal" + ex.getMessage();
        }
        paginaRespuesta = "index.jsp";
        request.setAttribute("mensaje", mensaje);
        //Redireccionar a la página de respuesta
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher(paginaRespuesta);
        dispatcher.forward(request, response);
        }
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
