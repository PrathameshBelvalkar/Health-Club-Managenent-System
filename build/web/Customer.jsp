<%-- 
    Document   : Customer
    Created on : Feb 20, 2021, 10:46:52 AM
    Author     : DELL
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CUSTOMER Page</title>
        <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Fox - Free One Page Template, Free Fitness HTML5 Template by FreeHTML5.co</title>

  <!-- Bootstrap CSS -->
  <link href="fox/css/animate.css" rel="stylesheet" type="text/css"/>
   
  <link rel="stylesheet" href="fox/css/bootstrap.min.css" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
  <link rel="stylesheet" href="fox/css/style.css">
        <script type="text/javascript" language="javascript">

function formValidator(){
	// Make quick references to our fields
	var name = document.getElementById("txtname");
	var age = document.getElementById("txtage");
	var Date = document.getElementById("txtdate");
	var csex= document.getElementById("txtcsex");
	var disease= document.getElementById("txtdis");
        var weight= document.getElementById("txtwt");
        var height= document.getElementById("txtht");        
        var address= document.getElementById("txtadd");
        var password= document.getElementById("txtpass");
        var email= document.getElementById("txtemail");
            
        if(notEmpty(name,"Name Must be given") && isAlphabet(name, "Please enter only letters for your name"))
        {
	if(notEmpty(age ,"Age Must be given") && isNumeric(age, "Numbers Only for Age"))
            {
				
	
	if(notEmpty( csex,"Sex Must be given") &&  isAlphabet(csex, "Please enter only letters for your sex"))
                     {
	if(notEmpty(disease ,"Disease Must be given") && isAlphabet(disease, "Please enter only alphabet for disease"))
                         {
        if(notEmpty(weight ,"Weight Must be given") &&  isNumeric(weight, "Please enter only digit for Weight")) 
                            {
        if(notEmpty(height ,"Height Must be given") &&  isNumeric(height, "Please enter only digit for Height"))
                                {
        if(notEmpty(address ,"Address Must be given") && isAlphanumeric(address, "Numbers and Letters Only for Address"))
                                    {
        if(notEmpty(password,"Password Must be given") &&  isAlphanumeric(password, "Please enter letters and digit for Password") && lengthRestriction(password,8,16))
                                        {
        if(notEmpty(email ,"email Must be given") &&  emailValidator(email, "Please enter valid email address"))
                                            {
                                                return true;
                                            }                                    
                                        }                                
                                    }                           
                                }                        
                            }                   
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
    function isNumeric(elem, helperMsg)
    {
	var numericExpression = /^[0-9]+$/;
	if(elem.value.match(numericExpression))
        {
		return true;
        }       
            else
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
        function isAlphanumeric(elem, helperMsg)
        {
	var alphaExp = /^[0-9a-zA-Z ]+$/;
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
        function emailValidator(elem, helperMsg)
        {
	var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
	if(elem.value.match(emailExp))
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

        function lengthRestriction(elem, min, max)
        {
	var uInput = elem.value;
	if(uInput.length >= min && uInput.length <= max)
        {
		return true;
	}
        else
        {
		alert("Please enter between " +min+ " and " +max+ " characters");
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
          <h4>Customer Registration</h4>
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
      <%
        int maxid=0;
      String cid,cname,cage,cdate,ccsex,cdis,cwt,cht,cadd,cpass,cemail;
      if(request.getQueryString()!=null){
      cid=request.getParameter("c_id");
      cname=request.getParameter("c_nm");
      cage=request.getParameter("c_age");
      cdate=request.getParameter("c_date");
      ccsex=request.getParameter("c_sex");
      cdis=request.getParameter("c_dis");
      cwt=request.getParameter("c_wt");
      cht=request.getParameter("c_ht");
      cadd=request.getParameter("c_add");
      cpass=request.getParameter("c_pass");
      cemail=request.getParameter("c_email");
      }
      else{
          rs=st.executeQuery("select max(CUST_ID)from customer");
          if(rs.next())
          {
          maxid=rs.getInt(1);
          maxid=maxid+1;
          }
          
          
      cid=String.valueOf(maxid);
      cname="";
      cage="";
      cdate="";
      ccsex="";
      cdis="";
      cwt="";
      cht="";
      cadd="";
      cpass="";
      cemail="";
      }
      %>
      <form action="CustomerIUD.jsp" autocomplete="off">
          <table class="table table-responsive d-table" style="color: black;width:75%;">
          <tr>
              <td><h1>Customer</h1></td>
          </tr>
           <tr>
               <td style="text-align: right">Customer ID</td>
               <td><input type="text" name="id" class="form-control pl-0" value="<%=cid%>" readonly="true" placeholdre="Customer ID" autocomplete="off"></td>
               <td></td>
           </tr>
           <tr>
               <td style="text-align: right">Name</td>
               <td><input type="text" name="name" class="form-control pl-0" value="<%=cname%>" id="txtname"></td>
               <td></td>
           </tr>
            <tr>
                <td style="text-align: right">AGE</td>
               <td><input type="text" name="age" class="form-control pl-0" value="<%=cage%>" id="txtage"></td>
               <td></td>
           </tr>
            <tr>
                <td style="text-align: right">Registration Date</td>
               <td><input type="date" name="date" class="form-control pl-0" value="<%=cdate%>" id="txtdate"></td>
               <td></td>
           </tr>
            <tr>
                <td style="text-align: right">Customer Sex</td>
               <td>
<!--                   <select>
                       <option>Male</option>
                       <option>Female</option>
                   </select>-->
                   <input type="text" name="csex" class="form-control pl-0" value="<%=ccsex%>" id="txtcsex" ></td>
               <td></td>
           </tr>
            <tr>
                <td style="text-align: right">Medical Disease</td>
               <td><input type="text" name="dis" class="form-control pl-0" value="<%=cdis%>" id="txtdis"></td>
               <td></td>
           </tr>
      
            <tr>
                <td style="text-align: right">Weight</td>
               <td><input type="text" name="wt" class="form-control pl-0" value="<%=cwt%>" id="txtwt"></td>
               <td></td>
           </tr>
            <tr>
                <td style="text-align: right">Height</td>
               <td><input type="text" name="ht" class="form-control pl-0" value="<%=cht%>" id="txtht"></td>
               <td></td>
           </tr>
            <tr>
                <td style="text-align: right">Address</td>
               <td><input type="text" name="add" class="form-control pl-0" value="<%=cadd%>" id="txtadd"></td>
               <td></td>
           </tr>
            <tr>
                <td style="text-align: right">Password</td>
                <td><input type="password" name="pass" class="form-control pl-0" value="<%=cpass%>" id="txtpass" style="border: 2px solid #000;border-top: none;border-right: none;border-left: none;"></td>
               <td></td>
           </tr>
            <tr>
                <td style="text-align: right">E-Mail</td>
               <td><input type="email" name="email" class="form-control pl-0" value="<%=cemail%>" id="txtemail"></td><td></td>
           </tr>
           <tr style="text-align: right">
               <%if(request.getQueryString()!=null){%>
               <td><br><input type="submit" value="Create Account" name="btn" disabled="" onclick="return formValidator()" style="background-image: linear-gradient(45deg,orange,orangered);">
<!--            <input type="submit" value="UPDATE" name="btn" onclick="return formValidator()">
            <input type="submit" value="DELETE" name="btn"></td>-->
            </tr>
            <%}
               else{
            %>
            <tr style="text-align: right">
             <td><br><input type="submit" value="Create Account" name="btn" onclick="return formValidator()" style="background-image: linear-gradient(45deg,orange,orangered);border-radius: 7px;color: wheat;font-family: Rockwell">
<!--                 <input type="submit" value="UPDATE" name="btn" disabled="" onclick="return formValidator()">
                 <input type="submit" value="DELETE" name="btn" disabled=""></td>-->
            </tr>
            <%}%>
       </table>
      </form>
        <h3></h3>
     
       <%
       
//        rs=st.executeQuery("select * from customer");
//        out.print("<table border=1 align='center'>");
//        out.print("<tr style=color:black>");
//        out.print("<th>SELECT</th>");
//        out.print("<th>CUSTOMER ID</th>");
//        out.print("<th>Name</th>");
//        out.print("<th>AGE</th>");
//        out.print("<th>DATE</th>");
//        out.print("<th> SEX</th>");
//        out.print("<th>Disease</th>");
//        out.print("<th> WEight</th>");
//        out.print("<th> Height</th>");
//        out.print("<th> Address</th>");
//        out.print("<th>CUSTOMER Password</th>");
//        out.print("<th>CUSTOMER Email</th>");
//        out.print("</tr>");
//        while(rs.next()){
//         out.print("<tr style=color:black>");
//         out.print("<td><a href='Customer.jsp?c_id="+rs.getInt(1)+"&c_nm="+rs.getString(2)+"&c_age="+rs.getInt(3)+"&c_date="+rs.getString(4)+"&c_sex="+rs.getString(5)+"&c_dis="+rs.getString(6)+"&c_wt="+rs.getFloat(7)+"&c_ht="+rs.getFloat(8)+"&c_add="+rs.getString(9)+"&c_pass="+rs.getString(10)+"&c_email="+rs.getString(11)+"'>SELECT</a></td>");
//         out.print("<td>"+rs.getInt(1)+"</td>");
//         out.print("<td>"+rs.getString(2)+"</td>");
//         out.print("<td>"+rs.getInt(3)+"</td>");
//         out.print("<td>"+rs.getString(4)+"</td>");
//         out.print("<td>"+rs.getString(5)+"</td>");
//         out.print("<td>"+rs.getString(6)+"</td>");
//         out.print("<td>"+rs.getFloat(7)+"</td>");
//         out.print("<td>"+rs.getFloat(8)+"</td>");
//         out.print("<td>"+rs.getString(9)+"</td>");
//         out.print("<td>"+rs.getString(10)+"</td>");
//         out.print("<td>"+rs.getString(11)+"</td>");
//         out.print("</tr>");
//        }
//        out.print("</table>");
//        st.close();
//        con.close();
        
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
    </body>
</html>
