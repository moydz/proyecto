<%-- 
    Document   : form
    Created on : 05-sep-2015, 16:00:25
    Author     : moises
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="agregar.html" method="POST" commandName="cmdForm">
		<form:label path="nombre">Nombre</form:label>
		<form:input path="nombre"/><br />
		<form:label path="apellido">Apellido</form:label>
		<form:input path="apellido"/>
		<input type="submit" value="Enviar"/>
	</form:form>
</body>
</html>