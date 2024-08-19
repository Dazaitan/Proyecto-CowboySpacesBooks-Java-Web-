<%-- 
    Document   : index
    Created on : 28 jul 2024, 15:07:33
    Author     : Jhonk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio o creacion de sesion</title>
        
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f0f0f0;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }
            .container {
                background-color: #fff;
                padding: 20px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                text-align: center;
            }
            .button {
                display: inline-block;
                padding: 10px 20px;
                margin: 10px;
                color: #fff;
                background-color: #007bff;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                text-decoration: none;
            }
            .button:hover {
                background-color: #0056b3;
            }
        </style>
    </head>
    <body>

        <div class="container">
            <h1>Bienvenido</h1>
            <a href="inicioSesion/login.jsp" class="button">Login</a>
            <a href="registro/registro.jsp" class="button">Register</a>
        </div>
    </body>
</html>
