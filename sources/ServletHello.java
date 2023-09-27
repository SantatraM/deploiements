package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.*;

import hello.*;

public class ServletHello extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Hello hello = new Hello();

        request.setAttribute("m", hello.essaie());

        RequestDispatcher dispat = request.getRequestDispatcher("/hello.jsp");
        dispat.forward(request, response);
    }
}
