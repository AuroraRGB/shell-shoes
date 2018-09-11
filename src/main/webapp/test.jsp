<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tigerwhale
  Date: 2018/9/10
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:choose>
    <c:when test="${!empty errorMessage}">
        <h4>${errorMessage}</h4>
    </c:when>
    <c:otherwise>
        <table border="1">
            <caption>用户信息列表</caption>
            <tr>
                <th>用户ID</th>
                <th>用户名</th>
                <th>用户年龄</th>
                <th>用户邮箱</th>
                <th>操作</th>
            </tr>
            <c:forEach var="customer" items="${PageDTo.modelList}"   >
                <tr>
                    <td><a href=""> ${customer.custId}</a></td>
                    <td> <a href="">${customer.custName}</a></td>
                    <td> ${customer.custAge}</td>
                    <td> ${customer.custEmail}</td>
                    <td> <a href="javascript:deleteConfirm(${c.custId});">删除</a></td>
                </tr>
            </c:forEach>


        </table>

        <div id="page">
            <c:if test="${PageDTo.currentPageCode !=1}">
                <a href="${pageContext.request.contextPath}/customerAllByPageServlet?page=${PageDTo.currentPageCode-1}">上一页</a>
            </c:if>

            当前是${PageDTo.currentPageCode} 页

            <c:if test="${PageDTo.currentPageCode !=PageDTo. totalPages}">
                <a href="${pageContext.request.contextPath}/customerAllByPageServlet?page=${PageDTo.currentPageCode+1}">下一页</a>
            </c:if>

            共${PageDTo.totalPages}页
            共有${PageDTo.totalRecord} 用户数据
        </div>


    </c:otherwise>
</c:choose>
</body>
</html>
