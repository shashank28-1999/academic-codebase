<%@ page import="java.sql.*" %>
<%
    String DB_URL  = "jdbc:mysql://localhost:3306/bookstore";
    String DB_USER = "root";
    String DB_PASS = "";

    String username = request.getParameter("username");
    if (username != null && !username.isEmpty()) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO users (username, password, email, mobile, address) VALUES (?,?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2, request.getParameter("password"));
            ps.setString(3, request.getParameter("email"));
            ps.setString(4, request.getParameter("mobile"));
            ps.setString(5, request.getParameter("address"));
            ps.executeUpdate();
            con.close();
            out.println("<p>User registered successfully.</p>");
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
%>
<html>
<head><title>DB Users - JSP</title></head>
<body>
    <h2>Register New User</h2>
    <form method="post">
        Username: <input type="text" name="username"><br><br>
        Password: <input type="password" name="password"><br><br>
        Email:    <input type="text" name="email"><br><br>
        Mobile:   <input type="text" name="mobile"><br><br>
        Address:  <textarea name="address"></textarea><br><br>
        <input type="submit" value="Register">
    </form>

    <h2>Registered Users</h2>
    <table border="1" cellpadding="5">
        <tr><th>ID</th><th>Username</th><th>Email</th><th>Mobile</th><th>Address</th></tr>
    <%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while (rs.next()) {
    %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("username") %></td>
            <td><%= rs.getString("email") %></td>
            <td><%= rs.getString("mobile") %></td>
            <td><%= rs.getString("address") %></td>
        </tr>
    <%
            }
            con.close();
        } catch (Exception e) {
            out.println("<tr><td colspan='5'>DB Error: " + e.getMessage() + "</td></tr>");
        }
    %>
    </table>
</body>
</html>
