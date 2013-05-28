package org.apache.jsp.WEB_002dINF.views.comp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class city_picker_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.domId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"city-picker dropdown-menu comp-container\">\r\n");
      out.write("\t<h4 class=\"departures_title\">从下列城市选择</h4>\r\n");
      out.write("\t<h5>热门城市</h5>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"quanguo\">全国</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"beijing\">北京</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"shanghai\">上海</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"guangzhou\">广州</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"shenzhen\">深圳</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"nanjing\">南京</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"hangzhou\">杭州</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"chengdu\">成都</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"xiamen\">厦门</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"wuhan\">武汉</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"qingdao\">青岛</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"tianjin\">天津</a>\r\n");
      out.write("\t<h5 class=\"dotline\">省会城市</h5>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"shenyang\">沈阳</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"changchun\">长春</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"changsha\">长沙</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"fuzhou\">福州</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"guiyang\">贵阳</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"hefei\">合肥</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"haikou\">海口</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"jinan\">济南</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"kunming\">昆明</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"lasa\">拉萨</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"lanzhou\">兰州</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"nanchang\">南昌</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"nanning\">南宁</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"taiyuan\">太原</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"xian\">西安</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"xining\">西宁</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"yinchuan\">银川</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"zhengzhou\">郑州</a>\r\n");
      out.write("\t<br clear=\"all\">\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"haerbin\">哈尔滨</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"shijiazhuang\">石家庄</a>\r\n");
      out.write("\t<a class=\"widthfix\" href=\"javascript:void(0);\" title=\"huhehaote\">呼和浩特</a>\r\n");
      out.write("\t<a class=\"widthfix\" href=\"javascript:void(0);\" title=\"wulumuqi\">乌鲁木齐</a>\r\n");
      out.write("\t<h5 class=\"dotline\">其它城市</h5>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"baotou\">包头</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"chongqing\">重庆</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"changzhou\">常州</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"dalian\">大连</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"dongguan\">东莞</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"foshan\">佛山</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"jiangmen\">江门</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"kashi\">喀什</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"mianyang\">绵阳</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"ningbo\">宁波</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"quanzhou\">泉州</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"sanya\">三亚</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"shantou\">汕头</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"suzhou\">苏州</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"taizhou\">台州</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"weihai\">威海</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"wuxi\">无锡</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"wenzhou\">温州</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"xichang\">西昌</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"xuzhou\">徐州</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"yuncheng\">运城</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"yanji\">延吉</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"yulin\">榆林</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"yantai\">烟台</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"yiwu\">义乌</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"zhongshan\">中山</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"zhuhai\">珠海</a>\r\n");
      out.write("\t<a href=\"javascript:void(0);\" title=\"hailaer\">海拉尔</a>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.domId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" a').click(function(){\r\n");
      out.write("\t\t\tvar pinyin = $(this).attr('title').toLowerCase();\r\n");
      out.write("\t\t\tvar label = $(this).text();\r\n");
      out.write("\t\t /* var w_href = window.location.href;\r\n");
      out.write("\t\t\tvar base_url = '");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("', url;\r\n");
      out.write("\t\t\tvar map_idx = w_href.indexOf('/map');\r\n");
      out.write("\t\t\tif(map_idx==-1){\r\n");
      out.write("\t\t\t\turl = base_url;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\turl = w_href.substring(0, map_idx +4);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(url.charAt(url.length-1) != '/'){\r\n");
      out.write("\t\t\t\turl += '/';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\turl += pinyin;\r\n");
      out.write("\t\t\twindow.location.href = url; */\r\n");
      out.write("\t\t\t$(this).parent().trigger('city-click',[pinyin, label]);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.domId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("').bind('city-open', function(e, pinyin){\r\n");
      out.write("\t\t\t$(this).find('a.active').removeClass('active');\r\n");
      out.write("\t\t\t$(this).find('a[title='+pinyin+']').addClass('active');\r\n");
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
    _jspx_th_c_url_0.setValue("/");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
