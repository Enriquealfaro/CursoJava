
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de inclusion dinamica</title>
    </head>
    <body>
        <h1>Ejemplo de inclusion dinamica</h1>
        <br>
        <jsp:include page="paginas/recursoPublico.jsp"></jsp:include>
        <br>
        <jsp:include page="WEB-INF/recursoPrivado.jsp">
        
            <jsp:param name="colorFondo" value="red"/>
            
        </jsp:include>
    </body>
</html>
