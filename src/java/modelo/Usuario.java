/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jhonk
 */
public class Usuario {
    public static String user =null;
    private int identificacion;
    private String nombre, apellido, email, contrasena;

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String credenciales (){
        return "Select email,nombre,apellido from usuario where email='"+getEmail()+"' AND contrasena=md5('"+getContrasena()+"')";
    }
    public String registro (){
        String sql = "INSERT INTO usuario (identificacion,nombre,apellido,email,contrasena) values ('"+getIdentificacion()+"','"+getNombre()+"','"+getApellido()+"','"+getEmail()+"',md5('"+getContrasena()+"'))";
        return sql;
    }
    public String actualizar (){
        String sql = "Update usuario set identificacion= '"+getIdentificacion()+"', nombre ='"+getNombre()+"',apellido ='"+getApellido()+"',contrasena=md5('"+getContrasena()+"') WHERE email ='"+getEmail()+"'";
        return sql;
    }
}
