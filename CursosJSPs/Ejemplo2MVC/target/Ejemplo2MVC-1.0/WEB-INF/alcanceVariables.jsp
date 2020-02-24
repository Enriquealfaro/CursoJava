
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance de variables</title>
    </head>
    <body>
        <h1>Alcance de variables</h1>
        <br>
        Variable request:<br>
        Base: ${rectanguloRequest.base}
        Altura: ${rectanguloRequest.altura}
        Area: ${rectanguloRequest.area}
        <br><br>
        Varables session:<br>
         Base: ${rectanguloSesion.base}
        Altura: ${rectanguloSesion.altura}
        Area: ${rectanguloSesion.area}
        <br><br>
         Varables application<br>
         Base: ${rectanguloAplicacion.base}
        Altura: ${rectanguloAplicacion.altura}
        Area: ${rectanguloAplicacion.area}
        <br><br>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio</a>
    </body>
</html>
