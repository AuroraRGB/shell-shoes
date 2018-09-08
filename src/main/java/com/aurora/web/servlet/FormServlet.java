package com.aurora.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "FormServlet",urlPatterns = "/Registered")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        boolean b=isRepeatSubmit(httpServletRequest);
        if (b){
            System.out.println("请不要重复提交");
        }else{
            httpServletRequest.getSession().removeAttribute("token");// 移除session中的token
            String clientToken=httpServletRequest.getParameter("token");
            String userName  = httpServletRequest.getParameter("userName");
            String userEmail = httpServletRequest.getParameter("userEmail");
            String userPhone = httpServletRequest.getParameter("userPhone");
            System.out.println("处理用户请求");
        }

        httpServletRequest.getRequestDispatcher("WEB-INF/pages/registered.jsp").forward(httpServletRequest,httpServletResponse);

    }


    private boolean isRepeatSubmit(HttpServletRequest httpServletRequest) {

        String clientToken  = httpServletRequest.getParameter("token");
        String serverToken = (String) httpServletRequest.getSession().getAttribute("token");

        // 1、如果用户提交的表单数据中没有token，则用户是重复提交了表单
        if (clientToken == null) {
            return true;
        }

        // 2、如果当前用户的Session中不存在Token(令牌)，则用户是重复提交了表单
        if (serverToken == null) {
            return true;
        }
        // 3、存储在Session中的Token(令牌)与表单提交的Token(令牌)不同，则用户是重复提交了表单
        if (!clientToken.equals(serverToken)) {
            return true;
        }


        return false;

    }

}
