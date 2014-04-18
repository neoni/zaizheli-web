<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <div class="container">
                <div class="navbar navbar-fixed-top">
                    <div class="navbar-inner">
                        <div class="container">
                            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"></a>
                             <div><a class="brand"  href="<c:url value="/" />" ><img height="28" src="<c:url value="/resources/img/logo4.png" />">
                              <span class="label label-info p-0 fs-9 va-6 lh-14 ta-c">
                                 <span class="version">Beta</span> 
                                <i class="icon-home icon-white w-15 ml-5"></i>
                              </span></div>
                            </a>
                             
                            <div> </div>
                            <ul class="nav">
                              <li id="nav-profiles">
                                <a href="<c:url value="/profiles" />">这里的人</a>
                              </li>
                              <li id="nav-create">
                                <a href="<c:url value="/activities/create" />">晒活动</a>
                              </li>
                              <li id="nav-apps">
                                <a href="<c:url value="/apps" />" title="在浙里移动客户端">在浙里移动客户端</a>
                              </li>
                            </ul>
                        <c:choose> 
                          <c:when test="${empty signInUser}">                 
                            <ul class="nav pull-right">
                              <li><a class="md-trigger" data-modal="modal-an">公告</a></li>
                              <li><a class="md-trigger" data-modal="modal-fb">反馈</a></li>
                              <li class="divider-vertical"></li>
                                <li>
                                    <a data-toggle="modal" href="<c:url value="/signin" />">登录</a>
                                </li>
                                <li>
                                    <a href="<c:url value="/signup" />">注册</a>
                                </li>
                                <li><a href="<c:url value="/about" />">关于</a></li>
                            </ul>
                          </c:when>
                            <c:otherwise>
                              <ul class="nav pull-right">
                                 <li><a class="md-trigger" data-modal="modal-an">公告</a></li>
                                <li><a class="md-trigger" data-modal="modal-fb">反馈</a></li>
                              

                                <li class="divider-vertical"></li>
                                
                                <li class="dropdown">
                                  <a class="dropdown-toggle" data-toggle="dropdown" href="#" >
                                    消息<span id="messages" act="<c:url value="/message/get" />" ></span>
                                    <b class="caret"></b>
                                  </a>
                                  <ul class="dropdown-menu">                   
                                    <li><a href="<c:url value="/message/pm" />">查看私信<span id="messages_p" act="<c:url value="/message/pm/get" />" class="pts_b"></span></a></li>
                                    <li><a href="<c:url value="/message/inform" />">查看通知<span id="messages_i" act="<c:url value="/message/inform/get" />" class="pts_b"></span></a></li>
                                    <li><a href="<c:url value="/message/atme" />">查看@我<span id="messages_a" act="<c:url value="/message/at/get" />" class="pts_b"></span></a></li>
                                  </ul>
                                </li>
                                <li class="dropdown">
                                  <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                    账号
                                    <b class="caret"></b>
                                  </a>
                                  <ul class="dropdown-menu">
                                    <li><a href="<c:url value="/dashboard" />">我的关注</a></li>
                                    <li><a href="<c:url value="/profiles/${signInUser.id}" />">我在这里</a></li>
                                    <li><a href="<c:url value="/setting" />">账号设置</a></li>
                                    <li class="divider"></li>
                                    <li><a href="<c:url value="/signout" />">退出登录</a></li>
                                  </ul>
                                </li>
                                <li><a href="<c:url value="/about" />">关于</a></li>
                              </ul>
                              <script type="text/javascript">
                                $(function () {  
                                    SetMessages();
                                    SetMessagesP();
                                    SetMessagesI();
                                    SetMessagesA();
                                    setInterval("SetMessages()", 3000); //每隔3秒刷新消息数
                                    setInterval("SetMessagesP()", 3000); //每隔3秒刷新消息数  
                                    setInterval("SetMessagesI()", 3000); //每隔3秒刷新消息数  
                                    setInterval("SetMessagesA()", 3000); //每隔3秒刷新消息数  
                                });  
                                function SetMessages() { //获取最新消息数   
                                     var mes_url = $('#messages').attr('act');    
                                    $.getJSON(mes_url, function(data){
                                      if(data && data.resultCode == 'SUCCESS'){
                                        if(data.exceptionMsg == '0') {
                                          $('#messages').removeClass('pts');
                                          $('#messages').text(''); 
                                        }
                                        else {
                                          $('#messages').addClass('pts');
                                          $('#messages').text(data.exceptionMsg); 
                                        }
                                      } 
                                    });     
                                } 
                                function SetMessagesP() { //获取最新消息数   
                                    var p_url = $('#messages_p').attr('act');    
                                    $.getJSON(p_url, function(data){
                                      if(data && data.resultCode == 'SUCCESS'){
                                        if(data.exceptionMsg == '0') {
                                          $('#messages_p').text(''); 
                                        }
                                        else {
                                          $('#messages_p').text(data.exceptionMsg); 
                                        }
                                      } 
                                    });     
                                }
                                function SetMessagesI() { //获取最新消息数 
                                    var i_url = $('#messages_i').attr('act');      
                                    $.getJSON(i_url, function(data){
                                      if(data && data.resultCode == 'SUCCESS'){
                                        if(data.exceptionMsg == '0') {
                                          $('#messages_i').text(''); 
                                        }
                                        else {
                                          $('#messages_i').text(data.exceptionMsg); 
                                        }
                                      } 
                                    });     
                                }
                                function SetMessagesA() { //获取最新消息数       
                                    var a_url = $('#messages_a').attr('act');   
                                    $.getJSON(a_url, function(data){
                                      if(data && data.resultCode == 'SUCCESS'){
                                        if(data.exceptionMsg == '0') {
                                          $('#messages_a').text(''); 
                                        }
                                        else {
                                          $('#messages_a').text(data.exceptionMsg); 
                                        }
                                      } 
                                    });     
                                } 
                              </script>
                            </c:otherwise> 
                          </c:choose>
                        </div>
                    </div>
                </div>
                <ul id="header-hiddens" class="dis-n">
                  <li><input name="signin-ts" type="hidden" value="${requestScope.signin_ts}"/></li>
                </ul>
        </div>

    
    
       
    <script type="text/javascript">
  function adjustWebWidth(){
    var web_width = $(window).width()-50;
    var pin_h_count = Math.max(4,Math.floor((web_width - 15)/237)); 
    web_width = pin_h_count*237-15;
    $('.content-wrapper').each(function(){
      var padding_left = $(this).css('padding-left');
      var padding_right = $(this).css('padding-right');
      var padding = 0, pl, pr;
      if($.trim(padding_left).length >1){
        pl = parseFloat(padding_left.substring(0, padding_left.length-2));
        if(!isNaN(pl)){
          padding += pl;
        }
      }
      if($.trim(padding_right).length>2){
        pr = parseFloat(padding_right.substring(0, padding_right.length-2));
        if(!isNaN(pr)){
          padding += pr;
        }
      }
      $(this).css('width', web_width-padding+'px');
    });
  }
  function noNeedAdjustWebWidth(noNeed){
    if(noNeed != 'true'){
      $(document).ready(function() {
        $(window).resize(adjustWebWidth);
      });
    }
  }
  function setHeaderTab(tab){
    $('ul.nav li').removeClass('active');
    $('ul.nav li#nav-' + tab).addClass('active');
  }
  $('#geo-city-picker a').click(function(){
    var city = $(this).attr('title').toLowerCase();
    op.city_picker_geo_callback(city);
  });
  noNeedAdjustWebWidth('${param.noNeed}')
  setHeaderTab('${param.tab}');
  $('.brand').find('.icon-home').hide();
  $('.brand').mouseenter(function(){
    $(this).find('.version').hide();
    $(this).find('.icon-home').show();
  });
  $('.brand').mouseleave(function(){
    $(this).find('.version').show();
    $(this).find('.icon-home').hide();
  });

  $("#form-feedback").validationEngine('attach', {
    promptPosition : "bottomRight", 
    scroll: false 
  });
  $(function(){
      $('#fb-send').click(function(){
        $('#form-feedback').ajaxForm({ 
            dataType:  'json', 
            success: function(data){
              if(!data) return;
              if(data && data.resultCode == 'Exception'){
                    alert("发送失败了~再发一次吧");
              }
              if(data && data.resultCode == 'SUCCESS'){
                  $("button[type=reset]").trigger("click");
                  $('#fb-close').trigger('click');
              }
            }
        });    
      })
  });
</script>
