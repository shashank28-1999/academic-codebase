<%@ page import="java.util.Date" %>
<%
    String logout = request.getParameter("logout");
    if ("true".equals(logout)) {
        Date start = (Date) session.getAttribute("startTime");
        long duration = (new Date().getTime() - start.getTime()) / 1000;
        String uname = (String) session.getAttribute("name");
        session.invalidate();
%>
<html><body>
<h2>Thank You, <%= uname %>!</h2>
<p>You used the site for <%= duration %> seconds.</p>
</body></html>
<%
        return;
    }

    String name = request.getParameter("name");
    if (name != null && !name.isEmpty()) {
        session.setAttribute("name", name);
        session.setAttribute("startTime", new Date());
    }

    String sessionName = (String) session.getAttribute("name");
    Date startTime = (Date) session.getAttribute("startTime");
%>
<html><body>
<% if (sessionName != null) { %>
    <div style="text-align:right; font-size:12px;">Started: <%= startTime %></div>
    <h2>Hello, <%= sessionName %>!</h2>
    <a href="hello_session.jsp?logout=true">Logout</a>
<% } else { %>
    <h2>Enter Your Name</h2>
    <form method="post">
        <input type="text" name="name" required>
        <input type="submit" value="Submit">
    </form>
<% } %>
</body></html>
