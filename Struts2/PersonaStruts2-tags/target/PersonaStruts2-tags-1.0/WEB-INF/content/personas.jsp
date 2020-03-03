<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="S" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Formulario Personas</title>
        <S:head/>
    </head>
    <body>
        <h1>Formulario de Personas(OGNL</h1>
        <S:form>
            <S:textfield label="Nombre" name="persona.nombre"/>
            <S:textfield label="calle"  name="persona.domicilio.calle"/>
            <S:textfield label="No. Calle" name="persona.domicilio.numeroCalle"/>
            <S:textfield label="Pais" name="persona.domicilio.pais"/>
            <S:submit value="Enviar"/>
        </S:form>
        
        <h2>Valores proporcionados</h2>
        Nombre: <S:property value="persona.nombre"/><br>
        Calle: <S:property value="persona.domicilio.calle"/><br>
        No. Calle: <S:property value="persona.domicilio.numeroCalle"/><br>
        Pais: <S:property value="persona.domicilio.pais"/><br>
        
        <br>
        <S:if test="persona.nombre != null">
            <S:if test="persona.nombre == 'admin'">
                Es un usuario administrador
            </S:if>
            <S:else>
                El usuario NO es administrador
            </S:else>
        </S:if>
        
    </body>
</html>
