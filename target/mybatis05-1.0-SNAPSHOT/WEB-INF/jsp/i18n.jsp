<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/4 0004
  Time: 1:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><t:message code="user.login"/></h1>
<a href="change?lang=zh">中文</a><br/>
<a href="change?lang=en">english</a><br/>
<form action="../user/login">
<t:message code="user.username"/>
    <input type="text" name="username" value="${user.username}"/>${map.username}<br/>
<t:message code="user.password"/>
    <input type="password" name="password"/>${map.password}<br/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
