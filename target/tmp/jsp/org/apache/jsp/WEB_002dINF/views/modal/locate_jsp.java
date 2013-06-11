package org.apache.jsp.WEB_002dINF.views.modal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class locate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_errors_path_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_modelAttribute_method_id_cssClass_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_errors_path_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_modelAttribute_method_id_cssClass_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_var_value_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_form_errors_path_cssClass_nobody.release();
    _jspx_tagPool_form_form_modelAttribute_method_id_cssClass_action.release();
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
      out.write("<div id=\"place-locate-modal\" class=\"modal hide\" \r\n");
      out.write("\t\tstyle=\"\">\r\n");
      out.write("\t");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_modelAttribute_method_id_cssClass_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_form_0.setPageContext(_jspx_page_context);
      _jspx_th_form_form_0.setParent(null);
      _jspx_th_form_form_0.setId("create-place-form");
      _jspx_th_form_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cpf_url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_form_form_0.setCssClass("sign-in");
      _jspx_th_form_form_0.setModelAttribute("placeCreationVo");
      _jspx_th_form_form_0.setMethod("post");
      int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
        if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t<div class=\"modal-header\">\r\n");
            out.write("\t\t<a class=\"close\" data-dismiss=\"modal\">×</a>\r\n");
            out.write("\t\t<h3>地址定位</h3>\r\n");
            out.write("\t</div>\r\n");
            out.write("\t<div class=\"modal-body upload\">\r\n");
            out.write("\t\t<div id=\"place-locate-map\" style=\"width: 530px; height: 220px\"></div>\r\n");
            out.write("\t\t<div class=\"\">\r\n");
            out.write("\t\t\t\t<input id=\"place-id-modal-hid\" type=\"hidden\" />\r\n");
            out.write("\t\t\t\t<input id=\"place-address-nation-hid\" name=\"address[nation]\" type=\"hidden\" />\r\n");
            out.write("\t\t\t\t<input id=\"place-address-province-hid\" name=\"address[province]\" type=\"hidden\" />\r\n");
            out.write("\t\t\t\t<input id=\"place-address-city-hid\" name=\"address[city]\" type=\"hidden\" />\r\n");
            out.write("\t\t\t\t<input id=\"place-address-district-hid\" name=\"address[district]\" type=\"hidden\" />\r\n");
            out.write("\t\t\t\t<input id=\"place-address-street-hid\" name=\"address[street]\" type=\"hidden\" />\r\n");
            out.write("\t\t\t\t<input id=\"place-address-zipCode-hid\" name=\"address[zipCode]\" type=\"hidden\" />\r\n");
            out.write("\t\t\t\t<div class=\"row-fluid mt-10\">\r\n");
            out.write("\t\t\t\t\t<input class=\"span10\" id=\"place-full-addr\" name=\"fullAddr\" type=\"text\" \r\n");
            out.write("\t\t\t\t\t\tplaceholder=\"拖动上方图钉,自动获得地址\" autocomplete=\"off\" />\r\n");
            out.write("\t\t\t\t\t<div class=\"span2 offset1\">\r\n");
            out.write("\t\t\t\t\t\t");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
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
            out.write("\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t<div class=\"row-fluid\">\r\n");
            out.write("\t\t\t\t\t<input class=\"span10\" id=\"place-lng-lat\" name=\"lngLat\" type=\"text\" \r\n");
            out.write("\t\t\t\t\t\tplaceholder=\"拖动上方图钉,自动获得经纬度\" autocomplete=\"off\" />\r\n");
            out.write("\t\t\t\t\t<div class=\"span1 offset1\">\r\n");
            out.write("\t\t\t\t\t\t");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_1.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_1.setPath("lngLat");
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
            out.write("\t\t\t\t</div>\r\n");
            out.write("\t\t</div>\r\n");
            out.write("\t</div>\r\n");
            out.write("\t<div class=\"modal-footer\">\r\n");
            out.write("\t\t<input type=\"submit\" class=\"btn btn-primary btn-large\" value=\"确定\"></input>\r\n");
            out.write("\t</div>\r\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_form_0.doFinally();
        _jspx_tagPool_form_form_modelAttribute_method_id_cssClass_action.reuse(_jspx_th_form_form_0);
      }
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://maps.google.com/maps/api/js?sensor=false&language=zh_cn&region=CN\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('#place-locate-modal').on('shown', function () {\r\n");
      out.write("\t\t\tvar locateObj = window.getLocateObj();\r\n");
      out.write("\t\t\tif(locateObj){\r\n");
      out.write("\t\t\t\t$('#place-full-addr').val(locateObj.fullAddr);\r\n");
      out.write("\t\t\t\t$('#place-lng-lat').val(locateObj.lngLat);\r\n");
      out.write("\t\t\t\t$('#place-id-modal-hid').val(locateObj.placeId);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar map = $('#place-locate-map').gmap3('get');\r\n");
      out.write("\t\t\tif(!map){\r\n");
      out.write("\t\t\t\t// initialize google map\r\n");
      out.write("\t\t\t\t$.getJSON( '");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("', function(data){\r\n");
      out.write("\t\t\t\t\tif(data && data.resultData){\r\n");
      out.write("\t\t\t\t\t\tvar cityMeta = data.resultData;\r\n");
      out.write("\t\t\t\t\t\t$('#place-locate-map').gmap3({\r\n");
      out.write("\t\t\t\t\t\t\taction: 'init',\r\n");
      out.write("\t\t\t\t\t\t\toptions:{\r\n");
      out.write("\t\t\t\t\t\t\t\tcenter: [cityMeta.lngLat[1], cityMeta.lngLat[0]],\r\n");
      out.write("\t\t\t\t\t\t\t\tzoom: cityMeta.zoom,\r\n");
      out.write("\t\t\t\t\t\t\t\tscrollwheel: true,\r\n");
      out.write("\t\t\t\t\t\t\t\tmapTypeId: google.maps.MapTypeId.ROADMAP,\r\n");
      out.write("\t\t\t\t\t\t\t\tmapTypeControl: false,\r\n");
      out.write("\t\t\t\t\t\t\t\tzoomControl: true,\r\n");
      out.write("\t\t\t\t\t\t\t\tzoomControlOptions: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle : google.maps.ZoomControlStyle.SMALL,\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tstreetViewControl: false\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\tevents: {\r\n");
      out.write("\t\t\t\t\t\t\t\tzoom_changed: function(zoom){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar marker = $(this).gmap3({action:'get',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname:'marker', first: true});\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(!marker ) return;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(this).gmap3({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\taction: 'panTo',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\targs: [marker.getPosition()]\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\tcallback: function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#place-lng-lat').data('latLng', [cityMeta.lngLat[1],cityMeta.lngLat[0]]);\r\n");
      out.write("\t\t\t\t\t\t\t\tlocate($('#place-full-addr').val());\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tlocate($('#place-full-addr').val());\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction locate(address){\r\n");
      out.write("\t\t\t// clear marker first\r\n");
      out.write("\t\t\t$('#place-locate-map').gmap3({\r\n");
      out.write("\t\t\t\taction: 'clear',\r\n");
      out.write("\t\t\t\tname: ['marker']\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tvar latLng = $('#place-lng-lat').data('latLng');\r\n");
      out.write("\t\t\tif($.trim(address) != ''){\r\n");
      out.write("\t\t\t\t// firstly, get geometry from address\r\n");
      out.write("\t\t\t\t$('#place-locate-map').gmap3({\r\n");
      out.write("\t\t\t\t\taction: 'getLatLng',\r\n");
      out.write("\t\t\t\t\taddress: $.trim(address),\r\n");
      out.write("\t\t\t\t\tcallback: function(results){\r\n");
      out.write("\t\t\t\t\t\taddMarker($(this), [results[0].geometry.location.lat(),\r\n");
      out.write("\t\t\t\t\t\t\t\tresults[0].geometry.location.lng()]);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}else if(latLng){\r\n");
      out.write("\t\t\t\taddMarker($('#place-locate-map'), latLng);\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction addMarker($this, latLng){\r\n");
      out.write("\t\t\t// add marker\r\n");
      out.write("\t\t\t$this.gmap3({\r\n");
      out.write("\t\t\t\taction: 'addMarker',\r\n");
      out.write("\t\t\t\tlatLng: latLng,\r\n");
      out.write("\t\t\t\tmarker: {\r\n");
      out.write("\t\t\t\t\toptions:{\r\n");
      out.write("\t\t\t\t\t\tdraggable: true,\r\n");
      out.write("\t\t\t\t\t\tanimation: google.maps.Animation.DROP,\r\n");
      out.write("\t\t\t\t\t\ticon: '");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("'\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tevents:{\r\n");
      out.write("\t\t\t\t\t\t// track latlng\r\n");
      out.write("\t\t\t\t\t\tdrag: function(marker, event, data){\r\n");
      out.write("\t\t\t\t\t\t\t$('#place-lng-lat').val(event.latLng.lng()+\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\",\"+event.latLng.lat());\r\n");
      out.write("\t\t\t\t\t\t\t$('#place-lng-lat').data('latLng', [event.latLng.lat(),\r\n");
      out.write("\t\t\t\t\t\t\t\t\tevent.latLng.lng()]);\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t// get address\r\n");
      out.write("\t\t\t\t\t\tdragend: function(marker, event, data){\r\n");
      out.write("\t\t\t\t\t\t\t$(this).gmap3({\r\n");
      out.write("\t\t\t\t\t\t\t\taction: 'getAddress',\r\n");
      out.write("\t\t\t\t\t\t\t\tlatLng: marker.getPosition(),\r\n");
      out.write("\t\t\t\t\t\t\t\tcallback:function(results){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#place-full-addr').val(results[0]\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.formatted_address);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#place-id-modal-hid').val('');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#place-full-addr').data('address', \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tformatAddress(results[0]));\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction formatAddress(geocoderResult){\r\n");
      out.write("\t\t\tvar address = {};\r\n");
      out.write("\t\t\tvar addr_components = geocoderResult.address_components,\r\n");
      out.write("\t\t\taddr_component, types;\r\n");
      out.write("\t\t\tfor(var i=addr_components.length-1; i>=0; i--){\r\n");
      out.write("\t\t\t\taddr_component = addr_components[i];\r\n");
      out.write("\t\t\t\ttypes = addr_component.types.join(',');\r\n");
      out.write("\t\t\t\tif(types.indexOf('postal_code')!=-1){\r\n");
      out.write("\t\t\t\t\taddress.zipCode = addr_component.long_name;\r\n");
      out.write("\t\t\t\t\t$('#place-address-zipCode-hid').val(addr_component.long_name);\r\n");
      out.write("\t\t\t\t}else if(types.indexOf('country')!=-1){\r\n");
      out.write("\t\t\t\t\taddress.nation = addr_component.long_name;\r\n");
      out.write("\t\t\t\t\t$('#place-address-nation-hid').val(addr_component.long_name);\r\n");
      out.write("\t\t\t\t}else if(types.indexOf('administrative_area_level_1')!=-1){\r\n");
      out.write("\t\t\t\t\taddress.province = addr_component.long_name;\r\n");
      out.write("\t\t\t\t\t$('#place-address-province-hid').val(addr_component.long_name);\r\n");
      out.write("\t\t\t\t}else if(types.indexOf('sublocality')!=-1){\r\n");
      out.write("\t\t\t\t\taddress.district = addr_component.long_name;\r\n");
      out.write("\t\t\t\t\t$('#place-address-district-hid').val(addr_component.long_name);\r\n");
      out.write("\t\t\t\t}else if(types.indexOf('locality')!=-1){\r\n");
      out.write("\t\t\t\t\taddress.city = addr_component.long_name;\r\n");
      out.write("\t\t\t\t\t$('#place-address-city-hid').val(addr_component.long_name);\r\n");
      out.write("\t\t\t\t}else if(types.indexOf('route')!=-1){\r\n");
      out.write("\t\t\t\t\taddress.street = addr_component.long_name;\r\n");
      out.write("\t\t\t\t\t$('#place-address-street-hid').val(addr_component.long_name);\r\n");
      out.write("\t\t\t\t}else if(types.indexOf('street_number')!=-1){\r\n");
      out.write("\t\t\t\t\taddress.street = address.street + addr_component.long_name;\r\n");
      out.write("\t\t\t\t\t$('#place-address-street-hid').val($('#place-address-street-hid').val()\r\n");
      out.write("\t\t\t\t\t\t\t+ addr_component.long_name);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t;//other ignore\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn address;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#create-place-form').ajaxForm({ \r\n");
      out.write("\t        dataType:  'json', \r\n");
      out.write("\t        beforeSubmit: function(formData, jqForm, options){\r\n");
      out.write("\t        \tvar placeId = $('#place-id-modal-hid').val();\r\n");
      out.write("\t        \tif(placeId){\r\n");
      out.write("\t        \t\t$('#place-locate-modal').modal('hide');\r\n");
      out.write("\t        \t\treturn false;\r\n");
      out.write("\t        \t}\r\n");
      out.write("\t        },\r\n");
      out.write("\t        success:  function(data){\r\n");
      out.write("\t        \tif(!data || data.resultCode != 'SUCCESS' ) return;\r\n");
      out.write("\t        \t$('#place-locate-modal').modal('hide');\r\n");
      out.write("\t        \twindow.locateCallback(data.resultData);\r\n");
      out.write("\t        },\r\n");
      out.write("\t        complete: function(jqXHR, textStatus){\r\n");
      out.write("          \t\t\r\n");
      out.write("          \t}\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/*$('#place-locate-modal .btn-primary').click(function(){\r\n");
      out.write("\t\t\t$('#create-place-form').ajaxSubmit();\r\n");
      out.write("\t\t});*/\r\n");
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
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/places/create");
    _jspx_th_c_url_0.setVar("cpf_url");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
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
    _jspx_th_c_url_1.setValue("/resources/js/gmap3.js");
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
    _jspx_th_c_url_2.setValue("/citymeta/");
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
    _jspx_th_c_url_3.setValue("/resources/img/map_pin.png");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }
}
