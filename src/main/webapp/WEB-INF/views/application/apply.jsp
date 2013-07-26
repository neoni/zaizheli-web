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
				<li><a href="<c:url value="/activity/${activity.id}/applications"/>" >申请处理</a></li>
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
			     <article class="job-panel" style="width:1000px;"> 
				      <header class="job-panel-header cf"> 
				       	<h2 class="job-title">加 入 的 成 员 ( 一 共 ${activity.currentNum} 位 )</h2> 
				      </header> 
				      <div class="content cf" style="padding:0px;"> 
				       <div class="tab-content bg-gray p-20" id="water-fall-wrapper" style="background:#DDDFEF;">
						    <div class="tab-pane active" id="water-fall">
						    	<c:import url="/activity/${activity.id}/getJoiners"></c:import>
						    </div>
						</div>
					    <div id="page-nav">
							<a href="<c:url value="/activity/${activity.id}/getJoiners" />"></a>
						</div>
				      </div> 
				      <footer class="job-panel-footer cf">
				      <c:choose>
				      	<c:when test="${activity.status eq '放弃'}">
                        	<a  href="<c:url value="/activities/${activity.id}"/>"  class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">此 活 动 已 被 放 弃 </a> 
                        </c:when>
                        <c:when test="${signInUser.id == activity.createdBy.id}">
					       <a href="<c:url value="/activity/${activity.id}/upload"/>" class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">上 传 活 动 图 片 </a> 	         
					     </c:when>
				      	<c:when test="${activity.status eq '已结束'}">
                        	<a  href="<c:url value="/activities/${activity.id}"/>" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">已 结 束 </a> 
                        </c:when>
                        <c:when test="${activity.status eq '晒活动'}">
                        	<a href="<c:url value="/activity/${activity.id}/gallery"/>" class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">晒 活 动 中 </a> 
                        </c:when>                        
                        <c:when test="${activity.status eq '征集成员中'}">
					       <a href="<c:url value="/activity/${activity.id}/join"/>" class="track apply noauth record-exit" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">加 入 我 们 吧 Join </a> 
		                   <c:if test="${activity.apply==1}">
					       		<a class="other-jobs">加入该活动需要填写申请表</a> 
					       </c:if>
					     </c:when>
					    </c:choose>
				      </footer> 
			    </article> 
			      
		    </section> 
		 </div>
	</div>
		    
	<jsp:include page="/WEB-INF/views/comp/back.top.jsp" />
	<script type="text/javascript">
		adjustWebWidth();
	</script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrapx-popoverx.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.form.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.pnotify.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.imagesloaded.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.masonry.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.infinitescroll.js" />" ></script>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false&language=zh_cn&region=CN"></script>
<script type="text/javascript" src="<c:url value="/resources/js/gmap3.js" />"></script>
<script type="text/javascript">
	$(function(){
		
		$('.pin').each(function(){
			op.pin_bind_event($(this));
		});
		var $wf = $('#water-fall');
		
		$wf.masonry({
			itemSelector : '.pin',
		    columnWidth : 222,
		    gutterWidth: 15,
		    isAnimated: false,
		    animationOptions: {
		    	queue: false
		    },
		    isFitWidth: false
		});
		
		$wf.infinitescroll(
			{
				navSelector  : '#page-nav', // selector for the paged navigation
				nextSelector : '#page-nav a', // selector for the NEXT link (to page 2)
				itemSelector : '.pin', // selector for all items you'll retrieve
				debug        : false,
				animate	 	 : false,
				animationOptions: {
				    duration: 750,
				    easing: 'linear',
				    queue: false
				},
				loading: {
					selector: '#water-fall-wrapper',
					finishedMsg: '没有更多了',
					msgText: '加载中...',
					img: '<c:url value="/resources/img/big-loading.gif" />',
					speed: 0
				},
				state : {
					currPage: 0
				},
				pathParse: function() {
			        return ['<c:url value="/activity/${activity.id}/getJoiners" />',''];
			    }
			},
			// trigger Masonry as a callback
			function( newElements ) {
				// hide new items while they are loading
				var $newElems = $( newElements ).hide();
				$newElems.each(function(){
					op.pin_bind_event($(this));
				});
				$newElems.find(".timeago").timeago();
				// ensure that images load before adding to masonry layout
				//$newElems.imagesLoaded(function(){
					// show elems now they're ready
					$wf.append( $newElems ).masonry( 'appended', 
							$newElems, false, function(){
						$newElems.fadeIn('slow');
					});
				//}); 
			}
		);
	});
</script>
<script type="text/javascript" src="<c:url value="/resources/js/ga.js" />" ></script>
</body>
</html>