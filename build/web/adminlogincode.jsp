<%-- 
    Document   : adminlogincode
    Created on : Mar 12, 2021, 9:12:43 AM
    Author     : DELL
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    </head>
    <body>
        <%!
        String user,pass;
        %>
        <%
        user=request.getParameter("user");
        pass=request.getParameter("pass");
        if(user.equals("admin")&&pass.equals("123456")){
            out.print("LOGIN SUCCESFUL");
         response.sendRedirect("dashboard.jsp");
        }
        else{
        out.print("Login unsuccesful");
           
       response.sendRedirect("adminlogin.jsp");
        }
        
        
        %>
        
    </body>
</html>
