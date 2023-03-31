<%-- 
    Document   : Customerlogin
    Created on : Mar 11, 2021, 11:11:52 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CUSTOMER LOGIN</title>
        <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!--  <title>Fox - Free One Page Template, Free Fitness HTML5 Template by FreeHTML5.co</title>-->

  <!-- Bootstrap CSS -->
  <link href="fox/css/animate.css" rel="stylesheet" type="text/css"/>
   
  <link rel="stylesheet" href="fox/css/bootstrap.min.css" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
  <link rel="stylesheet" href="fox/css/style.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--        <title>JSP Page</title>-->
        
        <script type="text/javascript" language="javascript">

function formValidator()
{
	// Make quick references to our fields
	var email = document.getElementById("txtemail");
	var password = document.getElementById("txtpass");
        if(notEmpty(email ,"Email Must be given") &&  emailValidator(email, "Please enter a valid email address"))
          {
        if(notEmpty(password,"Password Must be given") &&  isAlphanumeric(password, "Please enter only digit for Password") && lengthRestriction(password,8,16))
            {
              return true;    
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
function emailValidator(elem, helperMsg){
	var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
	if(elem.value.match(emailExp)){
		return true;
	}else{
		alert(helperMsg);
elem.value="";
		elem.focus();
		return false;
	}
}


function lengthRestriction(elem, min, max){
	var uInput = elem.value;
	if(uInput.length >= min && uInput.length <= max){
		return true;
	}else{
		alert("Please enter between " +min+ " and " +max+ " characters");
		elem.value="";
		elem.focus();
		return false;
	}
}
    
             </script>

    </head>
    <body>
        <form action="customerlogincode.jsp" autocomplete="off">
        <div class="container-fluid pl-0 pr-0 bg-img clearfix parallax-window2" data-parallax="scroll" data-image-src="images/banner2.jpg">
  <nav class="navbar navbar-expand-md navbar-dark">
    <div class="container"> 
      <!-- Brand --> 
      <a class="navbar-brand mr-auto" href="#"><h1 style="color: orangered;">Health Club Management System</h1><img src="images/logo1.png" alt="" /></a> 
      
      
      <!-- Toggler/collapsibe Button -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar"> <span class="navbar-toggler-icon"></span> </button>
      
      <!-- Navbar links -->
      <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item"> <a class="nav-link" href="fox/index.html">Home</a> </li>
          <li class="nav-item"> <a class="nav-link" href="Enquiry.jsp">Enquiry</a> </li>
<!--          <li class="nav-item"> <a class="nav-link" href="fox/index.html">Logout</a> </li>-->
<!--          <li class="nav-item"> <a class="nav-link" href="#contact">Contact</a> </li>-->
        </ul>
         
<!--        <ul class="navbar-nav ml-5">
          <li class="nav-item"> <a class="nav-link btn btn-danger" href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a> </li>
        </ul>-->
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
          <h4>CUSTOMER LOGIN</h4>
        <table class="table table-responsive d-table" style="color: black;width:75%;">
            <tr>
                <td style="text-align: right">E-mail</td>
                <td><input type="text" name="email" class="form-control pl-0" id="txtemail"/></td>
            </tr>
        <tr>
            <td style="text-align: right">Password</td>
        <td><input type="password" name="pass" class="form-control pl-0" id="txtpass"/></td>
        </tr>
        <tr>
            <td style="text-align: right"> <input type="submit" value="LOGIN"   onclick="return formValidator()" style="border-radius: 5px;padding: 10px; width: 150px; position: relative;
                                                  left: 70px;background-color: orangered;color: white;font-size: 18px;"/></td>
            <td></td>
            <td style="color: orangered;font-family: Rockwell;font-weight: bolder;">If you are new here</td>
            <td style="font-family: Rockwell;border: 1px;font-weight: bolder;font-size: 30px;position: relative;bottom: 10px;text-decoration: none;"><a href="Customer.jsp" class="btn btn-primary">Sign up</a></td>
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
        </form>
    </body>
</html>
