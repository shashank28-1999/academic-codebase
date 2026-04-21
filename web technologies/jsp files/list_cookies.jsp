<%@ page import="javax.servlet.http.Cookie" %>
<%
    Cookie[] cookies = request.getCookies();
    if (cookies == null || cookies.length == 0) {
        response.addCookie(new Cookie("sample_cookie", "HelloWorld"));
        response.addCookie(new Cookie("user", "TestUser"));
    }

    String list = request.getParameter("list");
%>
<html>
<head><title>List Cookies</title></head>
<body>
    <form method="post">
        <input type="submit" name="list" value="List Cookies">
    </form>
<% if (list != null) { %>
    <h2>Cookies Stored in Browser</h2>
    <table border="1" cellpadding="5">
        <tr><th>Name</th><th>Value</th></tr>
    <% if (cookies != null) {
           for (Cookie c : cookies) { %>
        <tr><td><%= c.getName() %></td><td><%= c.getValue() %></td></tr>
    <%     }
       } else { %>
        <tr><td colspan="2">No cookies found.</td></tr>
    <% } %>
    </table>
<% } %>
</body>
</html>
