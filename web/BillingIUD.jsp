<%-- 
    Document   : BillingIUD
    Created on : Feb 22, 2021, 10:23:39 AM
    Author     : DELL
--%>

<%@page  import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
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
       int billid,custid,packid,packcost,gst,total;
       String billdate,btn;
        %>
        <%
        btn=request.getParameter("btn");
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
        if(btn.equals("Confirm")){
        billid=Integer.parseInt(request.getParameter("id"));
        custid=Integer.parseInt(session.getAttribute("cid").toString());//request.getParameter("selectcust"));
        billdate=request.getParameter("date");
        packid=Integer.parseInt(session.getAttribute("pid").toString());
        packcost=Integer.parseInt(request.getParameter("cost"));
        gst=Integer.parseInt(request.getParameter("gst"));
        total=Integer.parseInt(request.getParameter("total"));
        st.executeUpdate("insert into billing values("+billid+","+custid+",'"+billdate+"',"+packid+","+packcost+","+gst+","+total+")");
        out.print("Inserted Succesfully");
        }
        
//         if(btn.equals("UPDATE")){
//        billid=Integer.parseInt(request.getParameter("id"));
//        custid=Integer.parseInt(request.getParameter("cid"));
//        billdate=request.getParameter("date");
//        packid=Integer.parseInt(request.getParameter("pid"));
//        packcost=Integer.parseInt(request.getParameter("cost"));
//        gst=Integer.parseInt(request.getParameter("gst"));
//        total=Integer.parseInt(request.getParameter("total"));
//        st.executeUpdate("update billing set CUST_ID="+custid+",BILL_DATE='"+billdate+"',PACK_ID="+packid+",PACK_COST="+packcost+",GST="+gst+",TOTAL="+total+" where BILL_ID="+billid);
//        out.print("Updated succesfully");
//         }
//          if(btn.equals("DELETE")){
//        billid=Integer.parseInt(request.getParameter("id"));
//        st.executeUpdate("delete from billing where BILL_ID="+billid);
//          }
        session.setAttribute("bid", billid);
        response.sendRedirect("Recipt.jsp");
          st.close();
          con.close();
        %>
    </body>
</html>
