
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CRUD</title>
</head>
<body>
<h1>Employees</h1>>
<table border = "1">
    <tr>
        <th>Lastname</th>
        <th>Firstname</th>
        <th>Login</th>
        <th>Password</th>
        <th>Age</th>
        <th>Salary</th>
        <th>IsMarried</th>
    </tr>

    <c:forEach var = "employee" items ="${employees}">
    <tr>
        <td>${employee.firstname}</td>
        <td>${employee.lastname}</td>
        <td>${employee.login}</td>
        <td>${employee.password}</td>
        <td>${employee.age}</td>
        <td>${employee.salary}</td>
        <td>${employee.isMarried}</td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
