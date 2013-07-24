<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://zaizheli.net/functions" prefix="f" %>
<c:if test="${not empty comments}">
<c:forEach var="comment" items="${comments}">
<c:if test="${comment.floor != 1}" >
 	<div style="border-bottom:2px dashed #F9DBB4; margin:3em 6em 3em; width:68em; color:#325D72"></div>
 </c:if>
<li> 
	<div class="number"> 
          <span>${comment.floor}</span> 
    </div> 
	<a class="img f-l" href="<c:url value="/profiles/${comment.createdBy.id}" />">
	<img width=60 height=60
		src="${f:avatarUrl(comment.createdBy.avatar, comment.createdBy.gender)}" /></a>
	<p class="fs-20"><a href="<c:url value="/profiles/${comment.createdBy.id}" />">${comment.createdBy.name}</a></p>
	<p class="fs-14 mb-0">
		<span> <fmt:formatDate value="${comment.createdAt}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
	</p>
	<br>
	<div  style="background-color:#343131 float:right;"></div> 
	<p style="padding-left:100px;">${comment.content}</p> 
</li> 
<p class="f-r"> 
	<a href="<c:url value="/comment/agree/${comment.id}" />" onclick="op.give_cagreement(event.currentTarget); event.preventDefault(); " class="cmt_tool btn-info btn-mini" ><i class="icon-heart icon-white"></i>&nbsp;&nbsp;<span>赞(${comment.agreeCount})&nbsp;</span></a>
	<a id="toReply" href="#comment" user-id="${comment.createdBy.id}" class="cmt_tool btn-info btn-mini" style="padding-left:5px;"><i class="icon-comment icon-white"></i>&nbsp;<span>&nbsp;回复&nbsp;</span></a> 
</p>
</c:forEach>
</c:if>