package com.aurora.web.servlet;


import com.aurora.service.CustomerService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/loginServlet")

public class LoginServlet extends HttpServlet {

    private CustomerService customerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        boolean flag = customerService.login(userName, userPassword);


        if (flag) {
            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
            response.sendRedirect("/orderDetailsServlet");
        } else {
            request.getRequestDispatcher("WEB-INF/pages/login.jsp").forward(request, response);
        }
    }
}