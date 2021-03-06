<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WagnerMestrinho
  Date: 2/12/17
  Time: 11:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Your History</title>

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

<div class="container" align="center">
    <p><h1>HOUSE THE WEATHER</h1></p>
</div>
<div class="container" align="center">
    <c:forEach items="${mList.iterator()}" var="request">
        <c:set var="now" value="${request.currently}" />
        <h2>Longitude</h2> <c:out value="${request.longitude}"/>
        :
        <h2>Latitude</h2><c:out value="${request.latitude}"/>
        <br>
    </c:forEach>
</div>

<div class="row">
    <div class="col-sm-6 col-xs-4" >
        <c:if test="${mList.hasPrevious()}">
            <div class="pull-left"><a href="/secure/history?page=<c:out value="${mList.number - 1}"/>"> Previous
                Page</a></div>
        </c:if>
    </div>
    <div class="col-sm-6 col-xs-4">

        <c:if test="${mList.hasNext()}">
            <div class="pull-right"><a href="/secure/history?page=<c:out value="${moviePage.number + 1}"/>"> Next
                Page</a></div>
        </c:if>
    </div>
</div>

</body>
</html>
