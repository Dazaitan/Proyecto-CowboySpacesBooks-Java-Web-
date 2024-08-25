<%-- 
    Document   : eliminar
    Created on : 7 ago 2024, 11:55:14
    Author     : Jhonk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar libro</title>
    </head>
    <style>
        label {
            display: block;
            margin-top: 10px;
        }
    </style>
    <body>
        <%@include file="../navBar/menu.html" %>
        <form action="../ConsultaLibros" method="POST">
            <label for="isbn">ISBN:</label>
            <input type="text" id="isbn" name="isbn" required>
        <input type="submit" value="Enviar">
        </form>
    </body>
</html>
