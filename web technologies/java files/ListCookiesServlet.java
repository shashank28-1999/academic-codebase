import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ListCookiesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Add sample cookies if none
        Cookie[] cookies = request.getCookies();
        if (cookies == null || cookies.length == 0) {
            response.addCookie(new Cookie("sample_cookie", "HelloWorld"));
            response.addCookie(new Cookie("user", "TestUser"));
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form method='post'><input type='submit' value='List Cookies'></form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();
        out.println("<html><body>");
        out.println("<h2>Cookies Stored in Browser</h2>");
        if (cookies != null && cookies.length > 0) {
            out.println("<table border='1' cellpadding='5'>");
            out.println("<tr><th>Name</th><th>Value</th></tr>");
            for (Cookie c : cookies) {
                out.println("<tr><td>" + c.getName() + "</td><td>" + c.getValue() + "</td></tr>");
            }
            out.println("</table>");
        } else {
            out.println("<p>No cookies found.</p>");
        }
        out.println("</body></html>");
    }
}
