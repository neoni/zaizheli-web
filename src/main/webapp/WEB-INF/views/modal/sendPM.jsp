<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/validationEngine.bootstrap.css" />" />

<div id="pmModal" class="mymodal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="mymodal-content">
		<h2 id="myModalLabel" style="text-align:center;">私 信</h2>
		<form id="pmForm" modelAttribute="PMVo" method="post" action="<c:url value="/message/pm/create" />">
			<input name="to" value="" id="to" type="hidden"> 
			<input name="base" value="" id="base" type="hidden"> 
			<div class="control-group " >
				<div class="controls" style="margin-bottom:12px;margin-left:20px">发&nbsp;&nbsp;给: <span id="sendto" style="margin-left:25px;";></span></div>
				<div class="controls"  style="margin-bottom:12px;margin-left:20px">标&nbsp;&nbsp;题:
				<input name="title"  id="title" class="validate[required,maxSize[30]]" style="margin-left:25px; width:83%"></div>   
				<div class="controls" style="margin-left:20px">内&nbsp;&nbsp;容：	<br>
					<textarea id="content" name="content" rows="6" cols="20" class="validate[required,maxSize[400]]" style="margin-top:12px;width:96%; border-color: rgb(232, 232, 232); border-style: solid; border-width: 1px; font-size: 12px;" ></textarea>
				</div>
			</div>
			<button class="btn btn-ora btn-large" style="margin-left:45%" type="submit" id="send">发 送</button>
		</form>
	</div>
</div>
<script type="text/javascript" src="<c:url value="/resources/languages/zh-cn/jquery.validationEngine.lang.js" />" ></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.validationEngine.js" />" ></script>
<script type="text/javascript">
	$("#pmForm").validationEngine('attach', {
		promptPosition : "bottomLeft", 
		scroll: false	
	});
	$(function(){
	    $('#send').click(function(){
	    	$('#pmForm').ajaxForm({ 
	        	dataType:  'json', 
	        	success: function(data){
						  if(!data) return;
						  if(data && data.resultCode == 'NEED_SIGNIN'){
						  	    window.location.href= web_context + "/signin";
						  }
						  if(data && data.resultCode == 'INVALID'){
						  	    alert(data.exceptionMsg);
						  }
						  if(data && data.resultCode == 'SUCCESS'){
						   		$('#pmModal').mymodal('hide');
						   		$("button[type=reset]").trigger("click");
						  }
				}
	    	}); 	 
	    })
	});
</script>
