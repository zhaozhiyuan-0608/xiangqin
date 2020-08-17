<%--
  Created by IntelliJ IDEA.
  User: helloworld
  Date: 2020/8/10
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/WEB-INF/include/include-head.jsp"%>


    <script type="text/javascript">
        $(function () {
            $("button").click(function () {
                window.history.back();
            })
        })
    </script>
</head>
<body>
<div class="container" style="text-align: center;">

    <h3>系统信息页面</h3>
    <h4>${requestScope.exception.message }</h4>
    <button style="width: 300px;margin: 0px auto 0px auto;" class="btn btn-lg btn-success btn-block">返回刚才页面</button> </div>
</body>
</html>
