<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>用户登录</title>
    <link rel="stylesheet" href="../../css/login.css">
    <script>
        function checkUsername() {
            var flag = false;
            var phone = document.getElementById("username").value;
            var tip = document.getElementById("username-error-tip");
            if (phone == null || phone == "")
                tip.innerText = "电话不能为空";
            else if (!/^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\d{8}$/.test(phone))
                tip.innerText = "不是有效的电话"
            else {
                tip.innerText = null;
                flag = true;
            }
            return flag;
        }
        function submitForm() {
            return checkUsername();
        }
    </script>
</head>
<body>

<div class="header">
    <div class="top">
        <div class="top-left">
            <div class="welcome">您好,欢迎光临贝履官方网站!</div>
            <div class="register-login">
                <a href="#">注册</a>
                <a href="#">登录</a>
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

<div class="regist">

    <div class="left">
        <img src="../../images/ChinaMap1.png" class="img" height="400" width="450" alt=""/>
    </div>

    <div class="right">
        <div id="regist-area">
            <form action="LoginServlet" onsubmit="return submitForm()">
                <div class="login-info">
                        <span class="area-title">
                            <label>登录</label>
                        </span>
                    <ul>
                        <li>
                            <div class="tip-label">
                                <label>手机号：</label>
                                <label>(phone)</label>
                            </div>

                            <input id="username" name="username" type="text" onblur="checkUsername()">
                            <span id="username-error-tip" class="error-tip"></span>
                        </li>
                        <li>
                            <div class="tip-label">
                                <label>密码</label>
                                <label>(User Password)</label>
                            </div>
                            <input type="password" name="password" id="password" onblur="checkPassword()">
                            <span id="pwd-error-tip" class="error-tip"></span>
                        </li>
                    </ul>

                    <div class="cc">
                        <input type="submit" class="sub_button" name="button" id="button" onsubmit="submitForm()" value="登录">
                    </div>

                </div>
            </form>
        </div>
    </div>

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
                <li><a href="//help.jd.com/user/issue/list-297.html

">生活旅行</a></li>
                <li><a href="//help.jd.com/user/issue.html

">常见问题</a></li>
                <li><a href="//help.jd.com/user/issue/list-136.html

">大家电</a></li>
                <li><a href="//help.jd.com/user/index.html

">联系客服</a></li>
            </ul>
        </div>
        <div class="mod_help_nav">
            <ul class="mod_help_nav_con">
                <li><a href="//help.jd.com/user/issue/list-81-100.html

">上门自提</a></li>
                <li><a href="//help.jd.com/user/issue/list-81.html

">211限时达</a></li>
                <li><a href="//help.jd.com/user/issue/103-983.html

">配送服务查询</a></li>
                <li><a href="//help.jd.com/user/issue/109-188.html

">配送费收取标准</a></li>
                <li><a href="//help.joybuy.com/help/question-list-201.html">海外配送</a></li>
            </ul>
        </div>
        <div class="mod_help_nav">
            <ul class="mod_help_nav_con">
                <li><a href="//help.jd.com/user/issue/list-172.html

">货到付款</a></li>
                <li><a href="//help.jd.com/user/issue/list-173.html

">在线支付</a></li>
                <li><a href="//help.jd.com/user/issue/list-176.html

">分期付款</a></li>
                <li><a href="//help.jd.com/user/issue/list-174.html

">邮局汇款</a></li>
                <li><a href="//help.jd.com/user/issue/list-175.html

">公司转账</a></li>
            </ul>
        </div>
        <div class="mod_help_nav">
            <ul class="mod_help_nav_con">
                <li><a href="//help.jd.com/user/issue/321-981.html

">售后政策</a></li>
                <li><a href="//help.jd.com/user/issue/list-132.html

">价格保护</a></li>
                <li><a href="//help.jd.com/user/issue/130-978.html

">退款说明</a></li>
                <li><a href="//myjd.jd.com/repair/repairs.action">返修/退换货</a></li>
                <li><a href="//help.jd.com/user/issue/list-50.html

">取消订单</a></li>
            </ul>
        </div>
        <div class="mod_help_nav">
            <ul class="mod_help_nav_con">
                <li><a href="//help.jd.com/user/issue/list-133.html

">夺宝岛</a></li>
                <li><a href="//help.jd.com/user/issue/list-134.html

">DIY装机</a></li>
                <li><a href="//fuwu.jd.com

/">延保服务</a></li>
                <li><a href="//o.jd.com/market/index.action

">京东E卡</a></li>
                <li><a href="//mobile.jd.com

/">京东通信</a></li>
                <li><a href="//s.jd.com

/">京东JD+</a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>