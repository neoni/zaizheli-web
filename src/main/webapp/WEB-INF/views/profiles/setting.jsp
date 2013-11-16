<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>${signInUser.name} 设置账号 在浙里——分享你我的社交</title>
	<link rel="SHORTCUT ICON" href= "<c:url value="/resources/img/head-logo.png" />" /> 
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap-responsive.css" />" />	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-theme.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-base.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/validationEngine.bootstrap.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery.Jcrop.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap-formhelpers.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery.fileupload-ui.css" />" />
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.1.7.1.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.init.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.op.js" />" ></script>
</head>
<body class="front">
	<jsp:include page="/WEB-INF/views/comp/header.jsp">
		<jsp:param name="noNeed" value="true"/>
		<jsp:param name="tab" value="none"/>
	</jsp:include>
	

	<div class="container mt-25 mb-30 board">
		<div class="pl-30 pr-30 pt-20 bg-gray">
		    <ul class="nav nav-tabs fs-14" 
		    	style="margin-left: -30px; margin-right: -30px;  margin-bottom:0px">
		    	<li class="active"  style="margin-left:30px">
		   			<a data-toggle="tab" href="#basic-info">基本信息</a></li>
		   		<li class="ml-10">
	   				<a data-toggle="tab" href="#specific-info">申请表信息</a></li>
		   		<li class="ml-10">
	   				<a data-toggle="tab" href="#change-avatar">修改头像</a></li>
	   			<li class="ml-10">
	   				<a data-toggle="tab" href="#change-pwd">修改密码</a></li>		
	   			<li class="">
	   				<a data-toggle="tab" href="#binding-weibo">关联三方账号</a></li>				    
			</ul>
	    </div>
	    <div class="tab-content p-20 of-v">
		    <div id="basic-info" class="tab-pane active fade in">
		    	<c:url value="/setting/basic" var="ub_url"/> 
		    	<form:form id="basicInfoForm" action="${ub_url}" method="post" class="form-horizontal mt-20 mb-0">
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-25 c-888" for="name">请叫我</label>
		    			<div class="controls fs-16 lh-18">
							<input id="name" class="validate[required,minSize[2]] input-xlarge" type="text" name="name" 
								data-prompt-position="centerRight:0,-4" value="${signInUser.name}" style="height: 25px;" >
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-30 c-888" for="gender">我是</label>
		    			<div class="controls fs-16 lh-18">
		    				<input id="gender" class="validate[required]" type="hidden" 
		    					data-prompt-position="centerRight:0,-4" name="gender" value="${signInUser.gender}" >
		    				<div class="btn-group" data-toggle="buttons-radio" data-toggle-name="gender">
		    					<button id="inputMale" class="btn btn-large btn-info fs-16" type="button" data-val="FEMALE">美女</button>
		    					<button id="gender_target" class="btn btn-large btn-info fs-16" type="button" data-val="MALE">帅哥</button>
		    					<button id="gender_target" class="btn btn-large btn-info fs-16" type="button" data-val="UNKNOWN">未知</button>
		    				</div>
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-30 c-888" for="city">居住在</label>
		    			<div class="controls fs-16 lh-18">
		    				<input id="city" class="validate[required]" type="hidden" 
		    					data-prompt-position="centerRight:0,-4" name="city" placeholder="" value="${signInUser.city}" >
		    				<div class="btn-group">
								<a id="city_target" class="btn btn-large dropdown-toggle fs-16" data-toggle="dropdown" href="#">
									<strong>未知</strong>
									<b class="caret"></b>
								</a>
								<jsp:include page="/WEB-INF/views/comp/city.picker.jsp">
									<jsp:param name="domId" value="setting-city-picker"/>
								</jsp:include>
							</div>
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-20 c-888" for="summary">我要说</label>
		    			<div class="controls fs-16 lh-18">
							<textarea id="summary" class="input-xlarge validate[maxSize[40]]" type="text" name="summary" rows="3" >${signInUser.summary}</textarea>
						</div>
		    		</div>
		    		<div class="form-actions" style="margin-bottom: 0px;">
		    			<div class="dis-i">
						    <button type="submit" class="btn-orange btn-large" data-loading-text="更新中...">保存修改</button>
					    	<i class="icon-ok ml-10" style="display:none;"></i>
				    	</div>
				    </div>
		    	</form:form>
		    </div>
		    <div id="specific-info" class="tab-pane fade">
		    	<c:url value="/setting/specific" var="sb_url"/> 
		    	<form:form id="specificInfoForm" action="${sb_url}" method="post" class="form-horizontal mt-20 mb-0">
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-25 c-888" for="realName">我的真名</label>
		    			<div class="controls fs-16 lh-18">
							<input id="realName" class="input-xlarge" type="text" name="realName" 
								   value="${signInUser.realName}" style="height: 25px;">
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-25 c-888" for="age">今年多少岁了</label>
		    			<div class="controls fs-16 lh-18">
							<input id="age" class="validate[custom[integer],min[0],max[150]] input-xlarge" type="number"  name="age" 
								   value="${signInUser.age}" style="height: 25px;">
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-25 c-888" for="birthday">我的破壳日</label>
		    			<div class="bfh-datepicker controls fs-16 lh-18" data-format="y-m-d" data-date="${(!empty signInUser.birthday)?signInUser.birthday:'1993-01-01'} ">     
		    			<div class="input-prepend bfh-datepicker-toggle" data-toggle="bfh-datepicker" >
		    				<span class="add-on"><i class="icon-calendar"></i></span>
							<input id="birthday" class="validate[past[now]] input-large" type="text" name="birthday" 
								   value="${signInUser.birthday}" style="height: 25px;" readonly>
						</div>
						<div class="bfh-datepicker-calendar">
						    <table class="calendar table table-bordered">
						      <thead>
						        <tr class="months-header">
						          <th class="month" colspan="4">
						            <a class="previous" href="#"><i class="icon-chevron-left"></i></a>
						            <span></span>
						            <a class="next" href="#"><i class="icon-chevron-right"></i></a>
						          </th>
						          <th class="year" colspan="3">
						            <a class="previous" href="#"><i class="icon-chevron-left"></i></a>
						            <span></span>
						            <a class="next" href="#"><i class="icon-chevron-right"></i></a>
						          </th>
						        </tr>
						        <tr class="days-header">
						        </tr>
						      </thead>
						      <tbody>
						      </tbody>
						    </table>
						  </div>
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-25 c-888" for="tel">call me (电话）</label>
		    			<div class="controls fs-16 lh-18">
							<input id="tel" class="input-xlarge validate[custom[integer],minSize[6],maxSize[17]]" type="number" name="tel" 
								   value="${signInUser.tel}" style="height: 25px;">
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-25 c-888" for="school">学校</label>
		    			<div class="controls fs-16 lh-18">
							<input id="school" class="input-xlarge" type="text" name="school" 
								   value="${signInUser.school}" style="height: 25px;">
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-25 c-888" for="address">能找到我的地址</label>
		    			<div class="controls fs-16 lh-18">
							<input id="address" class="input-xlarge" type="text" name="address" 
								   value="${signInUser.address}" style="height: 25px;">
						</div>
		    		</div>
		    		<div class="" style="margin-bottom: 30px;">
		    			<label class="fs-14 lh-30 c-888" style="margin-left:160px">提示： 此页信息可用作活动申请表</label>
		    			<!-- <div class="controls fs-16 lh-18">
		    				<input id="privateset" class="validate[required]" type="hidden" 
		    					data-prompt-position="centerRight:0,-4" name="privateset" value="${signInUser.privateset}">
		    				<div class="btn-group" data-toggle="buttons-radio" data-toggle-name="privateset">
		    					<button id="inputMale" class="btn btn-large btn-info fs-16" type="button" data-val=0 >是</button>
		    					<button id="gender_target" class="btn btn-large btn-info fs-16" type="button" data-val=1>否</button>
		    				</div>
						</div> -->
		    		</div>
		    		<div class="form-actions" style="margin-bottom: 0px;">
		    			<div class="dis-i">
						    <button type="submit" class="btn-orange btn-large" data-loading-text="更新中...">保存修改</button>
					    	<i class="icon-ok ml-10" style="display:none;"></i>
				    	</div>
				    </div>
		    	</form:form>
		    </div>
		    <div id="change-avatar" class="tab-pane fade">
		    	<form id="avatarUploadForm" class="form-horizontal" action="<c:url value="/avatar/upload"/>" method="POST" enctype="multipart/form-data">
					<div class="control-group" style="margin-bottom: 30px;">
						<div class="controls fs-14 lh-18">
							<div class="clear mb-10">
								<div id="avatarContainer" class="f-l">
									<img id="avatarImg" 
										src="<c:choose><c:when test="${not empty signInUser.avatar}"><c:url value="/images/avatars/${signInUser.avatar.resId}" /></c:when>
												<c:otherwise>http://placehold.it/350&text=Upload+Avatar</c:otherwise></c:choose>"></div>
								<div id="avatarPreview" class="ml-10 f-l">
									<div class="mb-10" style="width:100px;height:100px;overflow:hidden;">
										<img id="preview100" class="jcrop-preview" alt="Preview" 
											src="<c:choose><c:when test="${not empty signInUser.avatar}"><c:url value="/images/avatars/${signInUser.avatar.resId}" /></c:when>
												<c:otherwise>http://placehold.it/100&text=Upload+Avatar</c:otherwise></c:choose>">
									</div>
									<div class="mb-10" style="width:60px;height:60px;overflow:hidden;">
										<img id="preview60" class="jcrop-preview" alt="Preview" 
											src="<c:choose><c:when test="${not empty signInUser.avatar}"><c:url value="/images/avatars/${signInUser.avatar.resId}" /></c:when>
												<c:otherwise>http://placehold.it/60&text=Upload+Avatar</c:otherwise></c:choose>">
									</div>
									<div class="" style="width:30px;height:30px;overflow:hidden;">
										<img id="preview30" class="jcrop-preview" alt="Preview" 
											src="<c:choose><c:when test="${not empty signInUser.avatar}"><c:url value="/images/avatars/${signInUser.avatar.resId}" /></c:when>
												<c:otherwise>http://placehold.it/30&text=Upload+Avatar</c:otherwise></c:choose>">
									</div>
								</div>
							</div>
							<div class="row-fluid">
								<span class="btn btn-large btn-success fileinput-button">
				                    <i class="icon-plus icon-white"></i>
				                    <span>选择照片</span>
				                    <input id="avatarInput" type="file" name="imageFile" multiple >
			                	</span>
			                	<div class="p-8 convo lh-16 loading-box dis-n" style="">
									<a class="bg-h-loading pl-85 c-888" href=""></a>
								</div>
		                		<span class="alert alert-error dis-n mb-0"></span>
							</div>
		                </div>
					</div>
			    </form>
		    	<c:url value="/setting/avatar" var="ua_url"/> 
		    	<form:form id="avatarChangeForm" action="${ua_url}" method="post" class="form-horizontal mt-20 mb-0">
		    		<input type="hidden" id="imageUrl" name="imageUrl"/>
	    			<input type="hidden" id="x" name="x" />
					<input type="hidden" id="y" name="y" />
					<input type="hidden" id="w" name="w" />
					<input type="hidden" id="h" name="h" />
		    		<div class="form-actions" style="margin-bottom: 0px;">
		    			<div class="dis-i">
						    <button type="submit" class="btn-orange btn-large" data-loading-text="更新中...">保存修改</button>
					    	<i class="icon-ok ml-10" style="display:none;"></i>
				    	</div>
				    </div>
		    	</form:form>
		    </div>
		    <div id="change-pwd" class="tab-pane fade">
		    	<c:url value="/setting/changepwd" var="cp_url"/> 
		    	<form:form id="changePwdForm" action="${cp_url}" method="post" class="form-horizontal mt-20 mb-0">
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-25 c-888" for="inputOldPwd">旧密码</label>
		    			<div class="controls fs-16 lh-18">
							<input id="oldPwd" autocomplete="off" class="validate[required] input-xlarge" type="password" name="oldPwd" 
								 data-prompt-position="centerRight:0,-4" value="" style="height: 25px;">
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-25 c-888" for="inputNewPwd">新密码</label>
		    			<div class="controls fs-16 lh-18">
							<input id="newPwd" autocomplete="off" class="validate[required,minSize[6],maxSize[30]] input-xlarge" type="password" name="newPwd" 
								data-prompt-position="centerRight:0,-4" value="" style="height: 25px;">
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 30px;">
		    			<label class="control-label fs-15 lh-25 c-888" for="inputNewPwdRe">确认新密码</label>
		    			<div class="controls fs-16 lh-18">
							<input id="newPwdRe" autocomplete="off" class="validate[required,equals[newPwd]] input-xlarge" type="password" name="newPwdRe" 
								data-prompt-position="centerRight:0,-4" value="" style="height: 25px;">
						</div>
		    		</div>
		    		<div class="form-actions" style="margin-bottom: 0px;">
		    			<div class="dis-i">
						    <button type="submit" class="btn-orange btn-large" data-loading-text="更新中...">保存修改</button>
					    	<i class="icon-ok ml-10" style="display:none;"></i>
				    	</div>
				    </div>
		    	</form:form>
		    </div>
		    <div id="binding-weibo" class="tab-pane fade">
		    	<c:url value="/setting/binding" var="bw_url"/> 
		    	<form:form id="bindingForm" action="${bw_url}" method="post" class="form-horizontal mt-10">
		    		<div class="control-group" style="margin-bottom: 20px;">
		    			<!-- <label class="control-label fs-15 lh-25 c-888" for="inputName">新浪微博</label>-->
		    			<div class="controls fs-16 lh-18">
							<!-- <button class="btn btn-large btn-danger" data-toggle="button" type="button">绑定新浪微博</button>-->
							<a class="btn-3rd weibo" href="/oauth/weibo/signup/">
								<div class="logo_wrapper"><span class="logo"></span></div>
								<span>绑定微博帐号</span>
							</a>
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 20px;">
		    			<!-- <label class="control-label fs-15 lh-25 c-888" for="inputName">腾讯QQ</label>  -->
		    			<div class="controls fs-16 lh-18">
							<!-- <button class="btn btn-large btn-info" data-toggle="button" type="button">绑定人人网</button> -->
							<a class="btn-3rd qq" href="/oauth/weibo/signup/">
								<div class="logo_wrapper"><span class="logo"></span></div>
								<span>绑定QQ帐号</span>
							</a>
						</div>
		    		</div>
		    		<div class="control-group" style="margin-bottom: 20px;">
		    			<!-- <label class="control-label fs-15 lh-25 c-888" for="inputName">豆瓣</label> -->
		    			<div class="controls fs-16 lh-18">
							<!-- <button class="btn btn-large btn-success" data-toggle="button" type="button">绑定豆瓣</button>-->
							<a class="btn-3rd douban" href="/oauth/weibo/signup/">
								<div class="logo_wrapper"><span class="logo"></span></div>
								<span>绑定豆瓣帐号</span>
							</a>
						</div>
		    		</div>
		    		<div class="control-group">
		    			<!-- <label class="control-label fs-15 lh-25 c-888" for="inputName">腾讯微博</label> -->
		    			<div class="controls fs-16 lh-18">
							<!-- <button class="btn btn-large btn-primary" data-toggle="button" type="button">绑定腾讯微博</button> -->
							<a class="btn-3rd renren" href="/oauth/weibo/signup/">
								<div class="logo_wrapper"><span class="logo"></span></div>
								<span>绑定人人帐号</span>
							</a>
						</div>
		    		</div>
		    	</form:form>
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
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap-formhelpers-datepicker.en_US.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap-formhelpers-datepicker.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-ui-1.8.18.custom.min.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.scrollTo.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.form.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.Jcrop.js" />" ></script>
<script type="text/javascript">
	$(function(){
		function attachValidationForBasicInfoForm(){
			$('#basicInfoForm').validationEngine({
				prettySelect: true,
				useSuffix: '_target',
				promptPosition: 'centerRight',
				autoPositionUpdate: true,
				ajaxFormValidation: true,
				ajaxFormValidationMethod: 'post',
				ajaxFormValidationURL: '<c:url value="/setting/basic/validate" />',
				onBeforeAjaxFormValidation: function(form, options){
					$(form).find('.form-actions button').button('loading');
					$('#basicInfoForm .icon-ok').hide();
				},
				onAjaxFormComplete: function(status, form, errors, options){
					$('#basicInfoForm .form-actions button').button('reset')
					if(status == true){
						form.validationEngine('detach');
						form.ajaxSubmit({
					        dataType:  'json', 
					        beforeSubmit: function(formData, jqForm, options){
					        	$('#basicInfoForm .form-actions button').button('loading');
					        	$('#basicInfoForm .icon-ok').hide();
					        },
					        success:  function(data){
					        	if(!data || data.resultCode != 'SUCCESS' ) return;
					        	$('#basicInfoForm .icon-ok').css('display', 'inline-block');
					        },
					        complete: function(jqXHR, textStatus){
				          		$('#basicInfoForm .form-actions button').button('reset');
				          		attachValidationForBasicInfoForm();
				          	}
					    });
					}
				}
			});
		}
		function attachValidationForSpecificInfoForm(){
			$('#specificInfoForm').validationEngine({
				prettySelect: true,
				useSuffix: '_target',
				promptPosition: 'centerRight',
				autoPositionUpdate: true,
				ajaxFormValidation: true,
				ajaxFormValidationMethod: 'post',
				ajaxFormValidationURL: '<c:url value="/setting/specific/validate" />',
				onBeforeAjaxFormValidation: function(form, options){
					$(form).find('.form-actions button').button('loading');
					$('#specificInfoForm .icon-ok').hide();
				},
				onAjaxFormComplete: function(status, form, errors, options){
					$('#specificInfoForm .form-actions button').button('reset')
					if(status == true){
						form.validationEngine('detach');
						form.ajaxSubmit({
					        dataType:  'json', 
					        beforeSubmit: function(formData, jqForm, options){
					        	$('#specificInfoForm .form-actions button').button('loading');
					        	$('#specificInfoForm .icon-ok').hide();
					        },
					        success:  function(data){
					        	if(!data || data.resultCode != 'SUCCESS' ) return;
					        	$('#specificInfoForm .icon-ok').css('display', 'inline-block');
					        },
					        complete: function(jqXHR, textStatus){
				          		$('#specificInfoForm .form-actions button').button('reset');
				          		attachValidationForSpecificInfoForm();
				          	}
					    });
					}
				}
			});
		}
		function attachValidationForChangPwdForm(){
			$('#changePwdForm').validationEngine({
				autoPositionUpdate: true,
				ajaxFormValidation: true,
				ajaxFormValidationMethod: 'post',
				ajaxFormValidationURL: '<c:url value="/setting/changepwd/validate" />',
				onBeforeAjaxFormValidation: function(form, options){
					$(form).find('.form-actions button').button('loading');
					$('#changePwdForm .icon-ok').hide();
				},
				onAjaxFormComplete: function(status, form, errors, options){
					$('#changePwdForm .form-actions button').button('reset')
					if(status == true){
						form.validationEngine('detach');
						form.ajaxSubmit({
					        dataType:  'json', 
					        beforeSubmit: function(formData, jqForm, options){
					        	$('#changePwdForm .form-actions button').button('loading');
					        	$('#changePwdForm .icon-ok').hide();
					        },
					        success:  function(data){
					        	if(!data || data.resultCode != 'SUCCESS' ) return;
					        	form.clearForm();
					        	$('#changePwdForm .icon-ok').css('display', 'inline-block');
					        },
					        complete: function(jqXHR, textStatus){
				          		$('#changePwdForm .form-actions button').button('reset');
				          		attachValidationForChangPwdForm();
				          	}
					    });
					}
				}
			});
		};
		attachValidationForBasicInfoForm();
		attachValidationForSpecificInfoForm();
		attachValidationForChangPwdForm();
		var jcrop_api, boundx, boundy;;
		$('#avatarUploadForm').ajaxForm({
			dataType:  'json', 
	        beforeSubmit: function(formData, jqForm, options){
	        	$('#avatarUploadForm .loading-box').show();
	        	$('#avatarUploadForm .alert-error').hide();
	        },
			success: function(data) {
				if(data && data.resultCode == 'EXCEPTION' ){
					$('#avatarUploadForm').find(".alert-error").text(data.exceptionMsg);
					$('#avatarUploadForm').find(".alert-error").css('display','inline-block');
				}else{
					$('#preview100').attr('src', data.resultData);
					$('#preview60').attr('src', data.resultData);
					$('#preview30').attr('src', data.resultData);
					$('#imageUrl').val(data.resultData);
					if(jcrop_api == null){
						var $pic = $('<img src="'+data.resultData+'" />');
						$("#avatarContainer").html($pic);
						setupJcrop($pic);
					}else{
						updateJcrop(data.resultData, $('#avatarContainer img'));
					}
				}
			},
			complete: function(){
				$('#avatarUploadForm .loading-box').hide();
			}
		});
		function updatePreview(c){
			if (parseInt(c.w) > 0)
			{
			   $('#x').val(c.x);
		       $('#y').val(c.y);
		       $('#w').val(c.w);
		       $('#h').val(c.h);
				// preview100
				var rx = 100 / c.w;
				var ry = 100 / c.h;
				$('#preview100').css({
					width: Math.round(rx * boundx) + 'px',
					height: Math.round(ry * boundy) + 'px',
					marginLeft: '-' + Math.round(rx * c.x) + 'px',
					marginTop: '-' + Math.round(ry * c.y) + 'px'
				});
				// preview60
				rx = 60 / c.w;
				ry = 60 / c.h;
				$('#preview60').css({
					width: Math.round(rx * boundx) + 'px',
					height: Math.round(ry * boundy) + 'px',
					marginLeft: '-' + Math.round(rx * c.x) + 'px',
					marginTop: '-' + Math.round(ry * c.y) + 'px'
				});
				// preview30
				rx = 30 / c.w;
				ry = 30 / c.h;
				$('#preview30').css({
					width: Math.round(rx * boundx) + 'px',
					height: Math.round(ry * boundy) + 'px',
					marginLeft: '-' + Math.round(rx * c.x) + 'px',
					marginTop: '-' + Math.round(ry * c.y) + 'px'
				});
			} 
		}
		var avatarSrc = $('#avatarContainer img').attr('src');
		function setupJcrop($pic){
			var imgW, imgH, p1 = {}, p2 = {};
			$pic.Jcrop({
				aspectRatio: 1,
				onChange: updatePreview,
				onSelect: updatePreview,
				minSize:[192,192]
			},
			function(){
				var bounds = this.getBounds();
				boundx = bounds[0];
				boundy = bounds[1]; 
				imgW = $pic.width();
				imgH = $pic.height();
				p1.x = Math.floor((imgW-192)/2);
				p1.y = Math.floor((imgH-192)/2);
				p2.x = Math.floor((imgW+192)/2);
				p2.x = Math.floor((imgH+192)/2);
				jcrop_api = this;
				jcrop_api.setSelect([p1.x,p1.y,p2.x,p2.y]);
			});
		}
		function updateJcrop(imgSrc, $pic)
		{
			var imgW, imgH, p1 = {}, p2 = {};
			if(!jcrop_api) return;
			jcrop_api.setImage(imgSrc, function(){
				var bounds = this.getBounds();
				boundx = bounds[0];
				boundy = bounds[1]; 
				imgW = $pic.width();
				imgH = $pic.height();
				p1.x = Math.floor((imgW-192)/2);
				p1.y = Math.floor((imgH-192)/2);
				p2.x = Math.floor((imgW+192)/2);
				p2.x = Math.floor((imgH+192)/2);
				jcrop_api = this;
				jcrop_api.setSelect([p1.x,p1.y,p2.x,p2.y]);
			});
		}
		if($.trim(avatarSrc) && avatarSrc.indexOf('/images/avatars')!=-1){
			setupJcrop($('#avatarContainer img'));
		}
		$('#avatarChangeForm').ajaxForm({
	        dataType:  'json', 
	        beforeSubmit: function(formData, jqForm, options){
	        	$('#avatarChangeForm .form-actions button').button('loading');
	        	$('#avatarChangeForm .icon-ok').hide();
	        },
	        success:  function(data){
	        	if(!data || data.resultCode != 'SUCCESS' ) return;
	        	$('#avatarChangeForm').clearForm();
	        	$('#avatarChangeForm .icon-ok').css('display', 'inline-block');
	        },
	        complete: function(jqXHR, textStatus){
          		$('#avatarChangeForm .form-actions button').button('reset');
          	}
	    });
		$('#avatarInput').change(function(){
			$("#avatarUploadForm").submit();
		});
		$('div.btn-group[data-toggle-name=*]').each(function(){
		    var group   = $(this);
		    var form    = group.parents('form').eq(0);
		    var name    = group.attr('data-toggle-name');
		    var hidden  = $('input[name="' + name + '"]', form);
		    $('button', group).each(function(){
		    	var button = $(this);
		      	button.live('click', function(){
		        	hidden.val($(this).attr('data-val'));
		      	});
		      	if(button.attr('data-val') == hidden.val()) {
		     		button.addClass('active');
		    	}
		    });
		});
		var city = $('#city').val();
		if($.trim(city)){
			var targetCityElem = $('#setting-city-picker a[title='+city+']').addClass('active');
			$('#city_target strong').text(targetCityElem.text());
		}else{
			$('#city_target strong').text('-请选择-');
		}
		$('#setting-city-picker').bind('city-click', function(e, pinyin, label){
			$('#city').val(pinyin);
			$('#city').parent().find('.btn-group strong').text(label);
		});
		$('#setting-city-picker').parent().bind('dropdown-open', function(e){
			var pinyin = $('#city').val();
			$('#setting-city-picker').trigger('city-open', [pinyin]);
		});
	});
</script>
<script type="text/javascript" src="<c:url value="/resources/js/ga.js" />" ></script>
</body>
</html>