<%--
  Created by IntelliJ IDEA.
  User: tigerwhale
  Date: 2018/9/7
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>评论</title>
</head>
<body>

    <form action="finalFilterComment" method="get">

        <span>评论</span>

        <textarea name="commitTextArea">
            <%=request.getAttribute("comment")%>
        </textarea>

        <button type="submit">提交</button>

    </form>
        <%=request.getAttribute("errMessage")%>
</body>
</html>
