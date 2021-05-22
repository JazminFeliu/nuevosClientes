<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Nuevo Cliente</title>
</head>
<body>
<h1>Alta de Nuevo cliente</h1>
<p>Complete el siguiente formulario para registrar un nuevo cliente. Los campos con asterisco son obligatorios </p>
<br/>
<form action="nuevoCliente" method="post" >
  <input type="text" placeholder="Nombre" required name="nombre" /><span style="color: red">*</span>
  </br>
  <input type="text" placeholder="cargo" name="cargo"><span style="color: red"/>*</span>
  </br>
  <input type="text" placeholder="empresa" name="empresa" /> <span style="color: red">*</span>
  </br>
  <input type="phone" placeholder="telefono" name="telefono" /><span style="color: red">*</span>
  </br>
 <input type="text" placeholder="email" name="email" /> <span style="color: red">*</span>
  </br>
  <button type="submit">Enviar</button>
</form>

</body>
</html>
