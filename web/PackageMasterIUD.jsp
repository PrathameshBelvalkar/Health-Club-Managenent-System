<%-- 
    Document   : PackageMasterIUD
    Created on : Feb 22, 2021, 9:43:09 AM
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
        int id,cost;
        String name,duration,btn;
        %>
         <%
        btn=request.getParameter("btn");
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
        if(btn.equals("INSERT")){
            id=Integer.parseInt(request.getParameter("id"));
            name=request.getParameter("name");
            cost=Integer.parseInt(request.getParameter("cost"));
            duration=request.getParameter("duration");
            st.executeUpdate("insert into package_master values("+id+",'"+name+"',"+cost+",'"+duration+"')");
            out.print("Inserted succesfully");
        }
          if(btn.equals("UPDATE")){
            id=Integer.parseInt(request.getParameter("id"));
            name=request.getParameter("name");
            cost=Integer.parseInt(request.getParameter("cost"));
            duration=request.getParameter("duration");
            st.executeUpdate("update package_master set PACK_NM='"+name+"',PACK_COST="+cost+",PACK_DURATION='"+duration+"' where PACK_ID="+id);
            out.print("Updated succesfully");
          }
           if(btn.equals("DELETE")){
            id=Integer.parseInt(request.getParameter("id"));
            st.executeUpdate("delete from package_master where PACK_ID="+id);
           out.print("Deleted succesfully");
           }
        %>
    </body>
</html>
