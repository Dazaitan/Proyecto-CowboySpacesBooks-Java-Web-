/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jhonk
 */
public class Listas {
    String nombre,descripcion;

    public Listas() {
    }

    public Listas(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String insertarLista(){
        String sql = "INSERT INTO listas (nameList,descripcion) VALUES ('"+getNombre()+"','"+getDescripcion()+"')";
        return sql;
    }
    
}
