package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>ADMIN LOGIN</title>\n");
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
      out.write("\tvar user = document.getElementById(\"txtemail\");\n");
      out.write("\tvar password = document.getElementById(\"txtpass\");\n");
      out.write("        if(notEmpty(user,\"Name Must be given\") && isAlphabet(user, \"Please enter only letters for your name\"))\n");
      out.write("          {\n");
      out.write("        if(notEmpty(password,\"Password Must be given\") &&  isAlphanumeric(password, \"Please enter only digit for Password\") && lengthRestriction(password,8,16))\n");
      out.write("            {\n");
      out.write("              return true;\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("          return false;\n");
      out.write("  }\n");
      out.write("        \n");
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
      out.write("function isAlphabet(elem, helperMsg)\n");
      out.write("{\n");
      out.write("\tvar alphaExp = /^[a-zA-Z ]+$/;\n");
      out.write("\tif(elem.value.match(alphaExp))\n");
      out.write("{\n");
      out.write("\t\treturn true;\n");
      out.write("}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
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
      out.write("        <form action=\"adminlogincode.jsp\">\n");
      out.write("        <div class=\"container-fluid pl-0 pr-0 bg-img clearfix parallax-window2\" data-parallax=\"scroll\" data-image-src=\"images/banner2.jpg\">\n");
      out.write("  <nav class=\"navbar navbar-expand-md navbar-dark\">\n");
      out.write("    <div class=\"container\"> \n");
      out.write("      <!-- Brand --> \n");
      out.write("      <a class=\"navbar-brand mr-auto\" href=\"#\"><h1>Health Club Management Project</h1><img src=\"images/logo1.png\" alt=\"\" /></a> \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <!-- Toggler/collapsibe Button -->\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\"> <span class=\"navbar-toggler-icon\"></span> </button>\n");
      out.write("      \n");
      out.write("      <!-- Navbar links -->\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"fox/index.html\">Home</a> </li>\n");
      out.write("<!--          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#about-us\">About</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#\">Courses</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#contact\">Contact</a> </li>-->\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"navbar-nav ml-5\">\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link btn btn-danger\" href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a> </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("            \n");
      out.write("</div>\n");
      out.write("        <footer class=\"container-fluid\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("<!--        <div class=\"col-md-4\"></div>-->\n");
      out.write("      <div class=\"col-md-12 footer2 wow bounceInUp\" data-wow-delay=\".25s\" id=\"contact\">\n");
      out.write("        <div class=\"form-box\">\n");
      out.write("          <h4>Admin LOGIN</h4>\n");
      out.write("        <table class=\"table table-responsive d-table\" style=\"color: black;width:75%;\">\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">USERNAME</td>\n");
      out.write("                <td><input  type=\"text\" name=\"user\" class=\"form-control pl-0\" id=\"txtemail\" autocomplete=\"off\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td style=\"text-align: right\">PASSWORD</td>\n");
      out.write("            <td><input type=\"text\" name=\"pass\" class=\"form-control pl-0\" id=\"txtpass\" autocomplete=\"off\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td style=\"text-align: right\"> <input type=\"submit\" value=\"LOGIN\" id=\"myinput\" onclick=\"return formValidator()\" style=\"background-image: linear-gradient(90deg,orange,orangered);cursor: pointer;width: 200px;height: 40px;position: relative;left: 200px;\"/></td>\n");
      out.write("           \n");
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
      out.write("\n");
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
