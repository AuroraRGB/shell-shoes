package com.aurora.web.servlet;


import com.aurora.service.CustomerService;

import com.aurora.entity.Customer;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "LoginServlet" ,urlPatterns = "/loginServlet")

public class LoginServlet extends HttpServlet {

    private CustomerService customerService=new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName     = request.getParameter("userName");
        String userPassword =request.getParameter("userPassword");
        boolean flag=customerService.login(userName,userPassword);


        if (flag){
            HttpSession session=request.getSession();
            session.setAttribute("userName",userName);
            response.sendRedirect("/orderDetailsServlet");
        }else {
            request.getRequestDispatcher("WEB-INF/pages/orderDetails.jsp").forward(request,response);
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private final LoginServiceImpl loginService;

    public LoginServlet() {
        loginService = new LoginServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Customer customer = new Customer();
        customer.setCustPhone(Long.parseLong(req.getParameter("username")));
        customer.setCustPwd(req.getParameter("password"));
        Customer c = loginService.checkTelnoAndPwd(customer);
        if (c != null){
            HttpSession session = req.getSession();
            session.setAttribute("username",c.getCustName());
            session.setAttribute("userId",c.getCustId());
            System.out.println(session.getAttribute("userId"));
            resp.sendRedirect("/index");
        }
        else {
            resp.sendRedirect("/login");

        }
    }
}
