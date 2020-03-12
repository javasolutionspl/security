<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html lang="pl">
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div style='text-align:center'>
    <h1 class="display-4">My bank</h1>
    <h2>Amount: ${amount} <a href='http://localhost:8080/logout'>Logout</a></h2>
    <img src='/images/money.png' style='width:10%'></img>
    <h3 for="key">Send your money</h3>
    <div class='form-group'>
        <form:form method="post" modelAttribute="sendMoneyDetails">
            <div style= 'display:inline-block'>
            <label>User name:</label> <br/>
                <form:input path="userName" type="text" class="form-control" style="width:200px" />
            <label>Amount:</label> <br/>
                <form:input path="amount" type="text" class="form-control" style="width:200px" />
            </div>
    </div>
           <form:button class="btn btn-primary btn-lg" type="submit">Send money</form:button>
    </form:form>
</div>
</body>

</html>
