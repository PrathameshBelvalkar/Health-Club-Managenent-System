package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Customerlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("        <title>CUSTOMER LOGIN</title>\n");
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
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<!--        <title>JSP Page</title>-->\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("\n");
      out.write("function formValidator()\n");
      out.write("{\n");
      out.write("\t// Make quick references to our fields\n");
      out.write("\tvar email = document.getElementById(\"txtemail\");\n");
      out.write("\tvar password = document.getElementById(\"txtpass\");\n");
      out.write("        if(notEmpty(email ,\"Email Must be given\") &&  emailValidator(email, \"Please enter a valid email address\"))\n");
      out.write("          {\n");
      out.write("        if(notEmpty(password,\"Password Must be given\") &&  isAlphanumeric(password, \"Please enter only digit for Password\") && lengthRestriction(password,8,16))\n");
      out.write("            {\n");
      out.write("              return true;    \n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("          return false;\n");
      out.write("  }\n");
      out.write("         function notEmpty(elem, helperMsg)\n");
      out.write("{\n");
      out.write("\n");
      out.write("\tif(elem.value.length == 0)\n");
      out.write("{\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.focus(); // set the focus to this input\n");
      out.write("\t\treturn false;\n");
      out.write("}\n");
      out.write("\treturn true;\n");
      out.write("}\n");
      out.write("function emailValidator(elem, helperMsg){\n");
      out.write("\tvar emailExp = /^[\\w\\-\\.\\+]+\\@[a-zA-Z0-9\\.\\-]+\\.[a-zA-z0-9]{2,4}$/;\n");
      out.write("\tif(elem.value.match(emailExp)){\n");
      out.write("\t\treturn true;\n");
      out.write("\t}else{\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("elem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function lengthRestriction(elem, min, max){\n");
      out.write("\tvar uInput = elem.value;\n");
      out.write("\tif(uInput.length >= min && uInput.length <= max){\n");
      out.write("\t\treturn true;\n");
      out.write("\t}else{\n");
      out.write("\t\talert(\"Please enter between \" +min+ \" and \" +max+ \" characters\");\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("    \n");
      out.write("             </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"customerlogincode.jsp\" autocomplete=\"off\">\n");
      out.write("        <div class=\"container-fluid pl-0 pr-0 bg-img clearfix parallax-window2\" data-parallax=\"scroll\" data-image-src=\"images/banner2.jpg\">\n");
      out.write("  <nav class=\"navbar navbar-expand-md navbar-dark\">\n");
      out.write("    <div class=\"container\"> \n");
      out.write("      <!-- Brand --> \n");
      out.write("      <a class=\"navbar-brand mr-auto\" href=\"#\"><h1 style=\"color: orangered;\">Health Club Management System</h1><img src=\"images/logo1.png\" alt=\"\" /></a> \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <!-- Toggler/collapsibe Button -->\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\"> <span class=\"navbar-toggler-icon\"></span> </button>\n");
      out.write("      \n");
      out.write("      <!-- Navbar links -->\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"fox/index.html\">Home</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Enquiry.jsp\">Enquiry</a> </li>\n");
      out.write("<!--          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"fox/index.html\">Logout</a> </li>-->\n");
      out.write("<!--          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#contact\">Contact</a> </li>-->\n");
      out.write("        </ul>\n");
      out.write("         \n");
      out.write("<!--        <ul class=\"navbar-nav ml-5\">\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link btn btn-danger\" href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a> </li>\n");
      out.write("        </ul>-->\n");
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
      out.write("          <h4>CUSTOMER LOGIN</h4>\n");
      out.write("        <table class=\"table table-responsive d-table\" style=\"color: black;width:75%;\">\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">E-mail</td>\n");
      out.write("                <td><input type=\"text\" name=\"email\" class=\"form-control pl-0\" id=\"txtemail\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td style=\"text-align: right\">Password</td>\n");
      out.write("        <td><input type=\"password\" name=\"pass\" class=\"form-control pl-0\" id=\"txtpass\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td style=\"text-align: right\"> <input type=\"submit\" value=\"LOGIN\"   onclick=\"return formValidator()\" style=\"border-radius: 5px;padding: 10px; width: 150px; position: relative;\n");
      out.write("                                                  left: 70px;background-color: orangered;color: white;font-size: 18px;\"/></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td style=\"color: orangered;font-family: Rockwell;font-weight: bolder;\">If you are new here</td>\n");
      out.write("            <td style=\"font-family: Rockwell;border: 1px;font-weight: bolder;font-size: 30px;position: relative;bottom: 10px;text-decoration: none;\"><a href=\"Customer.jsp\" class=\"btn btn-primary\">Sign up</a></td>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("          </div>  \n");
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
      out.write("        </form>\n");
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
