/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador.libros;

import conexion.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import modelo.Libro;

/**
 *
 * @author Jhonk
 */
@WebServlet(name = "ActualizarLibro", urlPatterns = {"/ActualizarLibro"})
public class ActualizarLibro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *Servlet(name = "ActualizarLibro", urlPatterns = {"/ActualizarLibro"})
public class ActualizarLibro extends HttpServlet {

    /**
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");
            Conexion conexion = new Conexion();
            Libro libro = new Libro();
            libro.setIsbn(Long.parseLong(request.getParameter("isbn")));
            libro.setTitulo(request.getParameter("titulo"));
            libro.setAutorId(Integer.valueOf(request.getParameter("autor")));
            libro.setEditorial(Integer.valueOf(request.getParameter("editorial")));
            libro.setnPaginas(Integer.parseInt(request.getParameter("numPaginas")));
            libro.setCategoria(request.getParameter("categoria"));
            libro.setDescripcion(request.getParameter("descripcion"));
            libro.setEstado(request.getParameter("estado"));
            libro.setIdioma(request.getParameter("idioma"));
            libro.setFecha(LocalDate.parse(request.getParameter("fecha")));
            
            conexion.insertarActualizarEliminar(libro.actualizarLibro());
            conexion.cerrar();
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
