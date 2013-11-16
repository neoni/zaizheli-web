<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://zaizheli.net/functions" prefix="f" %>
<!DOCTYPE>
<html>
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
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/activity1.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/activity2.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery.atwho.css" />"/>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.1.7.1.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.init.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.op.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/bootstrap-paginator.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.uploadify.min.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js//jquery.atwho.js"  />" ></script>

    <script type="text/javascript">
	    $(function() {
	        $('#image_upload').uploadify({
	            height        : 30,
	            swf   	      : '<c:url value="/resources/js/uploadify.swf" />',
		   		uploader   	  : '<c:url value="/gallery/upload" />',
		        width         : 200,
		        buttonClass   : 'track apply noauth record-exit img_select',
		        buttonText    : '上传活动图片',
		        uploadLimit   : 50,
		        fileTypeDesc  : 'Image Files',
			    fileTypeExts  : '*.gif; *.jpg; *.png; *.jped; *.bmp',
			    fileSizeLimit : '10000KB',
			    progressData  : 'percentage',
			    formData      : {'actId' : '${activity.id}', 'userId': '${signInUser.id}'},
			    onUploadStart : function(file) {
            		$("#image__upload").uploadify("settings", "actId", '${activity.id}');
            		$("#image__upload").uploadify("settings", "userId", '${signInUser.id}');
        		} ,
			    onUploadError : function(file, errorCode, errorMsg, errorString) {
			    	op.notify_header('啊啊，上传失败了 >o<');
        		},
        		onUploadSuccess : function(file) {
        			op.notify_header('上传成功！ o@o');
           	    }  
			    
		    }); 

	    });
	    </script> 
