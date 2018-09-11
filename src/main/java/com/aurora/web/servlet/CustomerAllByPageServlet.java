package com.aurora.web.servlet;

import com.aurora.model.dto.PageDTO;
import com.aurora.model.entity.Customer;
import com.aurora.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CustomerAllByPageServlet" ,urlPatterns = "/customerAllByPageServlet")
public class CustomerAllByPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        CustomerService service = new CustomerService();
        PageDTO pageDTO         = new PageDTO();

        //    获得当前前台传过来的的页码数
        String page=httpServletRequest.getParameter("page");

        //将数据转换为Integer类型前判断数值是否为空
        Integer pageCode=0;

        if (page==null){
//            将当前的页数置为1
            pageCode=1;
        }else {
//            将页数置为当前的前台传过来的页数
            pageCode=Integer.parseInt(page);
        }

        //获取数据库中的总记录数
        Integer countCustomer=service.queryCountCustomer();

        //设置总记录数
        pageDTO.setTotalPages(countCustomer);

        //设置当前页码
        pageDTO.setCurrentPageCode(pageCode);

        //获取一页要显示的数据
        Integer pageSize=pageDTO.getPageSize();

        //设置总页数
        pageDTO.setTotalPages((countCustomer%pageSize)==0?(countCustomer/pageSize):(countCustomer/pageSize)+1);

        //从第几条开始显示
        pageDTO.setStartRecord((pageCode-1)*pageSize);

//        测试是否获取到page
        System.out.print(page);

        PageDTO<Customer> pageDTO1=service.queryAllPage(pageDTO);

        if (pageDTO1.getModelList()==null){
            httpServletRequest.setAttribute("errorMessage","无法获取");
        }else {
            httpServletRequest.setAttribute("PageDTo",pageDTO1);
        }
        httpServletRequest.getRequestDispatcher("test.jsp").forward(httpServletRequest,httpServletResponse);

    }
    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        this.doGet(httpServletRequest,httpServletResponse);
    }
}
