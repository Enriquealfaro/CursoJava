
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con scriplets</title>
    </head>
    <body>
        <h1>JSP con scriplets</h1>
        <br>
        <%-- Scriplet para enviar informacion al navegador--%>
        <%
            out.print("Saludos desde un scriptle");
        %>
        
        <%-- Scriplet para manipular los objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("nombre de la aplicicion: " + nombreAplicacion);
        %>
        <%-- Scriptlet con codigo condicionado --%>
        <% 
            if(session != null && session.isNew()){
        %>
        la sesion SI es  nueva
        <% 
        
            }else if(session !=null){
        
        %>
        la sesion No es nueva
        <% } %>
        <br>
        <a href="index.html">Inicio</a>
    </body>
</html>
