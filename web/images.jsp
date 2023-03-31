<%-- 
    Document   : images
    Created on : Feb 27, 2021, 10:08:35 AM
    Author     : DELL
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        %>
        <%
             Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
        %>
        <%
        rs=st.executeQuery("select * from equipment");
       out.print("<table border=1>");
          out.print("<tr>");
               out.print("<td height='150px' width='150px'><img src='upload/MinimalWallpapers-14.png' height='150px' width='150px'></td>");
              out.print("<td height='150px' width='150px' img src=><img src=''></td>");
               out.print("<td height='150px' width='150px'><img src=''></td>");
          out.print("</tr>");
           out.print("<tr>");
               out.print("<td height='150px' width='150px'><img src=''></td>");
              out.print("<td height='150px' width='150px'><img src=''></td>");
               out.print("<td height='150px' width='150px'><img src=''></td>");
          out.print("</tr>");
          out.print("<tr>");
               out.print("<td height='150px' width='150px'><img src=''></td>");
              out.print("<td height='150px' width='150px'><img src=''></td>");
               out.print("<td height='150px' width='150px'><img src=''></td>");
          out.print("</tr>");
          out.print("</table>");
        %>
    </body>
</html>
