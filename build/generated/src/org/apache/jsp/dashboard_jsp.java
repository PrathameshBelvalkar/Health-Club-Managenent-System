package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<!--        <title>PACKAGE PAGE</title>-->\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid pl-0 pr-0 bg-img clearfix parallax-window2\" data-parallax=\"scroll\" data-image-src=\"images/banner2.jpg\">\n");
      out.write("  <nav class=\"navbar navbar-expand-md navbar-dark\">\n");
      out.write("    <div class=\"container\"> \n");
      out.write("      <!-- Brand --> \n");
      out.write("      <a class=\"navbar-brand mr-auto\" href=\"#\"><h1>DASH BOARD</h1><img src=\"images/logo1.png\" alt=\"\" /></a> \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <!-- Toggler/collapsibe Button -->\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\"> <span class=\"navbar-toggler-icon\"></span> </button>\n");
      out.write("      \n");
      out.write("       Navbar links \n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"fox/index.html\">Home</a> </li>\n");
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"adminlogin.jsp\">Logout</a> </li>\n");
      out.write("<!--          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#\">Courses</a> </li>\n");
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
      out.write("<!--          <h4>CONTACT US</h4>-->\n");
      out.write("        <table class=\"table table-responsive d-table\" style=\"color: black;width:75%;\">\n");
      out.write("            <tr>\n");
      out.write("                <th>MANAGE</th>\n");
      out.write("                <th>LIST REPORT</th>\n");
      out.write("                <th>LIST Dynamic report</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("<!--                <a href=\"Billing.jsp\">Billing</a>\n");
      out.write("                <br><a href=\"Customer.jsp\">Customer</a>\n");
      out.write("               <br> <a href=\"Enquiry.jsp\">Enquiry</a>-->\n");
      out.write("                <br><a href=\"Equipment.jsp\">Equipment</a>\n");
      out.write("                <br><a href=\"PackageMaster.jsp\">Package master</a>\n");
      out.write("<!--                 <br><a href=\"Recipt.jsp\">Recipt</a>-->\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("               <td><a href=\"BillingListReport.jsp\">Billing List Report</a>\n");
      out.write("               <br><a href=\"CustomerListReport.jsp\">Customer List Report</a>\n");
      out.write("               <br> <a href=\"EnquiryListReport.jsp\">Enquiry List Report</a>\n");
      out.write("                <br><a href=\"EquipmentListReport.jsp\">Equipment List Report</a>\n");
      out.write("                <br><a href=\"PackageMasterListReport.jsp\">package master List Report</a>\n");
      out.write("               </td>\n");
      out.write("               \n");
      out.write("               <td><a href=\"customerwiseBill.jsp\">Customer wise Bill</a>\n");
      out.write("                 <br><a href=\"datedynamicreport.jsp\">Date DYNAMIC REPORT</a>  \n");
      out.write("                 <br><a href=\"Packagewisebill.jsp\">Package Wise Bill</a>\n");
      out.write("               </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("         </div>  \n");
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