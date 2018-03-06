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
            <div class="row">
                <br>
                <div class="panel panel-primary">
                    <div class="panel-heading">Employee CRUD</div>
                    <div class="panel-body">
                        <form class="form-horizontal" action="/hello" method="post">
                            <div class="form-group">
                                <label class="control-label col-lg-2" for="first_name">First name:</label>
                                <div class="col-lg-8">
                                    <input type="text" class="form-control" id="first_name" placeholder="Enter first name" name="firstName">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-lg-2" for="last_name">Last name:</label>
                                <div class="col-lg-8">
                                    <input type="text" class="form-control" id="last_name" placeholder="Enter last name" name="lastName">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-lg-2" for="age">Age:</label>
                                <div class="col-lg-8">
                                    <input type="number" class="form-control" id="age" placeholder="Enter age" name="age">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-lg-2" for="salary">Salary:</label>
                                <div class="col-lg-8">
                                    <input type="number" class="form-control" id="salary" placeholder="Enter salary" name="salary">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-8">
                                    <button type="submit" class="btn btn-success center-block">Submit</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
