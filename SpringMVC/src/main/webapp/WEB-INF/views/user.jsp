<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>


<html>
<head>
    <title>Profil użytkownika</title>
</head>
<body>
<div>Użytkownik o id: ${user.id}</div>
<div>Imię: ${user.firstName}</div>
<div>Nazwisko: ${user.lastName}</div>
<div>Wiek: ${user.age}</div>
<div>
    <c:choose>
        <c:when test="${user.age >= 18}">
            Pełnoletni
        </c:when>
        <c:otherwise>
            Niepełnoletni
        </c:otherwise>
    </c:choose>
</div>
<div>Płeć: ${user.gender}</div>
</body>
</html>