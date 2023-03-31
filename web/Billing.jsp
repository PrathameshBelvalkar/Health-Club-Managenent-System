<%-- 
    Document   : Billing
    Created on : Feb 20, 2021, 11:27:40 AM
    Author     : DELL
--%>
<%@page import="java.sql.*" %>
<%@page import="java.util.Calendar" %>
<%--<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>--%>
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
        <script type="text/javascript" language="javascript">

function formValidator(){
	// Make quick references to our fields
	var name = document.getElementById("txtname");
	var cost = document.getElementById("txtcost");
	var gst = document.getElementById("txtgst");
	var total= document.getElementById("txttotal");
        
        if(notEmpty(name,"Name Must be given") && isAlphabet(name, "Please enter only letters for your name"))
        {
        if(notEmpty(cost ,"cost Must be given") && isNumeric(cost, "Digits Only for cost"))
               {
	if(notEmpty(gst,"GST Must be given") && isNumeric(gst, "Digits Only for GST"))
                 {
         if(notEmpty(total,"Total Must be given") && isNumeric(total, "Digits Only for cost"))
                    {
                     return true; 
                    }            
                 }
             }
         }
                return false;
        }
        function notEmpty(elem, helperMsg)
    {

	if(elem.value.length == 0)
        {
		alert(helperMsg);
		elem.focus(); // set the focus to this input
		return false;
        }
	return true;
     }
     function isAlphanumeric(elem, helperMsg)
     {
	var alphaExp = /^[0-9a-zA-Z ]+$/;
	if(elem.value.match(alphaExp))
        {
		return true;
	}else
        {
		alert(helperMsg);
		elem.value="";
		elem.focus();
		return false;
	}
        }
function isNumeric(elem, helperMsg)
{
	var numericExpression = /^[0-9]+$/;
	if(elem.value.match(numericExpression))
{
		return true;
}else
{
		elem.value="";
		alert(helperMsg);
		elem.focus();
		return false;
	}
}
     function isAlphabet(elem, helperMsg)
    {
	var alphaExp = /^[a-zA-Z ]+$/;
	if(elem.value.match(alphaExp))
        {
		return true;
        }
            else
            {
		alert(helperMsg);
		elem.value="";
		elem.focus();
		return false;
            }
    }

        </script>
    </head>
    <body>
       <div class="container-fluid pl-0 pr-0 bg-img clearfix parallax-window2" data-parallax="scroll" data-image-src="images/banner2.jpg">
  <nav class="navbar navbar-expand-md navbar-dark">
    <div class="container"> 
      <!-- Brand --> 
      <a class="navbar-brand mr-auto" href="#"><h1>Gym Project</h1><img src="images/logo1.png" alt="" /></a> 
      
      
      <!-- Toggler/collapsibe Button -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar"> <span class="navbar-toggler-icon"></span> </button>
      
      <!-- Navbar links -->
      <div class="collapse navbar-collapse" id="collapsibleNavbar">
       <ul class="navbar-nav ml-auto">
          <li class="nav-item"> <a class="nav-link" href="Customerlogin.jsp">Home</a> </li>
          <li class="nav-item"> <a class="nav-link" href="Enquiry.jsp">Enquiry</a> </li>
          <li class="nav-item"> <a class="nav-link" href="fox/index.html">Logout</a> </li>
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
          <h4>Billing</h4>
        
            <%!        
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
       String id,name,cost;            int maxid=0;
       String bdate,bid,cid,pid,pcost,gst,total;

      
        %>
       <%
            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
        
         rs=st.executeQuery("select max(Bill_ID)from billing");
          if(rs.next()){
          maxid=rs.getInt(1);
          maxid=maxid+1;
          }
          
          
        id=(String)session.getAttribute("pid");
        name=(String)session.getAttribute("pname");
        cost=(String)session.getAttribute("pcost");
        bid=String.valueOf(maxid);
        cid="1";
        bdate="";
        gst=String.valueOf(Integer.parseInt(cost)*18/100);
        total=String.valueOf(Integer.parseInt(cost)+Integer.parseInt(gst));
       
         
        
//        out.print("id"+id);
//        out.print("name"+name);
//        out.print("cost"+cost);
//        
           
       %> 
        <%
        
//       if(request.getQueryString()!=null){
//           
//       bid=request.getParameter("b_id");
//        cid=request.getParameter("c_id");
//        bdate=request.getParameter("b_date");
//        pid=request.getParameter("p_id");
//        pcost=request.getParameter("p_cost");
//        gst=request.getParameter("gst");
//        total=request.getParameter("total");
//       }
//       else{
           
//            rs=st.executeQuery("select max(Bill_ID)from billing");
//          if(rs.next()){
//          maxid=rs.getInt(1);
//          maxid=maxid+1;
//          }
//       bdate="";
//       bid=String.valueOf(maxid);
//       cid="";
//       pid="";
//       pcost="";
//       gst="";
//       total="";
     //  }
        %>
        <form action="BillingIUD.jsp">
        <table class="table table-responsive d-table" style="color: black;width:75%;">
           <tr>
               <td><h1>Billing</h1></td>
               
           </tr>
            <tr>
                <td style="text-align: right">Bill Id</td>
                <td><input type="text" name="id" value="<%=bid%>" class="form-control pl-0" autocomplete="off">
            </tr>
            <tr>
                <td style="text-align: right">Customer Id</td>
                <td>
                    <%=session.getAttribute("cnm")%>
                </td>
            </tr>
           
            <tr>
                <td style="text-align: right">Bill Date</td>
                <td><input type="date" name="date" value="<%=bdate%>" class="form-control pl-0" autocomplete="off">
            </tr>
            <tr>
                <td style="text-align: right">Package Id</td>
                <td> <input type="text" name="pid" value="<%=name%>" class="form-control pl-0">
              </td> 
            </tr>
            <tr>
                <td style="text-align: right">Package Cost</td>
                <td><input type="text" name="cost" value="<%=cost%>" id="txtcost" class="form-control pl-0" autocomplete="off" readonly>
            </tr>
            <tr>
                <td style="text-align: right">GST</td>
                <td><input type="text" name="gst"  id="txtgst" value="<%=gst%>" class="form-control pl-0" autocomplete="off" readonly>
            </tr>
            <tr>
                <td style="text-align: right">Total</td>
                <td><input type="text" name="total"  id="txttotal" value="<%=total%>" class="form-control pl-0" autocomplete="off" readonly>
            </tr>
            <tr style="text-align: right">
            
            <tr style="text-align: right">
                <td><br><input type="submit" value="Confirm" name="btn" onclick="return formValidator()" style="cursor: pointer" class="btn btn-primary">
             <td></td>
<!--             <td><a href="Recipt.jsp"><input style="color: white;background-color: orangered;" type="button" value="See you recipt Here"></a></td>-->
            </tr>
          
        </table>
        </form>
       
        
       
       
        
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
