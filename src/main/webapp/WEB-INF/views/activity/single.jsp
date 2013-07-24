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
	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-base.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-theme.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery.pnotify.default.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery-ui-1.8.18.custom.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery.pnotify.zaizheli.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/validationEngine.bootstrap.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/activity1.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/activity2.css" />" />
	<script type="text/javascript" src="<c:url value="/resources/js/ga.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.1.7.1.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.init.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.op.js" />" ></script>
</head>
<body class="front" style="padding-top:46px;">
	<jsp:include page="/WEB-INF/views/comp/header.jsp">
		<jsp:param name="tab" value="none"/>
	</jsp:include>
	<div class="outer" id="header_wrap">
        <header class="inner" >
          <h1 id="project_title" class="pb-20">${activity.title}</h1>
		  <h2 id="project_tagline">在 这 里 的 我 们 —— 在 这 里 的 流 年</h2>
	      <span id="act_nav">
			  <ul>
				<li><a href="<c:url value="/activities/${activity.id}"/>" >活动主页</a></li>
				<c:if test="${signInUser.id == activity.createdBy.id}">
				<li><a href="<c:url value="/activity/${activity.id}/edit"/>" >活动编辑</a></li>
				</c:if>
				<li><a href="<c:url value="/activity/${activity.id}/joiners"/>" >参加人员</a></li>
				<li><a href="<c:url value="/activity/${activity.id}/gallery"/>" >活动图库</a></li>
			  </ul>
		  </span>
 		</header> 
    </div>
    <div id="main-content"> 
	   <div class="inside-main-content cf">
		    <section class="jobs-top" id="jobs"> 
			     <article class="job-panel"> 
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
					       <a href="<c:url value="/activity/${activity.id}/upload"/>" class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">上 传 活 动 图 片 </a> 	         
					     </c:when>
				      	<c:when test="${activity.status eq '已结束'}">
                        	<a  data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">已 结 束 </a> 
                        </c:when>
                        <c:when test="${activity.status eq '晒活动'}">
                        	<a href="<c:url value="/activity/${activity.id}/gallery"/>" class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">晒 活 动 中 </a> 
                        </c:when>                        
                        <c:when test="${activity.status eq '征集成员中'}">
					       <a href="<c:url value="/activity/${activity.id}/join"/>" class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">加 入 Join </a> 
		                   <c:if test="${activity.apply==1}">
					       		<a class="other-jobs">加入该活动需要填写申请表</a> 
					       </c:if>
					     </c:when>
					    </c:choose>
				      </footer> 
			     </article> 
			     <div class="learn-more-about fs-14"> 
			      <p>关 于 活 动 的 更 多 细 节</p> 
			     </div> 
		    </section> 
		    <div class="page"> 
		     <header class="team-header cf" style="background-color:#343131"> 
		      	<div class="team-logo">
			       <a  href="<c:url value="/profiles/${activity.createdBy.id}" />">
					  <img class="team-page-avatar" width=104 height=104 src="${f:avatarUrl(activity.createdBy.avatar, activity.createdBy.gender)}" />
				   </a>
			      </div>    
			      <h1>${activity.createdBy.name}</h1> 
			      <h4><a  data-idr="#fans-idr" class="follow-team add-to-network noauth pr-20">${activity.status}</a></h4>
			      <div class="op-list pl-40  pb-10 pt-10 f-r">
					<a class="btn btn-success mr-5 track" href="<c:url value="/ops/track/${activity.id}" />"
						onclick="op.change_track(event.currentTarget); event.preventDefault();">
						<i class="icon-star icon-white"></i>&nbsp;<span>追踪(${activity.trackCount})</span></a></li>
					<a class="btn" href="<c:url value="/ops/share/${activity.id}" />"
						 onclick="op.show_forward(event.currentTarget); event.preventDefault();">
						<i class="icon-share-alt"></i>&nbsp;<span>转发(${activity.shareCount})</span></a></li>&nbsp;&nbsp;
					<a class="btn btn-danger" href="<c:url value="/ops/agree/${activity.id}" />"
						 onclick="op.give_agreement(event.currentTarget); event.preventDefault(); ">
						<i class="icon-heart icon-white"></i>&nbsp;&nbsp;<span>赞(${activity.agreeCount})&nbsp;</span></a></li>
					</a>
				</div> 
		     </header> 
		     <div class="join-us-banner"> 
		      <p> <span> </span>一 起 来 吧&nbsp;&nbsp;&nbsp;&nbsp;  
		      	<a class="view-jobs" href="<c:url value="/activity/${activity.id}/joiners"/>" >查看参加人员</a>
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
		       <div class="icon" style="background-color:#343131"></div> 
		       <header> 
		          <h3>活 动 细 节</h3> 
		       </header>
		       <p>类别：${activity.type}</p> 
		       <p>开始时间：<fmt:formatDate value="${activity.startedAt}" pattern="yyyy-MM-dd HH:mm:ss"/></p><p>结束时间：<fmt:formatDate value="${activity.endedAt}" pattern="yyyy-MM-dd HH:mm:ss"/></p>
		       <p>参与的最大人数：${activity.maxNum}</p> 
		       <p>当前人数：${activity.currentNum}</p> 
		      </div> 
		      <div class="box half"> 
		       <div class="icon blub" style="background-color:#343131"></div> 
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
     <section class="cf" id="favourite-benefits" style="background-color:#343131">
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
       	<c:import url="/activity/${activity.id}/comments"></c:import>	
	   </ol> 
	    <div id="page" class="pagination pagination-centered">
		    <ul>
		    <li><a href="#">&laquo;</a></li>
		    <li><a href="#">1</a></li>
		    <li><a href="#">2</a></li>
		    <li><a href="#">3</a></li>
		    <li><a href="#">4</a></li>
		    <li><a href="#">5</a></li>
		   	<li><a href="#">&raquo;</a></li>
		    </ul>
		</div>

	</div>
		<form action="<c:url value="/activity/addcmt" />" method="post" id="commentform">
		   	<p><textarea name="content" id="comment" cols="58" rows="10"   required="true"></textarea></p>
		
		   	<p>
		   		<input name="submit" id="cmt_submit" tabindex="5" value="提交评论" type="submit">
				<input name="actId" value="${activity.id}" id="actId" type="hidden">
				<input name="replyToId" value="" id="replyToId" type="hidden">
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
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrapx-popoverx.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.timeago.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-ui-1.8.18.custom.min.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.scrollTo.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.form.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.imagesloaded.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.masonry.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.infinitescroll.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.pnotify.js" />" ></script>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false&language=zh_cn&region=CN"></script>
<script type="text/javascript" src="<c:url value="/resources/js/gmap3.js" />"></script>
<script type="text/javascript">
	$(function(){
		 $(".timeago").timeago();
		 $('#main-content').each(function(){
			op.pin_bind_event($(this));
		});
		 document.getElementById('toReply').onclick = function(){
		 	var userid = $(this).closet('li').attr('user_id');
		 	nt.getElementById('replyToId').val('userid');
		 }
	});
</script>
</body>
</html>