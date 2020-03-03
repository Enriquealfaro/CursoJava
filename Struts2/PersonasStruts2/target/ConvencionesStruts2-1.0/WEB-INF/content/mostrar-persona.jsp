
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar persona con struts 2</title>
    </head>
    <body>
        <h1>Persona con struts 2</h1>
        <s:form>
            <s:textfield name="nombre"/>
            <s:submit value="Enviar"/>
        </s:form>
        <div>
            Nombre proporcionado: <s:property value="nombre"/>
        </div>
    </body>
</html>
