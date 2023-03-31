package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Customer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


      Connection con=null;
      Statement st=null;
      ResultSet rs=null;
      
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CUSTOMER Page</title>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <title>Fox - Free One Page Template, Free Fitness HTML5 Template by FreeHTML5.co</title>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap CSS -->\n");
      out.write("  <link href=\"fox/css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   \n");
      out.write("  <link rel=\"stylesheet\" href=\"fox/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"fox/css/style.css\">\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("\n");
      out.write("function formValidator(){\n");
      out.write("\t// Make quick references to our fields\n");
      out.write("\tvar name = document.getElementById(\"txtname\");\n");
      out.write("\tvar age = document.getElementById(\"txtage\");\n");
      out.write("\tvar Date = document.getElementById(\"txtdate\");\n");
      out.write("\tvar csex= document.getElementById(\"txtcsex\");\n");
      out.write("\tvar disease= document.getElementById(\"txtdis\");\n");
      out.write("        var weight= document.getElementById(\"txtwt\");\n");
      out.write("        var height= document.getElementById(\"txtht\");        \n");
      out.write("        var address= document.getElementById(\"txtadd\");\n");
      out.write("        var password= document.getElementById(\"txtpass\");\n");
      out.write("        var email= document.getElementById(\"txtemail\");\n");
      out.write("            \n");
      out.write("        if(notEmpty(name,\"Name Must be given\") && isAlphabet(name, \"Please enter only letters for your name\"))\n");
      out.write("        {\n");
      out.write("\tif(notEmpty(age ,\"Age Must be given\") && isNumeric(age, \"Numbers Only for Age\"))\n");
      out.write("            {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\n");
      out.write("\tif(notEmpty( csex,\"Sex Must be given\") &&  isAlphabet(csex, \"Please enter only letters for your sex\"))\n");
      out.write("                     {\n");
      out.write("\tif(notEmpty(disease ,\"Disease Must be given\") && isAlphabet(disease, \"Please enter only alphabet for disease\"))\n");
      out.write("                         {\n");
      out.write("        if(notEmpty(weight ,\"Weight Must be given\") &&  isNumeric(weight, \"Please enter only digit for Weight\")) \n");
      out.write("                            {\n");
      out.write("        if(notEmpty(height ,\"Height Must be given\") &&  isNumeric(height, \"Please enter only digit for Height\"))\n");
      out.write("                                {\n");
      out.write("        if(notEmpty(address ,\"Address Must be given\") && isAlphanumeric(address, \"Numbers and Letters Only for Address\"))\n");
      out.write("                                    {\n");
      out.write("        if(notEmpty(password,\"Password Must be given\") &&  isAlphanumeric(password, \"Please enter letters and digit for Password\") && lengthRestriction(password,8,16))\n");
      out.write("                                        {\n");
      out.write("        if(notEmpty(email ,\"email Must be given\") &&  emailValidator(email, \"Please enter valid email address\"))\n");
      out.write("                                            {\n");
      out.write("                                                return true;\n");
      out.write("                                            }                                    \n");
      out.write("                                        }                                \n");
      out.write("                                    }                           \n");
      out.write("                                }                        \n");
      out.write("                            }                   \n");
      out.write("                         }\n");
      out.write("                      }\n");
      out.write("\t\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\treturn false;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("        function notEmpty(elem, helperMsg)\n");
      out.write("    {\n");
      out.write("\n");
      out.write("\tif(elem.value.length == 0)\n");
      out.write("         {\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.focus(); // set the focus to this input\n");
      out.write("\t\treturn false;\n");
      out.write("         }\n");
      out.write("\treturn true;\n");
      out.write("    }\n");
      out.write("    function isNumeric(elem, helperMsg)\n");
      out.write("    {\n");
      out.write("\tvar numericExpression = /^[0-9]+$/;\n");
      out.write("\tif(elem.value.match(numericExpression))\n");
      out.write("        {\n");
      out.write("\t\treturn true;\n");
      out.write("        }       \n");
      out.write("            else\n");
      out.write("        {\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("    }\n");
      out.write("        function isAlphabet(elem, helperMsg)\n");
      out.write("    {\n");
      out.write("\tvar alphaExp = /^[a-zA-Z ]+$/;\n");
      out.write("\tif(elem.value.match(alphaExp))\n");
      out.write("        {\n");
      out.write("\t\treturn true;\n");
      out.write("        }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("            }\n");
      out.write("    }\n");
      out.write("        function isAlphanumeric(elem, helperMsg)\n");
      out.write("        {\n");
      out.write("\tvar alphaExp = /^[0-9a-zA-Z ]+$/;\n");
      out.write("\tif(elem.value.match(alphaExp))\n");
      out.write("        {\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("                else\n");
      out.write("        \n");
      out.write("        {\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("        }\n");
      out.write("        function emailValidator(elem, helperMsg)\n");
      out.write("        {\n");
      out.write("\tvar emailExp = /^[\\w\\-\\.\\+]+\\@[a-zA-Z0-9\\.\\-]+\\.[a-zA-z0-9]{2,4}$/;\n");
      out.write("\tif(elem.value.match(emailExp))\n");
      out.write("            {\n");
      out.write("\t\treturn true;\n");
      out.write("            }\n");
      out.write("        else\n");
      out.write("            {\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("                elem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function lengthRestriction(elem, min, max)\n");
      out.write("        {\n");
      out.write("\tvar uInput = elem.value;\n");
      out.write("\tif(uInput.length >= min && uInput.length <= max)\n");
      out.write("        {\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("\t\talert(\"Please enter between \" +min+ \" and \" +max+ \" characters\");\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid pl-0 pr-0 bg-img clearfix parallax-window2\" data-parallax=\"scroll\" data-image-src=\"images/banner2.jpg\">\n");
      out.write("  <nav class=\"navbar navbar-expand-md navbar-dark\">\n");
      out.write("    <div class=\"container\"> \n");
      out.write("      <!-- Brand --> \n");
      out.write("      <a class=\"navbar-brand mr-auto\" href=\"#\"><h1>Gym Project</h1><img src=\"images/logo1.png\" alt=\"\" /></a> \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <!-- Toggler/collapsibe Button -->\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\"> <span class=\"navbar-toggler-icon\"></span> </button>\n");
      out.write("      \n");
      out.write("      <!-- Navbar links -->\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("       <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Customerlogin.jsp\">Home</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Enquiry.jsp\">Enquiry</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"fox/index.html\">Logout</a> </li>\n");
      out.write("<!--          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#contact\">Contact</a> </li>-->\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"navbar-nav ml-5\">\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link btn btn-danger\" href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a> </li>\n");
      out.write("        </ul>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("        <footer class=\"container-fluid\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("<!--        <div class=\"col-md-4\"></div>-->\n");
      out.write("      <div class=\"col-md-12 footer2 wow bounceInUp\" data-wow-delay=\".25s\" id=\"contact\">\n");
      out.write("        <div class=\"form-box\">\n");
      out.write("          <h4>Customer Registration</h4>\n");
      out.write("          ");
      out.write("\n");
      out.write("      ");

        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
      
      out.write("\n");
      out.write("      ");

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
      
      out.write("\n");
      out.write("      <form action=\"CustomerIUD.jsp\" autocomplete=\"off\">\n");
      out.write("          <table class=\"table table-responsive d-table\" style=\"color: black;width:75%;\">\n");
      out.write("          <tr>\n");
      out.write("              <td><h1>Customer</h1></td>\n");
      out.write("          </tr>\n");
      out.write("           <tr>\n");
      out.write("               <td style=\"text-align: right\">Customer ID</td>\n");
      out.write("               <td><input type=\"text\" name=\"id\" class=\"form-control pl-0\" value=\"");
      out.print(cid);
      out.write("\" readonly=\"true\" placeholdre=\"Customer ID\" autocomplete=\"off\"></td>\n");
      out.write("               <td></td>\n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("               <td style=\"text-align: right\">Name</td>\n");
      out.write("               <td><input type=\"text\" name=\"name\" class=\"form-control pl-0\" value=\"");
      out.print(cname);
      out.write("\" id=\"txtname\"></td>\n");
      out.write("               <td></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">AGE</td>\n");
      out.write("               <td><input type=\"text\" name=\"age\" class=\"form-control pl-0\" value=\"");
      out.print(cage);
      out.write("\" id=\"txtage\"></td>\n");
      out.write("               <td></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Registration Date</td>\n");
      out.write("               <td><input type=\"date\" name=\"date\" class=\"form-control pl-0\" value=\"");
      out.print(cdate);
      out.write("\" id=\"txtdate\"></td>\n");
      out.write("               <td></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Customer Sex</td>\n");
      out.write("               <td>\n");
      out.write("<!--                   <select>\n");
      out.write("                       <option>Male</option>\n");
      out.write("                       <option>Female</option>\n");
      out.write("                   </select>-->\n");
      out.write("                   <input type=\"text\" name=\"csex\" class=\"form-control pl-0\" value=\"");
      out.print(ccsex);
      out.write("\" id=\"txtcsex\" ></td>\n");
      out.write("               <td></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Medical Disease</td>\n");
      out.write("               <td><input type=\"text\" name=\"dis\" class=\"form-control pl-0\" value=\"");
      out.print(cdis);
      out.write("\" id=\"txtdis\"></td>\n");
      out.write("               <td></td>\n");
      out.write("           </tr>\n");
      out.write("      \n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Weight</td>\n");
      out.write("               <td><input type=\"text\" name=\"wt\" class=\"form-control pl-0\" value=\"");
      out.print(cwt);
      out.write("\" id=\"txtwt\"></td>\n");
      out.write("               <td></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Height</td>\n");
      out.write("               <td><input type=\"text\" name=\"ht\" class=\"form-control pl-0\" value=\"");
      out.print(cht);
      out.write("\" id=\"txtht\"></td>\n");
      out.write("               <td></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Address</td>\n");
      out.write("               <td><input type=\"text\" name=\"add\" class=\"form-control pl-0\" value=\"");
      out.print(cadd);
      out.write("\" id=\"txtadd\"></td>\n");
      out.write("               <td></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Password</td>\n");
      out.write("                <td><input type=\"password\" name=\"pass\" class=\"form-control pl-0\" value=\"");
      out.print(cpass);
      out.write("\" id=\"txtpass\" style=\"border: 2px solid #000;border-top: none;border-right: none;border-left: none;\"></td>\n");
      out.write("               <td></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">E-Mail</td>\n");
      out.write("               <td><input type=\"email\" name=\"email\" class=\"form-control pl-0\" value=\"");
      out.print(cemail);
      out.write("\" id=\"txtemail\"></td><td></td>\n");
      out.write("           </tr>\n");
      out.write("           <tr style=\"text-align: right\">\n");
      out.write("               ");
if(request.getQueryString()!=null){
      out.write("\n");
      out.write("               <td><br><input type=\"submit\" value=\"Create Account\" name=\"btn\" disabled=\"\" onclick=\"return formValidator()\" style=\"background-image: linear-gradient(45deg,orange,orangered);\">\n");
      out.write("<!--            <input type=\"submit\" value=\"UPDATE\" name=\"btn\" onclick=\"return formValidator()\">\n");
      out.write("            <input type=\"submit\" value=\"DELETE\" name=\"btn\"></td>-->\n");
      out.write("            </tr>\n");
      out.write("            ");
}
               else{
            
      out.write("\n");
      out.write("            <tr style=\"text-align: right\">\n");
      out.write("             <td><br><input type=\"submit\" value=\"Create Account\" name=\"btn\" onclick=\"return formValidator()\" style=\"background-image: linear-gradient(45deg,orange,orangered);border-radius: 7px;color: wheat;font-family: Rockwell\">\n");
      out.write("<!--                 <input type=\"submit\" value=\"UPDATE\" name=\"btn\" disabled=\"\" onclick=\"return formValidator()\">\n");
      out.write("                 <input type=\"submit\" value=\"DELETE\" name=\"btn\" disabled=\"\"></td>-->\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("       </table>\n");
      out.write("      </form>\n");
      out.write("        <h3></h3>\n");
      out.write("     \n");
      out.write("       ");

       
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
        
        
      out.write("\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      <div class=\"col-md-3 footer3 wow bounceInRight\" data-wow-delay=\".25s\">\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<!-- Optional JavaScript --> \n");
      out.write("<!-- jQuery first, then Bootstrap JS, ... -->\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/parallax.js\"></script>\n");
      out.write("<script src=\"js/wow.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
