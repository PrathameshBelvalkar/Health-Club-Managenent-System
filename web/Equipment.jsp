<%-- 
    Document   : Equipment
    Created on : Feb 20, 2021, 9:58:12 AM
    Author     : DELL
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Equipment page</title>
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

function formValidator()
{
	// Make quick references to our fields
	var id = document.getElementById("id");
	var name = document.getElementById("txtname");
	var photo = document.getElementById("txtphoto");
    
    if(notEmpty(name,"Name Must be given") && isAlphabet(name, "Please enter only letters for your name"))
    {
        if(notEmpty(photo ,"Address Must be given") && isAlphanumeric(photo, "Numbers and Letters Only for Address"))
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
          <h4>Equipment</h4>
        
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
        String eid,enm,ephoto;
        if(request.getQueryString()!=null){
        eid=request.getParameter("e_id");
        enm=request.getParameter("e_nm");   
        ephoto=request.getParameter("e_photo");
        }
        else{
          rs=st.executeQuery("select max(EQP_ID)from equipment");
          if(rs.next()){
          maxid=rs.getInt(1);
          maxid=maxid+1;
          }
          
        eid=String.valueOf(maxid);
        enm="";
        ephoto="";
        }
        %>
        <form action="EquipmentIUD.jsp" autocomplete="off">
       <table class="table table-responsive d-table" style="color: black;width:75%;">
           <tr>
               <td><h1>Equipment</h1></td>
               
           </tr>
            <tr>
                <td style="text-align: right"><h3>Equipment ID</h3></td>
                <td><input type="text" name="id" value="<%=eid%>" readonly="" class="form-control pl-0"/></td>
            </tr>
            
            <tr>
                <td style="text-align: right"><h3>Equipment Name</h3></td>
                <td><input type="text" name="name" value="<%=enm%>" id="txtname" class="form-control pl-0"/></td>
<!--            <textarea name="description" rows="10" cols="50">
                Description
            </textarea>-->
            </tr>
            
                <tr>
                    <td style="text-align: right"><h3>Equipment Photo</h3></td>
                <td><input type="file" name="File" id="txtphoto" class="form-control pl-0"/></td>
                </tr>
            
                <tr style="text-align: right">
            <%if(request.getQueryString()!=null){%>
               <td><br><input type="submit" value="INSERT" name="btn" disabled="" onclick="return formValidator()">
                   <input type="submit" value="UPDATE" name="btn" onclick="return formValidator()">
                   <input type="submit" value="DELETE" name="btn" ></td>
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
             
        rs=st.executeQuery("select * from equipment");
        out.print("<table border=1 align='center'>");
        out.print("<tr style=color:black>");
        out.print("<th>Select</th>");
        out.print("<th>Equipment ID</th>");
        out.print("<th>Equipment Name</th>");
        out.print("<th>Equipment photo</th>");
       
        out.print("</tr>");
        while(rs.next()){
            out.print("<tr style=color:black>");
            out.print("<td width=100><a href='Equipment.jsp?e_id="+rs.getInt(1)+"&e_nm="+rs.getString(2)+"&e_photo="+rs.getString(3)+"'>SELECT</a></td>"); 
           
            out.print("<td width=100>"+rs.getInt(1)+"</td>");
            out.print("<td width=100>"+rs.getString(2)+"</td>"); 
            out.print("<td><img src='upload/"+rs.getString(3)+"' height='150' width='150'></td>");
           
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
