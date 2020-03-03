<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="S" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><S:text name="bienvenido.titulo"/></title>
        <S:head/>
    </head>
    <body>
        <h1><S:text name="bienvenido.titulo"/></h1>
        
        <S:actionmessage/>
        <S:actionerror/>
        
        <h2>
            <S:text name="bienvenido.mensaje"/>:
        </h2>
        <br/>
        <S:text name="formLogin.usuarioF"/>: <S:property value="usuario"/>
        <br/>
        <S:text name="formLogin.passwordF"/> <S:property value="password"/>
        <br>
        <a href="<S:url action="login"/>"><S:text name="bienvenido.regresar"/></a>
    </body>
</html>
