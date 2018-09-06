package com.aurora.web.servlet;


import com.aurora.model.entity.Customer;
import com.aurora.service.CustomerService;
import com.aurora.service.LoginService;
import com.aurora.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")

public class LoginServlet extends HttpServlet {

    private final LoginServiceImpl loginServiceImpl;

    public LoginServlet() {
        loginServiceImpl = new LoginServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customer customer = new Customer();
        customer.setCustPhone(Long.parseLong(request.getParameter("username")));
        System.out.println("==="+request.getParameter("username")+"======");
        customer.setCustPwd(request.getParameter("password"));
        Customer customer1 = loginServiceImpl.checkTelnoAndPwd(customer);
        System.out.println(customer1);
        if (customer1!=null) {
            HttpSession session = request.getSession();
            session.setAttribute("userName", customer1.getCustName());
            session.setAttribute("userId",customer1.getCustId());
            System.out.println(session.getAttribute("userId"));
            request.getRequestDispatcher("WEB-INF/pages/commodities_show.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("WEB-INF/pages/login.jsp").forward(request, response);
        }
    }
}