<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/29 0029
  Time: 上午 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body>
<tr><%= request.getAttribute("username").toString() %>欢迎登陆！！！！<br/><br/>
    您的密码是<%= request.getAttribute("password").toString() %><br/><br/></tr>
</body>
</html>
