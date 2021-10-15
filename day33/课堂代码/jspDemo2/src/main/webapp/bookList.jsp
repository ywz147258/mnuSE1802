<%@ page import="com.ywz.entity.Book" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/15 0015
  Time: 下午 3:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<Book> list = (List<Book>) request.getAttribute("list");
    %>
    <form action="BookServlet" method="post">
        书名:<input type="text" name="keyWord" value="<%=request.getParameter("keyWord")%>"/> <button>搜索</button>
        <table>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>href</th>
            </tr>
            <%for(Book book:list){%>
                <tr>
                    <td><%=book.getId()%></td>
                    <td><%=book.getName()%></td>
                    <td><%=book.getHref()%></td>
                </tr>
            <%}%>
        </table>
    </form>
</body>
</html>
