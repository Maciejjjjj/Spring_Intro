<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Dodawanie użytkownika</title>
</head>
<body>
<h1>Dodaj nowego użytkownika</h1>
<div>
    <form method="post" action="/users/add">
        <fieldset>
            <legend>Dane identyfikacyjne</legend>
            <div><label for="firstName">Imię: </label>
                <input type="text" name="firstName" id="firstName"/></div>
            <div><label for="lastName">Nazwisko: </label>
                <input type="text" name="lastName" id="lastName"/></div>
        </fieldset>
        <fieldset>
            <legend>Dane osobowe</legend>
            <div><label for="age">Wiek: </label>
                <input type="number" min="9" max="120" step="1" name="age" id="age"/></div>
            <div><label for="gender">Płeć: </label>
                <select name="gender" id="gender">
                    <option value="-" selected>-- Wybierz płeć --</option>
                    <option value="Mężczyzna">Mężczyzna</option>
                    <option value="Kobieta">Kobieta</option>
                </select>
            </div>
        </fieldset>
        <div>
            <input type="submit" value="Dodaj"/>
            <input type="reset" value="Wyczyść"/>
        </div>
    </form>
</div>
</body>
</html>