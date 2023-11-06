<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Agência de Viagens</title>
</head>
<body>
    <h1>Destinos Disponíveis</h1>
    <c:forEach var="destino" items="${destinos}">
        <p>${destino.nome} - ${destino.preco}</p>
    </c:forEach>
</body>
</html>
