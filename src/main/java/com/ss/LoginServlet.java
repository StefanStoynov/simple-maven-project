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
        // url: http://localhost:8080/?username=Stefan&password=123
        //how to pass the value to the JSP - use attributes
        request.setAttribute("username", request.getParameter("username"));
        request.setAttribute("password", request.getParameter("password"));
        //redirecting to JSP
        //Example: request.getRequestDispatcher("Where my JSP is").forward(request, response);
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }


}
