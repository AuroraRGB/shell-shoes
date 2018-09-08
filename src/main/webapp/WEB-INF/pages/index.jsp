<%--
  Created by IntelliJ IDEA.
  User: tigerwhale
  Date: 2018/9/4
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>跳转界面</title>
</head>
<body>
    <h1>hello java</h1>

    <form action="/helloServlet" method="post">

        <input type=text>
        <input type="checkbox" name="good" value="good1">商品1
        <input type="checkbox" name="good" value="good2">商品2
        <input type="checkbox" name="good" value="good2">商品2

        <br>

        <input type="radio" name="gender" value="0">男
        <input type="radio" name="gender" value="1">女

        <br>

        <button type="submit">提交按钮</button>
    </form>


    <a href="/login"><h1>登录界面</h1></a>
    <a href="/registered"><h1>注册</h1></a>
    <a href="/orderDetails"><h1>订单详情界面</h1></a>
    <a href="/orderCreate"><h1>生成订单界面</h1></a>
    <a href="/orderDetail"><h1>单个订单查看界面</h1></a>
</body>
</html>
