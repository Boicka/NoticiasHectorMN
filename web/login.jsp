<%-- 
    Document   : login
    Created on : 22/06/2022, 06:05:01 PM
    Author     : serio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="estilos/login.css"/>
        <title>Iniciar Sesión</title>
    </head>

    <body class="text-center">
        <main class="form-signin">
            <form id="loginform">
                <h1 class="h3 mb-3 fw-normal">Iniciar sesión</h1>
                <img class="mb-4" src="estilos/lg.png" alt="Logo del corporativo" width="200" height="57">
                <div class="form-floating mb-3">
                    <input type="number" class="form-control" id="usuario" name="usuario" >
                    <label for="usuario">Usuario</label>
                </div>
                <div class="form-floating">
                    <input type="password" class="form-control" id="pass" name="pass">
                    <label for="pass">Contraseña</label>
                </div>
                <button type="submit" class="w-100 btn btn-lg btn-outline-primary mt-2" name="accion" value="acceder">Acceder</button>
            </form>
            <p class="mt-5 mb-0 text-muted">&copy; Diseño previo 2022</p>
        </main>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>