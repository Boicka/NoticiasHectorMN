<%-- 
    Document   : register
    Created on : 21/06/2022, 08:54:15 PM
    Author     : serio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="estilos/login.css"/>
        <title>Registrarse</title>
    </head>
    <body class="text-center">
        <main class="form-signin">
            <form id="signForm" action="ValidarRegister" method="POST">
                <h1 class="h3 mb-3 fw-normal">Registrarse</h1>
                <img class="mb-4" src="estilos/lg.png" alt="Logo del corporativo" width="200" height="57">
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="nombre" name="nombre" >
                    <label for="nombre">Nombre(s)</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="apepaterno" name="apepaterno" >
                    <label for="apepaterno">Apellido Paterno</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="apematerno" name="apematerno" >
                    <label for="apematerno">Apellido Materno</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="direccion" name="direccion" >
                    <label for="direccion">Direccion</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="number" class="form-control" id="tipo" name="tipo" >
                    <label for="tipo">Tipo</label>
                </div>
                <div class="form-floating">
                    <input type="password" class="form-control" id="pass" name="pass">
                    <label for="pass">Contraseña</label>
                </div>
                <button type="submit" class="w-100 btn btn-lg btn-outline-primary mt-2">Registrar</button>
            </form>
            <p class="mt-5 mb-0 text-muted">&copy; Diseño previo 2022</p>
        </main>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
