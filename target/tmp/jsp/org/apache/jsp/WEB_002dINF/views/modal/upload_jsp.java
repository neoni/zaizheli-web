package org.apache.jsp.WEB_002dINF.views.modal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write("\r\n");
      out.write("<div id=\"upload-image-modal\" class=\"modal hide\" \r\n");
      out.write("\t\tstyle=\"width: 450px;\">\r\n");
      out.write("\t<div class=\"modal-header\">\r\n");
      out.write("\t\t<a class=\"close\" data-dismiss=\"modal\">×</a>\r\n");
      out.write("\t\t<h3>上传、引用图片</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"modal-body upload\">\r\n");
      out.write("\t\t<div class=\"tabbable\">\r\n");
      out.write("    \t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("    \t\t\t<li class=\"active\"><a href=\"#from-local\" data-toggle=\"pill\">本地上传</a></li>\r\n");
      out.write(" \t\t\t    <li><a href=\"#from-site-address\" data-toggle=\"pill\">引用网址</a></li>\r\n");
      out.write("    \t\t</ul>\r\n");
      out.write("    \t\t<div class=\"tab-content\">\r\n");
      out.write("    \t\t\t<div class=\"tab-pane active\" id=\"from-local\">\r\n");
      out.write("    \t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("    \t\t\t\t\t<div class=\"span10\">\r\n");
      out.write("    \t\t\t\t\t\t<div class=\"well\">\r\n");
      out.write("    \t\t\t\t\t\t\t<div id=\"image-file-queue\"></div>\r\n");
      out.write("    \t\t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"span2 ta-r\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"image-file-input-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"none\" type=\"file\" id=\"image-file-input\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t\t<div class=\"tab-pane\" id=\"from-site-address\">\r\n");
      out.write("    \t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("    \t\t\t\t\t<div class=\"span10\">\r\n");
      out.write("    \t\t\t\t\t\t<input class=\"span9\" id=\"net-address\" name=\"netAdress\" type=\"text\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"输入图片网址\" autocomplete=\"off\" />\r\n");
      out.write("    \t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"span2 ta-r\">\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"refer-from-site-btn\" class=\"btn upload btn-primary\" href=\"javascript:void(0)\">引用</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('#image-file-input').uploadify({\r\n");
      out.write("\t\t    uploader  \t: '");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("\t\t    script   \t: '");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("\t\t    scriptData  : { 'session': '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.session.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'},\r\n");
      out.write("\t\t    cancelImg \t: '");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("\t\t    folder \t\t: '");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("\t\t    fileDataName : 'imageFile',\r\n");
      out.write("\t\t    buttonText\t: '浏览...',\r\n");
      out.write("\t\t    fileDesc  \t: \"Image File\",\r\n");
      out.write("\t\t    fileExt\t\t: \"*.jpg;*.png;*.jpeg;*.gif;*.bmp\",\r\n");
      out.write("\t\t    sizeLimit \t: 8000000,\r\n");
      out.write("\t\t    queueID\t\t: 'image-file-queue',\r\n");
      out.write("\t\t    multi     \t: false,\r\n");
      out.write("\t\t    simUploadLimit : 1,\r\n");
      out.write("\t\t    auto\t\t: true,\r\n");
      out.write("\t\t    removeCompleted: true,\r\n");
      out.write("\t\t    hideButton  : true,\r\n");
      out.write("\t\t    wmode     \t: 'transparent',\r\n");
      out.write("\t\t    onSelectOnce : function(event,data) {\r\n");
      out.write("\t\t      \r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    onComplete \t: function(event, ID, fileObj, response, data) {\r\n");
      out.write("\t\t    \t$('#image-file-input').uploadifyClearQueue();\r\n");
      out.write("\t\t    \t$('#upload-image-modal').modal('hide');\r\n");
      out.write("\t\t    \t$('#spot-image').attr('src', response);\r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    onError\t\t: function (event, queueID ,fileObj, errorObj) {\r\n");
      out.write("              \t\r\n");
      out.write("            }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#image-file-input-wrapper').mouseenter(function(){\r\n");
      out.write("\t\t\t$('#image-file-inputUploader').css('background-position', '-60px 0px');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#image-file-input-wrapper').mouseleave(function(){\r\n");
      out.write("\t\t\t$('#image-file-inputUploader').css('background-position', '0px 0px');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t    $('#upload-image-modal').on('show', function () {\r\n");
      out.write("\t        // do something…\r\n");
      out.write("\t    });\r\n");
      out.write("\t    $('#upload-image-modal').on('hide', function () {\r\n");
      out.write("\t    \t$('#image-file-input').uploadifyClearQueue();\r\n");
      out.write("\t    });\r\n");
      out.write("\t    */\r\n");
      out.write("\t\t$('#refer-from-site-btn').click(function(){\r\n");
      out.write("\t\t\tvar addr = $('#net-address').val();\r\n");
      out.write("\t\t\tif($.trim(addr)){\r\n");
      out.write("\t\t\t\t$('#spot-image').attr('src', addr);\r\n");
      out.write("\t\t\t\t$('#image-url-hid').val(addr);\r\n");
      out.write("\t\t\t\t$('#upload-image-modal').modal('hide');\r\n");
      out.write("\t\t\t\t$('#net-address').val('');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/js/uploadify.swf");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/spots/upload");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/resources/img/cancel.png");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/temp");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }
}
