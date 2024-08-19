/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jhonk
 */
public class Conexion {
    private Connection conexion;
    private Statement stm;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //conexion de dba
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/cowboyspacesbooks", "root", "");
            stm=conexion.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public int insertarActualizarEliminar(String sql) {
       
        try {
             // Convertir el texto a bytes con la codificación UTF-8
            byte[] textBytes = sql.getBytes("UTF-8");

            // Crear una nueva cadena de texto a partir de los bytes con la codificación UTF-8
            sql = new String(textBytes, "UTF-8");

            stm.execute(sql);
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ResultSet consultar(String sql) {
        ResultSet r=null;
        try {
            
            r=stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    public void cerrar(){
        try {
            stm.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
