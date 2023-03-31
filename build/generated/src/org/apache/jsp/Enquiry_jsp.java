package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Enquiry_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Enquiry page</title>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<!--  <title>Fox - Free One Page Template, Free Fitness HTML5 Template by FreeHTML5.co</title>-->\n");
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
      out.write("\tvar addr = document.getElementById(\"txtadd\");\n");
      out.write("\tvar phno = document.getElementById(\"txtmob\");\n");
      out.write("\tvar email= document.getElementById(\"txtemail\");\n");
      out.write("\tvar message= document.getElementById(\"txtmsg\");\n");
      out.write("        if(notEmpty(name,\"Name Must be given\") && isAlphabet(name, \"Please enter only letters for your name\"))\n");
      out.write("       {\n");
      out.write("        if(notEmpty(addr ,\"Address Must be given\") && isAlphanumeric(addr, \"Numbers and Letters Only for Address\"))\n");
      out.write("        {\n");
      out.write("\tif(notEmpty(phno,\"Phone No Must be given\") && validmobile(phno) && isNumeric(phno, \"Please enter a valid phone no\"))\n");
      out.write("            {\n");
      out.write("\tif(notEmpty(email ,\"Email Must be given\") &&  emailValidator(email, \"Please enter a valid email address\"))\n");
      out.write("                   {\n");
      out.write("        if(notEmpty(message ,\"Message Must be given\") && isAlphanumeric(message, \"Numbers and Letters Only for Message\"))\n");
      out.write("                    {\n");
      out.write("                        return true;\n");
      out.write("                    }   \n");
      out.write("                   }\n");
      out.write("              }\n");
      out.write("         }\n");
      out.write("       }\n");
      out.write("        return false;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("        function notEmpty(elem, helperMsg)\n");
      out.write("    {\n");
      out.write("\n");
      out.write("\tif(elem.value.length == 0)\n");
      out.write("        {\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.focus(); // set the focus to this input\n");
      out.write("\t\treturn false;\n");
      out.write("        }\n");
      out.write("\treturn true;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    function isNumeric(elem, helperMsg)\n");
      out.write("    {\n");
      out.write("\tvar numericExpression = /^[0-9]+$/;\n");
      out.write("\tif(elem.value.match(numericExpression))\n");
      out.write("        {\n");
      out.write("\t\treturn true;\n");
      out.write("        }\n");
      out.write("            else\n");
      out.write("        {\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("        function isAlphabet(elem, helperMsg)\n");
      out.write("    {\n");
      out.write("\tvar alphaExp = /^[a-zA-Z ]+$/;\n");
      out.write("\tif(elem.value.match(alphaExp))\n");
      out.write("    {\n");
      out.write("\t\treturn true;\n");
      out.write("    }   \n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("        function isAlphanumeric(elem, helperMsg)\n");
      out.write("        {\n");
      out.write("\tvar alphaExp = /^[0-9a-zA-Z ]+$/;\n");
      out.write("\tif(elem.value.match(alphaExp))\n");
      out.write("        {\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("        function validmobile(elem){\n");
      out.write("\tvar uInput = elem.value;\n");
      out.write("\tif(uInput.length==10)\n");
      out.write("        {\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("\t\talert(\"Please enter valid mobile Or Phone No\");\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function emailValidator(elem, helperMsg)\n");
      out.write("        {\n");
      out.write("\tvar emailExp = /^[\\w\\-\\.\\+]+\\@[a-zA-Z0-9\\.\\-]+\\.[a-zA-z0-9]{2,4}$/;\n");
      out.write("\tif(elem.value.match(emailExp))\n");
      out.write("        {\n");
      out.write("\t\treturn true;\n");
      out.write("\t}else\n");
      out.write("        {\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("                elem.value=\"\";\n");
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
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#\">Home</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#about-us\">About</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#\">Courses</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#contact\">Contact</a> </li>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"navbar-nav ml-5\">\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link btn btn-danger\" href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a> </li>\n");
      out.write("        </ul>\n");
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
      out.write("          <h4>Enquiry</h4>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

          Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
        
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <form action=\"EnquiryIUD.jsp\" autocomplete=\"off\">\n");
      out.write("       <table class=\"table table-responsive d-table\" style=\"color: black;width:75%;\">\n");
      out.write("           <tr>\n");
      out.write("               <td><h1 style=\"color: #FF8C00\">Enquiry</h1></td>\n");
      out.write("               \n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("               <td style=\"text-align: right\">Enquiry Id</td>\n");
      out.write("               <td><input type=\"text\" name=\"id\" value=\"");
      out.print(enid);
      out.write("\" class=\"form-control pl-0\" readonly=\"\" placeholder=\"Enquiry id\"></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Enquiry Name</td>\n");
      out.write("               <td><input type=\"text\" name=\"name\" value=\"");
      out.print(ennm);
      out.write("\" id=\"txtname\" class=\"form-control pl-0\"  ></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Enquiry Address</td>\n");
      out.write("               <td><input type=\"text\" name=\"add\" value=\"");
      out.print(enadd);
      out.write("\" id=\"txtadd\" class=\"form-control pl-0\"  ></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Enquiry Phone Number</td>\n");
      out.write("               <td><input type=\"text\" name=\"mob\" value=\"");
      out.print(enmob);
      out.write("\" id=\"txtmob\" class=\"form-control pl-0\"  ></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Enquiry E-Mail</td>\n");
      out.write("               <td><input type=\"text\" name=\"email\" value=\"");
      out.print(enemail);
      out.write("\" id=\"txtemail\" class=\"form-control pl-0\" ></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Enquiry Message</td>\n");
      out.write("               <td><input type=\"text\" name=\"msg\" value=\"");
      out.print(enmsg);
      out.write("\" id=\"txtmsg\" class=\"form-control pl-0\"  ></td>\n");
      out.write("           </tr>\n");
      out.write("           <tr style=\"text-align: right\">\n");
      out.write("            ");
if(request.getQueryString()!=null){
      out.write("\n");
      out.write("            <td><br><input type=\"submit\" value=\"INSERT\" name=\"btn\" disabled=\"\" onclick=\"return formValidator()\">\n");
      out.write("            <input type=\"submit\" value=\"UPDATE\" name=\"btn\" onclick=\"return formValidator()\">\n");
      out.write("            <input type=\"submit\" value=\"DELETE\" name=\"btn\"></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
               else{
            
      out.write("\n");
      out.write("            <tr style=\"text-align: right\">\n");
      out.write("             <td><br><input type=\"submit\" value=\"INSERT\" name=\"btn\" onclick=\"return formValidator()\">\n");
      out.write("                 <input type=\"submit\" value=\"UPDATE\" name=\"btn\" disabled=\"\" onclick=\"return formValidator()\">\n");
      out.write("                 <input type=\"submit\" value=\"DELETE\" name=\"btn\" disabled=\"\"></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("       </table>\n");
      out.write("        </form>\n");
      out.write("         ");

       
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
        
      out.write("\n");
      out.write("        </div>  \n");
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
