<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
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
            padding: 40px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
            text-align: center;
            width: 400px;
            border-radius: 10px;
        }
        .input {
            display: block;
            width: 90%;
            padding: 15px;
            margin: 15px auto;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 1.1em;
        }
        .button {
            display: inline-block;
            padding: 15px 30px;
            margin: 20px;
            color: #fff;
            background-color: #007bff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
            font-size: 1.1em;
        }
        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Inicio de sesion</h1>
        <form method="POST" action="../Login">
            <input type="text" name="correo" class="input" placeholder="Correo" required>
            <input type="password" name="password" class="input" placeholder="Contraseña" required>
            <button type="submit" class="button">Iniciar sesion</button>
        </form>
    </div>
</body>
</html>


