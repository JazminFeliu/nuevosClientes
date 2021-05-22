<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Acceso al Sitio </title>
</head>
<body style="background-color: beige; padding:10px;">
<h1>NUEVO SERVLET!!!!</h1>
<br/>
<form action="nuevoServlet" method="post">
  <input type="text" placeholder="Usuario" name="usuario" />
  </br>
  <input type="password" placeholder="Password" name="password" />
  </br>
  <button type="submit">Enviar</button>
</form>

</body>
</html>