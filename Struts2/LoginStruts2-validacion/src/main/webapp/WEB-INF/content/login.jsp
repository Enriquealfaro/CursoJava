
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="S" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><S:text name="formLogin.titulo1"/></title>
        <S:head/>
    </head>
    <body>
        <h1><S:property value="formLogin.titulo2"></S:property></h1>
        
        <S:actionerror/>
        
        <S:form action="validarUsuario">           
            <S:textfield  key="usuario"/>            
            <S:textfield  key="password"/>
            <S:submit key="formLogin.enviarF" name="submit"/>
        </S:form>      
    </body>
</html>
