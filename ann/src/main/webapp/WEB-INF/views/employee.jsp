<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello world</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row col-lg-8 col-lg-offset-2">
        <br>
        <div class="panel panel-primary ">
            <div class="panel-heading">Employee CRUD</div>
            <div class="panel-body">
                <form class="form-horizontal" action="/hello" method="post">
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-offset-2" for="first_name">First name:</label>
                        <div class="col-lg-5">
                            <input type="text" class="form-control" id="first_name" placeholder="Enter first name" name="firstName">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-offset-2" for="last_name">Last name:</label>
                        <div class="col-lg-5">
                            <input type="text" class="form-control" id="last_name" placeholder="Enter last name" name="lastName">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-offset-2" for="age">Age:</label>
                        <div class="col-lg-5">
                            <input type="number" class="form-control" id="age" placeholder="Enter age" name="age">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-lg-2 col-lg-offset-2" for="salary">Salary:</label>
                        <div class="col-lg-5">
                            <input type="number" class="form-control" id="salary" placeholder="Enter salary" name="salary">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-8">
                            <button type="submit" class="btn btn-success center-block">Submit</button>
                        </div>
                    </div>
                </form>

                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Age</th>
                        <th>Salary</th>
                        <th style="width: 5%"><span class="glyphicon glyphicon-refresh" aria-hidden="true"></span></th>
                        <th style="width: 5%"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${employees}" var="employee">
                        <tr>
                            <td>${employee.firstName}</td>
                            <td>${employee.lastName}</td>
                            <td>${employee.age}</td>
                            <td>${employee.salary}</td>
                            <td>
                                <button type="button" class="btn btn-info">
                                    <span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>
                                </button>
                            </td>
                            <td>
                                <button type="button" class="btn btn-danger">
                                    <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                </button>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
