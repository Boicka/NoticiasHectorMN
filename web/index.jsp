<%-- 
    Document   : index
    Created on : 21/06/2022, 07:49:54 PM
    Author     : serio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <title>Noticias Castores</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="resources/images/lg.png">
        <link rel="stylesheet" href="resources/css/style.css"/>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>

    <body onload="alerta('${mensaje}');">

        <div id="encabezado">
            <div>
                <h1>
                    <img src="resources/images/lg.png"  width="300" height="125">
                </h1>
            </div>
        </div>
        <ul>
            <li><a href="./index.jsp" class="active" > <i class="fa fa-home"></i> Inicio</a></li>
            <li><a href="./newnota.jsp" class="p1"><i class="fa fa-user-plus"></i>Nueva Nota</a></li>
            <li><a href="./newnota.jsp" class="p1"><i class="fa fa-user-plus"></i>Consultar Noticias</a></li>
            <li><a href="./registro.jsp" class="p1"><i class="fa fa-trash"></i> Registrarse</a></li>
            <li><a href="./login.jsp" class="p1"><i class="fa fa-trash"></i> Iniciar Sesión</a></li>
        </ul>
        
        <div class="welcome">
            <h1>Bienvenido</h1>
        </div>
    </body>
</html>

