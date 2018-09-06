package com.aurora.web.ui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddressUI",urlPatterns = "/address")
public class AddressUI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer type = Integer.parseInt(req.getParameter("type"));
        switch (type){
            case 0:
                req.getRequestDispatcher("/WEB-INF/pages/add_address.jsp").forward(req,resp);
                break;
            case 1:
                req.getRequestDispatcher("/WEB-INF/pages/change_address.jsp").forward(req,resp);
                break;
        }

    }
}
