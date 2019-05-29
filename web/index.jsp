<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28 0028
  Time: 下午 7:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      Hello World !!
      <li>ajax提交数据接收返回值</li><br/><br/>
      <input type="text" id="username" name="username" placeholder="请输入用户名"><br/><br/>
      <input type="password" id="password" name="password" placeholder="请输入密码"><br/><br/>
      <input type="submit" onclick="ajaxFun()" value="点击提交">
      <div>
        <li id="getM" ></li>
      </div>
  </body>
</html>
  <script type="text/javascript">
      function ajaxFun(){
          var username = document.getElementById("username").value;
          var password = document.getElementById("password").value;
          console.log(username+" "+password);
          $.ajax({
              type:"post",
              url:"/getMessage",
              data:"username="+username+"&password="+password,
              success:function(message){
                  document.getElementById("getM").innerHTML=message;
              }
          });
      }

  </script>
</html>
