<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Form Result</title>
    </head>
    <body>
        <p>Username: <%= request.getParameter("username") %></p><br>
        <p>Password: <%= request.getParameter("password") %></p>
    </body>
</html>
