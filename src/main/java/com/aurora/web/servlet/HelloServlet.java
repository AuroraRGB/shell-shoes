package com.aurora.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;



@WebServlet(name = "HelloServlet",urlPatterns = "/abc")

public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (null !=request.getParameterValues("good") && null !=request.getParameter("geender")){
            String[] goods  = request.getParameterValues("good");
            String   gender = request.getParameter("gender");
            for (String s:goods){
                System.out.println(s);
            }
            System.out.println(gender);
        }else {
            System.out.println("未选择无法进行输出");
        }

    }
}
