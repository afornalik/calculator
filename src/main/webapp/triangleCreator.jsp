<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Andrzej
  Date: 2019-07-03
  Time: 00:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Task 2 | triangle</title>

    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
          integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

    <link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/materia/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-SYbiks6VdZNAKT8DNoXQZwXAiuUo5/quw6nMKtFlGO/4WwxW86BSTMtgdzzB9JJl" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-dark bg-dark">
    <div class="">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">JSP homework - SDA</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="nav-item"><a class="nav-link" href="calculator.jsp">task 1 - calculator </a></li>
            <li class="nav-item"><a class="nav-link"    href="triangleCreator.jsp">task 2 - triangle  </a></li>
        </ul>
    </div>
</nav>

<div class="container col-6 mt-4">
    <form method="get" action="triangleServlet">
        <div class="form-group">
            <label aria-labelledby="rNumber">Rows</label>
            <input type="number" class="form-control" name="rowsNumber" aria-labelledby="rNumber">
            <small id="rNumber">Write how many rows triangle should have.</small>
        </div>
        <div class="form-group">
            <input type="submit" class="btn btn-danger" value="draw triangle">
        </div>
    </form>

    <c:forEach var="row" items="${triangleLeft}">
        <c:forEach var="cell" items="${row}">
            <c:out value="${cell}" />
        </c:forEach>
        <br>
    </c:forEach>
</div>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
