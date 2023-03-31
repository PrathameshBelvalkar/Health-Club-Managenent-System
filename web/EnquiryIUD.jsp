<%-- 
    Document   : enquiryIUD
    Created on : Feb 20, 2021, 6:37:47 PM
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
        int id;
        String name,add,mob,email,msg,btn; 
        %>
         <%
        btn=request.getParameter("btn");
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
        if(btn.equals("INSERT")){
            id=Integer.parseInt(request.getParameter("id"));
            name=request.getParameter("name");
            add=request.getParameter("add");
            mob=request.getParameter("mob");
            email=request.getParameter("email");
            msg=request.getParameter("msg");
        st.executeUpdate("insert into enquiry values("+id+",'"+name+"','"+add+"','"+mob+"','"+email+"','"+msg+"')");
        out.print("Insert succesful");
        }
        
         if(btn.equals("UPDATE")){
          id=Integer.parseInt(request.getParameter("id"));
            name=request.getParameter("name");
            add=request.getParameter("add");
            mob=request.getParameter("mob");
            email=request.getParameter("email");
            msg=request.getParameter("msg");
            st.executeUpdate("update enquiry set ENQ_NAME='"+name+"',ENQ_ADDR='"+add+"',ENQ_PHNO='"+mob+"',ENQ_EMAIL='"+email+"',ENQ_MESSAGE='"+msg+"' where ENQ_ID="+id);
            out.print("Updated succesfully");
         }
         if(btn.equals("DELETE")){
         id=Integer.parseInt(request.getParameter("id"));
         st.executeUpdate("delete from enquiry where ENQ_ID="+id);
         out.print("Deleted succesful");
         }
         st.close();
         con.close();
            %>
    </body>
</html>
