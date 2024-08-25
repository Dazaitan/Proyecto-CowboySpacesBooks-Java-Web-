/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador.libros;

import conexion.Conexion;
import controlador.editorial.ObtenerOpciones;
import jakarta.resource.cci.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Libro;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Jhonk
 */
@WebServlet(name = "ConsultaLibros", urlPatterns = {"/ConsultaLibros"})
public class ConsultaLibros extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            Conexion conexion = new Conexion();
            java.sql.ResultSet r =conexion.consultar("Select * from libro");
            JSONArray jsonArray = new JSONArray();
            while (r.next()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("NIT", r.getLong("ISBN"));
                jsonObject.put("nombre", r.getString("titulo"));
                jsonArray.put(jsonObject);
            }
            out.print(jsonArray.toString());
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerOpciones.class.getName()).log(Level.SEVERE, null, ex);
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
