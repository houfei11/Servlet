import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class secondServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("GBK");
        response.setContentType("text/html;charset=utf-8");

        String name = request.getParameter("name");
        PrintStream stream = new PrintStream(response.getOutputStream());
        stream.println("<html>");
        stream.println("<head>");
        stream.println("<title>secondServlet</title>");
        stream.println("</head>");
        stream.println("<body>");
        stream.println("your name is:" + name);
        stream.println("<body>");
        stream.println("<html>");
    }
}
