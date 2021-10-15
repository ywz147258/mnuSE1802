<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/15 0015
  Time: 上午 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
</head>
<style type="text/css">
    table{
        margin:auto;
    }
</style>
<body>
<% String message= request.getParameter("message");
    if(message!=null){
%>
<script type="text/javascript">
    window.onload=function(){
        document.getElementById("tip").innerText='<%=message%>'
    }
</script>
<%
    }
%>
<div id="tip"></div>
<form method="post" action="loginAction">
    <table>
        <tr>
            <td>账号</td>
            <td><input type="text" name="userName"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="psw"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登陆" /></td>
        </tr>
    </table>
</form>
</body>
</html>
