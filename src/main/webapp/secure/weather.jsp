<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WagnerMestrinho
  Date: 2/11/17
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Weather</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

<nav class="navbar navbar-inverse">
    <ul class="nav navbar-nav">
        <li><a href="/open/login.jsp"><h4>Login</h4></a></li>
        <li><a href="/secure/weather.jsp"><h4>Weather</h4></a></li>
        <li><a href="/secure/history"><h4>History</h4></a></li>
        <li><a href="/secure/display.jsp"><h4>Display</h4></a></li>
    </ul>

</nav>
<c:if test="${msg_success != null}">
    <div class="alert alert-success">
        <c:out value="${msg_success}"/>
    </div>
</c:if>
<div class="container" align="center">
    <p><h1>LET'S SEE WEATHER OR NOT IS A GOOD DAY</h1></p>
</div>
<form class="form-horizontal" action="/secure/calling" method="post">
    <div class="container" align="center">
        <div class="input-group">
            <div class="form-group" class="col-xs-3">
                <Label>ZIP Code</Label><input type="text" name="zipcode" pattern="\d{5}-?(\d{4})?" title="Five digit Zip-Code" />
                <br>
                <Label>Latitude</Label><input type="text"  name="latitude" title="Valid Latitude Number" required/>
                <br>
                <Label>Longitude</Label><input type="text"  name="longitude" title="Valid Longitude Number" required/>
                <br>
                <h1>CITIES IN INDIA </h1>
                <p>
                    <strong>Saint Dnyaneshwar Garden and Paithan park, Paithen, Maharashtra, India</strong> :	19.487707	75.380768<br>
                    <strong>Sinnar, Maharashtra, India</strong> :	19.853060	74.000633<br>
                    <strong>Guntakal, Andhra Pradesh, India</strong>	: 15.167409	77.373627<br>
                    <strong>Lalgola, West Bengal, India	24.417534</strong> : 88.250343<br>
                    <strong> Hoshangabad, Madhya Pradesh, India</strong> :	22.744108	77.736969<br>
                    <strong>Proddatur, Andhra Pradesh, India</strong> :	14.752805	78.552757<br>
                    <strong>RL Infotechh & Solutions, Durgapur, India</strong> : 23.520399	87.311897</p>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Check</button>
        </div>
    </div>
</form>
</div>
</div>

</body>
</html>
