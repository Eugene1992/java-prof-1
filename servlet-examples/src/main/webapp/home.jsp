<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>
        <title>CRUD</title>
        <style>
            table {
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <h1>Employees</h1>
        <form action="/hello/jsp" method="post">
            <input type="hidden" name="id" value="${updUser.id}"> <br>
            Username: <input type="text" name="username" value="${updUser.username}"> <br>
            Login: <input type="text" name="login" value="${updUser.login}"> <br>
            Password: <input type="password" name="password" value="${updUser.password}"> <br>
            <button type="submit">Register</button>
        </form>
        <table>
            <tr>
                <th>Username</th>
                <th>Login</th>
                <th>Password</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach var = "user" items="${users}">
                <tr>
                    <td>${user.username}</td>
                    <td>${user.login}</td>
                    <td>${user.password}</td>
                    <td><a href="/hello/jsp?action=update&id=${user.id}">Update</a></td>
                    <td><a href="/hello/jsp?action=delete&id=${user.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
