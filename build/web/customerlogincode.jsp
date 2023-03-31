<%-- 
    Document   : customerlogincode
    Created on : Mar 12, 2021, 9:39:52 AM
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
        String email,pass;
        %>
        <%
           email=request.getParameter("email");
        pass=request.getParameter("pass");
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
        rs=st.executeQuery("select * from customer where CUST_EMAIL='"+email+"' and CUST_PASS='"+pass+"'");
        if(rs.next()){
            session.setAttribute("cid", rs.getString(1));
            session.setAttribute("cnm", rs.getString(2));
            response.sendRedirect("searchpackage.jsp");
            out.print("LOGIN SUCCESFUL");
        }
        else{
          response.sendRedirect("Customerlogin.jsp");
        }
        %>
    </body>
</html>
