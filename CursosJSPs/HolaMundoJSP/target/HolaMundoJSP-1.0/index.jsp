<%-- 
    Document   : index
    Created on : 19 feb. 2020, 14:23:18
    Author     : fernandoCentauro
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola mundo JSP</title>
    </head>
    <body>
        <h1>Hola mundo JSP</h1>
            <ul>
                <li> <% out.print("Hola mundo con Scriplets");%> </li>
                <li>${"HOlaMundo con expression Languaje(EL)"}</li>
                <li> <%= "Hola mundo" %></li>
                <li><c:out value="Hola mundo con JSTL" />  </li>
            </ul>
    </body>
</html>
