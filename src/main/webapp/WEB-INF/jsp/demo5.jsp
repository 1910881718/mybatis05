<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/2 0002
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="demo5" modelAttribute="user" method="post">
    编号：<s:input path="id"/><br/>
    爱好:<s:checkboxes path="loves" items="${allLoves}"/><br/>
    城市:<s:select path="city">
    <option  value="0">请选择</option>
    <s:options items="${cityList}"  itemValue="id" itemLabel="name"></s:options>
</s:select>
    性别:<s:radiobuttons path="sex" items="${['男','女']}"/>
    <input type="submit" value="提交"/>

</s:form>
</body>
</html>
