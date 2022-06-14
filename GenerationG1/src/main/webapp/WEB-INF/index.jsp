<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danko Abarca c:</title>
</head>
<body>
<h1>Hola <c:out value="${apellidos}"></c:out><c:out value="${nombre}"></c:out>
<c:out value="${usuario.nombre}"></c:out><c:out value="${usuario.apellidos}"></c:out>
</h1>
</body>
</html>
