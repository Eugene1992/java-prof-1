<%@ page import="java.io.PrintWriter" %>
<h1>Hello world!</h1>
<%
    PrintWriter writer = response.getWriter();
    writer.write("Cookies:");
    writer.write("<br>");
    for (Cookie cookie : request.getCookies()) {
        writer.write(cookie.getName() + " : " + cookie.getValue());
        writer.write("<br>");
    }
%>