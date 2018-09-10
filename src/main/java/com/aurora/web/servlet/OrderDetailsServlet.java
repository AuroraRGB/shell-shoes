package com.aurora.web.servlet;
import com.aurora.model.dto.OrderDetailsDTO;
import com.aurora.service.CustomerService;
import com.aurora.util.Json2StringUtil;



import com.aurora.service.MyorderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@WebServlet(name = "OrderDetailsServlet",urlPatterns = "/orderDetailsServlet")

    public class OrderDetailsServlet extends HttpServlet {

    private CustomerService customerService = new CustomerService();
    private MyorderService myorderService   = new MyorderService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        String customerName= (String) session.getAttribute("userName");
        Integer customerId=customerService.queryCustomerIDByName(customerName);
        System.out.println("servlet层"+customerId);
        Map<String,List<OrderDetailsDTO>> map = myorderService.queryByCustIdMap(customerId);
        session.setAttribute("orderMap",map);
        request.getRequestDispatcher("WEB-INF/pages/orderDetail/orderDetails.jsp").forward(request,response);
    }
}
