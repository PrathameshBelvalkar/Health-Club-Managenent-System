<%-- 
    Document   : BillingListReport
    Created on : Feb 22, 2021, 5:05:37 PM
    Author     : DELL
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Billing Page</title>
        <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!--  <title>Fox - Free One Page Template, Free Fitness HTML5 Template by FreeHTML5.co</title>-->

  <!-- Bootstrap CSS -->
  <link href="fox/css/animate.css" rel="stylesheet" type="text/css"/>
   
  <link rel="stylesheet" href="fox/css/bootstrap.min.css" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
  <link rel="stylesheet" href="fox/css/style.css">

    </head>
    <body>
         <div class="container-fluid pl-0 pr-0 bg-img clearfix parallax-window2" data-parallax="scroll" data-image-src="images/banner2.jpg">
  <nav class="navbar navbar-expand-md navbar-dark">
    <div class="container"> 
      <!-- Brand --> 
      <a class="navbar-brand mr-auto" href="#"><h1>Health club management</h1><img src="images/logo1.png" alt="" /></a> 
      
      
      <!-- Toggler/collapsibe Button -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar"> <span class="navbar-toggler-icon"></span> </button>
      
       Navbar links 
      <div class="collapse navbar-collapse" id="collapsibleNavbar">
         <ul class="navbar-nav ml-auto">
          <li class="nav-item"> <a class="nav-link" href="fox/index.html">Home</a> </li>
          <li class="nav-item"> <a class="nav-link" href="adminlogin.jsp">Logout</a> </li>
          <li class="nav-item"> <a class="nav-link" href="dashboard.jsp">Dashboard</a> </li>
<!--          <li class="nav-item"> <a class="nav-link" href="#contact">Contact</a> </li>-->
        </ul>
        <ul class="navbar-nav ml-5">
          <li class="nav-item"> <a class="nav-link btn btn-danger" href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a> </li>
        </ul>
      </div>
    </div>
  </nav>

</div>
        <footer class="container-fluid">
  <div class="container">
    <div class="row">
<!--        <div class="col-md-4"></div>-->
      <div class="col-md-12 footer2 wow bounceInUp" data-wow-delay=".25s" id="contact">
        <div class="form-box">
          <h4>Billing Report</h4>
           <%!        
        Connection con=null;
        Statement st=null;
        ResultSet rs=null; 
        %>
         <%
           Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
st=con.createStatement(); rs=st.executeQuery("select BILL_ID,BILL_DATE,CUST_NM,PACK_NM,billing.PACK_COST,GST,TOTAL from billing,customer,package_master where billing.CUST_ID=customer.CUST_ID and billing.PACK_ID=package_master.PACK_ID");
       out.print("<table class='table table-responsive d-table' style='color: black;width:75%;'>");
       out.print("<tr>");
      //<table class="table table-responsive d-table" style="color: black;width:75%;">
       out.print("<th>Bill ID</th>");
       out.print("<th>Bill date</th>");
       out.print("<th>Customer name</th>");
       out.print("<th>Package Name</th>");
       out.print("<th>Package Cost</th>");
       out.print("<th>GST</th>");
       out.print("<th>Total</th>");
       out.print("</tr>");
       while(rs.next())
       {           
       out.print("<tr>");
       out.print("<td>"+rs.getString(1)+"</td>");
       out.print("<td>"+rs.getString(2)+"</td>");
       out.print("<td>"+rs.getString(3)+"</td>");
       out.print("<td>"+rs.getString(4)+"</td>");
       out.print("<td>"+rs.getString(5)+"</td>");
       out.print("<td>"+rs.getString(6)+"</td>");
       out.print("<td>"+rs.getString(7)+"</td>");
       
       out.print("</tr>");
      
       }
        out.print("</table>");
       %>
        </div>  
      <div class="col-md-3 footer3 wow bounceInRight" data-wow-delay=".25s">
        
      </div>
    </div>
  </div>
  </div>
</footer>

<!-- Optional JavaScript --> 
<!-- jQuery first, then Bootstrap JS, ... -->

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/parallax.js"></script>
<script src="js/wow.js"></script>
<script src="js/main.js"></script>
    </body>
</html>
