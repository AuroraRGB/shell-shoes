package com.aurora.web.servlet;

import com.aurora.util.TokenProccessor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import java.io.IOException;



@WebServlet(name = "CreateTokenServlet" ,urlPatterns = "/registered")
public class CreateTokenServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        //生成Token
        String token= TokenProccessor.getInstance().makeToken();
        HttpSession session=httpServletRequest.getSession();
        System.out.println("这是服务端生成的token"+token);
        session.setAttribute("token",token);
        httpServletRequest.getRequestDispatcher("WEB-INF/pages/registered.jsp").forward(httpServletRequest,httpServletResponse);
    }

}
