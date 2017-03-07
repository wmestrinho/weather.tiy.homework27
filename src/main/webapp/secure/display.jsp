<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
    <c:forEach items="${mList.iterator()}" var="request">
        <c:set var="now" value="${request.currently}" />
        <h2>Temperature</h2> <c:out value="${now.temperature}"/>
        <h2>Humidity</h2> <c:out value="${now.humidity}"/>
        <h2>Precipitation</h2> <c:out value="${now.preciprobability}"/>
        <h2>Summary</h2><c:out value="${now.summary}"/>
        <h2>visibility</h2><c:out value="${now.visibility}"/>
        <br>
    </c:forEach>
</div>
</body>
</html>
