<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE>
<html class="app_v">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>在浙里 在浙里——分享你我的社交</title>
	<link rel="SHORTCUT ICON" href= "<c:url value="/resources/img/head-logo.png" />" /> 
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-base.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-theme.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery.pnotify.default.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery-ui-1.8.18.custom.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery.pnotify.zaizheli.css" />" />
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.1.7.1.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.init.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.op.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/bootstrapx-popoverx.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-ui-1.8.18.custom.min.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.form.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.pnotify.js" />" ></script>
		
<style type="text/css">
.offset4 {
  margin-left: 350px;
}
input.span4 {
  margin-left: 20px;
  width: 330px;
}

.span0 {
  margin-left: 20px;
  width: 330px;
}
input.span5 {
  margin-left: 20px;
  width: 330px;
  height: 80px;
}

input,
textarea,
.uneditable-input {
  width: 330px;
}

input[disabled], input[readonly], textarea[disabled], textarea[readonly] {
background-color: #EAEDED;
border-color: transparent;
color: #CAD2D3;
cursor: default;
}

textarea, input[type=text], input[type=password], input[type=datetime], input[type=datetime-local], input[type=date], input[type=month], input[type=time], input[type=week], input[type=number], input[type=email], input[type=url], input[type=search], input[type=tel], input[type=color], .uneditable-input {
  background-color: #ffffff;
  border: 1px solid #cccccc;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
     -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
          box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
  -webkit-transition: border linear 0.2s, box-shadow linear 0.2s;
     -moz-transition: border linear 0.2s, box-shadow linear 0.2s;
       -o-transition: border linear 0.2s, box-shadow linear 0.2s;
          transition: border linear 0.2s, box-shadow linear 0.2s;
}

textarea:focus, input[type=text]:focus, input[type=password]:focus, input[type=datetime]:focus, input[type=datetime-local]:focus, input[type=date]:focus, input[type=month]:focus, input[type=time]:focus, input[type=week]:focus, input[type=number]:focus, input[type=email]:focus, input[type=url]:focus, input[type=search]:focus, input[type=tel]:focus, input[type=color]:focus, .uneditable-input:focus {
  border-color: #ffc554;
  outline: 0;
  outline: thin dotted \9;
  /* IE6-9 */

  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 8px rgba(82, 168, 236, 0.6);
     -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 8px rgba(82, 168, 236, 0.6);
          box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 8px rgba(82, 168, 236, 0.6);
      }


</style>	
	
</head>

