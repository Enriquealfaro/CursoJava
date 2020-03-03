
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="S" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><S:property value="titulo1F"></S:property></title>
    </head>
    <body>
        <h1><S:property value="titulo2F"></S:property></h1>
        <S:form>
            
            <S:textfield  name="usuario"/>
            
            <S:textfield  name="password"/>
            <S:submit key="formLogin.enviarF" name="submit"/>
        </S:form>
        
        <div>
            <S:property value="usuarioF"/> : <S:property value="usuario"/>
            <br>
            <S:property value="passwordF"/> : <S:property value="password"/>
        </div>
    </body>
</html>
