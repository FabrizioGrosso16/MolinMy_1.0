<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html> <html> 
    <head> 
        <title>RegistroCiudadano</title> 
    <link rel="stylesheet" type="text/css" href="newcss.css">
    </head> 
<body> <h2>Registrarse</h2> 
<form action="/submit_registration" method="post"> 
<label for="fname">Nombres:</label><br> 
<input type="text" id="fname" name="fname"><br>

<label for="lname">Apellidos:</label><br>
<input type="text" id="lname" name="lname"><br>

<label for="email">Correo Electronico:</label><br>
<input type="email" id="email" name="email"><br>

<label for="pwd">Contrasena:</label><br>
<input type="password" id="pwd" name="pwd"><br>

<input type="submit" value="Registrarme">
</form> 
<h3>tienes cuenta?</h3> <a href="/Principal.jsp">Iniciar sesion</a> 
</body> 
</html>
