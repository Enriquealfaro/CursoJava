<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="S" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><S:text name="form.titulo"/></title>
        <S:head/>
    </head>
    <body>
        <h1><S:text name="form.titulo"/></h1>
        <S:form>
            <S:textfield key="form.nombre" name="persona.nombre"/>
            <S:textfield key="form.calle"  name="persona.domicilio.calle"/>
            <S:textfield key="form.no.calle" name="persona.domicilio.numeroCalle"/>
            <S:textfield key="form.pais" name="persona.domicilio.pais"/>
            <S:submit key="form.enviar"/>
        </S:form>

        <h2><S:text name="form.resultado"/></h2>
        <S:text name="form.nombre"/>: <S:property value="persona.nombre"/><br>
        <S:text name="form.calle"/>: <S:property value="persona.domicilio.calle"/><br>
        <S:text name="form.no.calle"/>: <S:property value="persona.domicilio.numeroCalle"/><br>
        <S:text name="form.pais"/>: <S:property value="persona.domicilio.pais"/><br>


        <S:url var="localeES" action="personas">
            <S:param name="request_locale">es</S:param>
        </S:url>

        <S:url var="localeEN" action="personas">
            <S:param name="request_locale">en</S:param>
        </S:url>


        <S:a href="%{localeES}"><S:text name="form.idioma.espaniol"/></S:a>    
        <S:a href="%{localeEN}"><S:text name="form.idioma.ingles"/></S:a>   


    </body>
</html>
