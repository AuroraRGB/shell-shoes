<%--
  Created by IntelliJ IDEA.
  User: tigerwhale
  Date: 2018/9/7
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/Registered" method="post">
        <input type="hidden" name="token" value="<%=session.getAttribute("token")%>">
        用户名    ：<input type="text" name="userName">
        用户邮箱   ：<input type="email" name="userEmail">
        用户手机号 ：<input type="number" name="userPhone">
        <input type="submit" value="注册">
    </form>
</body>
</html>
