package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Equipment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Equipment page</title>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<!--  <title>Fox - Free One Page Template, Free Fitness HTML5 Template by FreeHTML5.co</title>-->\n");
      out.write("\n");
      out.write("  <!-- Bootstrap CSS -->\n");
      out.write("  <link href=\"fox/css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   \n");
      out.write("  <link rel=\"stylesheet\" href=\"fox/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"fox/css/style.css\">\n");
      out.write("      \n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("\n");
      out.write("function formValidator()\n");
      out.write("{\n");
      out.write("\t// Make quick references to our fields\n");
      out.write("\tvar id = document.getElementById(\"id\");\n");
      out.write("\tvar name = document.getElementById(\"txtname\");\n");
      out.write("\tvar photo = document.getElementById(\"txtphoto\");\n");
      out.write("    \n");
      out.write("    if(notEmpty(name,\"Name Must be given\") && isAlphabet(name, \"Please enter only letters for your name\"))\n");
      out.write("    {\n");
      out.write("        if(notEmpty(photo ,\"Address Must be given\") && isAlphanumeric(photo, \"Numbers and Letters Only for Address\"))\n");
      out.write("        {\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    \n");
      out.write("      }\n");
      out.write("    return false;\n");
      out.write("}\n");
      out.write("    function notEmpty(elem, helperMsg)\n");
      out.write("       {\n");
      out.write("\n");
      out.write("\tif(elem.value.length == 0)\n");
      out.write("        {\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.focus(); // set the focus to this input\n");
      out.write("\t\treturn false;\n");
      out.write("        }\n");
      out.write("\treturn true;\n");
      out.write("        }\n");
      out.write("    function isAlphabet(elem, helperMsg)\n");
      out.write("    {\n");
      out.write("\tvar alphaExp = /^[a-zA-Z ]+$/;\n");
      out.write("\tif(elem.value.match(alphaExp))\n");
      out.write("    {\n");
      out.write("\t\treturn true;\n");
      out.write("    }   \n");
      out.write("        else    \n");
      out.write("        {\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </script>\n");
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
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"fox/index.html\">Home</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"adminlogin.jsp\">Logout</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"dashboard.jsp\">Dashboard</a> </li>\n");
      out.write("<!--          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#contact\">Contact</a> </li>-->\n");
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
      out.write("          <h4>Equipment</h4>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("         ");

        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
      
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <form action=\"EquipmentIUD.jsp\" autocomplete=\"off\">\n");
      out.write("       <table class=\"table table-responsive d-table\" style=\"color: black;width:75%;\">\n");
      out.write("           <tr>\n");
      out.write("               <td><h1>Equipment</h1></td>\n");
      out.write("               \n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\"><h3>Equipment ID</h3></td>\n");
      out.write("                <td><input type=\"text\" name=\"id\" value=\"");
      out.print(eid);
      out.write("\" readonly=\"\" class=\"form-control pl-0\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\"><h3>Equipment Name</h3></td>\n");
      out.write("                <td><input type=\"text\" name=\"name\" value=\"");
      out.print(enm);
      out.write("\" id=\"txtname\" class=\"form-control pl-0\"/></td>\n");
      out.write("<!--            <textarea name=\"description\" rows=\"10\" cols=\"50\">\n");
      out.write("                Description\n");
      out.write("            </textarea>-->\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"text-align: right\"><h3>Equipment Photo</h3></td>\n");
      out.write("                <td><input type=\"file\" name=\"File\" id=\"txtphoto\" class=\"form-control pl-0\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("                <tr style=\"text-align: right\">\n");
      out.write("            ");
if(request.getQueryString()!=null){
      out.write("\n");
      out.write("               <td><br><input type=\"submit\" value=\"INSERT\" name=\"btn\" disabled=\"\" onclick=\"return formValidator()\">\n");
      out.write("                   <input type=\"submit\" value=\"UPDATE\" name=\"btn\" onclick=\"return formValidator()\">\n");
      out.write("                   <input type=\"submit\" value=\"DELETE\" name=\"btn\" ></td>\n");
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
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("            ");

             
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
            
      out.write("\n");
      out.write("            </div>  \n");
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
