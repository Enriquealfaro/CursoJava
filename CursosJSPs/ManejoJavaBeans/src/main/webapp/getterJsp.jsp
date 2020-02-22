
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee los valores del javaBean</title>
    </head>
    <body>
        <h1>JSP que lee los valores del javaBean</h1>
        <br>
        <jsp:useBean id="rectagulo" class="beans.Rectangulo" scope="session"></jsp:useBean>
        <br>
        Valor Base: <jsp:getProperty name="rectangulo" property="base"></jsp:getProperty>
        <br>
        Valor altura: <jsp:getProperty name="rectangulo" property="altura"></jsp:getProperty>
        <br>
        Valor area: <jsp:getProperty name="rectangulo" property="area"></jsp:getProperty>
        <br>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
