package com.aurora.web.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;



@WebFilter(filterName = "IllegalCharacterFilter",urlPatterns = "/*")

public class IllegalCharacterFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("乱码传输，过滤");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(2300);

        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
