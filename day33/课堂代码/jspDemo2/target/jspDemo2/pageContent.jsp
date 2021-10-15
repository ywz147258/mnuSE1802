<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/15 0015
  Time: 下午 2:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name ="ywz";
        pageContext.setAttribute("name",name);
//        out.print("hello");
    %>

    <%=pageContext.getAttribute("name")%>
    <a href="index.jsp">跳转</a>
</body>
</html>
