
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>El, y Variables Implicitas</title>
    </head>
    <body>
        <h1>El, y Variables Implicitas</h1>
        <ul>
            <li>Nombre de la aplicacion: ${pageContext.request.contextPath}</li>
            <li>Navegador del cliente: ${header["User-Agent"]}</li>
            <li>Id Sesion: ${cookie.JSESSIONID.value}</li>
            <li>Web server: ${pageContext.servletContext.serverInfo}</li>
            <li>valor parametro: ${param["usuario"]}</li>
            <br>
            <a href="inde.jps">regresar a la pagina de inicio</a>
        </ul>
    </body>
</html>
