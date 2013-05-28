package org.apache.jsp.WEB_002dINF.views.profiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_method_id_class_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_method_id_class_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_form_form_method_id_class_action.release();
    _jspx_tagPool_c_url_var_value_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_otherwise.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signInUser.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" 设置账号 在浙里——分享你我的社交</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" />\t\r\n");
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
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"front\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/comp/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("noNeed", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("tab", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("none", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container mt-25 mb-30 board\">\r\n");
      out.write("\t\t<div class=\"pl-30 pr-30 pt-20 bg-gray\">\r\n");
      out.write("\t\t    <ul class=\"nav nav-tabs fs-14\" \r\n");
      out.write("\t\t    \tstyle=\"margin-left: -30px; margin-right: -30px;  margin-bottom:0px\">\r\n");
      out.write("\t\t    \t<li class=\"active\"  style=\"margin-left:30px\">\r\n");
      out.write("\t\t   \t\t\t<a data-toggle=\"tab\" href=\"#basic-info\">基本信息</a></li>\r\n");
      out.write("\t\t   \t\t<li class=\"ml-10\">\r\n");
      out.write("\t   \t\t\t\t<a data-toggle=\"tab\" href=\"#specific-info\">详细资料</a></li>\r\n");
      out.write("\t\t   \t\t<li class=\"ml-10\">\r\n");
      out.write("\t   \t\t\t\t<a data-toggle=\"tab\" href=\"#change-avatar\">修改头像</a></li>\r\n");
      out.write("\t   \t\t\t<li class=\"ml-10\">\r\n");
      out.write("\t   \t\t\t\t<a data-toggle=\"tab\" href=\"#change-pwd\">修改密码</a></li>\t\t\r\n");
      out.write("\t   \t\t\t<li class=\"\">\r\n");
      out.write("\t   \t\t\t\t<a data-toggle=\"tab\" href=\"#binding-weibo\">关联三方账号</a></li>\t\t\t\t    \r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div class=\"tab-content p-20 of-v\">\r\n");
      out.write("\t\t    <div id=\"basic-info\" class=\"tab-pane active fade in\">\r\n");
      out.write("\t\t    \t");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t    \t");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div id=\"specific-info\" class=\"tab-pane fade\">\r\n");
      out.write("\t\t    \t");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t    \t");
      if (_jspx_meth_form_form_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div id=\"change-avatar\" class=\"tab-pane fade\">\r\n");
      out.write("\t\t    \t<form id=\"avatarUploadForm\" class=\"form-horizontal\" action=\"");
      if (_jspx_meth_c_url_13(_jspx_page_context))
        return;
      out.write("\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"controls fs-14 lh-18\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear mb-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"avatarContainer\" class=\"f-l\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img id=\"avatarImg\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"avatarPreview\" class=\"ml-10 f-l\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"mb-10\" style=\"width:100px;height:100px;overflow:hidden;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img id=\"preview100\" class=\"jcrop-preview\" alt=\"Preview\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"mb-10\" style=\"width:60px;height:60px;overflow:hidden;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img id=\"preview60\" class=\"jcrop-preview\" alt=\"Preview\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"\" style=\"width:30px;height:30px;overflow:hidden;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img id=\"preview30\" class=\"jcrop-preview\" alt=\"Preview\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_choose_3(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"btn btn-large btn-success fileinput-button\">\r\n");
      out.write("\t\t\t\t                    <i class=\"icon-plus icon-white\"></i>\r\n");
      out.write("\t\t\t\t                    <span>选择照片</span>\r\n");
      out.write("\t\t\t\t                    <input id=\"avatarInput\" type=\"file\" name=\"imageFile\" multiple >\r\n");
      out.write("\t\t\t                \t</span>\r\n");
      out.write("\t\t\t                \t<div class=\"p-8 convo lh-16 loading-box dis-n\" style=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"bg-h-loading pl-85 c-888\" href=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t                \t\t<span class=\"alert alert-error dis-n mb-0\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t    </form>\r\n");
      out.write("\t\t    \t");
      if (_jspx_meth_c_url_18(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t    \t");
      if (_jspx_meth_form_form_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div id=\"change-pwd\" class=\"tab-pane fade\">\r\n");
      out.write("\t\t    \t");
      if (_jspx_meth_c_url_19(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t    \t");
      if (_jspx_meth_form_form_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div id=\"binding-weibo\" class=\"tab-pane fade\">\r\n");
      out.write("\t\t    \t");
      if (_jspx_meth_c_url_20(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t    \t");
      if (_jspx_meth_form_form_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_21(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_22(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_23(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_24(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_25(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_26(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_27(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tfunction attachValidationForBasicInfoForm(){\r\n");
      out.write("\t\t\t$('#basicInfoForm').validationEngine({\r\n");
      out.write("\t\t\t\tprettySelect: true,\r\n");
      out.write("\t\t\t\tuseSuffix: '_target',\r\n");
      out.write("\t\t\t\tpromptPosition: 'centerRight',\r\n");
      out.write("\t\t\t\tautoPositionUpdate: true,\r\n");
      out.write("\t\t\t\tajaxFormValidation: true,\r\n");
      out.write("\t\t\t\tajaxFormValidationMethod: 'post',\r\n");
      out.write("\t\t\t\tajaxFormValidationURL: '");
      if (_jspx_meth_c_url_28(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("\t\t\t\tonBeforeAjaxFormValidation: function(form, options){\r\n");
      out.write("\t\t\t\t\t$(form).find('.form-actions button').button('loading');\r\n");
      out.write("\t\t\t\t\t$('#basicInfoForm .icon-ok').hide();\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tonAjaxFormComplete: function(status, form, errors, options){\r\n");
      out.write("\t\t\t\t\t$('#basicInfoForm .form-actions button').button('reset')\r\n");
      out.write("\t\t\t\t\tif(status == true){\r\n");
      out.write("\t\t\t\t\t\tform.validationEngine('detach');\r\n");
      out.write("\t\t\t\t\t\tform.ajaxSubmit({\r\n");
      out.write("\t\t\t\t\t        dataType:  'json', \r\n");
      out.write("\t\t\t\t\t        beforeSubmit: function(formData, jqForm, options){\r\n");
      out.write("\t\t\t\t\t        \t$('#basicInfoForm .form-actions button').button('loading');\r\n");
      out.write("\t\t\t\t\t        \t$('#basicInfoForm .icon-ok').hide();\r\n");
      out.write("\t\t\t\t\t        },\r\n");
      out.write("\t\t\t\t\t        success:  function(data){\r\n");
      out.write("\t\t\t\t\t        \tif(!data || data.resultCode != 'SUCCESS' ) return;\r\n");
      out.write("\t\t\t\t\t        \t$('#basicInfoForm .icon-ok').css('display', 'inline-block');\r\n");
      out.write("\t\t\t\t\t        },\r\n");
      out.write("\t\t\t\t\t        complete: function(jqXHR, textStatus){\r\n");
      out.write("\t\t\t\t          \t\t$('#basicInfoForm .form-actions button').button('reset');\r\n");
      out.write("\t\t\t\t          \t\tattachValidationForBasicInfoForm();\r\n");
      out.write("\t\t\t\t          \t}\r\n");
      out.write("\t\t\t\t\t    });\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction attachValidationForSpecificInfoForm(){\r\n");
      out.write("\t\t\t$('#specificInfoForm').validationEngine({\r\n");
      out.write("\t\t\t\tprettySelect: true,\r\n");
      out.write("\t\t\t\tuseSuffix: '_target',\r\n");
      out.write("\t\t\t\tpromptPosition: 'centerRight',\r\n");
      out.write("\t\t\t\tautoPositionUpdate: true,\r\n");
      out.write("\t\t\t\tajaxFormValidation: true,\r\n");
      out.write("\t\t\t\tajaxFormValidationMethod: 'post',\r\n");
      out.write("\t\t\t\tajaxFormValidationURL: '");
      if (_jspx_meth_c_url_29(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("\t\t\t\tonBeforeAjaxFormValidation: function(form, options){\r\n");
      out.write("\t\t\t\t\t$(form).find('.form-actions button').button('loading');\r\n");
      out.write("\t\t\t\t\t$('#specificInfoForm .icon-ok').hide();\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tonAjaxFormComplete: function(status, form, errors, options){\r\n");
      out.write("\t\t\t\t\t$('#specificInfoForm .form-actions button').button('reset')\r\n");
      out.write("\t\t\t\t\tif(status == true){\r\n");
      out.write("\t\t\t\t\t\tform.validationEngine('detach');\r\n");
      out.write("\t\t\t\t\t\tform.ajaxSubmit({\r\n");
      out.write("\t\t\t\t\t        dataType:  'json', \r\n");
      out.write("\t\t\t\t\t        beforeSubmit: function(formData, jqForm, options){\r\n");
      out.write("\t\t\t\t\t        \t$('#specificInfoForm .form-actions button').button('loading');\r\n");
      out.write("\t\t\t\t\t        \t$('#specificInfoForm .icon-ok').hide();\r\n");
      out.write("\t\t\t\t\t        },\r\n");
      out.write("\t\t\t\t\t        success:  function(data){\r\n");
      out.write("\t\t\t\t\t        \tif(!data || data.resultCode != 'SUCCESS' ) return;\r\n");
      out.write("\t\t\t\t\t        \t$('#specificInfoForm .icon-ok').css('display', 'inline-block');\r\n");
      out.write("\t\t\t\t\t        },\r\n");
      out.write("\t\t\t\t\t        complete: function(jqXHR, textStatus){\r\n");
      out.write("\t\t\t\t          \t\t$('#specificInfoForm .form-actions button').button('reset');\r\n");
      out.write("\t\t\t\t          \t\tattachValidationForSpecificInfoForm();\r\n");
      out.write("\t\t\t\t          \t}\r\n");
      out.write("\t\t\t\t\t    });\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction attachValidationForChangPwdForm(){\r\n");
      out.write("\t\t\t$('#changePwdForm').validationEngine({\r\n");
      out.write("\t\t\t\tautoPositionUpdate: true,\r\n");
      out.write("\t\t\t\tajaxFormValidation: true,\r\n");
      out.write("\t\t\t\tajaxFormValidationMethod: 'post',\r\n");
      out.write("\t\t\t\tajaxFormValidationURL: '");
      if (_jspx_meth_c_url_30(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("\t\t\t\tonBeforeAjaxFormValidation: function(form, options){\r\n");
      out.write("\t\t\t\t\t$(form).find('.form-actions button').button('loading');\r\n");
      out.write("\t\t\t\t\t$('#changePwdForm .icon-ok').hide();\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tonAjaxFormComplete: function(status, form, errors, options){\r\n");
      out.write("\t\t\t\t\t$('#changePwdForm .form-actions button').button('reset')\r\n");
      out.write("\t\t\t\t\tif(status == true){\r\n");
      out.write("\t\t\t\t\t\tform.validationEngine('detach');\r\n");
      out.write("\t\t\t\t\t\tform.ajaxSubmit({\r\n");
      out.write("\t\t\t\t\t        dataType:  'json', \r\n");
      out.write("\t\t\t\t\t        beforeSubmit: function(formData, jqForm, options){\r\n");
      out.write("\t\t\t\t\t        \t$('#changePwdForm .form-actions button').button('loading');\r\n");
      out.write("\t\t\t\t\t        \t$('#changePwdForm .icon-ok').hide();\r\n");
      out.write("\t\t\t\t\t        },\r\n");
      out.write("\t\t\t\t\t        success:  function(data){\r\n");
      out.write("\t\t\t\t\t        \tif(!data || data.resultCode != 'SUCCESS' ) return;\r\n");
      out.write("\t\t\t\t\t        \tform.clearForm();\r\n");
      out.write("\t\t\t\t\t        \t$('#changePwdForm .icon-ok').css('display', 'inline-block');\r\n");
      out.write("\t\t\t\t\t        },\r\n");
      out.write("\t\t\t\t\t        complete: function(jqXHR, textStatus){\r\n");
      out.write("\t\t\t\t          \t\t$('#changePwdForm .form-actions button').button('reset');\r\n");
      out.write("\t\t\t\t          \t\tattachValidationForChangPwdForm();\r\n");
      out.write("\t\t\t\t          \t}\r\n");
      out.write("\t\t\t\t\t    });\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tattachValidationForBasicInfoForm();\r\n");
      out.write("\t\tattachValidationForSpecificInfoForm();\r\n");
      out.write("\t\tattachValidationForChangPwdForm();\r\n");
      out.write("\t\tvar jcrop_api, boundx, boundy;;\r\n");
      out.write("\t\t$('#avatarUploadForm').ajaxForm({\r\n");
      out.write("\t\t\tdataType:  'json', \r\n");
      out.write("\t        beforeSubmit: function(formData, jqForm, options){\r\n");
      out.write("\t        \t$('#avatarUploadForm .loading-box').show();\r\n");
      out.write("\t        \t$('#avatarUploadForm .alert-error').hide();\r\n");
      out.write("\t        },\r\n");
      out.write("\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\tif(data && data.resultCode == 'EXCEPTION' ){\r\n");
      out.write("\t\t\t\t\t$('#avatarUploadForm').find(\".alert-error\").text(data.exceptionMsg);\r\n");
      out.write("\t\t\t\t\t$('#avatarUploadForm').find(\".alert-error\").css('display','inline-block');\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$('#preview100').attr('src', data.resultData);\r\n");
      out.write("\t\t\t\t\t$('#preview60').attr('src', data.resultData);\r\n");
      out.write("\t\t\t\t\t$('#preview30').attr('src', data.resultData);\r\n");
      out.write("\t\t\t\t\t$('#imageUrl').val(data.resultData);\r\n");
      out.write("\t\t\t\t\tif(jcrop_api == null){\r\n");
      out.write("\t\t\t\t\t\tvar $pic = $('<img src=\"'+data.resultData+'\" />');\r\n");
      out.write("\t\t\t\t\t\t$(\"#avatarContainer\").html($pic);\r\n");
      out.write("\t\t\t\t\t\tsetupJcrop($pic);\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tupdateJcrop(data.resultData, $('#avatarContainer img'));\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcomplete: function(){\r\n");
      out.write("\t\t\t\t$('#avatarUploadForm .loading-box').hide();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tfunction updatePreview(c){\r\n");
      out.write("\t\t\tif (parseInt(c.w) > 0)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t   $('#x').val(c.x);\r\n");
      out.write("\t\t       $('#y').val(c.y);\r\n");
      out.write("\t\t       $('#w').val(c.w);\r\n");
      out.write("\t\t       $('#h').val(c.h);\r\n");
      out.write("\t\t\t\t// preview100\r\n");
      out.write("\t\t\t\tvar rx = 100 / c.w;\r\n");
      out.write("\t\t\t\tvar ry = 100 / c.h;\r\n");
      out.write("\t\t\t\t$('#preview100').css({\r\n");
      out.write("\t\t\t\t\twidth: Math.round(rx * boundx) + 'px',\r\n");
      out.write("\t\t\t\t\theight: Math.round(ry * boundy) + 'px',\r\n");
      out.write("\t\t\t\t\tmarginLeft: '-' + Math.round(rx * c.x) + 'px',\r\n");
      out.write("\t\t\t\t\tmarginTop: '-' + Math.round(ry * c.y) + 'px'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t// preview60\r\n");
      out.write("\t\t\t\trx = 60 / c.w;\r\n");
      out.write("\t\t\t\try = 60 / c.h;\r\n");
      out.write("\t\t\t\t$('#preview60').css({\r\n");
      out.write("\t\t\t\t\twidth: Math.round(rx * boundx) + 'px',\r\n");
      out.write("\t\t\t\t\theight: Math.round(ry * boundy) + 'px',\r\n");
      out.write("\t\t\t\t\tmarginLeft: '-' + Math.round(rx * c.x) + 'px',\r\n");
      out.write("\t\t\t\t\tmarginTop: '-' + Math.round(ry * c.y) + 'px'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t// preview30\r\n");
      out.write("\t\t\t\trx = 30 / c.w;\r\n");
      out.write("\t\t\t\try = 30 / c.h;\r\n");
      out.write("\t\t\t\t$('#preview30').css({\r\n");
      out.write("\t\t\t\t\twidth: Math.round(rx * boundx) + 'px',\r\n");
      out.write("\t\t\t\t\theight: Math.round(ry * boundy) + 'px',\r\n");
      out.write("\t\t\t\t\tmarginLeft: '-' + Math.round(rx * c.x) + 'px',\r\n");
      out.write("\t\t\t\t\tmarginTop: '-' + Math.round(ry * c.y) + 'px'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar avatarSrc = $('#avatarContainer img').attr('src');\r\n");
      out.write("\t\tfunction setupJcrop($pic){\r\n");
      out.write("\t\t\tvar imgW, imgH, p1 = {}, p2 = {};\r\n");
      out.write("\t\t\t$pic.Jcrop({\r\n");
      out.write("\t\t\t\taspectRatio: 1,\r\n");
      out.write("\t\t\t\tonChange: updatePreview,\r\n");
      out.write("\t\t\t\tonSelect: updatePreview,\r\n");
      out.write("\t\t\t\tminSize:[192,192]\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tfunction(){\r\n");
      out.write("\t\t\t\tvar bounds = this.getBounds();\r\n");
      out.write("\t\t\t\tboundx = bounds[0];\r\n");
      out.write("\t\t\t\tboundy = bounds[1]; \r\n");
      out.write("\t\t\t\timgW = $pic.width();\r\n");
      out.write("\t\t\t\timgH = $pic.height();\r\n");
      out.write("\t\t\t\tp1.x = Math.floor((imgW-192)/2);\r\n");
      out.write("\t\t\t\tp1.y = Math.floor((imgH-192)/2);\r\n");
      out.write("\t\t\t\tp2.x = Math.floor((imgW+192)/2);\r\n");
      out.write("\t\t\t\tp2.x = Math.floor((imgH+192)/2);\r\n");
      out.write("\t\t\t\tjcrop_api = this;\r\n");
      out.write("\t\t\t\tjcrop_api.setSelect([p1.x,p1.y,p2.x,p2.y]);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction updateJcrop(imgSrc, $pic)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar imgW, imgH, p1 = {}, p2 = {};\r\n");
      out.write("\t\t\tif(!jcrop_api) return;\r\n");
      out.write("\t\t\tjcrop_api.setImage(imgSrc, function(){\r\n");
      out.write("\t\t\t\tvar bounds = this.getBounds();\r\n");
      out.write("\t\t\t\tboundx = bounds[0];\r\n");
      out.write("\t\t\t\tboundy = bounds[1]; \r\n");
      out.write("\t\t\t\timgW = $pic.width();\r\n");
      out.write("\t\t\t\timgH = $pic.height();\r\n");
      out.write("\t\t\t\tp1.x = Math.floor((imgW-192)/2);\r\n");
      out.write("\t\t\t\tp1.y = Math.floor((imgH-192)/2);\r\n");
      out.write("\t\t\t\tp2.x = Math.floor((imgW+192)/2);\r\n");
      out.write("\t\t\t\tp2.x = Math.floor((imgH+192)/2);\r\n");
      out.write("\t\t\t\tjcrop_api = this;\r\n");
      out.write("\t\t\t\tjcrop_api.setSelect([p1.x,p1.y,p2.x,p2.y]);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($.trim(avatarSrc) && avatarSrc.indexOf('/images/avatars')!=-1){\r\n");
      out.write("\t\t\tsetupJcrop($('#avatarContainer img'));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$('#avatarChangeForm').ajaxForm({\r\n");
      out.write("\t        dataType:  'json', \r\n");
      out.write("\t        beforeSubmit: function(formData, jqForm, options){\r\n");
      out.write("\t        \t$('#avatarChangeForm .form-actions button').button('loading');\r\n");
      out.write("\t        \t$('#avatarChangeForm .icon-ok').hide();\r\n");
      out.write("\t        },\r\n");
      out.write("\t        success:  function(data){\r\n");
      out.write("\t        \tif(!data || data.resultCode != 'SUCCESS' ) return;\r\n");
      out.write("\t        \t$('#avatarChangeForm').clearForm();\r\n");
      out.write("\t        \t$('#avatarChangeForm .icon-ok').css('display', 'inline-block');\r\n");
      out.write("\t        },\r\n");
      out.write("\t        complete: function(jqXHR, textStatus){\r\n");
      out.write("          \t\t$('#avatarChangeForm .form-actions button').button('reset');\r\n");
      out.write("          \t}\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t$('#avatarInput').change(function(){\r\n");
      out.write("\t\t\t$(\"#avatarUploadForm\").submit();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('div.btn-group[data-toggle-name=*]').each(function(){\r\n");
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
      out.write("\t\tvar city = $('#city').val();\r\n");
      out.write("\t\tif($.trim(city)){\r\n");
      out.write("\t\t\tvar targetCityElem = $('#setting-city-picker a[title='+city+']').addClass('active');\r\n");
      out.write("\t\t\t$('#city_target strong').text(targetCityElem.text());\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$('#city_target strong').text('-请选择-');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$('#setting-city-picker').bind('city-click', function(e, pinyin, label){\r\n");
      out.write("\t\t\t$('#city').val(pinyin);\r\n");
      out.write("\t\t\t$('#city').parent().find('.btn-group strong').text(label);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#setting-city-picker').parent().bind('dropdown-open', function(e){\r\n");
      out.write("\t\t\tvar pinyin = $('#city').val();\r\n");
      out.write("\t\t\t$('#setting-city-picker').trigger('city-open', [pinyin]);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_31(_jspx_page_context))
        return;
      out.write("\" ></script>\r\n");
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
    _jspx_th_c_url_0.setValue("/resources/css/bootstrap-responsive.css");
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
    _jspx_th_c_url_1.setValue("/resources/css/baguajie-theme.css");
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
    _jspx_th_c_url_3.setValue("/resources/css/baguajie-base.css");
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
    _jspx_th_c_url_4.setValue("/resources/css/validationEngine.bootstrap.css");
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
    _jspx_th_c_url_5.setValue("/resources/css/jquery.Jcrop.css");
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
    _jspx_th_c_url_7.setValue("/resources/css/jquery.fileupload-ui.css");
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
    _jspx_th_c_url_8.setValue("/resources/js/jquery.1.7.1.js");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
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
    _jspx_th_c_url_9.setValue("/resources/js/baguajie.init.js");
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
    _jspx_th_c_url_10.setValue("/resources/js/baguajie.op.js");
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
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent(null);
    _jspx_th_c_url_11.setValue("/setting/basic");
    _jspx_th_c_url_11.setVar("ub_url");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_form_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_id_class_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setId("basicInfoForm");
    _jspx_th_form_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ub_url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_form_0.setMethod("post");
    _jspx_th_form_form_0.setDynamicAttribute(null, "class", new String("form-horizontal mt-20 mb-0"));
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-25 c-888\" for=\"name\">请叫我</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<input id=\"name\" class=\"validate[required,minSize[2]] input-xlarge\" type=\"text\" name=\"name\" \r\n");
          out.write("\t\t\t\t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signInUser.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 25px;\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-30 c-888\" for=\"gender\">我是</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t    \t\t\t\t<input id=\"gender\" class=\"validate[required]\" type=\"hidden\" \r\n");
          out.write("\t\t    \t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\" name=\"gender\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signInUser.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t    \t\t\t\t<div class=\"btn-group\" data-toggle=\"buttons-radio\" data-toggle-name=\"gender\">\r\n");
          out.write("\t\t    \t\t\t\t\t<button id=\"inputMale\" class=\"btn btn-large btn-info fs-16\" type=\"button\" data-val=\"FEMALE\">美女</button>\r\n");
          out.write("\t\t    \t\t\t\t\t<button id=\"gender_target\" class=\"btn btn-large btn-info fs-16\" type=\"button\" data-val=\"MALE\">帅哥</button>\r\n");
          out.write("\t\t    \t\t\t\t\t<button id=\"gender_target\" class=\"btn btn-large btn-info fs-16\" type=\"button\" data-val=\"UNKNOWN\">未知</button>\r\n");
          out.write("\t\t    \t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-30 c-888\" for=\"city\">居住在</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t    \t\t\t\t<input id=\"city\" class=\"validate[required]\" type=\"hidden\" \r\n");
          out.write("\t\t    \t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\" name=\"city\" placeholder=\"\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signInUser.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t    \t\t\t\t<div class=\"btn-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<a id=\"city_target\" class=\"btn btn-large dropdown-toggle fs-16\" data-toggle=\"dropdown\" href=\"#\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<strong>未知</strong>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<b class=\"caret\"></b>\r\n");
          out.write("\t\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/comp/city.picker.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("domId", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("setting-city-picker", request.getCharacterEncoding()), out, false);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-20 c-888\" for=\"summary\">我想说</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<textarea id=\"summary\" class=\"input-xlarge\" type=\"text\" name=\"summary\" rows=\"3\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signInUser.summary}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</textarea>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"form-actions\" style=\"margin-bottom: 0px;\">\r\n");
          out.write("\t\t    \t\t\t<div class=\"dis-i\">\r\n");
          out.write("\t\t\t\t\t\t    <button type=\"submit\" class=\"btn btn-large btn-primary\" data-loading-text=\"更新中...\">保存修改</button>\r\n");
          out.write("\t\t\t\t\t    \t<i class=\"icon-ok ml-10\" style=\"display:none;\"></i>\r\n");
          out.write("\t\t\t\t    \t</div>\r\n");
          out.write("\t\t\t\t    </div>\r\n");
          out.write("\t\t    \t");
          int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_0.doFinally();
      _jspx_tagPool_form_form_method_id_class_action.reuse(_jspx_th_form_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("/setting/specific");
    _jspx_th_c_url_12.setVar("sb_url");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }

  private boolean _jspx_meth_form_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_1 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_id_class_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_1.setPageContext(_jspx_page_context);
    _jspx_th_form_form_1.setParent(null);
    _jspx_th_form_form_1.setId("specificInfoForm");
    _jspx_th_form_form_1.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sb_url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_form_1.setMethod("post");
    _jspx_th_form_form_1.setDynamicAttribute(null, "class", new String("form-horizontal mt-20 mb-0"));
    int[] _jspx_push_body_count_form_form_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_1 = _jspx_th_form_form_1.doStartTag();
      if (_jspx_eval_form_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-25 c-888\" for=\"realName\">真实姓名</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<input id=\"realName\" class=\"input-xlarge\" type=\"text\" name=\"realName\" \r\n");
          out.write("\t\t\t\t\t\t\t\t   value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signInUser.realName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 25px;\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-25 c-888\" for=\"age\">年龄</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<input id=\"age\" class=\"input-xlarge\" type=\"text\" name=\"age\" \r\n");
          out.write("\t\t\t\t\t\t\t\t   value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signInUser.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 25px;\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-25 c-888\" for=\"birthday\">生日</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"bfh-datepicker controls fs-16 lh-18\" data-format=\"y-m-d\" data-date=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(!empty signInUser.birthday)?signInUser.birthday:'1993-01-01'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \">     \r\n");
          out.write("\t\t    \t\t\t<div class=\"input-prepend bfh-datepicker-toggle\" data-toggle=\"bfh-datepicker\" >\r\n");
          out.write("\t\t    \t\t\t\t<span class=\"add-on\"><i class=\"icon-calendar\"></i></span>\r\n");
          out.write("\t\t\t\t\t\t\t<input id=\"birthday\" class=\"input-large\" type=\"text\" name=\"birthday\" \r\n");
          out.write("\t\t\t\t\t\t\t\t   value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signInUser.birthday}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 25px;\" readonly>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"bfh-datepicker-calendar\">\r\n");
          out.write("\t\t\t\t\t\t    <table class=\"calendar table table-bordered\">\r\n");
          out.write("\t\t\t\t\t\t      <thead>\r\n");
          out.write("\t\t\t\t\t\t        <tr class=\"months-header\">\r\n");
          out.write("\t\t\t\t\t\t          <th class=\"month\" colspan=\"4\">\r\n");
          out.write("\t\t\t\t\t\t            <a class=\"previous\" href=\"#\"><i class=\"icon-chevron-left\"></i></a>\r\n");
          out.write("\t\t\t\t\t\t            <span></span>\r\n");
          out.write("\t\t\t\t\t\t            <a class=\"next\" href=\"#\"><i class=\"icon-chevron-right\"></i></a>\r\n");
          out.write("\t\t\t\t\t\t          </th>\r\n");
          out.write("\t\t\t\t\t\t          <th class=\"year\" colspan=\"3\">\r\n");
          out.write("\t\t\t\t\t\t            <a class=\"previous\" href=\"#\"><i class=\"icon-chevron-left\"></i></a>\r\n");
          out.write("\t\t\t\t\t\t            <span></span>\r\n");
          out.write("\t\t\t\t\t\t            <a class=\"next\" href=\"#\"><i class=\"icon-chevron-right\"></i></a>\r\n");
          out.write("\t\t\t\t\t\t          </th>\r\n");
          out.write("\t\t\t\t\t\t        </tr>\r\n");
          out.write("\t\t\t\t\t\t        <tr class=\"days-header\">\r\n");
          out.write("\t\t\t\t\t\t        </tr>\r\n");
          out.write("\t\t\t\t\t\t      </thead>\r\n");
          out.write("\t\t\t\t\t\t      <tbody>\r\n");
          out.write("\t\t\t\t\t\t      </tbody>\r\n");
          out.write("\t\t\t\t\t\t    </table>\r\n");
          out.write("\t\t\t\t\t\t  </div>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-25 c-888\" for=\"tel\">电话</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<input id=\"tel\" class=\"input-xlarge\" type=\"text\" name=\"tel\" \r\n");
          out.write("\t\t\t\t\t\t\t\t   value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signInUser.tel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 25px;\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-25 c-888\" for=\"school\">学校</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<input id=\"school\" class=\"input-xlarge\" type=\"text\" name=\"school\" \r\n");
          out.write("\t\t\t\t\t\t\t\t   value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signInUser.school}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 25px;\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-30 c-888\" for=\"privateset\">此页信息是否面向大众展示</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t    \t\t\t\t<input id=\"privateset\" class=\"validate[required]\" type=\"hidden\" \r\n");
          out.write("\t\t    \t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\" name=\"privateset\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signInUser.privateset}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t    \t\t\t\t<div class=\"btn-group\" data-toggle=\"buttons-radio\" data-toggle-name=\"privateset\">\r\n");
          out.write("\t\t    \t\t\t\t\t<button id=\"inputMale\" class=\"btn btn-large btn-info fs-16\" type=\"button\" data-val=0 >否</button>\r\n");
          out.write("\t\t    \t\t\t\t\t<button id=\"gender_target\" class=\"btn btn-large btn-info fs-16\" type=\"button\" data-val=1>是</button>\r\n");
          out.write("\t\t    \t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"form-actions\" style=\"margin-bottom: 0px;\">\r\n");
          out.write("\t\t    \t\t\t<div class=\"dis-i\">\r\n");
          out.write("\t\t\t\t\t\t    <button type=\"submit\" class=\"btn btn-large btn-primary\" data-loading-text=\"更新中...\">保存修改</button>\r\n");
          out.write("\t\t\t\t\t    \t<i class=\"icon-ok ml-10\" style=\"display:none;\"></i>\r\n");
          out.write("\t\t\t\t    \t</div>\r\n");
          out.write("\t\t\t\t    </div>\r\n");
          out.write("\t\t    \t");
          int evalDoAfterBody = _jspx_th_form_form_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_1.doFinally();
      _jspx_tagPool_form_form_method_id_class_action.reuse(_jspx_th_form_form_1);
    }
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
    _jspx_th_c_url_13.setValue("/avatar/upload");
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty signInUser.avatar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_url_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_url_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_14.setPageContext(_jspx_page_context);
    _jspx_th_c_url_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_url_14.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/images/avatars/${signInUser.avatar.resId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_14 = _jspx_th_c_url_14.doStartTag();
    if (_jspx_th_c_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("http://placehold.it/350&text=Upload+Avatar");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty signInUser.avatar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_url_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_url_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_15.setPageContext(_jspx_page_context);
    _jspx_th_c_url_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_url_15.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/images/avatars/${signInUser.avatar.resId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_15 = _jspx_th_c_url_15.doStartTag();
    if (_jspx_th_c_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("http://placehold.it/100&text=Upload+Avatar");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_choose_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent(null);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty signInUser.avatar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_url_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_url_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_16.setPageContext(_jspx_page_context);
    _jspx_th_c_url_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_url_16.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/images/avatars/${signInUser.avatar.resId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_16 = _jspx_th_c_url_16.doStartTag();
    if (_jspx_th_c_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
    if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("http://placehold.it/60&text=Upload+Avatar");
        int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_3.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_3.setParent(null);
    int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
    if (_jspx_eval_c_choose_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_choose_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty signInUser.avatar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_url_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_url_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_17 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_17.setPageContext(_jspx_page_context);
    _jspx_th_c_url_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_c_url_17.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/images/avatars/${signInUser.avatar.resId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_17 = _jspx_th_c_url_17.doStartTag();
    if (_jspx_th_c_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_3.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    int _jspx_eval_c_otherwise_3 = _jspx_th_c_otherwise_3.doStartTag();
    if (_jspx_eval_c_otherwise_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("http://placehold.it/30&text=Upload+Avatar");
        int evalDoAfterBody = _jspx_th_c_otherwise_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
    return false;
  }

  private boolean _jspx_meth_c_url_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_18 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_18.setPageContext(_jspx_page_context);
    _jspx_th_c_url_18.setParent(null);
    _jspx_th_c_url_18.setValue("/setting/avatar");
    _jspx_th_c_url_18.setVar("ua_url");
    int _jspx_eval_c_url_18 = _jspx_th_c_url_18.doStartTag();
    if (_jspx_th_c_url_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_18);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_18);
    return false;
  }

  private boolean _jspx_meth_form_form_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_2 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_id_class_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_2.setPageContext(_jspx_page_context);
    _jspx_th_form_form_2.setParent(null);
    _jspx_th_form_form_2.setId("avatarChangeForm");
    _jspx_th_form_form_2.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ua_url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_form_2.setMethod("post");
    _jspx_th_form_form_2.setDynamicAttribute(null, "class", new String("form-horizontal mt-20 mb-0"));
    int[] _jspx_push_body_count_form_form_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_2 = _jspx_th_form_form_2.doStartTag();
      if (_jspx_eval_form_form_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t    \t\t<input type=\"hidden\" id=\"imageUrl\" name=\"imageUrl\"/>\r\n");
          out.write("\t    \t\t\t<input type=\"hidden\" id=\"x\" name=\"x\" />\r\n");
          out.write("\t\t\t\t\t<input type=\"hidden\" id=\"y\" name=\"y\" />\r\n");
          out.write("\t\t\t\t\t<input type=\"hidden\" id=\"w\" name=\"w\" />\r\n");
          out.write("\t\t\t\t\t<input type=\"hidden\" id=\"h\" name=\"h\" />\r\n");
          out.write("\t\t    \t\t<div class=\"form-actions\" style=\"margin-bottom: 0px;\">\r\n");
          out.write("\t\t    \t\t\t<div class=\"dis-i\">\r\n");
          out.write("\t\t\t\t\t\t    <button type=\"submit\" class=\"btn btn-large btn-primary\" data-loading-text=\"更新中...\">保存修改</button>\r\n");
          out.write("\t\t\t\t\t    \t<i class=\"icon-ok ml-10\" style=\"display:none;\"></i>\r\n");
          out.write("\t\t\t\t    \t</div>\r\n");
          out.write("\t\t\t\t    </div>\r\n");
          out.write("\t\t    \t");
          int evalDoAfterBody = _jspx_th_form_form_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_2.doFinally();
      _jspx_tagPool_form_form_method_id_class_action.reuse(_jspx_th_form_form_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_19 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_19.setPageContext(_jspx_page_context);
    _jspx_th_c_url_19.setParent(null);
    _jspx_th_c_url_19.setValue("/setting/changepwd");
    _jspx_th_c_url_19.setVar("cp_url");
    int _jspx_eval_c_url_19 = _jspx_th_c_url_19.doStartTag();
    if (_jspx_th_c_url_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_19);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_19);
    return false;
  }

  private boolean _jspx_meth_form_form_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_3 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_id_class_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_3.setPageContext(_jspx_page_context);
    _jspx_th_form_form_3.setParent(null);
    _jspx_th_form_form_3.setId("changePwdForm");
    _jspx_th_form_form_3.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cp_url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_form_3.setMethod("post");
    _jspx_th_form_form_3.setDynamicAttribute(null, "class", new String("form-horizontal mt-20 mb-0"));
    int[] _jspx_push_body_count_form_form_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_3 = _jspx_th_form_form_3.doStartTag();
      if (_jspx_eval_form_form_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-25 c-888\" for=\"inputOldPwd\">旧密码</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<input id=\"oldPwd\" autocomplete=\"off\" class=\"validate[required] input-xlarge\" type=\"password\" name=\"oldPwd\" \r\n");
          out.write("\t\t\t\t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\" value=\"\" style=\"height: 25px;\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-25 c-888\" for=\"inputNewPwd\">新密码</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<input id=\"newPwd\" autocomplete=\"off\" class=\"validate[required,minSize[6],maxSize[30]] input-xlarge\" type=\"password\" name=\"newPwd\" \r\n");
          out.write("\t\t\t\t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\" value=\"\" style=\"height: 25px;\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 30px;\">\r\n");
          out.write("\t\t    \t\t\t<label class=\"control-label fs-18 lh-25 c-888\" for=\"inputNewPwdRe\">确认新密码</label>\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<input id=\"newPwdRe\" autocomplete=\"off\" class=\"validate[required,equals[newPwd]] input-xlarge\" type=\"password\" name=\"newPwdRe\" \r\n");
          out.write("\t\t\t\t\t\t\t\tdata-prompt-position=\"centerRight:0,-4\" value=\"\" style=\"height: 25px;\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"form-actions\" style=\"margin-bottom: 0px;\">\r\n");
          out.write("\t\t    \t\t\t<div class=\"dis-i\">\r\n");
          out.write("\t\t\t\t\t\t    <button type=\"submit\" class=\"btn btn-large btn-primary\" data-loading-text=\"更新中...\">保存修改</button>\r\n");
          out.write("\t\t\t\t\t    \t<i class=\"icon-ok ml-10\" style=\"display:none;\"></i>\r\n");
          out.write("\t\t\t\t    \t</div>\r\n");
          out.write("\t\t\t\t    </div>\r\n");
          out.write("\t\t    \t");
          int evalDoAfterBody = _jspx_th_form_form_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_3.doFinally();
      _jspx_tagPool_form_form_method_id_class_action.reuse(_jspx_th_form_form_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_20 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_20.setPageContext(_jspx_page_context);
    _jspx_th_c_url_20.setParent(null);
    _jspx_th_c_url_20.setValue("/setting/binding");
    _jspx_th_c_url_20.setVar("bw_url");
    int _jspx_eval_c_url_20 = _jspx_th_c_url_20.doStartTag();
    if (_jspx_th_c_url_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_20);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_20);
    return false;
  }

  private boolean _jspx_meth_form_form_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_4 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_id_class_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_4.setPageContext(_jspx_page_context);
    _jspx_th_form_form_4.setParent(null);
    _jspx_th_form_form_4.setId("bindingForm");
    _jspx_th_form_form_4.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bw_url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_form_4.setMethod("post");
    _jspx_th_form_form_4.setDynamicAttribute(null, "class", new String("form-horizontal mt-10"));
    int[] _jspx_push_body_count_form_form_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_4 = _jspx_th_form_form_4.doStartTag();
      if (_jspx_eval_form_form_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 20px;\">\r\n");
          out.write("\t\t    \t\t\t<!-- <label class=\"control-label fs-18 lh-25 c-888\" for=\"inputName\">新浪微博</label>-->\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<!-- <button class=\"btn btn-large btn-danger\" data-toggle=\"button\" type=\"button\">绑定新浪微博</button>-->\r\n");
          out.write("\t\t\t\t\t\t\t<a class=\"btn-3rd weibo\" href=\"/oauth/weibo/signup/\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"logo_wrapper\"><span class=\"logo\"></span></div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<span>绑定微博帐号</span>\r\n");
          out.write("\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 20px;\">\r\n");
          out.write("\t\t    \t\t\t<!-- <label class=\"control-label fs-18 lh-25 c-888\" for=\"inputName\">腾讯QQ</label>  -->\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<!-- <button class=\"btn btn-large btn-info\" data-toggle=\"button\" type=\"button\">绑定人人网</button> -->\r\n");
          out.write("\t\t\t\t\t\t\t<a class=\"btn-3rd qq\" href=\"/oauth/weibo/signup/\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"logo_wrapper\"><span class=\"logo\"></span></div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<span>绑定QQ帐号</span>\r\n");
          out.write("\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\" style=\"margin-bottom: 20px;\">\r\n");
          out.write("\t\t    \t\t\t<!-- <label class=\"control-label fs-18 lh-25 c-888\" for=\"inputName\">豆瓣</label> -->\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<!-- <button class=\"btn btn-large btn-success\" data-toggle=\"button\" type=\"button\">绑定豆瓣</button>-->\r\n");
          out.write("\t\t\t\t\t\t\t<a class=\"btn-3rd douban\" href=\"/oauth/weibo/signup/\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"logo_wrapper\"><span class=\"logo\"></span></div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<span>绑定豆瓣帐号</span>\r\n");
          out.write("\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t\t<div class=\"control-group\">\r\n");
          out.write("\t\t    \t\t\t<!-- <label class=\"control-label fs-18 lh-25 c-888\" for=\"inputName\">腾讯微博</label> -->\r\n");
          out.write("\t\t    \t\t\t<div class=\"controls fs-16 lh-18\">\r\n");
          out.write("\t\t\t\t\t\t\t<!-- <button class=\"btn btn-large btn-primary\" data-toggle=\"button\" type=\"button\">绑定腾讯微博</button> -->\r\n");
          out.write("\t\t\t\t\t\t\t<a class=\"btn-3rd renren\" href=\"/oauth/weibo/signup/\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"logo_wrapper\"><span class=\"logo\"></span></div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<span>绑定人人帐号</span>\r\n");
          out.write("\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t    \t\t</div>\r\n");
          out.write("\t\t    \t");
          int evalDoAfterBody = _jspx_th_form_form_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_4.doFinally();
      _jspx_tagPool_form_form_method_id_class_action.reuse(_jspx_th_form_form_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_21 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_21.setPageContext(_jspx_page_context);
    _jspx_th_c_url_21.setParent(null);
    _jspx_th_c_url_21.setValue("/resources/js/bootstrap.js");
    int _jspx_eval_c_url_21 = _jspx_th_c_url_21.doStartTag();
    if (_jspx_th_c_url_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_21);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_21);
    return false;
  }

  private boolean _jspx_meth_c_url_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_22 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_22.setPageContext(_jspx_page_context);
    _jspx_th_c_url_22.setParent(null);
    _jspx_th_c_url_22.setValue("/resources/js/bootstrap-formhelpers-datepicker.en_US.js");
    int _jspx_eval_c_url_22 = _jspx_th_c_url_22.doStartTag();
    if (_jspx_th_c_url_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_22);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_22);
    return false;
  }

  private boolean _jspx_meth_c_url_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_23 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_23.setPageContext(_jspx_page_context);
    _jspx_th_c_url_23.setParent(null);
    _jspx_th_c_url_23.setValue("/resources/js/bootstrap-formhelpers-datepicker.js");
    int _jspx_eval_c_url_23 = _jspx_th_c_url_23.doStartTag();
    if (_jspx_th_c_url_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_23);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_23);
    return false;
  }

  private boolean _jspx_meth_c_url_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_24 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_24.setPageContext(_jspx_page_context);
    _jspx_th_c_url_24.setParent(null);
    _jspx_th_c_url_24.setValue("/resources/js/jquery-ui-1.8.18.custom.min.js");
    int _jspx_eval_c_url_24 = _jspx_th_c_url_24.doStartTag();
    if (_jspx_th_c_url_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_24);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_24);
    return false;
  }

  private boolean _jspx_meth_c_url_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_25 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_25.setPageContext(_jspx_page_context);
    _jspx_th_c_url_25.setParent(null);
    _jspx_th_c_url_25.setValue("/resources/js/jquery.scrollTo.js");
    int _jspx_eval_c_url_25 = _jspx_th_c_url_25.doStartTag();
    if (_jspx_th_c_url_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_25);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_25);
    return false;
  }

  private boolean _jspx_meth_c_url_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_26 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_26.setPageContext(_jspx_page_context);
    _jspx_th_c_url_26.setParent(null);
    _jspx_th_c_url_26.setValue("/resources/js/jquery.form.js");
    int _jspx_eval_c_url_26 = _jspx_th_c_url_26.doStartTag();
    if (_jspx_th_c_url_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_26);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_26);
    return false;
  }

  private boolean _jspx_meth_c_url_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_27 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_27.setPageContext(_jspx_page_context);
    _jspx_th_c_url_27.setParent(null);
    _jspx_th_c_url_27.setValue("/resources/js/jquery.Jcrop.js");
    int _jspx_eval_c_url_27 = _jspx_th_c_url_27.doStartTag();
    if (_jspx_th_c_url_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_27);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_27);
    return false;
  }

  private boolean _jspx_meth_c_url_28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_28 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_28.setPageContext(_jspx_page_context);
    _jspx_th_c_url_28.setParent(null);
    _jspx_th_c_url_28.setValue("/setting/basic/validate");
    int _jspx_eval_c_url_28 = _jspx_th_c_url_28.doStartTag();
    if (_jspx_th_c_url_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_28);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_28);
    return false;
  }

  private boolean _jspx_meth_c_url_29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_29 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_29.setPageContext(_jspx_page_context);
    _jspx_th_c_url_29.setParent(null);
    _jspx_th_c_url_29.setValue("/setting/specific/validate");
    int _jspx_eval_c_url_29 = _jspx_th_c_url_29.doStartTag();
    if (_jspx_th_c_url_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_29);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_29);
    return false;
  }

  private boolean _jspx_meth_c_url_30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_30 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_30.setPageContext(_jspx_page_context);
    _jspx_th_c_url_30.setParent(null);
    _jspx_th_c_url_30.setValue("/setting/changepwd/validate");
    int _jspx_eval_c_url_30 = _jspx_th_c_url_30.doStartTag();
    if (_jspx_th_c_url_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_30);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_30);
    return false;
  }

  private boolean _jspx_meth_c_url_31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_31 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_31.setPageContext(_jspx_page_context);
    _jspx_th_c_url_31.setParent(null);
    _jspx_th_c_url_31.setValue("/resources/js/ga.js");
    int _jspx_eval_c_url_31 = _jspx_th_c_url_31.doStartTag();
    if (_jspx_th_c_url_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_31);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_31);
    return false;
  }
}
