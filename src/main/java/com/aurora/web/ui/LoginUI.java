package com.aurora.web.ui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginUI",urlPatterns = "/login")
public class LoginUI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req,resp);
    }
    /*
ClientA ---(FireFox)-----------> server (想记录当前客户端A的信息标记)
 第一次访问 获得A 用户的请求 数据保存 到A 用的FireFox中 form stuName:Peter (cookie) response.addCookie()
 第二次访问 客户端request (http请求头中)一并发送给服务器 获得request (http请求头中) Client B ----（FireFox）---------- (想记录当前客户端B的信息标记)
  第一次访问 获得B 用户的请求 数据保存 到B 用的FireFox中 1. jsp第一访问服务器 ,客户端表单（）
  2. 服务器CookieDemo1Servlet { String englishName = request.getPara...("englishName");
  // name value Cookie c1 = new Cookie("englishName",englishName);
  response.addCookie(c1);
  // 获得当前客户端所有的cookie Cookie[] cookies = request.getCookies();
  for(Cookie c :cookies){ String n = c.getName();
   String v = c.getValue(); print(.....);
   // 可能里面会有一部分cookie数据 (http头部信息的cookie数据 )
    / / 能不能在当前所有cookie或得到c1 对象？？？ } } 第二次访问 */


/*显示之前的浏览记录 所有商品的列表 点击进去查看某一个商品详情----- 浏览了该商品 new Cookie("商品id","商品id") response.addCookie(..)
再次访问所有商品的列表，在商品列表下面（或者是其他区域 浏览记录区域
） 之前的【浏览过的商品】显示在 浏览记录区域
Cookie[] cookies = request.getCookies();
1. 浏览了3个商品，3个cookie对象？ 2. 显示在浏览记录区域
3个商品图片，名称，价格 Cookie[] cookies = request.getCookies()
3个商品的id 显示之前 根据商品的id查询商品对象 List 显示 服务器中List的数据 */
}
