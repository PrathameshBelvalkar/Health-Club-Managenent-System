package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Billing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

        
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
       String id,name,cost;            int maxid=0;
       String bdate,bid,cid,pid,pcost,gst,total;

      
        
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Billing Page</title>\n");
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
      out.write("        <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("\n");
      out.write("function formValidator(){\n");
      out.write("\t// Make quick references to our fields\n");
      out.write("\tvar name = document.getElementById(\"txtname\");\n");
      out.write("\tvar cost = document.getElementById(\"txtcost\");\n");
      out.write("\tvar gst = document.getElementById(\"txtgst\");\n");
      out.write("\tvar total= document.getElementById(\"txttotal\");\n");
      out.write("        \n");
      out.write("        if(notEmpty(name,\"Name Must be given\") && isAlphabet(name, \"Please enter only letters for your name\"))\n");
      out.write("        {\n");
      out.write("        if(notEmpty(cost ,\"cost Must be given\") && isNumeric(cost, \"Digits Only for cost\"))\n");
      out.write("               {\n");
      out.write("\tif(notEmpty(gst,\"GST Must be given\") && isNumeric(gst, \"Digits Only for GST\"))\n");
      out.write("                 {\n");
      out.write("         if(notEmpty(total,\"Total Must be given\") && isNumeric(total, \"Digits Only for cost\"))\n");
      out.write("                    {\n");
      out.write("                     return true; \n");
      out.write("                    }            \n");
      out.write("                 }\n");
      out.write("             }\n");
      out.write("         }\n");
      out.write("                return false;\n");
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
      out.write("     }\n");
      out.write("     function isAlphanumeric(elem, helperMsg)\n");
      out.write("     {\n");
      out.write("\tvar alphaExp = /^[0-9a-zA-Z ]+$/;\n");
      out.write("\tif(elem.value.match(alphaExp))\n");
      out.write("        {\n");
      out.write("\t\treturn true;\n");
      out.write("\t}else\n");
      out.write("        {\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("        }\n");
      out.write("function isNumeric(elem, helperMsg)\n");
      out.write("{\n");
      out.write("\tvar numericExpression = /^[0-9]+$/;\n");
      out.write("\tif(elem.value.match(numericExpression))\n");
      out.write("{\n");
      out.write("\t\treturn true;\n");
      out.write("}else\n");
      out.write("{\n");
      out.write("\t\telem.value=\"\";\n");
      out.write("\t\talert(helperMsg);\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("     function isAlphabet(elem, helperMsg)\n");
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
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container-fluid pl-0 pr-0 bg-img clearfix parallax-window2\" data-parallax=\"scroll\" data-image-src=\"images/banner2.jpg\">\n");
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
      out.write("          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"fox/index.html\">Home</a> </li>\n");
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
      out.write("          <h4>Billing</h4>\n");
      out.write("        \n");
      out.write("            ");
      out.write("\n");
      out.write("       ");

            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
        
         rs=st.executeQuery("select max(Bill_ID)from billing");
          if(rs.next()){
          maxid=rs.getInt(1);
          maxid=maxid+1;
          }
          
          
        id=(String)session.getAttribute("pid");
        name=(String)session.getAttribute("pname");
        cost=(String)session.getAttribute("pcost");
        bid=String.valueOf(maxid);
        cid="1";
        bdate="2021/3/21";
        gst=String.valueOf(Integer.parseInt(cost)*18/100);
        total=String.valueOf(Integer.parseInt(cost)+Integer.parseInt(gst));
        
//        out.print("id"+id);
//        out.print("name"+name);
//        out.print("cost"+cost);
//        
           
       
      out.write(" \n");
      out.write("        ");

        
//       if(request.getQueryString()!=null){
//           
//       bid=request.getParameter("b_id");
//        cid=request.getParameter("c_id");
//        bdate=request.getParameter("b_date");
//        pid=request.getParameter("p_id");
//        pcost=request.getParameter("p_cost");
//        gst=request.getParameter("gst");
//        total=request.getParameter("total");
//       }
//       else{
           
//            rs=st.executeQuery("select max(Bill_ID)from billing");
//          if(rs.next()){
//          maxid=rs.getInt(1);
//          maxid=maxid+1;
//          }
//       bdate="";
//       bid=String.valueOf(maxid);
//       cid="";
//       pid="";
//       pcost="";
//       gst="";
//       total="";
     //  }
        
      out.write("\n");
      out.write("        <form action=\"BillingIUD.jsp\">\n");
      out.write("        <table class=\"table table-responsive d-table\" style=\"color: black;width:75%;\">\n");
      out.write("           <tr>\n");
      out.write("               <td><h1>Billing</h1></td>\n");
      out.write("               \n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Bill Id</td>\n");
      out.write("                <td><input type=\"text\" name=\"id\" value=\"");
      out.print(bid);
      out.write("\" class=\"form-control pl-0\" autocomplete=\"off\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Customer Id</td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(session.getAttribute("cnm"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Bill Date</td>\n");
      out.write("                <td><input type=\"text\" name=\"date\" value=\"");
      out.print(bdate);
      out.write("\" class=\"form-control pl-0\" autocomplete=\"off\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Package Id</td>\n");
      out.write("                <td> <input type=\"text\" name=\"pid\" value=\"");
      out.print(name);
      out.write("\" class=\"form-control pl-0\">\n");
      out.write("              </td> \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Package Cost</td>\n");
      out.write("                <td><input type=\"text\" name=\"cost\" value=\"");
      out.print(cost);
      out.write("\" id=\"txtcost\" class=\"form-control pl-0\" autocomplete=\"off\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">GST</td>\n");
      out.write("                <td><input type=\"text\" name=\"gst\"  id=\"txtgst\" value=\"");
      out.print(gst);
      out.write("\" class=\"form-control pl-0\" autocomplete=\"off\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: right\">Total</td>\n");
      out.write("                <td><input type=\"text\" name=\"total\"  id=\"txttotal\" value=\"");
      out.print(total);
      out.write("\" class=\"form-control pl-0\" autocomplete=\"off\">\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"text-align: right\">\n");
      out.write("            \n");
      out.write("            <tr style=\"text-align: right\">\n");
      out.write("                <td><br><input type=\"submit\" value=\"INSERT\" name=\"btn\" onclick=\"return formValidator()\" style=\"cursor: pointer\">\n");
      out.write("             <td></td>\n");
      out.write("             <td><a href=\"Recipt.jsp\"><input style=\"color: white;background-color: orangered;\" type=\"button\" value=\"See you recipt Here\"></a></td>\n");
      out.write("            </tr>\n");
      out.write("          \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("       \n");
      out.write("       \n");
      out.write("        \n");
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
