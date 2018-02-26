<%@ page import="java.io.PrintWriter" %><%
    PrintWriter writer = response.getWriter();
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        writer.write(cookie.getName() + " : " + cookie.getValue() + "<br>");
    }
%>