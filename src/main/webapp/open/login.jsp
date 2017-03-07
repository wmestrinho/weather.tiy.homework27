<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Weather or NOT</title>

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
        <li><a href="/secure/weather.jsp"><h4>Check Weather</h4></a></li>
        <li><a href="/secure/history"><h4>History</h4></a></li>
        <li><a href="/secure/display.jsp"><h4>Display</h4></a></li>
    </ul>

</nav>

<div class="container" align="center">
    <h1>Weather or Not</h1>
    <p><h6>Making it Rain</h6></p>
</div>
<c:if test="${err_login_msg}">
    <div class="alert alert-warning">
        Incorrect User and Password
    </div>
</c:if>
<div class="container" align="center">
    <form class="form-signin" action="/open/authenticate" method="post">
        <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <input id="guest" type="text" class="form-control" name="guest" placeholder="guest">
        </div>
        <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
            <input id="password" type="password" class="form-control" name="password" placeholder="Password">
        </div>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>
    <br>
</div>

</body>
</html>
