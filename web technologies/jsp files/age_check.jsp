<%
    String name = request.getParameter("name");
    String ageStr = request.getParameter("age");
    if (name != null && ageStr != null) {
        int age = Integer.parseInt(ageStr);
%>
<html><body>
<% if (age < 18) { %>
    <p>Hello <%= name %>, you are not authorized to visit the site.</p>
<% } else { %>
    <p>Welcome to this site.</p>
<% } %>
</body></html>
<%
    } else {
%>
<html>
<head><title>Age Check</title></head>
<body>
    <h2>Enter Details</h2>
    <form method="post">
        Name: <input type="text" name="name" required><br><br>
        Age:  <input type="number" name="age" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
<% } %>
