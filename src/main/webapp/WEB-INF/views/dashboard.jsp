<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://zaizheli.net/functions" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>${user.name} 在浙里——分享你我的社交</title>
	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-base.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-theme.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/validationEngine.bootstrap.css" />" />
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.1.7.1.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.init.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.op.js" />" ></script>
</head>
<body class="front">
	<jsp:include page="/WEB-INF/views/comp/header.jsp">
		<jsp:param name="tab" value="dashboard"/>
	</jsp:include>
	<div class="main-wrapper ml-10 mt-20 mb-30">
		<div class="main block-h-c content-wrapper row-fluid p-r">
			<div class="span8 board">
				<div class="pl-30 pr-30 pt-20">
				    <ul id="profile-nav-tabs" class="nav nav-tabs fs-14" 
				    	style="margin-left: -30px; margin-right: -30px;  margin-bottom:0px">				  
				    		<li class="follow active" style="margin-left:30px;">
			    			<a data-toggle="tab" href="#follow-act-list">好友的动态</a></li>
			    			<li class="track">
			    			<a data-toggle="tab" href="#track-act-list" 
			    				data-action="<c:url value="/activities/${user.id}/track/0"/>">关注的活动</a></li>
				    </ul>
			    </div>
			    
			    
			</div>
			<div class="span4">
				<c:import url="/profiles/${user.id}/private"></c:import>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/comp/back.top.jsp" />
	<script type="text/javascript">
		adjustWebWidth();
	</script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.timeago.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.pnotify.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-ui-1.8.18.custom.min.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.scrollTo.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.form.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.imagesloaded.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.masonry.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.infinitescroll.js" />" ></script>
<script type="text/javascript">
	$(function(){
		$(".timeago").timeago();
		$('.act-list').each(function(){
			op.act_bind_event($(this));
		});
		
		$('#profile-nav-tabs .track a').click(function(){
			var $this = $(this);
			if(! $(this).data('first-load')){
				var data_action = $(this).attr('data-action');
				var c = $('#track-act-list');
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
							act.find('.timeago').timeago();
						}
					},
					complete: function(){
						loading_box.hide();
						$this.data('first-load', true);
					}
				});
			}
		});
			
		var $fal = $('#follow-act-list');
		var $tal = $('#track-act-list');
		
		$fal.infinitescroll(
			{
				navSelector  : '#follow-page-nav', // selector for the paged navigation
				nextSelector : '#follow-page-nav a', // selector for the NEXT link (to page 2)
				itemSelector : '.act-list', // selector for all items you'll retrieve
				debug        : false,
				animate	 	 : false,
				animationOptions: {
				    duration: 750,
				    easing: 'linear',
				    queue: false
				},
				loading: {
					selector: '#act-list-wrapper',
					finishedMsg: '没有更多了',
					msgText: '动态加载中...',
					img: '<c:url value="/resources/img/big-loading.gif" />',
					speed: 0
				},
				state : {
					currPage: 0
				},
				pathParse: function() {
			        return ['<c:url value="/activities/${user.id}/follow/" />', ''];
			    }
			},
			function( newElements ) {
				var $newElems = $( newElements );
				$newElems.find(".timeago").timeago();
				$newElems.each(function(){
					op.act_bind_event($(this));
				});
				$fal.append( $newElems );
			}
		);
		$tal.infinitescroll(
				{
					navSelector  : '#track-page-nav', // selector for the paged navigation
					nextSelector : '#track-page-nav a', // selector for the NEXT link (to page 2)
					itemSelector : '.act-list', // selector for all items you'll retrieve
					debug        : false,
					animate	 	 : false,
					animationOptions: {
					    duration: 750,
					    easing: 'linear',
					    queue: false
					},
					loading: {
						selector: '#act-list-wrapper',
						finishedMsg: '没有更多了',
						msgText: '动态加载中...',
						img: '<c:url value="/resources/img/big-loading.gif" />',
						speed: 0
					},
					state : {
						currPage: 0
					},
					pathParse: function() {
				        return ['<c:url value="/activities/${user.id}/track/" />', ''];
				    }
				},
				function( newElements ) {
					var $newElems = $( newElements );
					$newElems.find(".timeago").timeago();
					$newElems.each(function(){
						op.act_bind_event($(this));
					});
					$tal.append( $newElems );
				}
			);
	});
</script>
<script type="text/javascript" src="<c:url value="/resources/js/ga.js" />" ></script>
</body>
</html>