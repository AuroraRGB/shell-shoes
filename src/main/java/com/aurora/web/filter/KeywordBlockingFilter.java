package com.aurora.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class KeywordBlockingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("非法字符的过滤器创建");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String[] iLLegalCharArr = {"AAA","BBB","CCC","DDD"};
        String commit=servletRequest.getParameter("commit");
        String commitReplace=commit;
        for (String illChar:iLLegalCharArr){
            commitReplace=commit.replace(illChar,"888888");
        }

        if (commitReplace.equals(commit)){
            servletRequest.setAttribute("resMessage","不含有非法字符");

        }else {
            servletRequest.setAttribute("errMessage","含有非法字符串");

        }

        servletRequest.setAttribute("commitReplace",commitReplace);
        System.out.println("过滤后的字符串"+commitReplace);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("非法字符过滤器的销毁");
    }
}
