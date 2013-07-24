<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://zaizheli.net/functions" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>在浙里 在浙里——分享你我的社交</title>
	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-base.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-theme.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/validationEngine.bootstrap.css" />" />
	<script type="text/javascript" src="<c:url value="/resources/js/ga.js" />" ></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.1.7.1.js" />" ></script>
</head>
<body class="front">
	<jsp:include page="/WEB-INF/views/comp/header.jsp">
		<jsp:param name="tab" value="none"/>
	</jsp:include>
	<div class="main-wrapper mb-30">
		<div class="main block-h-c content-wrapper row-fluid p-r">
			<div class="span12 board">
				<div class="pl-30 pr-30 pb-20 pt-20 bb-divider clear">
					<a class="img mr-10 f-l" href="<c:url value="/profiles/${activity.createdBy.id}" />">
						<img width=60 height=60
							src="${f:avatarUrl(activity.createdBy.avatar, activity.createdBy.gender)}" /></a>
					<p class="fs-20"><a href="<c:url value="/profiles/${activity.createdBy.id}" />">${activity.createdBy.name}</a></p>
					<p class="fs-14 mb-0">
						<span class="timeago" 
							title="<fmt:formatDate value="${activity.createdAt}" pattern="yyyy-MM-dd HH:mm:ss Z"/>"></span>
						添加此八卦到&nbsp;
						<a class="" >${activity.type}</a>
					</p>
				</div>
				<div class="pl-30 pr-30 pb-20 pt-20">
					<a class="btn btn-success mr-5" href="#">
						<i class="icon-heart icon-white"></i>&nbsp;追踪
					</a>
					<a class="btn" href="#">
						<i class="icon-share-alt"></i>&nbsp;转发
					</a>
				</div>
				<div class="pl-30 pr-30 pb-20 p-r">
					<c:choose>
					<c:when test="${activity.image.orgSize[1]>=1100}">
						<a class="img" href="#">
							<img class="block-h-c" width="1100" height="${(1100*activity.image.orgSize[0])/activity.image.orgSize[1]}" 
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
				<div class="pl-30 pr-30 pb-20 p-r">
					<c:if test="${not empty activity.title}">
						<p class="fs-16 fw-b">${activity.title}</p>
					</c:if>
					
					<p class="fs-14">${activity.content}</p>
				
				</div>
			</div>
			
		</div>
	</div>
	<script type="text/javascript">
		adjustWebWidth();
	</script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.timeago.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-ui-1.8.18.custom.min.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.scrollTo.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.form.js" />"></script>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false&language=zh_cn"></script>
<script type="text/javascript" src="<c:url value="/resources/js/gmap3.js" />"></script>
<script type="text/javascript">
	$(function(){
		 $(".timeago").timeago();
	});
</script>
</body>
</html>