</head>
<body class="front" style="padding-top:46px;">
	
	<jsp:include page="/WEB-INF/views/comp/header.jsp">
		<jsp:param name="tab" value="none"/>
	</jsp:include>
	<jsp:include page="/WEB-INF/views/comp/side.nav.jsp" />
	<c:import url="../modal/sendPM.jsp"/>
    <div id="main-content"> 
	   <div class="inside-main-content cf">
		    <section class="jobs-top" id="jobs"> 
			     <article class="job-panel"> 
			     	  <header class="job-panel-header cf"> 
				       	<h2 class="job-title"><img src="<c:url value="/resources/img/colorful-logo.png" />" />        ${activity.title}</h2> 
				      </header>
				      <div class="content cf"> 
				       <c:choose>
						<c:when test="${activity.image.orgSize[1]>=720}">
							<a class="img" href="#">
								<img class="block-h-c" width="720" height="${(720*activity.image.orgSize[0])/activity.image.orgSize[1]}" 
									src="${f:imageUrl(activity.image.resId)}" alt="${activity.title}"/>
							</a>
						</c:when>
						<c:otherwise>
							 <a class="img" href="#" style="text-align:center;display:block">
								<img class="block-h-c" width="${activity.image.orgSize[1]}" height="${activity.image.orgSize[0]}" 
									src="${f:imageUrl(activity.image.resId)}" alt="${activity.title}"/>
							</a>
						</c:otherwise>
						</c:choose> 
				      </div> 
				      <footer class="job-panel-footer cf">
				      <c:choose>
				      	<c:when test="${activity.status eq '放弃'}">
                        	<a  class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">此 活 动 已 被 放 弃 </a> 
                        </c:when>
                        <c:when test="${signInUser.id == activity.createdBy.id}">
					       <input type="file" id="image_upload" name="image_upload">    
					     </c:when>
				      	<c:when test="${activity.status eq '已结束'}">
                        	<a  data-action="view job application" class="track apply noauth record-exit" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">已 结 束 </a> 
                        </c:when>
                        <c:when test="${activity.status eq '晒活动'}">
                        	<a href="<c:url value="/activity/${activity.id}/gallery"/>" class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">晒 活 动 中 </a> 
                        </c:when>                        
                        <c:when test="${activity.status eq '征集成员中'}"> 
                        	<c:choose>
                        	<c:when test="${status eq 0}">                                         
	                        	<a act="<c:url value="/activity/${activity.id}/join"/>" onclick="op.apply(event.currentTarget); event.preventDefault();"  class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity"><span>加 入 活 动</span> </a> 					   
			                   <c:if test="${activity.apply==1}">
						       		<a class="other-jobs">加入该活动需要填写申请表</a> 
						       </c:if>
						    </c:when>
						    <c:when test="${status eq 1}"> 
						    	<a  class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity"><span>等待审核中</span> </a> 
						    </c:when>
						    <c:otherwise>					   
			                 	<a  id="quit_act" class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity"><span>退 出 活 动</span> </a>   
			                </c:otherwise>
			            	</c:choose>
					     </c:when>
					    </c:choose>
				      </footer> 
			     </article> 
			     <div class="learn-more-about fs-14"> 
			      <p><font color="#000000">关 于 活 动 的 更 多 细 节</p> 
			     </div> 
		    </section> 
		    <div class="page"> 
		     <header class="team-header cf"> 
		      	<div class="team-logo">
			       <a  href="<c:url value="/profiles/${activity.createdBy.id}" />">
					  <img class="team-page-avatar" width=104 height=104 src="${f:avatarUrl(activity.createdBy.avatar, activity.createdBy.gender)}" />
				   </a>
			    </div>    
			    <h1 style="color:#ffca00">${activity.createdBy.name}</h1><br><br><br><br><br><br><br>			      
			    <div calss="op-list pl-40  pb-10 pt-10 f-r">
					<a class="btn btn-green-1 mr-5 track" act="<c:url value="/ops/track/${activity.id}" />"
						onclick="op.change_track(event.currentTarget); event.preventDefault();">
						<i class="icon-star icon-white"></i>&nbsp;<span>追踪(${activity.trackCount})</span></a></li>
					<a class="btn btn-pink" act="<c:url value="/ops/agree/${activity.id}" />"
						 onclick="op.give_agreement(event.currentTarget); event.preventDefault(); ">
						<i class="icon-heart icon-white"></i>&nbsp;&nbsp;<span>赞(${activity.agreeCount})&nbsp;</span></a></li>&nbsp;&nbsp;
					</a>
					<a class="btn btn-purple" act="<c:url value="/ops/share/${activity.id}" />"
						 onclick="toggle('div1')">
						<i class="icon-share-alt icon-white"></i>&nbsp;<span>转发(${activity.shareCount})</span></a></li>

					<!--一键分享——START-->
					<script language="JavaScript" type="text/JavaScript">
					<!--
						function toggle(targetid){
						     if (document.getElementById){
						         target=document.getElementById(targetid);
						             if (target.style.display=="block"){
						                 target.style.display="none";
						             } else {
						                 target.style.display="block";
						             }
						     }
						}
					-->
					</script>
					<div id="div1" style="display:none">
						<div class="bshare-custom"><div class="bsPromo bsPromo2"></div><a title="分享到新浪微博" class="bshare-sinaminiblog" style="padding-left:20px"></a><a title="分享到QQ好友" class="bshare-qqim" href="javascript:void(0);"></a><a title="分享到人人网" class="bshare-renren"></a><a title="分享到豆瓣" class="bshare-douban" href="javascript:void(0);"></a></div><script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=2&amp;lang=zh"></script><script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/bshareC0.js"></script>
					</div>
					<!--一键分享——END-->
					
				</div>
		     </header> 
		     <div class="join-us-banner"> 
		      <p><a class="view-jobs-status">${activity.status}</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
		      	<a class="view-jobs" href="<c:url value="/activity/${activity.id}/joiners"/>" >查看参与人员</a>
		      	<a class="view-jobs" href="#comment">去评论吧</a> </p>
		      	 </p> 
	     	</div>  
		    <section class="cf" id="challenges">
		       <div class="member-details"> 
		       <h3>活动 基本信息</h3> 
		       <p class=""> </p> 
		       </div> 
		       <div class="caption">
					<p><a href="#" data-id="${activity.place.id}" data-type="placemap" 
						data-html="true" data-toggle="popoverx" data-original-title="详细地图"
						data-city="${activity.city}" data-lngLat="${activity.place.lngLat[1]},${activity.place.lngLat[0]}">
						<i class="icon-map-marker"></i>${activity.place.fullAddr}</a></p>
					<c:if test="${not empty activity.addr}">			
						<h4>地址备注：${activity.addr}</h4>
					</c:if>
				</div>
				<br>
		       <div class="box half"> 
		       <div class="icon" style="background-color:#a0d4ae"></div> 
		       <header> 
		          <h3>活 动 细 节</h3> 
		       </header>
		       <p>类别：${activity.type}</p> 
		       <p>开始时间：<fmt:formatDate value="${activity.startedAt}" pattern="yyyy-MM-dd HH:mm:ss"/></p><p>结束时间：<fmt:formatDate value="${activity.endedAt}" pattern="yyyy-MM-dd HH:mm:ss"/></p>
		       <p>参与的最大人数：${activity.maxNum}</p> 
		       <p>当前人数：${activity.currentNum}</p> 
		      </div> 
		      <div class="box half"> 
		       <div class="icon blub" style="background-color:#a0d4ae"></div> 
		       <header> 
		        <h3>活 动 情 况</h3> 
		       </header> 
		       <p>是否需要费用：<c:choose> <c:when test="${activity.fee eq 0}">否 </c:when>
		                                   <c:when test="${activity.fee eq 1}">是 </c:when>	
		                        </c:choose>
		       <p>被赞：${activity.agreeCount}</p> 
		       <p>转发：${activity.shareCount}</p>
		       <p>评论：${activity.commentCount}</p> 
		       <p>追踪：${activity.trackCount}</p> 
		      </div> 
		     </section> 
     <section class="cf" id="favourite-benefits" style="background-color:#ffca00;filter:alpha(opacity=50);-moz-opacity:0.5;opacity:0.5">
     	<div style="padding-left:80px; padding-right:80px;">
     	<h3>活 动 补 充</h3>  
   			${activity.content}
  		</div>
     </section> 
     <section class="cf" id="why-work"> 
      <header class="header"> 
       <h2 class="heading">一 共 ${activity.commentCount} 条 评 论</h2> 
      </header>
      <div class="inside">  
      <ol class="reasons"> 
       	<c:import url="/activity/${activity.id}/comments/${no}"></c:import>	

	  </div>
		<form action="<c:url value="/activity/addcmt" />" method="post" id="commentform">
		   	<p><textarea name="content" id="comment" cols="58" rows="10"   required="true"></textarea></p>
		
		   	<p>
		   		<input name="submit" id="cmt_submit" tabindex="5" value="提交评论" type="submit">
				<input name="actId" value="${activity.id}" id="actId" type="hidden">
				<input name="replyToId" value="" id="replyToId" type="hidden">
				<input name="cmtId" value="" id="cmtId" type="hidden">
		 	</p>
		 	
	 	</form>
       
     
     </section>
     <footer class="page-footer"> 

      <p class="watermark">Zai Zhe Li</p> 
     </footer> 
    </div> 
    <div id="dimmer"></div> 
   </div> 
  </div> 
	</div>
	<jsp:include page="/WEB-INF/views/comp/back.top.jsp"></jsp:include>
	<script type="text/javascript">
		adjustWebWidth();
	</script>
	<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3 id="myModalLabel">提 醒</h3>
		</div>
		<div class="modal-body">
		<p id="modal_text">确定要退出此活动？</p>
		</div>
		<div class="modal-footer">
		<a id="sure" class="btn-or" act="<c:url value="/activity/${activity.id}/quit"/>"  >确定</a>
		<a  data-dismiss="modal"  class="btn btn-primary">取消</a>
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

<script type="text/javascript" src="<c:url value="/resources/js/bootstrapx-popoverx.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.timeago.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-ui-1.8.18.custom.min.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.form.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.imagesloaded.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.pnotify.js" />" ></script>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false&language=zh_cn&region=CN"></script>
<script type="text/javascript" src="<c:url value="/resources/js/gmap3.js" />"></script>
<script type="text/javascript">
	$(function(){
		var names = $.map(${myUsers},function(value,i) {
           return {'name':value};
         });
		 $(".timeago").timeago();
		 $('#main-content').each(function(){
			op.pin_bind_event($(this));
		});	
		 $('#comment')
		  .atwho({
		    at: "@",
		    data: names
		  });
		 $('#quit_act').click(function(){
		 	$('#myModal').modal('toggle');
		 });
		 $('#sure').click(function(){
		 	op.apply_quit(event.currentTarget);
		 	event.preventDefault(); 
		 	setTimeout(function(){window.location.reload();}, 1500);
		 });

	});
</script>
</body>
</html>