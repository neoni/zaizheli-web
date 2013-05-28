package org.apache.jsp.WEB_002dINF.views.comp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class back_top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#rocket-to-top div {\r\n");
      out.write("    left: 0;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    width: 149px;\r\n");
      out.write("}\r\n");
      out.write("#rocket-to-top .level-2 {\r\n");
      out.write("    background: url(\"./img/rocket_button_up.png\") no-repeat scroll -149px 0 transparent;\r\n");
      out.write("    display: none;\r\n");
      out.write("    height: 250px;\r\n");
      out.write("    opacity: 0;\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("#rocket-to-top .level-3 {\r\n");
      out.write("    background: none repeat scroll 0 0 transparent;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    display: block;\r\n");
      out.write("    height: 150px;\r\n");
      out.write("    z-index: 2;\r\n");
      out.write("}\r\n");
      out.write("#rocket-to-top {\r\n");
      out.write("    background: url(\"./img/rocket_button_up.png\") no-repeat scroll 0 0 transparent;\r\n");
      out.write("    cursor: default;\r\n");
      out.write("    display: block;\r\n");
      out.write("    height: 250px;\r\n");
      out.write("    margin: -125px 0 0;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    top: 80%;\r\n");
      out.write("    width: 149px;\r\n");
      out.write("    z-index: 11;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div style=\"display: none;\" id=\"rocket-to-top\">\r\n");
      out.write("<div style=\"opacity: 0; display: block;\" class=\"level-2\"></div><div class=\"level-3\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tvar obj = $(\"#rocket-to-top\");\r\n");
      out.write("\t\tvar sTop = $(document).scrollTop();\r\n");
      out.write("\t\tvar timer, scrolldelay;\r\n");
      out.write("\t\tvar button = true;\r\n");
      out.write("\t\t$(window).scroll(function() {\r\n");
      out.write("\t\t\tvar sTop = $(document).scrollTop();\r\n");
      out.write("\t\t\tif (sTop == 0) {\r\n");
      out.write("\t\t\t\tif (obj.css(\"background-position\") == \"0px 0px\") {\r\n");
      out.write("\t\t\t\t\tobj.fadeOut('slow')\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tif (button) {\r\n");
      out.write("\t\t\t\t\t\tbutton = false;\r\n");
      out.write("\t\t\t\t\t\t$(\".level-2\").css(\"opacity\", 1);\r\n");
      out.write("\t\t\t\t\t\tobj.delay(100).animate({\r\n");
      out.write("\t\t\t\t\t\t\tmarginTop : \"-1000px\"\r\n");
      out.write("\t\t\t\t\t\t}, \"normal\", function() {\r\n");
      out.write("\t\t\t\t\t\t\tobj.css({\r\n");
      out.write("\t\t\t\t\t\t\t\t\"margin-top\" : \"-125px\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\"display\" : \"none\"\r\n");
      out.write("\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\tbutton = true;\r\n");
      out.write("\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tobj.fadeIn(\"slow\")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\tobj.hover(function() {\r\n");
      out.write("\t\t\t$(\".level-2\").stop(true).animate({\r\n");
      out.write("\t\t\t\topacity : 1\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}, function() {\r\n");
      out.write("\t\t\t$(\".level-2\").stop(true).animate({\r\n");
      out.write("\t\t\t\topacity : 0\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\".level-3\").click(function() {\r\n");
      out.write("\t\t\tif (!button)\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\tfunction changeBg() {\r\n");
      out.write("\t\t\t\tvar pos = obj.css(\"background-position\");\r\n");
      out.write("\t\t\t\tif (obj.css(\"display\") == \"none\" || button == false) {\r\n");
      out.write("\t\t\t\t\tclearInterval(timer);\r\n");
      out.write("\t\t\t\t\tobj.css(\"background-position\", \"0px 0px\");\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tswitch (pos) {\r\n");
      out.write("\t\t\t\tcase \"0px 0px\":\r\n");
      out.write("\t\t\t\t\tobj.css(\"background-position\", \"-298px 0px\");\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\tcase \"-298px 0px\":\r\n");
      out.write("\t\t\t\t\tobj.css(\"background-position\", \"-447px 0px\");\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\tcase \"-447px 0px\":\r\n");
      out.write("\t\t\t\t\tobj.css(\"background-position\", \"-596px 0px\");\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\tcase \"-596px 0px\":\r\n");
      out.write("\t\t\t\t\tobj.css(\"background-position\", \"-745px 0px\");\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\tcase \"-745px 0px\":\r\n");
      out.write("\t\t\t\t\tobj.css(\"background-position\", \"-298px 0px\");\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ttimer = setInterval(changeBg, 50);\r\n");
      out.write("\t\t\t$(\"html,body\").animate({\r\n");
      out.write("\t\t\t\tscrollTop : 0\r\n");
      out.write("\t\t\t}, \"slow\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
