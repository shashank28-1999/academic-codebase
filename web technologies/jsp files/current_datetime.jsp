<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<%
    Date now = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat dayFormat  = new SimpleDateFormat("EEEE");
%>
<html>
<head><title>Current Date Time</title></head>
<body>
    <h2>Current Date, Time and Day</h2>
    <p>Date : <%= dateFormat.format(now) %></p>
    <p>Time : <%= timeFormat.format(now) %></p>
    <p>Day  : <%= dayFormat.format(now) %></p>
</body>
</html>
