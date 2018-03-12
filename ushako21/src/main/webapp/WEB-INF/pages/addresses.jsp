<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Addresses главная</title>
  <style type="text/css">
    .tg {
      border-collapse: collapse;
      border-spacing: 0;
      border-color: #ccc;
    }

    .tg td {
      font-family: Arial, sans-serif;
      font-size: 14px;
      padding: 10px 5px;
      border-style: solid;
      border-width: 1px;
      overflow: hidden;
      word-break: normal;
      border-color: #ccc;
      color: #333;
      background-color: #fff;
    }

    .tg th {
      font-family: Arial, sans-serif;
      font-size: 14px;
      font-weight: normal;
      padding: 10px 5px;
      border-style: solid;
      border-width: 1px;
      overflow: hidden;
      word-break: normal;
      border-color: #ccc;
      color: #333;
      background-color: #f0f0f0;
    }

    .tg .tg-4eph {
      background-color: #f9f9f9
    }
  </style>
</head>
<body>
<a href="../../index.jsp">Back to main menu</a>

<br/>

<h1>Book List</h1>
<c:if test="${!empty listAddresses}">
  <table class="tg">
    <tr>
      <th width="80">ID</th>
      <th width="120">Street</th>
      <th width="120">House</th>
      <th width="120">Flats Quantity</th>
      <th width="60">Edit</th>
      <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listAddresses}" var="address">
      <tr>
        <td>${address.id}</td>
        <td><a href="/bookdata/${address.id}" target="_blank">${address.street}</a></td>
        <td>${address.house}</td>
        <td>${address.flatQuantity}</td>
        <td><a href="<c:url value='/edit/${address.id}'/>">Edit</a></td>
        <td><a href="<c:url value='/remove/${address.id}'/>">Delete</a></td>
      </tr>
    </c:forEach>
  </table>
</c:if>

<h1>Add a Book</h1>

<c:url var="addAction" value="/addresses/add"/>

<form:form action="${addAction}" commandName="address">
  <table>
    <c:if test="${!empty address.street}">
      <tr>
        <td>
          <form:label path="id">
            <spring:message text="ID"/>
          </form:label>
        </td>
        <td>
          <form:input path="id" readonly="true" size="8" disabled="true"/>
          <form:hidden path="id"/>
        </td>
      </tr>
    </c:if>
    <tr>
      <td>
        <form:label path="street">
          <spring:message text="street"/>
        </form:label>
      </td>
      <td>
        <form:input path="street"/>
      </td>
    </tr>
    <tr>
      <td>
        <form:label path="house">
          <spring:message text="house"/>
        </form:label>
      </td>
      <td>
        <form:input path="house"/>
      </td>
    </tr>
    <tr>
      <td>
        <form:label path="flatQuantity">
          <spring:message text="flatQuantity"/>
        </form:label>
      </td>
      <td>
        <form:input path="flatQuantity"/>
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <c:if test="${!empty address.street}">
          <input type="submit"
                 value="<spring:message text="Edit Address"/>"/>
        </c:if>
        <c:if test="${empty address.street}">
          <input type="submit"
                 value="<spring:message text="Add Street"/>"/>
        </c:if>
      </td>
    </tr>
  </table>
</form:form>

</body>
</html>
