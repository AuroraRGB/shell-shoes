<%--
  Created by IntelliJ IDEA.
  User: tigerwhale
  Date: 2018/9/5
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>登录</title>
</head>
<body>
<jsp:include page="/WEB-INF/pages/basic/top.jsp"></jsp:include>
    <div id="middle">
       <form action="index">
           <input type="text" name="userName" placeholder="请输入用户名"><br>
           <input type="password" name="userPassword" placeholder="请输入密码"><br>
           <button type="submit">登录</button>
       </form>
      </div>
<jsp:include page="/WEB-INF/pages/basic/bottom.jsp"></jsp:include>
</body>
</html>
