import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloSessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);

        out.println("<html><body>");
        if (session != null && session.getAttribute("name") != null) {
            String name = (String) session.getAttribute("name");
            Date startTime = (Date) session.getAttribute("startTime");
            out.println("<div style='text-align:right;font-size:12px;'>Started: " + startTime + "</div>");
            out.println("<h2>Hello, " + name + "!</h2>");
            out.println("<a href='HelloSessionServlet?logout=true'>Logout</a>");
        } else {
            out.println("<h2>Enter Your Name</h2>");
            out.println("<form method='post'>");
            out.println("<input type='text' name='name' required>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("startTime", new Date());

        if ("true".equals(request.getParameter("logout"))) {
            Date start = (Date) session.getAttribute("startTime");
            long duration = (new Date().getTime() - start.getTime()) / 1000;
            String userName = (String) session.getAttribute("name");
            session.invalidate();
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2>Thank You, " + userName + "!</h2>");
            out.println("<p>Duration: " + duration + " seconds.</p>");
            out.println("</body></html>");
        } else {
            response.sendRedirect("HelloSessionServlet");
        }
    }
}
