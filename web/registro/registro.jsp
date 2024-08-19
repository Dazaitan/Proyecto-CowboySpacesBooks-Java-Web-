<%-- 
    Document   : index
    Created on : 28 jul 2024, 15:28:40
    Author     : Jhonk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <!-- Por defecto el display venia flexible -->
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: #fff;
            margin-top: 20px;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }
        h1 {
            margin-bottom: 20px;
            font-size: 24px;
            text-align: center;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .form-group input:focus {
            border-color: #0056b3;
            outline: none;
        }
        .form-group button {
            background-color: #0056b3;
            color: #fff;
            border: none;
            padding: 10px;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
        }
        .form-group button:hover {
            background-color: #004494;
        }
    </style>
<body>
    <div class="container">
        <h1>Registro de Usuario</h1>
        <form id="registration-form" method="POST" action="../RegistroUsuario">
            <!-- El atributo action lo que hace es procesar los datos del formulario -->
            <div class="form-group">
                <label for="identificacion">Identificación:</label>
                <input type="text" id="identificacion" name="identificacion" required>
            </div>
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre" required>
            </div>
            <div class="form-group">
                <label for="apellido">Apellido:</label>
                <input type="text" id="apellido" name="apellido" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="contrasena">Contraseña:</label>
                <input type="password" id="contrasena" name="contrasena" required>
            </div>
            <div class="form-group">
                <label for="contrasena">Confirme la contraseña:</label>
                <input type="password" id="confirmarContrasena" name="confirmarContrasena" required>
            </div>
            <div class="form-group">
                <button type="submit">Registrarse</button>
            </div>
        </form>
    </div>
</body>
</html>
