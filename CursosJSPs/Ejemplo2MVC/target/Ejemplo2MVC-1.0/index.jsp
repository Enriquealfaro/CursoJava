<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC 2</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo MVC 2</h1>
        <br>
        <div style="color:red">${mensaje}</div>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador">Link al servlet controlador SIN paramentros</a>
        <br>
        <br>
         <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregarVariable">Link al servlet controlador para agregar las variables</a>
         <br>
        <br>
         <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariable">Link al servlet controlador para  listar variables</a>
    </body>
</html>