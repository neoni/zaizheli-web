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
	<script type="text/javascript" src="<c:url value="/resources/js/ga.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.1.7.1.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.init.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/zaizheli.op.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.uploadify.min.js" />" ></script>

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
					       <input type="file" id="image_upload" name="image_upload">
					     </c:when>
				      	<c:when test="${activity.status eq '已结束'}">
                        	<a  href="<c:url value="/activities/${activity.id}"/>" data-action="view job application" data-from="job on team page" data-opportunity-visit-path="/teams/4f57ea5e8617b7000d000002/opportunities/176/visit" data-target-type="job-opportunity">已 结 束 </a>
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

		    </section>
		 </div>
	</div>

	<jsp:include page="/WEB-INF/views/comp/back.top.jsp" />
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
	<a id="sure" class="btn" act="<c:url value="/activity/${activity.id}/quit"/>"  >确定</a>
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
    </script><script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js" />" ></script>
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
		$("#form-feedback").validationEngine('attach', {
            promptPosition : "bottomRight", scroll: false
        });
		$('.pin').each(function(){
			op.pin_bind_event($(this));
		});
		$('#quit_act').click(function(){
		 	$('#myModal').modal('toggle');
		 });
		 $('#sure').click(function(){
		 	op.apply_quit(event.currentTarget);
		 	event.preventDefault();
		 	setTimeout(function(){window.location.reload();}, 1500);
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
