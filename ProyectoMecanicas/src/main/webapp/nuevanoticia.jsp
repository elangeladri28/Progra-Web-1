<%-- 
    Document   : nuevanoticia
    Created on : Dec 7, 2020, 2:03:48 AM
    Author     : adria
--%>

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
        <link rel="stylesheet" href="assets/css/modsnuevanoticia.css" />
        <link rel="icon" type="image/png"
              href="https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Sport_balls.svg/1200px-Sport_balls.svg.png" />
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
            </div>
        </nav>
        <div class="noticiamarco" style="margin-bottom: 50px;">
            <form action="./AgregarNoticia" method="POST">
                <h1>Nueva Noticia</h1>
                <h4>Titulo:</h4>
                <div class="form-group" style="margin-right: 20px; margin-left: 5px;">
                    <input type="text" name="NTitulo" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                           placeholder="Titulo">
                </div>
                <h4>Descripcion:</h4>
                <div class="form-group" style="margin-right: 20px; margin-left: 5px;">
                    <input class="form-control" type="text" name="NDescripcion" id="exampleFormControlTextarea1" placeholder="Descripcion"
                           rows="4">
                </div>
                <h4>Deporte:</h4>
                <div class="form-group" style="margin-right: 20px; margin-left: 5px;">
                    <select class="form-control" type="text" name="NDeporte" id="exampleFormControlSelect1">
                        <option>Futbol Soccer</option>
                        <option>Basketball</option>
                        <option>Baseball</option>
                        <option>American Football</option>
                        <option>MMA</option>
                        <option>Boxeo</option>
                        <option>Judo</option>
                        <option>Golf</option>
                        <option>Atletismo</option>
                        <option>Ciclismo</option>
                    </select>
                </div>
                <h4>Imagenes:</h4>

                <label>Agregar Imagen</label>
                <div class="form-group-imagen1">
                    <input type="file" name="NImage1" class="form-control-file" id="Archivo1">
                </div>
                <label>Agregar Imagen</label>

                <div class="form-group-imagen2">
                    <input type="file" name="NImage2" class="form-control-file" id="Archivo2">
                </div>

                <label>Agregar Imagen</label>
                <div class="form-group-imagen3">
                    <input type="file" name="NImage3"  class="form-control-file" id="Archivo3">
                </div>


                <h4 style="margin-top: 10px;">Video:</h4>

                <div class="form-group-video"  style="margin-bottom: 50px;">
                    <label for="Archivo1">Agregar vídeo</label>
                    <input type="file" name="NVideo" class="form-control-file" id="Archivo1">
                </div>


                <button type="submit" class="btn btn-success">Agregar Noticia</button>
                <%--<a type="button" href="Close" class="btn btn-success">Agregar Noticia</a>--%>
            </form>
        </div> <!--Marco-->

    </body>

</html>