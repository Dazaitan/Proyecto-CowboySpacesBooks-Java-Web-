/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador.libros;

import conexion.Conexion;
import controlador.editorial.ObtenerOpciones;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author Jhonk
 */
@WebServlet(name = "GetConsultaLibros", urlPatterns = {"/GetConsultaLibros"})
public class GetConsultaLibros extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            Conexion conexion = new Conexion();
            ResultSet r =conexion.consultar("SELECT libro.calificacion as calificacion, libro.portada as portada, libro.titulo as titulo,listas.nameList as listName, autor.nombre as autor,editorial.nombre as editorial,editorial.NIT as nit, rel_listas_libros.fechaAgregacion as fecha_Agregacion FROM libro INNER JOIN rel_listas_libros ON libro.ISBN=rel_listas_libros.fk_rel_libro_isbn INNER JOIN listas on rel_listas_libros.fk_rel_lista_Id =listas.lista_Id INNER JOIN autor on autor.autor_Id=libro.fk_autor_Id INNER JOIN editorial on editorial.NIT=libro.fk_edi_nit");
            JSONArray jsonArray = new JSONArray();
            while (r.next()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("portada", r.getString("portada"));
                jsonObject.put("calificacion", r.getFloat("calificacion"));
                jsonObject.put("titulo", r.getString("titulo"));
                jsonObject.put("autor", r.getString("autor"));
                jsonObject.put("NIT", r.getLong("nit"));
                jsonObject.put("Lista", r.getString("listName"));
                jsonObject.put("Editorial", r.getString("editorial"));
                jsonObject.put("FechaAgregacion", r.getString("fecha_Agregacion"));
                jsonArray.put(jsonObject);
            }
            out.print(jsonArray.toString());
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerOpciones.class.getName()).log(Level.SEVERE, null, ex);
        } 
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

    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
