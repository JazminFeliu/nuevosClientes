<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Acceso al Sitio</title>
</head>
<body style="background-color: beige; padding:10px;">
<h1>Acceso a nuestro sitio</h1>
<br/>
<form action="hello-servlet" method="post">
    <input type="text" placeholder="Usuario" name="usuario" />
    </br>
    <input type="password" placeholder="Password" name="password" />
    </br>
    <button type="submit">Enviar</button>
</form>

</body>
</html>