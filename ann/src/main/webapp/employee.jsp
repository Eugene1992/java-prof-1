
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CRUD</title>
</head>
<body>
<h1>Employees</h1>


<div class="styleform">
<form action="/employee.jsp/" method="post">
    <label>Lastname:</label><input type="text" name="lastname"><div class="clear"></div><br>
    <label>Firstname:</label><input type="text" name="firstname"><div class="clear"></div><br>
    <label>Login:</label><input type="text" name="login"><div class="clear"></div><br>
    <label>Password:</label><input type="password" name="password"><div class="clear"></div><br>
    <label>Age:</label><input type="text" name="age"><div class="clear"></div><br>
    <label>Salary:</label><input type="text" name="salary"><div class="clear"></div><br>
    <label>isMarried</label>:<input type="text" name="isMarried"><div class="clear"></div><br>
    <button type="submit">Register</button>

</form>
</div>
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
