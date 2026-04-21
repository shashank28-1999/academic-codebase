import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Calculator (Servlet)</h2>");
        out.println("<form method='post'>");
        out.println("Number 1: <input type='text' name='num1'><br><br>");
        out.println("Operator: <select name='op'><option>+</option><option>-</option><option>*</option><option>/</option></select><br><br>");
        out.println("Number 2: <input type='text' name='num2'><br><br>");
        out.println("<input type='submit' value='Calculate'>");
        out.println("</form></body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        double num1   = Double.parseDouble(request.getParameter("num1"));
        double num2   = Double.parseDouble(request.getParameter("num2"));
        String op     = request.getParameter("op");
        String result;

        switch (op) {
            case "+": result = String.valueOf(num1 + num2); break;
            case "-": result = String.valueOf(num1 - num2); break;
            case "*": result = String.valueOf(num1 * num2); break;
            case "/": result = (num2 != 0) ? String.valueOf(num1 / num2) : "Cannot divide by zero"; break;
            default:  result = "Invalid operator";
        }

        out.println("<html><body>");
        out.println("<h2>Calculator (Servlet)</h2>");
        out.println("<h3>Result: " + result + "</h3>");
        out.println("<a href='CalculatorServlet'>Back</a>");
        out.println("</body></html>");
    }
}
