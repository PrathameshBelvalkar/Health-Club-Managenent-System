<%--
    Document   : CustomerIUD
    Created on : Feb 20, 2021, 3:15:30 PM
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
        int id,age;
        float weight,height;
        String name,btn,date,csex,disease,add,pass,email;
        %>
        <%
        btn=request.getParameter("btn");
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
        if(btn.equals("Create Account")){
        id=Integer.parseInt(request.getParameter("id"));
        name=request.getParameter("name");
        age=Integer.parseInt(request.getParameter("age"));
        date=request.getParameter("date");
        csex=request.getParameter("csex");
        disease=request.getParameter("dis");
        weight=Float.parseFloat(request.getParameter("wt"));
        height=Float.parseFloat(request.getParameter("ht"));
        add=request.getParameter("add");
        pass=request.getParameter("pass");
        email=request.getParameter("email");
        st.executeUpdate("insert into customer values("+id+",'"+name+"',"+age+",'"+date+"','"+csex+"','"+disease+"',"+weight+","+height+",'"+add+"','"+pass+"','"+email+"')");
        out.print("Insert Succesful");
        }
//        if(btn.equals("UPDATE")){
//        id=Integer.parseInt(request.getParameter("id"));
//        name=request.getParameter("name");
//        age=Integer.parseInt(request.getParameter("age"));
//        date=request.getParameter("date");
//        csex=request.getParameter("csex");
//        disease=request.getParameter("dis");
//        weight=Float.parseFloat(request.getParameter("wt"));
//        height=Float.parseFloat(request.getParameter("ht"));
//        add=request.getParameter("add");
//        pass=request.getParameter("pass");
//        email=request.getParameter("email");
//        st.executeUpdate("update customer set CUST_NM='"+name+"',CUST_AGE="+age+",REG_DATE='"+date+"',CUST_SEX='"+csex+"',CUST_MED_DIESESE='"+disease+"',CUST_WT="+weight+",CUST_HT="+height+",CUST_ADD='"+add+"',CUST_PASS='"+pass+"',CUST_EMAIL='"+email+"' where CUST_ID="+id);
//        out.print("Updated succesfully");
//        }
//        if(btn.equals("DELETE")){
//         id=Integer.parseInt(request.getParameter("id"));
//         st.executeUpdate("delete from customer where CUST_ID="+id);
//         out.print("Delete succesful");
//        }
        response.sendRedirect("Customerlogin.jsp");
        %>
    </body>
</html>
