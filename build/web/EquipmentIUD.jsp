<%-- 
    Document   : EquipmentIUD
    Created on : Feb 20, 2021, 2:53:07 PM
    Author     : DELL
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        int id;
        String name,photo,btn;
        %>
        <%
        btn=request.getParameter("btn");
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
        if(btn.equals("INSERT"))
        {
        id=Integer.parseInt(request.getParameter("id"));
        name=request.getParameter("name");
        photo=request.getParameter("File");
        st.executeUpdate("insert into equipment values("+id+",'"+name+"','"+photo+"')");
        out.print("insert succesful");
        }
         if(btn.equals("UPDATE")){
          id=Integer.parseInt(request.getParameter("id"));
        name=request.getParameter("name");
        photo=request.getParameter("File");
        st.executeUpdate("update equipment set EQP_NAME='"+name+"',EQP_photo='"+photo+"' where EQP_ID="+id);
        out.print("Update succesful");
         }
         if(btn.equals("DELETE")){
            id=Integer.parseInt(request.getParameter("id"));
            st.executeUpdate("delete from equipment where EQP_ID="+id);
            out.print("DELETED SUCCESFUL");
         }
         st.close();
         con.close();
         response.sendRedirect("Equipment.jsp");
        %>
    </body>
</html>
