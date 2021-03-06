<%-- 
    Document   : acceptpost
    Created on : Dec 10, 2020, 11:27:01 AM
    Author     : adria
--%>
<%@page import="java.util.List"%>
<%@page import="com.pw.dbconnection.models.AgregarNoticiaModel"%>
<%
    List<AgregarNoticiaModel> Revisar = (List<AgregarNoticiaModel>) request.getAttribute("NewsRevisa");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sport City</title>

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous" />

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
                integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
                integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="assets/css/modsaccept.css" />
    </head>

    <header>
    </header>



    <body>
        <nav class="navbar sticky-top navbar-expand-lg navbar-light shadow p-2 mb-4" style="background-color: #ffb84d;">
            <a class="navbar-brand" href="Home"> <img
                    src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Sport_balls.svg/1200px-Sport_balls.svg.png"
                    width="30" height="30" class="d-inline-block align-top" alt="" loading="lazy">
                SportCity</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                </ul>

                <form class="form-inline my-2 my-lg-0">
                    <a href="Pruebalogin.html" class="btn " role="button"
                       style="margin-left: 10px; background-color: #ffb84d; color: black;">Acceder</a>

                    <div class="media" style="margin-left: 10px;">
                        <img src="Images/DefaultPP.png" width="30" height="30" class="mr-3" alt="...">
                        <div class="media-body">
                            <h5 class="mt-0"></h5>

                        </div>
                    </div>
                </form>
                
            </div>
        </nav>

        <!--Hasta aqui termina mi header, aunque es body xd-->
        <div class="noticiamarco">
            <h1 style="text-align: center;">Solicitudes de Noticias</h1>
            <%
                for (AgregarNoticiaModel Noticias : Revisar) {
            %>
            <div class="card mb-3" style="max-width: 540px;">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="Images/DefaultPP.png" class="card-img" alt="...">
                    </div>
                    <div class="col-md-8">
                        <Form action="CheckNoticias?id=<%=Noticias.getID()%>" method="POST">
                            <div class="card-body">
                                <h5 class="card-title"><%=Noticias.getTitulo()%></h5>
                                <textarea id="adrian" class="form-control" name="Respuesta" style="display: none"></textarea>
                                <button class="btn btn-success" onclick="estado1()" >Aceptar</button>
                                <button class="btn btn-danger" onclick="estado2()" >Rechazar</button>
                                <button type="Submit" class="btn btn-success" >Subir</button>
                            </div>
                        </Form>    
                    </div>
                </div>
            </div>
            <%
                }
            %>



        </div>

        <!--Marco-->
        <script>
           
            function estado1() {

                document.getElementById("adrian").innerHTML = "Aceptado";
                event.preventDefault();
            }
            function estado2() {

                document.getElementById("adrian").innerHTML = "Rechazado";
                event.preventDefault();
            }

        </script>

    </body>

</html>