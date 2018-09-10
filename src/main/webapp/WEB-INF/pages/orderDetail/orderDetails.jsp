
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: tigerwhale
  Date: 2018/9/4
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>

<html>

<head>
    <title>用户的全部订单</title>
    <link rel="stylesheet" type="text/css" href="../../../assets/css/order/oderDetails.css">
</head>

<body>

<div id="container">

    <jsp:include page="/WEB-INF/pages/basic/top.jsp"></jsp:include>

        <form action="/orderDetailsServlet">
            <div id="middle">
                <c:forEach items="${orderMap}" var="s" >
                    <li>${s.key}</li>
                    <div id="orderGetNumber">
                        <c:forEach items="${s.value}" var="x" >
                            <c:if test="${not empty x.orderDetailList}">
                                <c:forEach items="${x.orderDetailList}" var="y">
                                    <div id="y">
                                        <c:out value="${y}"/>
                                    </div>
                                </c:forEach>
                            </c:if>

                            <div id="#oDiv">
                                <ul>
                                    <li>商品名称:${x.shoesName}</li>
                                    <li>商品大小:${x.orderShoesSize}</li>
                                    <li>商品颜色:${x.orderShoesColor}</li>
                                </ul>
                            </div>
                        </c:forEach>
                    </div>
                </c:forEach>
            </div>
        </form>

    <jsp:include page="/WEB-INF/pages/basic/bottom.jsp"></jsp:include>
</div>


</body>
</html>
