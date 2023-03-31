<%-- 
    Document   : PackageMaster
    Created on : Feb 20, 2021, 11:23:09 AM
    Author     : DELL
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PACKAGE PAGE</title>
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
	var Duration= document.getElementById("txtdur");
	if(notEmpty(name,"Name Must be given") && isAlphanumeric(name, "Please enter only letters for your name"))
                {
	
        if(notEmpty(cost ,"cost Must be given") && isAlphanumeric(cost, "Numbers and Letters Only for Cost")) 
                        {
        if(notEmpty(Duration ,"Duration Must be given") && isAlphanumeric(Duration, "Numbers and Letters Only for Duration")) 
                            {
                                return true;
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
}else{
		alert(helperMsg);
		elem.value="";
		elem.focus();
		return false;
	}
}

function isAlphanumeric(elem, helperMsg){
	var alphaExp = /^[0-9a-zA-Z ]+$/;
	if(elem.value.match(alphaExp)){
		return true;
	}else{
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
          <h4>Packages</h4>
         <%!
            Connection con=null;
            ResultSet rs=null;
            Statement st=null;
            %>
            <%
             Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
            %>
            <%
                int maxid=0;
            String pid,pnm,pcost,pdur;
            if(request.getQueryString()!=null){
            pid=request.getParameter("p_id");
            pnm=request.getParameter("p_nm");
            pcost=request.getParameter("p_cost");
            pdur=request.getParameter("p_dur");
            }
            else{
                 rs=st.executeQuery("select max(PACK_ID)from package_master");
          if(rs.next()){
          maxid=rs.getInt(1);
          maxid=maxid+1;
          }
             pid=String.valueOf(maxid);
             pnm="";
             pcost="";
             pdur="";
            }
            %>
            <form action="PackageMasterIUD.jsp" autocomplete="off">
        <table class="table table-responsive d-table" style="color: black;width:75%;">
           <tr>
               <td><h1>Packages</h1></td>
               
           </tr>
            <tr>
                <td style="text-align: right">Package ID<td>
                <td><input type="text" name="id" value="<%=pid%>" class="form-control pl-0" readonly="" placeholder="Package id"></td>
            </tr>
            <tr>
                <td style="text-align: right">Package Name<td>
                <td><input type="text" name="name" value="<%=pnm%>" id="txtname" class="form-control pl-0"></td>
            </tr>
            <tr>
                <td style="text-align: right">Package Cost<td>
                <td><input type="text" name="cost" value="<%=pcost%>" id="txtcost" class="form-control pl-0"></td>
            </tr>
            <tr>
                <td style="text-align: right">Package Duration<td>
                <td><input type="text" name="duration" value="<%=pdur%>" id="txtdur" class="form-control pl-0"></td>
            </tr>
            <tr style="text-align: right">
             <%if(request.getQueryString()!=null){%>
             <td><br><input type="submit" value="INSERT" name="btn" disabled="" onclick="return formValidator()">
            <input type="submit" value="UPDATE" name="btn" onclick="return formValidator()">
            <input type="submit" value="DELETE" name="btn"></td>
            </tr>
            <%}
               else{
            %>
            <tr style="text-align: right">
             <td><br><input type="submit" value="INSERT" name="btn" onclick="return formValidator()">
                 <input type="submit" value="UPDATE" name="btn" disabled="" onclick="return formValidator()">
                 <input type="submit" value="DELETE" name="btn" disabled=""></td>
            </tr>
            <%}%>
        </table>
        </form>
           
            <%
            
        rs=st.executeQuery("select * from package_master");
        out.print("<table border=1>");
        out.print("<tr style=color:black>");
        out.print("<th>select</th>");
        out.print("<th>Package ID</th>");
        out.print("<th>Package Name</th>");
        out.print("<th>Package cost</th>");
        out.print("<th>Package Duration</th>");
        out.print("</tr>");
        while(rs.next()){
            out.print("<tr style=color:black>");
            out.print("<td><a href='PackageMaster.jsp?p_id="+rs.getInt(1)+"&p_nm="+rs.getString(2)+"&p_cost="+rs.getInt(3)+"&p_dur="+rs.getString(4)+"'>SELECT</a></td>");
            out.print("<td>"+rs.getInt(1)+"</td>");
            out.print("<td>"+rs.getString(2)+"</td>"); 
            out.print("<td>"+rs.getInt(3)+"</td>");
            out.print("<td>"+rs.getString(4)+"</td>");
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
