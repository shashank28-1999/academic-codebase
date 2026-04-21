<%
    String result = "";
    String num1Str = request.getParameter("num1");
    String num2Str = request.getParameter("num2");
    String op      = request.getParameter("op");

    if (num1Str != null && num2Str != null && op != null) {
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        switch (op) {
            case "+": result = String.valueOf(num1 + num2); break;
            case "-": result = String.valueOf(num1 - num2); break;
            case "*": result = String.valueOf(num1 * num2); break;
            case "/": result = (num2 != 0) ? String.valueOf(num1 / num2) : "Cannot divide by zero"; break;
            default:  result = "Invalid operator";
        }
    }
%>
<html>
<head><title>Calculator - JSP</title></head>
<body>
    <h2>Calculator (JSP)</h2>
    <form method="post">
        Number 1: <input type="text" name="num1"><br><br>
        Operator:
        <select name="op">
            <option>+</option>
            <option>-</option>
            <option>*</option>
            <option>/</option>
        </select><br><br>
        Number 2: <input type="text" name="num2"><br><br>
        <input type="submit" value="Calculate">
    </form>
    <% if (!result.isEmpty()) { %>
        <h3>Result: <%= result %></h3>
    <% } %>
</body>
</html>
