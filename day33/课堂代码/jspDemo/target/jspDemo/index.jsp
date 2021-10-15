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

    <table border="1">
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>HREF</th>
        </tr>
    <%
        //一页有几条
        Integer limit=5;
        //当前是第几页
        Integer nowPage=1;
        if(request.getParameter("nowPage")!=null){
            nowPage=Integer.valueOf(request.getParameter("nowPage"));
        }
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bookStore?useUnicode=true&characterEncoding=UTF-8";
        //数据库账号
        String user = "root";
        //数据库的密码
        String password = "";
        //链接数据库
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement ps = con.prepareStatement("select * from book limit ?,?");
        ps.setInt(1,nowPage);
        ps.setInt(2,limit);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        %>
           <tr>
               <td><%=rs.getInt("id")%></td>
               <td><%=rs.getString("name")%></td>
               <td><%=rs.getString("href")%></td>
           </tr>
         <%
        }
     rs.close();
     ps.close();
    %>
    </table>

    <%
        String sql="select count(1) as counts from book";
        PreparedStatement psCount= con.prepareStatement(sql);
        ResultSet rsCount= psCount.executeQuery();
        Integer count = 0;
        while(rsCount.next()){
            count=rsCount.getInt("counts");
        }
        Double d1= Double.valueOf(count/limit);
        int pages = (int)Math.ceil(d1);
        for(int i=1;i<=pages;i++){ %>
            <a href="index.jsp?nowPage=<%=i%>">第<%=i%>页</a>
        <% }

        con.close();
    %>


</body>
</html>