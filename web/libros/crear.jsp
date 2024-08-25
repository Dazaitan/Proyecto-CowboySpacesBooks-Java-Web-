<%-- 
    Document   : crear
    Created on : 7 ago 2024, 12:00:53
    Author     : Jhonk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ingresar Datos del Libro</title>
    <script src="../js/libs/jquery/jquery.min.js"></script>
    <script src="js/script.js"></script>
    <link rel="stylesheet" href="css/estilos.css"> 
    <style>
        label {
            display: block;
            margin-top: 10px;
        }
        input, select, textarea {
            display: block;
            margin-bottom: 10px;
        }
    </style>
</head>
    <body>
        <%@include file="../navBar/menu.html" %>
        <h2>Ingresar Datos del Libro</h2>
        <form class="formulario-libro" action="../InsertarLibro" method="post">
            <label for="isbn">ISBN:</label>
            <input type="text" id="isbn" name="isbn" required>
            
            <label for="editorial">Portada (URL):</label>
            <textarea id="portada" name="portada" rows="4" cols="50" required></textarea>
            
            <label for="numPaginas">Número de Páginas:</label>
            <input type="number" id="numPaginas" name="numPaginas" required>

            <label for="titulo">Título:</label>
            <input type="text" id="titulo" name="titulo" required>
            <label for="autor">Autor:</label>
            <select id="autor" name="autor" required>
                <!-- Cargue de opciones  -->
            </select>
            <label for="idioma">Idioma:</label>
            <input type="text" id="idioma" name="idioma" required>

            <label for="descripcion">Descripción:</label>
            <textarea id="descripcion" name="descripcion" rows="4" cols="50" required></textarea>

            <label for="categoria">Categoría:</label>
            <input type="text" id="categoria" name="categoria" required>

            <label for="estado">Estado:</label>
            <select id="estado" name="estado" required>
                <option value="Quiero leer">Quiero leer</option>
                <option value="Leyendo">Leyendo</option>
                <option value="Leido">Leido</option>
            </select>
            <label for="formato">Formato:</label>
            <select id="formato" name="formato" required>
                <option value="Tapa dura">Tapa dura</option>
                <option value="Tapa blanda">Tapa blanda</option>
                <option value="Electronico">Electronico</option>
            </select>
            <label for="editorial">Editorial:</label>
            <select id="editorial" name="editorial" required>
                <!-- Cargue de opciones  -->
            </select>

            <label for="fecha">Fecha:</label>
            <input type="date" id="fecha" name="fecha" required>
            
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
