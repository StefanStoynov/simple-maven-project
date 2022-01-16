package com.ss;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //redirecting to JSP
        //Example: request.getRequestDispatcher("Where my JSP is").forward(request, response);
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("username", request.getParameter("username"));
        //redirecting to JSP
        //Example: request.getRequestDispatcher("Where my JSP is").forward(request, response);
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
    }


}
