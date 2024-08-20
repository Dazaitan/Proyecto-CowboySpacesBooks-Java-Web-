/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador.editorial;

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

@WebServlet(name = "ObtenerOpciones", urlPatterns = {"/ObtenerOpciones"})
public class ObtenerOpciones extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            Conexion conexion = new Conexion();
            ResultSet r =conexion.consultar("Select NIT,nombre from editorial");
            JSONArray jsonArray = new JSONArray();
            while (r.next()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("NIT", r.getLong("nit"));
                jsonObject.put("nombre", r.getString("nombre"));
                jsonArray.put(jsonObject);
            }
            out.print(jsonArray.toString());
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerOpciones.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}
