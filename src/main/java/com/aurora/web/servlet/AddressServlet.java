package com.aurora.web.servlet;

import com.aurora.model.entity.ReceiveAddress;
import com.aurora.service.impl.AddressServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddressServlet", urlPatterns = "/AddressServlet")
public class AddressServlet extends javax.servlet.http.HttpServlet {
    private final AddressServiceImp addressService;

    public AddressServlet() {
        addressService = new AddressServiceImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer type = Integer.parseInt(request.getParameter("type"));
        switch (type){
            case 0:
                addAddress(request,response);
                break;
            case 1:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    private void addAddress(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ReceiveAddress address = new ReceiveAddress();
        address.setAddressProvince(request.getParameter("province"));
        address.setAddressCity(request.getParameter("city"));
        address.setAddressArea(request.getParameter("area"));
        address.setAddressStreet(request.getParameter("street"));
        address.setAddressDetail(request.getParameter("detail"));
        address.setAddressPostCode(Integer.parseInt(request.getParameter("code")));
        address.setAddressId(8);
        System.out.println(request.getSession().getAttribute("userId"));
        address.setCustId((Integer)request.getSession().getAttribute("userId"));

        boolean b = addressService.addAddress(address);
        if (b == true) {
            response.sendRedirect("/index");
        } else {
            response.sendRedirect("/add_address");
        }
    }

}
