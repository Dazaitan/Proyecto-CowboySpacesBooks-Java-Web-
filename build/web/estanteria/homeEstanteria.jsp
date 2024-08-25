<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="estilos.css">
        <script src="../js/libs/jquery/jquery.min.js"></script>
        <script src="script.js"></script>
    </head>
    <body>
        <%@include file="../navBar/menu.html" %>
        <div class="container">
            <h2 style="font-weight: 500; text-align: center;">Mis libros</h2>
            <div class="row h-100">
                <div class="col-3 align-items-center ladoIzquierdo">
                    <p style="font-size: 20px; margin-left: 70px;">Estanteria</p>
                    <ul class="estanterias">
                        <!<!-- Opciones de estanterias -->
                    </ul>
                    <button class="btn btn-outline-secondary" id="OpenModalAnadirEstanteria" type="button" >Añadir estanteria</button>
                    <br>
                    <hr style="width: 180px; margin-left: 70px;" size="5px">
                    <p style="font-size: 20px; margin-left: 70px;">Tu actividad de lectura</p>
                    <ul>
                        <li>Estadistica de lectura</li>
                        <li>Desafio de lectura <br> en libros del año</li>
                    </ul>
                </div>
                <div class="col-9 d-flex align-items-center justify-content-center color2">
                    <table id="books">
                        <thead id="booksHeader" class="tableList">
                            <tr>
                                <th class="header field portada">Portada</th>
                                <th class="header field titulo">Titulo</th>
                                <th class="header field autor">Autor</th>
                                <th class="header field calificacion">Calificacion</th>
                                <th class="header field estanteria">Estanteria</th>
                                <th class="header fiel reseña">Reseña</th>
                                <th class="header field fecha_lectura">Fecha de lectura</th>
                                <th class="header field fecha_anadido">Fecha de agregacion</th>
                            </tr>
                        </thead>
                        <tbody class="bookBody">
                            <!--<td class="field portada"><a href="#"><img src="https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1616927575i/57551565.jpg"></a></td>
                            <td class="field titulo">Almendra</td>
                            <td class="field autor">Sohn Won-Pyung</td>
                            <td class="field calificacion">iframe</td>
                            <td class="field estanteria">Leido</td>
                            <td class="field reseña">Escribe una reseña</td>
                            <td class="field fecha_lectura">Mar 31, 2024</td>
                            <td class="field fecha_anadido">Mar 31, 2024</td> -->
                            
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <dialog id="myDialog">
            <form action="../CrearEstanteria" method="POST">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" id="nombre" name="nombre" required>
                </div>
                <div class="form-group">
                    <label for="descripcion">Descripción:</label>
                    <textarea id="descripcion" name="descripcion" rows="4" required></textarea>
                </div>
                <div class="dialog-footer">
                    <button type="submit" class="btn btn-outline-success">Enviar</button>
                    <button type="button" class="btn btn-outline-success" id="closeModal">Cancelar</button>
                </div>
            </form>
        </dialog>
    </body>
</html>
