<%-- 
    Document   : dashboard
    Created on : Mar 12, 2021, 10:21:30 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--        <title>PACKAGE PAGE</title>-->
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
      <a class="navbar-brand mr-auto" href="#"><h1>DASH BOARD</h1><img src="images/logo1.png" alt="" /></a> 
      
      
      <!-- Toggler/collapsibe Button -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar"> <span class="navbar-toggler-icon"></span> </button>
      
       Navbar links 
      <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item"> <a class="nav-link" href="fox/index.html">Home</a> </li>
          <li class="nav-item"> <a class="nav-link" href="adminlogin.jsp">Logout</a> </li>
<!--          <li class="nav-item"> <a class="nav-link" href="#">Courses</a> </li>
          <li class="nav-item"> <a class="nav-link" href="#contact">Contact</a> </li>-->
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
<!--          <h4>CONTACT US</h4>-->
        <table class="table table-responsive d-table" style="color: black;width:75%;">
            <tr>
                <th>MANAGE</th>
                <th>LIST REPORT</th>
                <th>LIST Dynamic report</th>
            </tr>
            <tr>
                <td>
<!--                <a href="Billing.jsp">Billing</a>
                <br><a href="Customer.jsp">Customer</a>
               <br> <a href="Enquiry.jsp">Enquiry</a>-->
                <br><a href="Equipment.jsp">Equipment</a>
                <br><a href="PackageMaster.jsp">Package master</a>
<!--                 <br><a href="Recipt.jsp">Recipt</a>-->
                </td>
                
                
               <td><a href="BillingListReport.jsp">Billing List Report</a>
               <br><a href="CustomerListReport.jsp">Customer List Report</a>
               <br> <a href="EnquiryListReport.jsp">Enquiry List Report</a>
                <br><a href="EquipmentListReport.jsp">Equipment List Report</a>
                <br><a href="PackageMasterListReport.jsp">package master List Report</a>
               </td>
               
               <td><a href="customerwiseBill.jsp">Customer wise Bill</a>
                 <br><a href="datedynamicreport.jsp">Date DYNAMIC REPORT</a>  
                 <br><a href="Packagewisebill.jsp">Package Wise Bill</a>
               </td>
            </tr>
            

        
        </table>
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
