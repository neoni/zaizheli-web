<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>登录 在浙里 分享你我的社交</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-base.css" />" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/zaizheli-theme.css" />" />
</head>
<body>
	<div class="container">
		<div class="row mt-30" >
			<div class="span8 offset2 mt-20">
				<div class="hero-unit board">
					<h1>在浙里</h1>
					<p>完成登录，开始分享你我的社交.</p>
					<form:form cssClass="sign-in mt-30" modelAttribute="forgetPasswordVo" method="post">
						<div class="row-fluid ">
							<div class="f-l"><input id="user-name" class="input-xlarge" name="email" type="text"
								placeholder="在浙里注册邮箱" autocomplete="off" value="<c:out value="${forgetPasswordVo.email}" />"/></div>
							<div class="f-l hint"><form:errors path="email" cssClass="alert alert-error" /></div>
						</div>	
						<div class="row-fluid mt-10">
							 <div class="span6">
							 	<button type="submit" class="btn btn-primary btn-large">登 录</button>
							 	<a class="btn btn-large ml-10" href="<c:url value="/" />">返回</a></div>
						</div>
					</form:form>
					<p><a href="<c:url value="/signup" />">还没有在浙里账号？立即注册！</a></p>
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript" src="<c:url value="/resources/js/ga.js" />" ></script>
</body>
</html>