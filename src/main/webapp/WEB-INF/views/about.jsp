<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>在浙里——分享你我的社交</title>
		<link rel="SHORTCUT ICON" href= "<c:url value="/resources/img/head-logo.png" />" /> 
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-theme.css" />" />
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" />
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-base.css" />" />	
		<script type="text/javascript" src="<c:url value="/resources/js/jquery.js" />" ></script>
		<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js" />" ></script>
		<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.init.js" />" ></script>
		<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.op.js" />" ></script>
	</head>
	<body>
		<jsp:include page="/WEB-INF/views/comp/header.jsp">
			<jsp:param name="tab" value="none"/>
		</jsp:include>
		<div id="content-wrapper">
			<div class="site">
			<div class="markdown-format"> 
				<h3>在浙里</h3>
				<p class="intro">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;“在浙里”社交化活动应用主要为人们提供了一个活动发布、参与、分享的平台，其分类包括聚餐，运动，班级活动，线上讨论等人们常做的活动。用户所需要的就是发布活动的名称，时间，地点.，其他用户科方便地寻找“志同道合”的人，共同参与一项活动，丰富生活;当活动结束后，还可上传活动图片，与大家一起分享。<br><br>
				(为享受最佳体验，推荐使用最新版本的 FireFox or Chrome 浏览器）
					</p>
				<p>
					<h4>“在浙里”主要实现功能：</h4>
					<ul>
						<li>	最热活动</li>
						<li>	活动地图布局</li>
						<li>	发布活动</li>
						<li>	查找用户，可进行关注、私信</li>
						<li>	申请加入活动(根据活动状况判断是否填写申请表)</li>
						<li>	跟帖讨论回复</li>
						<li>	可进行 @ </li>
						<li>	重新编辑活动</li>
						<li>	查看已参与用户</li>
						<li>	上传图片或查看活动图库</li>
						<li>	跟踪、转发、赞活动</li>
						<li>	我的关注——查看追踪的活动及关注的用户的动态</li>
						<li>	在这里的我——我的动态</li>
						<li>	消息功能</li>
						<li>	用户设置，可设置头像、昵称、固定申请表等</li>
					</ul>
				</p>
				<h3>联系及反馈邮箱</h3>
					<h4> <a target="_blank" href="mailto: blue.snow13@163.com">blue.snow13@163.com</a>  </h4>
					<br>
				<h3>有空多来踩踩吧~ 即使来喂喂鱼也挺好的</h3>
				<div style="margin-bottom:70px">		
					<center><embed height=300 type=application/x-shockwave-flash width=660 src=http://fishgadget.googlecode.com/svn/trunk/fish.swf FLASHVARS="up_numFish=6&amp;up_fishColor4=#FFFFFF&amp;up_backgroundColor=F6F6F6&amp;up_fishColor1=F4A61C&amp;up_fishColor7=F45540&amp;up_fishColor6=F45540&amp;up_fishColor8=F45540&amp;up_fishColor2=C4C4C4&amp;up_fishColor9=F45540&amp;up_fishColor3=#600000&amp;up_fishName=Fish&amp;up_fishColor5=F45540&amp;up_fishColor10=F45540&amp;up_backgroundImage=http://&amp;up_foodColor=FCB347&amp;" BGCOLOR="#F6F6F6" WMODE="zaizheli" ></embed></center>
				</div>
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
	</body>
</html>