<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="SHORTCUT ICON" href= "<c:url value="/resources/img/head-logo.png" />" /> 
	<title>地图布局 在浙里——分享你我的社交</title>	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-base.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-theme.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/validationEngine.bootstrap.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap-formhelpers.css" />" />
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.1.7.1.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.init.js" />" ></script>
</head>
<body class="front">
	<jsp:include page="/WEB-INF/views/comp/header.jsp">
		<jsp:param name="tab" value="home"/>
	</jsp:include>
	<div id="water-fall-wrapper" class="main-wrapper">
		<jsp:include page="/WEB-INF/views/comp/spot.filter.bar.jsp" >
			<jsp:param name="filters" value="${filters}"/>
			<jsp:param name="viewType" value="mv"/>
		</jsp:include>
		<div id="map-view" class="board content-wrapper p-r" style="width: 1140px;">
			<div id="explore-map" style="width: 100%; height:600px;">
				<jsp:include page="/WEB-INF/views/comp/marker.tip.jsp"/>
				<div id="map-loading" class="p-a z-99 dis-n" style="top: 250px; width:100%">
					<div class="bg-black ta-c br-5 c-eee fs-16 fw-b p-15" 
						style="width:48px; height:48px; margin: 0 auto;">
						<p class="bg-big-loading-white" style="width:48px; height:48px;"></p>
					</div>
				</div>
				<div id="map-noti" class="p-a z-99 dis-n" style="top: 265px; width:100%">
					<div class="bg-black ta-c br-5 c-eee fs-16 fw-b p-15" style="width: 60%; margin: 0 auto;">更  多</div>
				</div>
				<div id="more-btn" class="p-a z-99 ta-c" style="bottom: 10px; width:100%">
					<button class="btn btn-large" style="width: 60%">更  多</button></div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		adjustWebWidth();
	</script>
	<div id="page-nav">
		<a href="<c:url value="/spots/search/marker?${qStr}no=0" />"></a>
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
<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.op.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap-formhelpers-datepicker.en_US.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap-formhelpers-datepicker.js" />" ></script>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false&language=zh_cn&region=CN"></script>
<script type="text/javascript" src="<c:url value="/resources/js/gmap3.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/marker.overlay.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/marker.overlay.manager.js" />"></script>
<script type="text/javascript">
	$(function(){
		
		var cityMeta = null;
		
		$.getJSON( '<c:url value="/citymeta" />', function(data){
			if(data && data.resultData){
				cityMeta = data.resultData;
				$('#explore-map').gmap3({
					action: 'init',
					options:{
						noClear: true,
						center: [cityMeta.lngLat[1], cityMeta.lngLat[0]],
						zoom: cityMeta.zoom,
						scrollwheel: true,
						mapTypeId: google.maps.MapTypeId.ROADMAP,
						mapTypeControl: false,
						zoomControl: true,
						zoomControlOptions: {
							style : google.maps.ZoomControlStyle.SMALL
						},
						streetViewControl: false
					},
					callback: function(){
						MarkerOverlayManager.myMap = $(this).gmap3('get');
						getMore();
					}
				});
			}
		});
		
		$('#map-view #more-btn').click(function(){
			getMore();
		});
		
		function getMore(){
			if($('#map-loading').css('display') 
					== 'block'){
				return;
			}
			var url = $('#page-nav a').attr('href');
			if(url.lastIndexOf('/end')!=-1){
				mapNoti('没有更多了');
				return;
			}
			$('#map-loading').show();
			$.getJSON(url, function(data){
				if(data && data.resultData){
					var pinMarkers = data.resultData;
					var len = pinMarkers.length;
					if(len==0){
						mapNoti('没有更多了');
						incrPageNo(true);
					}else{
						MarkerOverlayManager.draw(pinMarkers, true);
						incrPageNo(false);
					}
				}
			})
			.complete(function(){
				$('#map-loading').hide();
			});
		}
		
		var noti_timer = null;
		
		function mapNoti(msg){
			if(noti_timer!=null){
				clearTimeout(noti_timer);
			}
			$('#map-noti div').html(msg);
			$('#map-noti').fadeIn();
			noti_timer = setTimeout(function(){
				$('#map-noti').fadeOut('slow');
			}, 1500);
		}
		
		function incrPageNo(isEnd){
			var url = $('#page-nav a').attr('href');
			var lastIdx = url.lastIndexOf('=');
			var current_no = parseFloat(url.substring(lastIdx+1, url.length));
			if(!isEnd && !isNaN(current_no)){
				$('#page-nav a').attr('href', url.substring(0, lastIdx+1) + (++current_no));
			}else if(isEnd){
				$('#page-nav a').attr('href', url.substring(0, lastIdx+1) + 'end');
			}else{
				;//nothing
			}
		}
	});
</script>
<script type="text/javascript" src="<c:url value="/resources/js/ga.js" />" ></script>
</body>
</html>