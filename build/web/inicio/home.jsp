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
        <link rel="stylesheet" href="estilos.css">
        <style>
            
        </style>
    </head>
    <body>
        <%@include file="../navBar/menu.html" %>
        <%@page import="modelo.Usuario" %>
        <%
            if (Usuario.user==null){
                response.sendRedirect("../index.jsp");
            }
        %>
        <h1>Bienvenido al sistema de gestion de libros</h1>
        <div class="container-fluid full-height">
            <div class="row h-100">
                <div class="col-3 align-items-center align-items-center ladoIzquierdo" style="background-color">
                    <p class="subtitulo">Actualmente estas leyendo</p>
                    <div class="portadaActual">
                        <img src="../img/portada-almendra.jpg" class="imgPortada">
                        <p style="font-size: 15px;">Que estas leyendo actualmente?</p>
                    </div>
                    <input type="text">
                    <br>
                    <hr>
                    <p class="subtitulo">Reto actual de lectura</p>
                    <div class="reto">
                        <img class="item" src="../img/img-Libro-animado.png" style="height: 70px; width: 70px;"/>
                        <p class="item">Retate a leer mas libros este año</p><br>
                        <input class="item" type="number" style="height: 30px;width: 35px"><br>
                    </div>
                    <br>
                    <button>Empieza ya</button>
                    <hr>
                    <p class="subtitulo">Quiero leer</p>
                    <div class="imgQuieroLeer">
                        <img src="../img/Almendra.png" alt="" class="imgLeer">
                        <img src="../img/hemingway.png" alt="" class="imgLeer">
                        <img src="../img/Marquez.png" alt="" class="imgLeer">
                    </div>
                </div>
                <div class="col-6 d-flex align-items-center justify-content-center color2">

                </div>
                <div class="col-3 align-items-center justify-content-center color1">
                    <p class="subtitulo">Noticias</p>
                    <p style="font-size: 15px; color: #aaa9e8; padding: 0px,30px,0px;">Segun un estudio, estos son los libros que mas recomienda la gente</p>
                    <img src="../img/image.png" style="height: 120px; width: 250px; margin-left: 35px;">
                    <ul class="socialInteraction">
                        <li>20likes</li>
                        <li>5 comentarios</li>
                    </ul> <br>
                    <hr>
                    <p class="subtitulo">Recomendaciones</p>
                    <p style="font-size: 12px; padding-left: 30px;">Porque de tus obras favoritas es <br>Almendra - Won Pyung sohn</p>
                    <div class="recomendationCustom">
                        <img src="../img/tteokbokki.png" style="height: 150px; width: 100px; margin: 20px;">
                        <p style="font-size: 12px; margin-top: 20px;">Quiero morir, pero tambien comer tteokbokki <br>Por Baek Sehee</p>
                    </div>
                </div>
            </div>
        </div>
        <footer>
            Hola mundo 
        </footer>
    </body>
</html>
