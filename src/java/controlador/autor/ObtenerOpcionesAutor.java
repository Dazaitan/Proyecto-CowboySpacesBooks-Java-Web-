/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador.autor;

import conexion.Conexion;
import java.sql.ResultSet;
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
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Jhonk
 */
@WebServlet(name = "ObtenerOpcionesAutor", urlPatterns = {"/ObtenerOpcionesAutor"})
public class ObtenerOpcionesAutor extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            Conexion conexion = new Conexion();
            ResultSet r =conexion.consultar("Select autor_id,nombre from autor");
            JSONArray jsonArray = new JSONArray();
            while (r.next()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("id", r.getLong("autor_id"));
                jsonObject.put("nombre", r.getString("nombre"));
                jsonArray.put(jsonObject);
            }
            conexion.cerrar();
            out.print(jsonArray.toString());
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerOpcionesAutor.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