<body >
	<jsp:include page="/WEB-INF/views/comp/header.jsp">
		<jsp:param name="tab" value="none"/>
	</jsp:include>
    <div id="app_v" class="container">
		<div><img style="margin-left:290px; margin-top:75px;" src="<c:url value="/resources/img/app_own.png" />"></div>
		<div  class="row mt-30" style="margin-top: 15px;" >
			<div class="span8 offset4 mt-20" style="width: 569px">	
					<div class="app_in control-group">
					昵称
				       <span class="app_uneditable-input" style="margin-left:40px; ">${application.applicant.name}</span></div>
					   
					<div class="control-group app_in" >
					性别
					<span class="app_uneditable-input" style="margin-left:40px; ">${application.applicant.gender}</span></div>	
					
					<div class="control-group app_in">
					邮箱
					<span class="app_uneditable-input" style="margin-left:40px; ">${application.applicant.email}</span></div>	
					
					<c:if test="${activity.realNameReq eq true}">
					<div class="control-group app_in" style="margin-bottom: 40px; ">
					姓名
					<span class="app_uneditable-input" style="margin-left:40px;">${application.realName}</span></div>
					</c:if>
					
					<c:if test="${activity.ageReq eq true}" >
					<div class="control-group app_in" style="margin-bottom: 10px; ">
					年龄
					<span class="app_uneditable-input" style="margin-left:40px;">${application.age}</span></div>
					</c:if>
					
					<c:if test="${activity.birthdayReq eq true}">
					<div class="control-group app_in" style="margin-bottom: 10px;">
					生日
					<span class="app_uneditable-input" style="margin-left:40px;">${application.birthday}</span></div>
					</c:if>
					
					<c:if test="${activity.telReq eq true}">
					<div class="control-group app_in" style="margin-bottom: 10px;">
					电话
					<span class="app_uneditable-input" style="margin-left:40px;">${application.tel}</span></div>
					</c:if>
					
					<c:if test="${activity.schoolReq eq true}">					
					<div class="app_in control-group" style="margin-bottom: 10px;">
					学校
					<span class="app_uneditable-input" style="margin-left:40px">${application.school}</span></div>
					</c:if>
					
					<c:if test="${activity.addressReq eq true}">
					<div class="control-group app_in" style="margin-bottom: 10px;">
					地址
					<span class="app_uneditable-input" style="margin-left:40px;">${application.address}</span></div>
					</c:if>
					
					<c:if test="${activity.noteReq eq true}">
					<div class="control-group app_in" style="margin-bottom: 10px;">
					Ta的话
					<span style="margin-left:25px">${application.note}</span></div>
					</c:if>	
					
					<c:choose>
					<c:when test="${application.status eq '申请中'}">
					<div style="margin-left:75px; margin-top:28px;">			    
						<a  id="a_agree" class=" btn btn-ora" act="<c:url value="/application/${application.id}/agree" />" onclick="op.application_agree(event.currentTarget); event.preventDefault();" re="<c:url value="/activity/${application.activity.id}/applications"/>">
								同意</a>
						<a  id="a_refuse" class="btn btn-info ml-10" act="<c:url value="/application/${application.id}/refuse" />" onclick="op.application_refuse(event.currentTarget); event.preventDefault();" re="<c:url value="/activity/${application.activity.id}/applications"/>">拒绝</a>
					</div>	
					</c:when>
					<c:when test="${application.status eq '已加入'}">
					<div style="margin-left:200px; margin-top:28px;">			    
						<a  id="a_kickout" class="btn btn-inverse ml-10" act="<c:url value="/application/${application.id}/kickout" />" onclick="op.application_kickout(event.currentTarget); event.preventDefault();" re="<c:url value="/activity/${application.activity.id}/applications"/>">踢出此活动</a>
						<a  class="btn ml-10" href="<c:url value="/activity/${application.activity.id}/applications"/>">返回</a>	
					</div>	
					</c:when>
					<c:otherwise>
						<a  class="btn" style="margin-left:240px" href="<c:url value="/activity/${application.activity.id}/applications"/>">返回</a>
					</c:otherwise>
					</c:choose>
			</div>
		</div>
	</div>
	<div class="md-modal md-effect-4" id="modal-fb" >
      <div class="md-content">
        <h3><img src="<c:url value="/resources/img/w_logo.png" />"></h3>
        <div>
          <p style="font-size:16px;letter-spacing:0.25em">感谢您对"在浙里"的支持！希望能得到您的反馈与建议，愿意与我们进行长期交流沟通，可留下您的邮箱。</p>
          <br>
          <form id="form-feedback" modelAttribute="FBVo" method="post" action="<c:url value="/feedback/create" />">
            <div>
              <label for="ipt-fdbc-mail" style="float:left;font-size:16px">邮箱</label>
              <input type="email" style="margin-left:20px;height:25px;width:88%" name="fb_mail" id="fb_mail">
            </div>
            <br>
            <div>
              <label for="ipt-fdbc-content" style="float:left;font-size:16px">意见</label>
              <textarea class="validate[required]" style="margin-left:20px;width:88%" name="fb_content" rows="3" cols="20" id="fb_content"></textarea>
            </div>
            <br>
            <button type="submit" class="btn-ora btn-large" style="padding:7px 12px" id="fb-send">通知我吧</button>
            <button type="reset" style="display:none"></button>
            <button id="fb-close" class="md-close btn-ora" style="display:none"></button>
          </form>
          
        </div>
      </div>
    </div>
    <div class="md-modal md-effect-4" id="modal-an">
      <div class="md-content">
        <h3><img src="<c:url value="/resources/img/w_logo.png" />"></h3>
        <div>
          <ul style="font-family:'Microsoft Jhenghei';line-height: 1.7em;">
            <li><strong >目的：</strong>大家可以在"在浙里"发布自己的活动，来组织一个自己的活动或寻找志同道合的小伙伴。</li>
            <li><strong>布局：</strong>在首页的搜索框的右边，大家可以在热门活动、瀑布布局、地图布局三者之前切换寻找最有效的查询活动的方式；
            还可直接按在任意空白处按<span style="background-color:#FFA41D;padding:2">Ctrl</span>进行切换。</li>
            <li><strong>使用：</strong>发布活动可分为有申请表和无申请表；是否通过将由创建者决定；可在活动中发表评论、@、上传活动图片至活动图库；可对活动、用户进行关注、追踪、私信；可提前在账号设置中设置好自己的申请表信息。</li>
            <li><strong>浏览：</strong>使用 firefox 或 chrome 最新版本浏览会得到最棒的享受哦。</li>
            <li><strong>收藏：</strong>大家可以通过<span style="background-color:#FFA41D;padding:2">Ctrl + D</span>来收藏网站哦。</li>
            <li><strong>有你：</strong>希望大家都能上传一个自己特色的头像，让我们的'在浙里'因你更加美丽。</li>
          </ul>
          
          <button type="submit" class="md-close btn-ora btn-large" style="padding:7px 12px">恩恩，了解了</button>
        </div>
      </div>
    </div>
	<div class="md-overlay"></div><!-- the overlay element -->

    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/component.css" />" />
    <!-- <link rel="stylesheet" type="text/css"href="<c:url value="/resources/css/font-awesome.min.css" />" /> -->
    <link rel="stylesheet" type="text/css"href="<c:url value="/resources/css/hovermenu.css" />" />
    <script type="text/javascript" src="<c:url value="/resources/js/hovermenu.js" />" charset="utf-8"></script>
    <script type="text/javascript" src="<c:url value="/resources/languages/zh-cn/jquery.validationEngine.lang.js" />" ></script>
    <script type="text/javascript" src="<c:url value="/resources/js/jquery.validationEngine.js" />" ></script>
    <!-- classie.js by @desandro: https://github.com/desandro/classie -->
    <script type="text/javascript" src="<c:url value="/resources/js/classie.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/modalEffects.js" />"></script>
    <!-- for the blur effect -->
    <!-- by @derSchepp https://github.com/Schepp/CSS-Filters-Polyfill -->
    <script>
      // this is important for IEs
      var polyfilter_scriptpath = '/js/';
    </script>						
<script type="text/javascript">
	$(function(){
		 $('#app_v').each(function(){
			op.pin_bind_event($(this));
		});	

	});
</script>
</body>
</html>
