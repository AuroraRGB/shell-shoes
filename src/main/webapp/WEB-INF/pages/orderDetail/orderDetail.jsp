<%--
  Created by IntelliJ IDEA.
  User: tigerwhale
  Date: 2018/9/5
  Time: 08:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>查看当前生成的订单</title>
</head>
<body>

<div id="container">

    <jsp:include page="/WEB-INF/pages/basic/top.jsp"></jsp:include>

    <div id="middle">
        <h1>查询订单界面</h1>
        <span>订单编号<%=request.getAttribute("orderNumber")%></span>
        <span>订单价格<%=request.getAttribute("orderPrice")%>></span>
        <span>用户地址id<%=request.getAttribute("orderAddressPrice")%></span>
        <span>订单状态<%=request.getAttribute("orderStatus")%></span>
    </div>


    <jsp:include page="/WEB-INF/pages/basic/bottom.jsp"></jsp:include>

</div>


</body>
</html>
