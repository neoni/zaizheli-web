<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://zaizheli.net/functions" prefix="f" %>
<c:if test="${not empty pins}">
<c:forEach var="pin" items="${pins}">
<div class="thumbnail pin wft" data-act-id="${pin.actId}">
	<div class="op-view p-r">
		<c:choose>
		<c:when test="${pin.imageHeight > 800}">
			<a class="img long" href="<c:url value="/activities/${pin.activityId}" />">
			<img alt="${pin.title}" width=192 height=${pin.imageHeight} src="${pin.imageUrl}">
			<span class="stop"></span></a>
		</c:when>
		<c:otherwise>
			<a class="img" href="<c:url value="/activities/${pin.activityId}" />">
			<img alt="${pin.title}" width=192 height=${pin.imageHeight} src="${pin.imageUrl}"></a>
		</c:otherwise>
		</c:choose>
		<div class="op-list p-a dis-n " style="top:8px; right: 2px"><ul class="ls-n ta-r">
			<li><a class="btn mb-5 btn-success track" act="<c:url value="/ops/track/${pin.activityId}" />"
				style="margin-bottom:5px;" onclick="op.change_track(event.currentTarget); event.preventDefault();">
				<i class="icon-star icon-white"></i>&nbsp;<span>追踪(${pin.trackCount})</span></a></li>
			<li><a class="btn mb-5 btn-info" act="<c:url value="/ops/share/${activity.id}" />"
				style="margin-bottom:5px;" onclick="op.show_forward(event.currentTarget); event.preventDefault();">
				<i class="icon-share-alt icon-white"></i>&nbsp;<span>转发(${pin.shareCount})</span></a></li>
			<li><a class="btn mb-5 btn-danger" act="<c:url value="/ops/agree/${pin.activityId}" />"
				style="margin-bottom:5px;" onclick="op.give_agreement(event.currentTarget); event.preventDefault(); ">
				<i class="icon-heart icon-white"></i>&nbsp;&nbsp;<span>赞(${pin.agreeCount})&nbsp;</span></a></li>
		</ul></div>
	</div>
	<div class="caption">
		<p><a href="#" data-id="${pin.placeId}" data-type="placemap" 
			data-html="true" data-toggle="popoverx" data-original-title="详细地图"
			data-city="${pin.city}" data-lngLat="${pin.lngLat[1]},${pin.lngLat[0]}">
			<i class="icon-map-marker"></i>${pin.placeAddr}</a></p>
		
		<h5>${pin.title}</h5>
	</div>
	
	<div class="convo clear">
		<p class="clear mb-0">
			<span class="c-333"><i class="icon-bookmark"></i>&nbsp;&nbsp;参与人数(${pin.currentNum})&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
			<span class="c-333"><i class="icon-comment"></i>评论(${pin.commentCount})</span> 
		</p>
	</div>
 
	<div class="convo clear" style="border-top:1px solid white; border-bottom:1px solid #EDEDED;">
		<p class="clear mb-0">
			<a class="img f-l mr-5 mb-5" href="<c:url value="/profiles/${pin.createdById}" />"
				data-id="${pin.createdById}" data-type="namecard" data-original-title="用户信息"
				data-html="true" data-trigger="manual" data-toggle="popoverx">
				<img src="${pin.createdByAvatarUrl}" width=30 height=30 /></a>
			<a class="" href="<c:url value="/profiles/${pin.createdById}" />" >${pin.createdByName}</a>
			&nbsp;在&nbsp;
			<a href="<c:url value="/?pinyin=quanguo&type=${pin.type}" />">${pin.type}</a>&nbsp;中创建了此活动，快来围观吧<br>		
			<span style="float:right">(<span class="timeago" title="<fmt:formatDate 
				value="${pin.createdAt}" pattern="yyyy-MM-dd HH:mm:ss Z"/>"></span>)</span>
		</p>
	</div>

	
	
</div>
</c:forEach>
</c:if>
