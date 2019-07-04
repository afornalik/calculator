package web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/triangleServlet")
public class TriangleServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/triangleCreator.jsp");
        HttpSession session = request.getSession();
        int rows = 0;

        try {
            rows = Integer.parseInt(request.getParameter("rowsNumber"));
        } catch (Exception e) {
            session.setAttribute("error", "type number !");
        }

        session.setAttribute("rows", rows);
        requestDispatcher.include(request, response);

    }
}
