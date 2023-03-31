package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class EnquiryIUD_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

        
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        int id;
        String name,add,mob,email,msg,btn; 
        
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("\n");
      out.write("         ");

        btn=request.getParameter("btn");
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        st=con.createStatement();
        if(btn.equals("INSERT")){
            id=Integer.parseInt(request.getParameter("id"));
            name=request.getParameter("name");
            add=request.getParameter("add");
            mob=request.getParameter("mob");
            email=request.getParameter("email");
            msg=request.getParameter("msg");
        st.executeUpdate("insert into enquiry values("+id+",'"+name+"','"+add+"','"+mob+"','"+email+"','"+msg+"')");
        out.print("Insert succesful");
        }
        
         if(btn.equals("UPDATE")){
          id=Integer.parseInt(request.getParameter("id"));
            name=request.getParameter("name");
            add=request.getParameter("add");
            mob=request.getParameter("mob");
            email=request.getParameter("email");
            msg=request.getParameter("msg");
            st.executeUpdate("update enquiry set ENQ_NAME='"+name+"',ENQ_ADDR='"+add+"',ENQ_PHNO='"+mob+"',ENQ_EMAIL='"+email+"',ENQ_MESSAGE='"+msg+"' where ENQ_ID="+id);
            out.print("Updated succesfully");
         }
         if(btn.equals("DELETE")){
         id=Integer.parseInt(request.getParameter("id"));
         st.executeUpdate("delete from enquiry where ENQ_ID="+id);
         out.print("Deleted succesful");
         }
         st.close();
         con.close();
            
      out.write("\n");
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
