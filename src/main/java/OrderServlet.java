import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/api/orders")
public class OrderServlet extends HttpServlet {
    private static final String CONTENT = "app/json";

    @Override
    protected void doGet(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("application/json");
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setStatus(HttpServletResponse.SC_OK);
        servletResponse.getWriter().write("{\"message\": \"GET method handled\"}");
    }

    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException, ServletException {
        servletResponse.setContentType("application/json");
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setStatus(HttpServletResponse.SC_CREATED);
        servletResponse.getWriter().write("{\"message\": \"POST method handled\"}");
    }

    @Override
    protected void doPut(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException, ServletException {
        servletResponse.setContentType("application/json");
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setStatus(HttpServletResponse.SC_OK);
        servletResponse.getWriter().write("{\"message\": \"PUT method handled\"}");
    }

    @Override
    protected void doDelete(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException, ServletException {
        servletResponse.setContentType("application/json");
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setStatus(HttpServletResponse.SC_NO_CONTENT);
        servletResponse.getWriter().write("{\"message\": \"DELETE method handled\"}");
    }

    @Override
    protected void doHead(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException, ServletException {
        servletResponse.setStatus(HttpServletResponse.SC_OK);
    }
}
