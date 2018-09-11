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
    <link rel="stylesheet" type="text/css" href="./assets/css/basic/basic.css">
</head>
<body>

<jsp:include page="WEB-INF/pages/basic/top.jsp"></jsp:include>
    <div id="middle">
        <a href="/login"><h1>登录界面</h1></a>
        <a href="/orderDetails"><h1>订单详情界面</h1></a>
        <a href="/customerAllByPageServlet"><h1>用户分页显示</h1></a>
    </div>
<jsp:include page="WEB-INF/pages/basic/bottom.jsp"></jsp:include>
</body>
</html>
