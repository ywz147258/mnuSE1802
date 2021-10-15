<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/15 0015
  Time: 下午 4:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        if(request.getSession().getAttribute("isLogin")==null){
            response.sendRedirect("login.jsp");
        }
    %>
    您好<%=request.getSession().getAttribute("userName")%>
    <a href="BookServlet">返回到首页</a>
</body>
</html>
