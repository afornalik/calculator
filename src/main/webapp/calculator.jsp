
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
          integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

    <link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/materia/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-SYbiks6VdZNAKT8DNoXQZwXAiuUo5/quw6nMKtFlGO/4WwxW86BSTMtgdzzB9JJl" crossorigin="anonymous">

    <title>Task 1 | calculator</title>
</head>
<body>
<h2>Calculator</h2>
<div class="container mt-4">
    <form method="post" action="calculator">
        <div class="form-group col-6 fa fa-hand-o-down">
            <label for="f1">first number</label>
            <input type="number" name="firstNumber" class="form-control" id="f1" value="${fNumber}"/>
        </div>

        <div class="form-group col-6  fa fa-hand-o-down">
            <label for="f2">second number</label>
            <input type="number" name="secondNumber" class="form-control" id="f2" value="${sNumber}"/>
        </div>
        <!-- Default inline 1-->
        <div class="form-group col-6 mt-3">
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" class="custom-control-input" id="defaultInline1" name="operation"
                       value="ADD" checked="checked">
                <label class="custom-control-label" for="defaultInline1">add</label>
            </div>

            <!-- Default inline 2-->
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" class="custom-control-input" id="defaultInline2" name="operation"
                       value="SUBTRACT">
                <label class="custom-control-label" for="defaultInline2">subtract</label>
            </div>

            <!-- Default inline 3-->
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" class="custom-control-input" id="defaultInline3" name="operation"
                       value="DIVIDE">
                <label class="custom-control-label" for="defaultInline3">divide</label>
            </div>
            <!-- Default inline 4-->
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" class="custom-control-input" id="defaultInline4" name="operation"
                       value="MULTIPLY">
                <label class="custom-control-label" for="defaultInline4">multiply</label>
            </div>
            <!-- Default inline 4-->
            <div class="custom-control custom-radio custom-control-inline">
                <input type="radio" class="custom-control-input" id="defaultInline5" name="operation"
                       value="STRONG">
                <label class="custom-control-label" for="defaultInline5">strong</label>
            </div>
        </div>


        <div class="form-group mt-3">
            <button type="submit" class="btn btn-primary ">calculate</button>
        </div>
    </form>
    <div>
        ${result}
        ${errorMessage}
    </div>
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
