<%-- 
    Document   : Recipt
    Created on : Mar 17, 2021, 9:55:39 AM
    Author     : DELL
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--        <title>CUSTOMER Page</title>-->
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
        <div class="container-fluid pl-0 pr-0 bg-img clearfix parallax-window2" data-parallax="scroll" data-image-src="images/banner2.jpg">
  <nav class="navbar navbar-expand-md navbar-dark">
    <div class="container"> 
       Brand  
      <a class="navbar-brand mr-auto" href="#"><h1>Gym Project</h1><img src="images/logo1.png" alt="" /></a> 
      
      
       Toggler/collapsibe Button 
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar"> <span class="navbar-toggler-icon"></span> </button>
      
       Navbar links 
      <div class="collapse navbar-collapse" id="collapsibleNavbar">
         <ul class="navbar-nav ml-auto">
          <li class="nav-item"> <a class="nav-link" href="Customerlogin.jsp">Home</a> </li>
          <li class="nav-item"> <a class="nav-link" href="Enquiry.jsp">Enquiry</a> </li>
          <li class="nav-item"> <a class="nav-link" href="Customerlogin.jsp">Logout</a> </li>
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
            <h4 style="font-family:Rockwell">Bill Recipt</h4>
            
            
           <%
        int bid;
        bid=(Integer)session.getAttribute("bid");
        
           rs=st.executeQuery("select BILL_ID,BILL_DATE,CUST_NM,PACK_NM,billing.PACK_COST,GST,TOTAL from billing,customer,package_master where billing.CUST_ID=customer.CUST_ID and billing.PACK_ID=package_master.PACK_ID and BILL_ID="+bid);
            while(rs.next())
       {           
           %>
           <div id="print">
        <table style="margin-left: auto;margin-right: auto;background:#ffdab9;width: 100%">
		<tr>
                    <td style="color: black;font-family:Rockwell">Date:-<label><b><%out.print(rs.getString(2));%></b></label></td>
		</tr>
		<tr>
                    <td style="color: black;font-family: Rockwell">Bill No:-<label><b><%out.print(rs.getString(1));%></b></label></td>
		</tr>
		<tr>
			<td></td>
                        <td style="color: black;font-family:Rockwell"> Recieved amount of Rupees:-<label><b><%out.print(rs.getString(5));%>/-</b></label></td>
		</tr>
		<tr>
			<td></td>
                        <td style="color: black;font-family:Rockwell">from:-<label><u><b><%out.print(rs.getString(3));%></b></u></label></td>
		</tr>
		<tr>
			<!-- <td>Rupees</td> -->
		</tr>
		<tr>
                    <td style="color: black;font-family:Rockwell">Ruppees:-<label style="font-size: x-large"><u><%out.print(rs.getString(5));%>/-</u></label></td>
                    <td></td>
                    <td><img src="upload/Sign6.png" height="80" width="250"></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
                        <td style="color: black;font-family:Rockwell;">Authorised Signature</td>
		</tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="PRINT" onclick=window.print() style="margin-left: 50%"></td>
                </tr>
	</table>
           <%
                 }
           %>
           </div>
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

