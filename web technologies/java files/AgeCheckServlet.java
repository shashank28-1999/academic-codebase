import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AgeCheckServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Enter Details</h2>");
        out.println("<form method='post'>");
        out.println("Name: <input type='text' name='name' required><br><br>");
        out.println("Age: <input type='number' name='age' required><br><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form></body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        out.println("<html><body>");
        if (age < 18) {
            out.println("<p>Hello " + name + ", you are not authorized to visit the site.</p>");
        } else {
            out.println("<p>Welcome to this site.</p>");
        }
        out.println("</body></html>");
    }
}
