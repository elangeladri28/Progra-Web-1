<%-- 
    Document   : Pruebalogin
    Created on : Dec 6, 2020, 10:54:37 PM
    Author     : adria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
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
        <link rel="stylesheet" href="assets/css/modsprueba.css"/>
        <link rel="icon" type="image/png"
              href="https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Sport_balls.svg/1200px-Sport_balls.svg.png" />
    </head>
    <header>
        <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #ffb84d;">
            <a class="navbar-brand" href="index.jsp"> <img
                    src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Sport_balls.svg/1200px-Sport_balls.svg.png"
                    width="30" height="30" class="d-inline-block align-top" alt="" loading="lazy">
                SportCity</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>        
        </nav>
    </header>
    <body>

        <div class="container" style="margin-top: 100px;">

            <div class="contenedortodo">

                <div class="cajatrasera">

                    <div class="cajatrasera-login">
                        <h3>¿Ya tienes una cuenta?</h3>
                        <p>Inicia sesión para entrar en la página</p>
                        <button id="btn__iniciar-sesion">Iniciar sesión</button>
                    </div>

                    <div class="cajatrasera-register">
                        <h3>¿Aún no tienes una cuenta?</h3>
                        <p>Regístrate para que puedas iniciar sesión</p>
                        <button id="btn__registrarse">Registrarse</button>
                    </div>

                </div>
                <div class="contenedor__login-register">
                    <form action="./Login" method="POST" class="formulario__login" >
                        <h2>Iniciar sesión</h2>
                        <input type="text" name="Username" placeholder="Username">
                        <input type="password" name="Password" placeholder="Contraseña">
                        <button type="submit">Entrar</button>
                    </form> 

                    <form action="./Register" method="POST" class="formulario__register">
                        <h2>Registrarse</h2>
                        <input type="text" name="RUsername" placeholder="Username">
                        <input type="email" name="REmail" placeholder="Email">
                        <input type="password" name="RPassword" placeholder="Contraseña">

                        <input type="text" name="RFacebook" placeholder="Facebook">
                        <input type="text" name="RInstagram" placeholder="Instagram">
                        <input type="text" name="RTwitter" placeholder="Twitter">
                        
                        
                        <input type="file" name="RPP">
                        <button type="submit">Registrarse</button>


                    </form>

                </div>
            </div>

        </div>
        <script src="assets/js/pruebalogin.js"></script>
    </body>
</html>
