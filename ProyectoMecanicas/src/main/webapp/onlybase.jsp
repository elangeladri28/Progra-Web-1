<%-- 
    Document   : onlybase
    Created on : Dec 7, 2020, 1:12:43 AM
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
    <link rel="stylesheet" href="assets/css/modsbase.css" />
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
                    <!--Esto es otra seccion del navbar-->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            En Equipo
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="onlysoccer.jsp">Futbol Soccer</a>
                            <a class="dropdown-item" href="onlybasket.jsp">Basketball</a>
                            <a class="dropdown-item" href="onlybase.jsp">Baseball</a>
                            <a class="dropdown-item" href="onlyfootball.jsp">American Football</a>
                        </div>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            De Pelea
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="onlymma.jsp">MMA</a>
                            <a class="dropdown-item" href="onlybox.jsp">Boxeo</a>
                            <a class="dropdown-item" href="onlyjudo.jsp">Judo</a>
                        </div>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Individuales
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="onlygolf.jsp">Golf</a>
                            <a class="dropdown-item" href="onlyatletismo.jsp">Atletismo</a>
                            <a class="dropdown-item" href="onlyciclismo.jsp">Ciclismo</a>
                        </div>
                    </li>
                    <%String Tipo = (String) session.getAttribute("Tipo");%>
                    <%if (Tipo != null) {%>
                    <%if (Tipo.equals("Administrador") || Tipo.equals("Editor") || Tipo.equals("Creador")) {%>
                    <li class="nav-item">
                        <a class="nav-link" href="AgregarNoticia">AgregarNoticia</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="CheckNoticias">AprobarNoticias</a>
                    </li>
                    <%}%>
                    <%}%>
                </ul>

                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="Search">
                    <button class="btn btn-success my-2 my-sm-0" type="submit"><img
                            src="https://www.seekpng.com/png/full/920-9209972_magnifying-glass-png-white-search-icon-white-png.png" 
                            width="20" height="20" alt=""></button>
                        <%String Username = (String) session.getAttribute("Username"); %>
                        <%if (Username != null) {%>

                    <label><%= Username%></label>
                    <div class="media" style="margin-left: 10px;">
                        <img href="<%=(String) session.getAttribute("Image")%>"  width="30" height="30" class="mr-3" alt="...">
                    </div>
                    <a type="button" href="Close" class="btn btn-danger">Salir</a>

                    <%} else {%>
                    <a href="Login" class="btn " role="button"
                       style="margin-left: 10px; background-color: #ffb84d; color: black;">Acceder</a>

                    <div class="media" style="margin-left: 10px;">

                        <img src="Images/DefaultPP.png" width="30" height="30" class="mr-3" alt="...">

                    </div>
                    <%}%>  
                </form>
            </div>
        </nav>

    <!--Hasta aqui termina mi header, aunque es body xd-->
    <div class="container">
       

       
    </div>
</body>

</html>
