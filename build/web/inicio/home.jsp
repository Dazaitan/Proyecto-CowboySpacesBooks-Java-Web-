<%-- 
    Document   : home
    Created on : 4 ago 2024, 16:34:31
    Author     : Jhonk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        
    </head>
    <body>
        
        <%@include file="../navBar/menu.html" %>
        <%@page import="modelo.Usuario" %>
        <%
            if (Usuario.user==null){
                response.sendRedirect("../index.jsp");
            }
        %>
        <h1>Bienvenido <%=Usuario.user %></h1>
    </body>
</html>
