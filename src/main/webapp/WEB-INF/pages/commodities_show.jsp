<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>所有商品</title>
    <link rel="stylesheet" href="../../css/commodities_show.css">
</head>
<body>

<div id="container">
    <div id="header">
        <div class="top">
            <div class="top-left">
                <div class="welcome">您好,欢迎光临贝履官方网站!</div>
                <div class="register-login">
                    <a href="#">注册</a>
                    <a href="/login">登录</a>
                </div>
            </div>
            <div class="top-right">
                <ul>
                    <li><a href="#">我的贝履</a></li>
                    <li><a href="#">品牌官网</a></li>
                    <li><a href="#">购物车<label>(0)</label>件</a></li>
                </ul>
            </div>
        </div>
        <div class="nav">
            <div class="logo"></div>
            <div class="font">贝 履</div>
            <ul>
                <li><a href="#">首页</a></li>
                <li><a href="#">男子</a></li>
                <li><a href="#">女子</a></li>
                <li><a href="#">儿童</a></li>
                <li><a href="#">运动</a></li>
                <li><a href="#">品牌</a></li>
                <li><a href="#">新品上市</a></li>
                <li><a href="#">热销推荐</a></li>
            </ul>
        </div>
    </div>
    <%--<div id="main">--%>
    <%--<div class="images-main"></div>--%>
    <%--<div class="body">--%>
    <%--<div class="body-nav">--%>

    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
</div>


<div id="filter">
    <div class="filter-slice">
        <div class="filter-header">颜色：</div>
        <ul>
            <li class="filter-main"><a href="">黑色</a></li>
            <li class="filter-main"><a href="">白色</a></li>
            <li class="filter-main"><a href="">蓝色</a></li>
            <li class="filter-main"><a href="">红色</a></li>
            <li class="filter-main"><a href="">黄色</a></li>
            <li class="filter-main"><a href="">绿色</a></li>
        </ul>
    </div>
    <div class="filter-slice">
        <div class="filter-header">尺码：</div>
        <ul>
            <li class="filter-main"><a href="">37</a></li>
            <li class="filter-main"><a href="">38</a></li>
            <li class="filter-main"><a href="">39</a></li>
            <li class="filter-main"><a href="">40</a></li>
            <li class="filter-main"><a href="">41</a></li>
            <li class="filter-main"><a href="">42</a></li>
            <li class="filter-main"><a href="">43</a></li>
        </ul>
    </div>
    <%--<div class="filter-slice">--%>
    <%--<div class="filter-header">条件三：</div>--%>
    <%--<ul>--%>
    <%--<li class="filter-main"><a href="">条件1</a></li>--%>
    <%--<li class="filter-main"><a href="">条件2</a></li>--%>
    <%--<li class="filter-main"><a href="">条件3</a></li>--%>
    <%--<li class="filter-main"><a href="">条件4</a></li>--%>
    <%--<li class="filter-main"><a href="">条件5</a></li>--%>
    <%--</ul>--%>
    <%--</div>--%>
    <div class="filter-slice"></div>
</div>

<div id="sort">
    <a href="">
        <div class="sort">销量</div>
    </a>
    <a href="">
        <div class="sort">价格</div>
    </a>
</div>

<div style="height: 600px">
    <a href="${pageContext.request.contextPath}/address?type=1">添加地址</a>
    <a href="/address?type=2">修改地址</a>
    <a href="/AddressServlet?type=0">查看所有地址</a>
    <%--<a href="/login">登录页面</a>--%>
</div>

<div id="pages">
    分页预留
</div>
<div id="orderBottom">
    <div id="orderBottomTop">
        <ol>
            <li>
                多品类齐全，轻松购物
            </li>
            <li>
                快多仓直发，极速配送
            </li>
            <li>
                好正品行货，精致服务
            </li>
            <li>
                省天天低价，畅选无忧
            </li>
        </ol>
    </div>

    <div id="orderBottomDown">
        <div class="mod_help_nav">
            <ul class="mod_help_nav_con">
                <li><a href="//help.jd.com/user/issue/list-29.html">购物流程</a></li>
                <li><a href="//help.jd.com/user/issue/list-151.html">会员介绍</a></li>
                <li><a href="//help.jd.com/user/issue/list-297.html">生活旅行</a></li>
                <li><a href="//help.jd.com/user/issue.html">常见问题</a></li>
                <li><a href="//help.jd.com/user/issue/list-136.html">大家电</a></li>
                <li><a href="//help.jd.com/user/index.html">联系客服</a></li>
            </ul>
        </div>
        <div class="mod_help_nav">
            <ul class="mod_help_nav_con">
                <li><a href="//help.jd.com/user/issue/list-81-100.html">上门自提</a></li>
                <li><a href="//help.jd.com/user/issue/list-81.html">211限时达</a></li>
                <li><a href="//help.jd.com/user/issue/103-983.html">配送服务查询</a></li>
                <li><a href="//help.jd.com/user/issue/109-188.html">配送费收取标准</a></li>
                <li><a href="//help.joybuy.com/help/question-list-201.html">海外配送</a></li>
            </ul>
        </div>
        <div class="mod_help_nav">
            <ul class="mod_help_nav_con">
                <li><a href="//help.jd.com/user/issue/list-172.html">货到付款</a></li>
                <li><a href="//help.jd.com/user/issue/list-173.html">在线支付</a></li>
                <li><a href="//help.jd.com/user/issue/list-176.html">分期付款</a></li>
                <li><a href="//help.jd.com/user/issue/list-174.html">邮局汇款</a></li>
                <li><a href="//help.jd.com/user/issue/list-175.html">公司转账</a></li>
            </ul>
        </div>
        <div class="mod_help_nav">
            <ul class="mod_help_nav_con">
                <li><a href="//help.jd.com/user/issue/321-981.html">售后政策</a></li>
                <li><a href="//help.jd.com/user/issue/list-132.html">价格保护</a></li>
                <li><a href="//help.jd.com/user/issue/130-978.html">退款说明</a></li>
                <li><a href="//myjd.jd.com/repair/repairs.action">返修/退换货</a></li>
                <li><a href="//help.jd.com/user/issue/list-50.html">取消订单</a></li>
            </ul>
        </div>
        <div class="mod_help_nav">
            <ul class="mod_help_nav_con">
                <li><a href="//help.jd.com/user/issue/list-133.html">夺宝岛</a></li>
                <li><a href="//help.jd.com/user/issue/list-134.html">DIY装机</a></li>
                <li><a href="//fuwu.jd.com/">延保服务</a></li>
                <li><a href="//o.jd.com/market/index.action">京东E卡</a></li>
                <li><a href="//mobile.jd.com/">京东通信</a></li>
                <li><a href="//s.jd.com/">京东JD+</a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
