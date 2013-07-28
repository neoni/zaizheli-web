<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://zaizheli.net/functions" prefix="f" %>
<!DOCTYPE>
<html style=" background:none repeat scroll 0 0 #CCCCCC">
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
<body class="front" style="padding-top:46px; ">
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
				<c:choose>
				<c:when test="${signInUser.id == activity.createdBy.id}">
				<li><a href="<c:url value="/activity/${activity.id}/edit"/>" >活动编辑</a></li>
				<li><a href="<c:url value="/activity/${activity.id}/applications"/>" >申请处理</a></li>
				</c:when>
				<c:otherwise>
				<li><a href="<c:url value="/activity/${activity.id}/joiners"/>" >参加人员</a></li>
				</c:otherwise>
				</c:choose>
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
				      		<ul id="profile-nav-tabs" class="nav nav-tabs" >
				    		<li class="active in">
			    			 	<a class="app_tab" data-toggle="tab " href="#in-list">申请中( ${ activity.inJudgingCount} )</a></li>
			    			<li class="agree">
			    			<a class="app_tab" data-toggle="tab" href="#agree-list" 
			    			data-action="<c:url value="/activity/${activity.id}/applications/1"/>">已申请加入( ${activity.currentNum-1} )</a></li>
			    			<li class="refuse">
			    			<a class="app_tab" data-toggle="tab" href="#refuse-list" 
			    			data-action="<c:url value="/activity/${activity.id}/applications/2"/>">已拒绝( ${activity.applicationCount-activity.inJudgingCount-activity.currentNum + 1})</a></li>
				    	</ul>
				      </header> 
				     <div class="content cf" style="padding:0px;"> 
				       <div class="tab-content bg-gray p-20" id="water-fall-wrapper" style="background:#DDDFEF;-moz-transition: left 0.5s ease-in-out 0s, top 0.5s ease-in-out 0s;">	
						    <div id="in-list" class="tab-pane active"  style="margin: 0 auto;">
						    	<c:import url="/activity/${activity.id}/applications/0" ></c:import>
						    </div>
						    <div id="agree-list" class="tab-pane">
						    	<div class="p-8 lh-16 ta-c loading-box">
						    		<a href="" class="bg-h-loading pl-85 c-888" >加载中...</a>
						    	</div>
						    </div>
						    <div id="refuse-list" class="tab-pane">
						    	<div class="p-8 lh-16 ta-c loading-box">
						    		<a href="" class="bg-h-loading pl-85 c-888" >加载中...</a>
						    	</div>
						    </div>
						</div>	
					    <div id="in-page-nav">
							<a href="<c:url value="/activity/${activity.id}/applications/0" />"></a>
						</div>
						<div id="agree-page-nav">
							<a href="<c:url value="/activity/${activity.id}/applications/1" />"></a>
						</div>	
						<div id="refuse-page-nav">
							<a href="<c:url value="/activity/${activity.id}/applications/2" />"></a>
						</div>
				      </div>
				 
				      
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

		$('#profile-nav-tabs .in a').click(function (e) {
		    e.preventDefault();
		    $(this).tab('show');
	    })
		$('#profile-nav-tabs .agree a').click(function(){
			var $this = $(this);
			if(! $(this).data('first-load')){
				var data_action = $(this).attr('data-action');
				var c = $('#agree-list');
				var loading_box = c.find('.loading-box');
				$.ajax({
					url: data_action,
					beforeSend: function(){
						loading_box.show();
					},
					success: function(data) {
						if($.trim(data)){
							var act = $(data).prependTo(c);
							act.each(function(){
								op.act_bind_event($(this));
							});
						}
					},
					complete: function(){
						loading_box.hide();
						$this.data('first-load', true);
					}
				});
			}
		});
		$('#profile-nav-tabs .refuse a').click(function(){
			var $this = $(this);
			if(! $(this).data('first-load')){
				var data_action = $(this).attr('data-action');
				var c = $('#refuse-list');
				var loading_box = c.find('.loading-box');
				$.ajax({
					url: data_action,
					beforeSend: function(){
						loading_box.show();
					},
					success: function(data) {
						if($.trim(data)){
							var act = $(data).prependTo(c);
							act.each(function(){
								op.act_bind_event($(this));
							});
						}
					},
					complete: function(){
						loading_box.hide();
						$this.data('first-load', true);
					}
				});
			}
		});
			
		var $ial = $('#in-list');
		var $aal = $('#agree-list');
		var $ral = $('#refuse-list');	
		$ial.masonry({
			itemSelector : '.pin',
		    columnWidth : 222,
		    gutterWidth: 15,
		    isAnimated: false,
		    animationOptions: {
		    	queue: false
		    },
		    isFitWidth: false
		});
		
		$ial.infinitescroll(
			{
				navSelector  : '#in-page-nav', // selector for the paged navigation
				nextSelector : '#in-page-nav a', // selector for the NEXT link (to page 2)
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
			        return ['<c:url value="/activity/${activity.id}/applications/0" />',''];
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
		$ral.masonry({
			itemSelector : '.pin',
		    columnWidth : 222,
		    gutterWidth: 15,
		    isAnimated: false,
		    animationOptions: {
		    	queue: false
		    },
		    isFitWidth: false
		});
		
		$ral.infinitescroll(
			{
				navSelector  : '#refuse-page-nav', // selector for the paged navigation
				nextSelector : '#refuse-page-nav a', // selector for the NEXT link (to page 2)
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
			        return ['<c:url value="/activity/${activity.id}/applications/2" />',''];
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
		$aal.masonry({
			itemSelector : '.pin',
		    columnWidth : 222,
		    gutterWidth: 15,
		    isAnimated: false,
		    animationOptions: {
		    	queue: false
		    },
		    isFitWidth: false
		});
		
		$aal.infinitescroll(
			{
				navSelector  : '#agree-page-nav', // selector for the paged navigation
				nextSelector : '#agree-page-nav a', // selector for the NEXT link (to page 2)
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
			        return ['<c:url value="/activity/${activity.id}/applications/1" />',''];
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