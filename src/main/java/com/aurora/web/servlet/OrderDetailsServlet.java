package com.aurora.web.servlet;
import com.aurora.model.dto.OrderDetailsDTO;
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

    private MyorderService myorderService=new MyorderService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session=request.getSession();
        Map<String,List<OrderDetailsDTO>> map             = myorderService.queryByCustIdMap(1002);
        session.setAttribute("orderMap",map);
        request.getRequestDispatcher("WEB-INF/pages/orderDetail/orderDetails.jsp").forward(request,response);
    }
}
