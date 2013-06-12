package org.apache.jsp.WEB_002dINF.views.activity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_errors_path_cssClass_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_errors_path_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_import_url_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_form_errors_path_cssClass_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<title>我在浙里 在浙里——分享你我的社交</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\" media=\"screen\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t<script src=\"/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t    window.onload = function() {\r\n");
      out.write("\t        CKEDITOR.replace( 'editor1' );\r\n");
      out.write("\t    };\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/comp/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("tab", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("create", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_c_import_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<form id=\"createactivity-form\" modelAttribute=\"activityCreationVo\" method=\"post\">\r\n");
      out.write("\t\t<div id=\"timeline\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input id=\"image-url-hid\" class=\"validate[required]\" data-prompt-position=\"centerRight:0,-4\" name=\"imageUrl\" type=\"hidden\" />\r\n");
      out.write("\t\t\t<input id=\"place-id-hid\" name=\"placeId\" type=\"hidden\" />\r\n");
      out.write("\t\t\t<ul id=\"dates\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#上传海报\" class=\"selected time\">上传活动封面</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#活动细节\" >活动细节</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#活动规划\" >活动规划</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#创建活动的主页面吧\" >创建活动的主页面吧</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul id=\"issues\" >\r\n");
      out.write("\t\t\t\t<li id=\"上传海报\" class=\"selected time \" style=\"margin-top: 100px; margin-left:30px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"upload-img p-r row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<img id=\"spot-image\" class=\"\" alt=\"\" width=300 src=\"http://placehold.it/300&text=Upload+Image\">\r\n");
      out.write("\t\t\t\t\t\t<a id=\"upload-image-btn\" class=\"p-a upload-btn mt-20\" \r\n");
      out.write("               \t\t\t\t href=\"#upload-image-modal\" data-toggle=\"modal\" title=\"上传,引用图片\" style=\"margin-left: 60px;\">+</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li id=\"活动细节\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group \" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label fs-15 lh-20 c-ffc\" for=\"title\">* 给你的活动取个名称吧</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"add-on\"> <i class=\"icon-leaf\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"title\" class=\"validate[required] input-xlarge\" type=\"text\" name=\"title\" \r\n");
      out.write("\t              \t\t\t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activityCreationVo.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group mt-20\" style=\"margin-bottom: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label fs-15 lh-20 c-ffc\" for=\"type\">* 选择活动分类</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-prepend controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"add-on\"> <i class=\"icon-th\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select id=\"type\" class=\"validate[required] span5\" name=\"type\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>聚餐</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>出游</option>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>电影</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>购物</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>线上讨论</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>班级活动</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>其他</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group \" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label fs-15 lh-20 c-ffc\" for=\"startDate\">* 活动开始时间</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bfh-datepicker controls fs-16 lh-18\" data-format=\"y-m-d\" style=\"float:left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-prepend bfh-datepicker-toggle\" data-toggle=\"bfh-datepicker\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"add-on\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-calendar\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"startDate\" class=\"validate[required] input-small\" type=\"text\" name=\"startDate\" \r\n");
      out.write("\t             \t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activityCreationVo.startDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  readonly>\r\n");
      out.write("\t             \t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"bfh-datepicker-calendar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table class=\"calendar table table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr class=\"months-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"month\" colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"previous\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-chevron-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"next\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-chevron-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"year\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"previous\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-chevron-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"next\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-chevron-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr class=\"days-header\"></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tbody></tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bfh-timepicker ml-80\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <div class=\"input-prepend bfh-timepicker-toggle ml-80\" data-toggle=\"bfh-timepicker\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <span class=\"add-on\"><i class=\"icon-time\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <input id=\"startTime\" name=\"startTime\" type=\"text\" class=\"validate[required] input-small\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t    value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activityCreationVo.startTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <div class=\"bfh-timepicker-popover ml-80\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <table class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t      <tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t          <td class=\"hour\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <a class=\"next\" href=\"#\"><i class=\"icon-chevron-up\"></i></a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <input type=\"text\" class=\"input-mini\" readonly><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <a class=\"previous\" href=\"#\"><i class=\"icon-chevron-down\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t          </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t          <td class=\"separator\">:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t          <td class=\"minute\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <a class=\"next\" href=\"#\"><i class=\"icon-chevron-up\"></i></a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <input type=\"text\" class=\"input-mini\" readonly><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <a class=\"previous\" href=\"#\"><i class=\"icon-chevron-down\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t          </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t      </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    </table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group mt-20\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label fs-15 lh-20 c-ffc\" for=\"endDate\">* 活动结束时间</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bfh-datepicker controls fs-16 lh-18\" data-format=\"y-m-d\" style=\"float:left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-prepend bfh-datepicker-toggle\" data-toggle=\"bfh-datepicker\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"add-on\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-calendar\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"endDate\" class=\"validate[required,future[#startDate]] input-small\" type=\"text\" name=\"endDate\" \r\n");
      out.write("\t             \t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activityCreationVo.endDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  readonly>\r\n");
      out.write("\t             \t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"bfh-datepicker-calendar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table class=\"calendar table table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr class=\"months-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"month\" colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"previous\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-chevron-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"next\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-chevron-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"year\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"previous\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-chevron-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"next\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-chevron-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr class=\"days-header\"></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tbody></tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"bfh-timepicker ml-80\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <div class=\"input-prepend bfh-timepicker-toggle ml-80\" data-toggle=\"bfh-timepicker\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <span class=\"add-on\"><i class=\"icon-time\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <input id=\"endTime\" name=\"endTime\" type=\"text\" class=\"validate[required] input-small\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t     value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activityCreationVo.endTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <div class=\"bfh-timepicker-popover ml-80\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <table class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t      <tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t          <td class=\"hour\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <a class=\"next\" href=\"#\"><i class=\"icon-chevron-up\"></i></a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <input type=\"text\" class=\"input-mini\" readonly><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <a class=\"previous\" href=\"#\"><i class=\"icon-chevron-down\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t          </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t          <td class=\"separator\">:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t          <td class=\"minute\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <a class=\"next\" href=\"#\"><i class=\"icon-chevron-up\"></i></a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <input type=\"text\" class=\"input-mini\" readonly><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <a class=\"previous\" href=\"#\"><i class=\"icon-chevron-down\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t          </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t      </tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    </table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group mt-20\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label fs-15 lh-20 c-ffc\" for=\"num\">* 允许参与活动的最大人数/参加人数</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"add-on\"> <i class=\"icon-tint\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"num\" class=\"validate[required,custom[integer],min[1],max[65000]] input-xlarge\" type=\"text\" name=\"num\" value=1 data-prompt-position=\"centerRight:0,-4\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\" style=\"margin-top: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label fs-15 lh-15 c-ffc\" for=\"status\">* 活动状态</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-prepend controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"add-on\"> <i class=\"icon-heart\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select id=\"status\" class=\"validate[required] span5\" name=\"status\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activityCreationVo.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>征集成员中</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>晒活动</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>放弃</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>已结束</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li id=\"活动规划\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group mt-20\" >\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-append\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label fs-15 lh-20 c-ffc\" for=\"fullAddr\">* 活动地点</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"full-addr-input\" name=\"fullAddr\" type=\"text\" class=\"controls input-xlarge\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"点击右边的图标选择地点吧\" autocomplete=\"off\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"add-on\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a id=\"place-locate-btn\" class=\"\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"#place-locate-modal\" data-toggle=\"modal\" title=\"手动定位地址\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-map-marker\"></i></a></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>");
      //  form:errors
      org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
      _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
      _jspx_th_form_errors_0.setParent(null);
      _jspx_th_form_errors_0.setPath("fullAddr");
      _jspx_th_form_errors_0.setCssClass("alert alert-error");
      int[] _jspx_push_body_count_form_errors_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_errors_0 = _jspx_th_form_errors_0.doStartTag();
        if (_jspx_th_form_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_errors_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_errors_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_errors_0.doFinally();
        _jspx_tagPool_form_errors_path_cssClass_nobody.reuse(_jspx_th_form_errors_0);
      }
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <br>\r\n");
      out.write("\t\t\t\t\t    <div class=\"control-group mt-20\">\r\n");
      out.write("\t\t\t\t\t    \t<label class=\"control-label fs-15 lh-20 c-ffc\" for=\"addr\">地址备注</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"add-on\"> <i class=\"icon-tint\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"addr\" name=\"addr\" class=\"input-xlarge\" type=\"text\"  \r\n");
      out.write("          \t\t\t\t\t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activityCreationVo.addr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"control-group mt-20\">\r\n");
      out.write("\t\t\t\t\t    \t<label class=\"control-label fs-15 lh-20 c-ffc\" for=\"fee\">费用</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
      out.write("\t\t    \t\t\t\t\t<input id=\"fee\" class=\"validate[required]\" type=\"hidden\" \r\n");
      out.write("\t\t    \t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\" name=\"fee\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activityCreationVo.fee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"btn-group\" data-toggle=\"buttons-radio\" data-toggle-name=\"fee\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t<button id=\"inputMale\" class=\"btn btn-large btn-info fs-16\" type=\"button\" data-val=\"1\">是</button>\r\n");
      out.write("\t\t\t    \t\t\t\t\t<button id=\"gender_target\" class=\"btn btn-large btn-info fs-16\" type=\"button\" data-val=\"0\">无</button>\r\n");
      out.write("\t\t\t    \t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"control-group mt-20\">\r\n");
      out.write("\t\t\t\t\t    \t<label class=\"control-label fs-15 lh-20 c-ffc\" for=\"apply\">是否需要参与者提供详细个人申请资料</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
      out.write("\t\t\t    \t\t\t\t<input id=\"apply\" class=\"validate[required]\" type=\"hidden\" \r\n");
      out.write("\t\t\t    \t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\" name=\"apply\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activityCreationVo.apply}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"btn-group\" data-toggle=\"buttons-radio\" data-toggle-name=\"apply\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t<button id=\"inputMale\" class=\"btn btn-large btn-info fs-16\" type=\"button\" data-val=\"1\">是</button>\r\n");
      out.write("\t\t\t    \t\t\t\t\t<button id=\"gender_target\" class=\"btn btn-large btn-info fs-16\" type=\"button\" data-val=\"0\">否</button>\r\n");
      out.write("\t\t\t    \t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li id=\"创建活动的主页面吧\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t<textarea id=\"editor1\" name=\"editor1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activityCreationVo.editor1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\" type=\"text\" placeholder=\"页面完成后回车表示输入完成\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t<div>");
      //  form:errors
      org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
      _jspx_th_form_errors_1.setPageContext(_jspx_page_context);
      _jspx_th_form_errors_1.setParent(null);
      _jspx_th_form_errors_1.setPath("editor1");
      _jspx_th_form_errors_1.setCssClass("alert alert-error");
      int[] _jspx_push_body_count_form_errors_1 = new int[] { 0 };
      try {
        int _jspx_eval_form_errors_1 = _jspx_th_form_errors_1.doStartTag();
        if (_jspx_th_form_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_errors_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_errors_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_errors_1.doFinally();
        _jspx_tagPool_form_errors_path_cssClass_nobody.reuse(_jspx_th_form_errors_1);
      }
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<input id=\"err\" name=\"err\" data-prompt-position=\"centerRight:0,-4\" style=\"display:none\"/>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div style=\"float:right\">\r\n");
      out.write("\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\t<button  id=\"submit-btn\" type=\"submit\" class=\" btn btn-primary btn-large\" data-loading-text=\"创建中...\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t提交该活动</button>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a id=\"return-btn\" class=\"btn btn-success btn-large ml-10\" href=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\">返回主页</a>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href=\"#\" id=\"next\">+</a>\r\n");
      out.write("\t\t\t<a href=\"#\" id=\"prev\">-</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">adjustWebWidth();</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_13(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_14(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_15(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_16(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_17(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$().timelinr({\r\n");
      out.write("\t        orientation:  'vertical',\r\n");
      out.write("\t        issuesSpeed:  200,\r\n");
      out.write("\t        datesSpeed:   100,\r\n");
      out.write("\t        arrowKeys:    'true',\r\n");
      out.write("\t        startAt:    1\r\n");
      out.write("\t      });\r\n");
      out.write("\t\tfunction attachValidationForForm(){\r\n");
      out.write("\t\t\t$('#createactivity-form').validationEngine({\r\n");
      out.write("\t\t\t\tprettySelect: true,\t\t\t\t\r\n");
      out.write("\t\t\t\tpromptPosition: 'centerRight',\r\n");
      out.write("\t\t\t\tautoPositionUpdate: true,\r\n");
      out.write("\t\t\t\tajaxFormValidation: true,\r\n");
      out.write("\t\t\t\tajaxFormValidationMethod: 'post',\r\n");
      out.write("\t\t\t\tajaxFormValidationURL: '");
      if (_jspx_meth_c_url_18(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("\t\t\t\tonBeforeAjaxFormValidation: function(form, options){\r\n");
      out.write("\t\t\t\t\t$(form).find('button #submit-btn').button('loading');\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tonAjaxFormComplete: function(status, form, errors, options){\r\n");
      out.write("\t\t\t\t\t$('#createactivity-form button #submit-btn').button('reset');\r\n");
      out.write("\t\t\t\t\tif(status == true){\r\n");
      out.write("\t\t\t\t\t\tform.validationEngine('detach');\r\n");
      out.write("\t\t\t\t\t\tform.ajaxSubmit({\r\n");
      out.write("\t\t\t\t\t        dataType:  'json', \r\n");
      out.write("\t\t\t\t\t        beforeSubmit: function(formData, jqForm, options){\r\n");
      out.write("\t\t\t\t\t        \t$('#createactivity-form button #submit-btn').button('loading');\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t        },\r\n");
      out.write("\t\t\t\t\t        success:  function(data){\r\n");
      out.write("\t\t\t\t\t        \tif(!data || data.resultCode != 'SUCCESS' ) return;\t\t\t\t      \r\n");
      out.write("\t\t\t\t\t        \twindow.location.href = $('#return-btn').attr('href');\r\n");
      out.write("\t\t\t\t\t        },\r\n");
      out.write("\t\t\t\t\t        complete: function(jqXHR, textStatus){\t\r\n");
      out.write("\t\t\t\t\t        \t$('#createactivity-form button #submit-btn').button('reset');\r\n");
      out.write("\t\t\t\t\t        \tattachValidationForForm();\t\t\t          \t\r\n");
      out.write("\t\t\t\t          \t}\r\n");
      out.write("\t\t\t\t\t    });\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tattachValidationForForm();\r\n");
      out.write("\r\n");
      out.write("\t    $('#spot-image').load(function(){\r\n");
      out.write("\t    \t$('#image-url-hid').val($(this).attr('src'));\r\n");
      out.write("\t\t\tvar top = ($('#spot-image').height()-$('#upload-image-btn').height())/2;\r\n");
      out.write("\t\t\tvar left = ($('#spot-image').width()-$('#upload-image-btn').width())/2;\r\n");
      out.write("\t\t\t$('#upload-image-btn').css('top', top);\r\n");
      out.write("\t    \t$('#upload-image-btn').css('left', left);\r\n");
      out.write("    \t});\r\n");
      out.write("    \t$('div.btn-group[data-toggle-name=*]').each(function(){\r\n");
      out.write("\t\t    var group   = $(this);\r\n");
      out.write("\t\t    var form    = group.parents('form').eq(0);\r\n");
      out.write("\t\t    var name    = group.attr('data-toggle-name');\r\n");
      out.write("\t\t    var hidden  = $('input[name=\"' + name + '\"]', form);\r\n");
      out.write("\t\t    $('button', group).each(function(){\r\n");
      out.write("\t\t    \tvar button = $(this);\r\n");
      out.write("\t\t      \tbutton.live('click', function(){\r\n");
      out.write("\t\t        \thidden.val($(this).attr('data-val'));\r\n");
      out.write("\t\t      \t});\r\n");
      out.write("\t\t      \tif(button.attr('data-val') == hidden.val()) {\r\n");
      out.write("\t\t     \t\tbutton.addClass('active');\r\n");
      out.write("\t\t    \t}\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t});\r\n");
      out.write("\t   \r\n");
      out.write("\t});\r\n");
      out.write("\tfunction getLocateObj(){\r\n");
      out.write("\t\treturn {fullAddr : $('#full-addr-input').val(), \r\n");
      out.write("\t\t\tlngLat: $('#full-addr-input').data('lngLat'),\r\n");
      out.write("\t\t\tplaceId: $('#place-id-hid').val()};\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction locateCallback(place){\r\n");
      out.write("\t\t$('#place-id-hid').val(place.id);\r\n");
      out.write("\t\t$('#full-addr-input').val(place.fullAddr);\r\n");
      out.write("\t\t$('#full-addr-input').data('lngLat', place.lngLat);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
    _jspx_th_c_url_0.setValue("/resources/css/zaizheli-base.css");
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
    _jspx_th_c_url_1.setValue("/resources/css/zaizheli-theme.css");
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
    _jspx_th_c_url_2.setValue("/resources/css/bootstrap.css");
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
    _jspx_th_c_url_3.setValue("/resources/css/uploadify.css");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/resources/css/style_v.css");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/resources/css/validationEngine.bootstrap.css");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/resources/css/bootstrap-formhelpers.css");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/resources/js/jquery.1.7.1.js");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("/resources/js/jquery.timelinr-0.9.53.js");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("../modal/upload.jsp");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_import_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_1.setPageContext(_jspx_page_context);
    _jspx_th_c_import_1.setParent(null);
    _jspx_th_c_import_1.setUrl("../modal/locate.jsp");
    int[] _jspx_push_body_count_c_import_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_1 = _jspx_th_c_import_1.doStartTag();
      if (_jspx_th_c_import_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_1.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signUpUserVo.fullAddr}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent(null);
    _jspx_th_c_url_9.setValue("/");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent(null);
    _jspx_th_c_url_10.setValue("/resources/js/bootstrap.js");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_c_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent(null);
    _jspx_th_c_url_11.setValue("/resources/js/zaizheli.op.js");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("/resources/js/bootstrap-formhelpers-datepicker.en_US.js");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }

  private boolean _jspx_meth_c_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_13.setPageContext(_jspx_page_context);
    _jspx_th_c_url_13.setParent(null);
    _jspx_th_c_url_13.setValue("/resources/js/bootstrap-formhelpers-datepicker.js");
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
    return false;
  }

  private boolean _jspx_meth_c_url_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_14.setPageContext(_jspx_page_context);
    _jspx_th_c_url_14.setParent(null);
    _jspx_th_c_url_14.setValue("/resources/js/bootstrap-formhelpers-timepicker.js");
    int _jspx_eval_c_url_14 = _jspx_th_c_url_14.doStartTag();
    if (_jspx_th_c_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
    return false;
  }

  private boolean _jspx_meth_c_url_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_15.setPageContext(_jspx_page_context);
    _jspx_th_c_url_15.setParent(null);
    _jspx_th_c_url_15.setValue("/resources/js/swfobject.js");
    int _jspx_eval_c_url_15 = _jspx_th_c_url_15.doStartTag();
    if (_jspx_th_c_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
    return false;
  }

  private boolean _jspx_meth_c_url_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_16.setPageContext(_jspx_page_context);
    _jspx_th_c_url_16.setParent(null);
    _jspx_th_c_url_16.setValue("/resources/js/jquery.uploadify.v2.1.4.js");
    int _jspx_eval_c_url_16 = _jspx_th_c_url_16.doStartTag();
    if (_jspx_th_c_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
    return false;
  }

  private boolean _jspx_meth_c_url_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_17 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_17.setPageContext(_jspx_page_context);
    _jspx_th_c_url_17.setParent(null);
    _jspx_th_c_url_17.setValue("/resources/js/jquery.form.js");
    int _jspx_eval_c_url_17 = _jspx_th_c_url_17.doStartTag();
    if (_jspx_th_c_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
    return false;
  }

  private boolean _jspx_meth_c_url_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_18 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_18.setPageContext(_jspx_page_context);
    _jspx_th_c_url_18.setParent(null);
    _jspx_th_c_url_18.setValue("/activities/create/validate");
    int _jspx_eval_c_url_18 = _jspx_th_c_url_18.doStartTag();
    if (_jspx_th_c_url_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
    return false;
  }
}
