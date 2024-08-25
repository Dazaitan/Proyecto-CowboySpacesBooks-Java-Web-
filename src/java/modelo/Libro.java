/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Jhonk
 */
public class Libro {
    long isbn;
    int nPaginas,autorId,editorial;
    String titulo,idioma,descripcion,categoria,estado,portada,nombreAutor;
    LocalDate fecha;

    public Libro() {
    }

    public Libro(long isbn, int nPaginas, String titulo, String idioma, String descripcion, String categoria, String estado, LocalDate fecha, String portada) {
        this.isbn = isbn;
        this.nPaginas = nPaginas;
        this.titulo = titulo;
        this.idioma = idioma;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.fecha = fecha;
        this.portada =portada;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }
    
    public String consultarLibro(){
        return "Select * from libro";
    }
    public String insertarLibroNuevo(){
        String consulta = "Insert into libro (ISBN,nPaginas,titulo,idioma,descripcion,categoria,estado,anoPublicacion,portada,fk_edi_nit,fk_autor_id) VALUES ('"+getIsbn()+"','"+getnPaginas()+"','"+getTitulo()+"','"+getIdioma()+"','"+getDescripcion()+"','"+getCategoria()+"','"+getEstado()+"','"+getFecha()+"','"+getPortada()+"','"+getEditorial()+"','"+getAutorId()+"');";
        return consulta;
    }
    public String actualizarLibro(){
        String sql = "Update libro set nPaginas='"+getnPaginas()+"',titulo='"+getTitulo()+"',idioma='"+getIdioma()+"',descripcion='"+getDescripcion()+"',categoria='"+getCategoria()+"',estado='"+getEstado()+"',anoPublicacion='"+getFecha()+"',fk_edi_nit='"+getEditorial()+"',fk_autor_id='"+getAutorId()+"' WHERE ISBN='"+getIsbn()+"';";
        return sql;
    }
    public String eliminarLibro(){
        String sql = "Delete from libro where isbn ='"+getIsbn()+"'";
        return sql;
    }
    
}