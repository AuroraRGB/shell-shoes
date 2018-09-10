package com.aurora.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

import java.io.IOException;




@WebFilter(filterName = "KeywordBlockingFilter" ,urlPatterns = "/finalFilterComment")
public class KeywordBlockingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String[] iLLegalCharArr = {"AAA","BBB","CCC","DDD"};
        if (servletRequest.getParameter("commitTextArea")==null){
            servletRequest.getRequestDispatcher("WEB-INF/comment/comment.jsp").forward(servletRequest,servletResponse);
        }else {
            servletRequest.getServerPort();
            String comment=servletRequest.getParameter("commitTextArea");
            for (String illChar:iLLegalCharArr){
                if (comment.contains(illChar)){
                    comment=comment.replace(illChar,"***");
                    servletRequest.setAttribute("errMessage","有敏感字符");
                    servletRequest.setAttribute("comment",comment);
                    servletRequest.getRequestDispatcher("WEB-INF/comment/comment.jsp").forward(servletRequest,servletResponse);
                    return;
                }

            }
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy(){}
}
