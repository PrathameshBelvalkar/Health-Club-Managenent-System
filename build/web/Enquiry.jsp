<%-- 
    Document   : Enquiry
    Created on : Feb 20, 2021, 11:18:19 AM
    Author     : DELL
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enquiry page</title>
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
	var addr = document.getElementById("txtadd");
	var phno = document.getElementById("txtmob");
	var email= document.getElementById("txtemail");
	var message= document.getElementById("txtmsg");
        if(notEmpty(name,"Name Must be given") && isAlphabet(name, "Please enter only letters for your name"))
       {
        if(notEmpty(addr ,"Address Must be given") && isAlphanumeric(addr, "Numbers and Letters Only for Address"))
        {
	if(notEmpty(phno,"Phone No Must be given") && validmobile(phno) && isNumeric(phno, "Please enter a valid phone no"))
            {
	if(notEmpty(email ,"Email Must be given") &&  emailValidator(email, "Please enter a valid email address"))
                   {
        if(notEmpty(message ,"Message Must be given") && isAlphanumeric(message, "Numbers and Letters Only for Message"))
                    {
                        return true;
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
 
        function validmobile(elem){
	var uInput = elem.value;
	if(uInput.length==10)
        {
		return true;
	}
        else
        {
		alert("Please enter valid mobile Or Phone No");
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
	}else
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
          <h4>Enquiry</h4>
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
        String enid,ennm,enadd,enmob,enemail,enmsg;
        if(request.getQueryString()!=null){
         enid=request.getParameter("en_id");
         ennm=request.getParameter("en_nm");
         enadd=request.getParameter("en_add");
         enmob=request.getParameter("en_mob");
         enemail=request.getParameter("en_email");
         enmsg=request.getParameter("en_msg");
        }
        else{
             rs=st.executeQuery("select max(ENQ_ID)from enquiry");
          if(rs.next()){
          maxid=rs.getInt(1);
          maxid=maxid+1;
          }
        enid=String.valueOf(maxid);
        ennm="";
        enadd="";
        enmob="";
        enemail="";
        enmsg="";
        }
        %>
        <form action="EnquiryIUD.jsp" autocomplete="off">
       <table class="table table-responsive d-table" style="color: black;width:75%;">
           <tr>
               <td><h1 style="color: #FF8C00">Enquiry</h1></td>
               
           </tr>
           <tr>
               <td style="text-align: right">Enquiry Id</td>
               <td><input type="text" name="id" value="<%=enid%>" class="form-control pl-0" readonly="" placeholder="Enquiry id"></td>
           </tr>
            <tr>
                <td style="text-align: right">Enquiry Name</td>
               <td><input type="text" name="name" value="<%=ennm%>" id="txtname" class="form-control pl-0"  ></td>
           </tr>
            <tr>
                <td style="text-align: right">Enquiry Address</td>
               <td><input type="text" name="add" value="<%=enadd%>" id="txtadd" class="form-control pl-0"  ></td>
           </tr>
            <tr>
                <td style="text-align: right">Enquiry Phone Number</td>
               <td><input type="text" name="mob" value="<%=enmob%>" id="txtmob" class="form-control pl-0"  ></td>
           </tr>
            <tr>
                <td style="text-align: right">Enquiry E-Mail</td>
               <td><input type="text" name="email" value="<%=enemail%>" id="txtemail" class="form-control pl-0" ></td>
           </tr>
            <tr>
                <td style="text-align: right">Enquiry Message</td>
               <td><input type="text" name="msg" value="<%=enmsg%>" id="txtmsg" class="form-control pl-0"  ></td>
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
            <% } %>
       </table>
        </form>
         <%
       
        rs=st.executeQuery("select * from enquiry");
        out.print("<table border=1>");
        out.print("<tr style=color:black>");
        out.print("<th>SELECT</th>");
        out.print("<th>ENQUIRY ID</th>");
        out.print("<th>ENQUIRY NAME</th>");
        out.print("<th>ENQUIRY ADDRESS</th>");
        out.print("<th>ENQUIRY PHONE NUMBER</th>");
        out.print("<th>ENQUIRY EMAIL</th>");
        out.print("<th>ENQUIRY MESSAGE</th>");
        out.print("</tr>");
        while(rs.next()){
         out.print("<tr style=color:black>");
         out.print("<td><a href='Enquiry.jsp?en_id="+rs.getInt(1)+"&en_nm="+rs.getString(2)+"&en_add="+rs.getString(3)+"&en_mob="+rs.getString(4)+"&en_email="+rs.getString(5)+"&en_msg="+rs.getString(6)+"'>Select</a></td>");
         out.print("<td>"+rs.getInt(1)+"</td>");
         out.print("<td>"+rs.getString(2)+"</td>");
         out.print("<td>"+rs.getString(3)+"</td>");
         out.print("<td>"+rs.getString(4)+"</td>");
         out.print("<td>"+rs.getString(5)+"</td>");
         out.print("<td>"+rs.getString(6)+"</td>");
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
