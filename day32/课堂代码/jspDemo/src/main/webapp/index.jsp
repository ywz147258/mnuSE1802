<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" session="false" errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>

<body>
<% String str = "ywz";%>
您的名字是：<%=str%><br/>

    <%
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bookStore?useUnicode=true&characterEncoding=UTF-8";
        //数据库账号
        String user = "root";
        //数据库的密码
        String password = "";
        //链接数据库
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement ps = con.prepareStatement("select * from book");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String name=rs.getString("name");

        %>
            <%=name%><br/>
         <%
        }
    rs.close();
    ps.close();
    con.close();
    %>


</body>
</html>