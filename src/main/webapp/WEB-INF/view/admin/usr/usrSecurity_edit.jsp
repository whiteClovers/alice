<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>

<script type="text/javascript" src="${ctxResource }/resource/admin/script/usr/usrSecurity.js"></script>

<title>用户信息</title>

<style type="text/css">

.userId{
	width:173px;
}

</style>

</head>
<body style="margin: 0;">
	<div class="easyui-panel" data-options="fit:true,border:false"; title="新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id='formEdit'>
	    	<ul class="form_layout">
	    		
	    			<input type="hidden" name="securityId" id="securityId" value="${usrSecurity.securityId }" />
	    		
	    		<li>
	    			<span>用户名:</span>
					<select name="userId" class="userId">
						<option value="">-</option>
						<c:forEach items="${listUsrInformation }" var="usrInformation">
							<option <c:if test='${usrInformation.userId== usrSecurity.userId}'>selected="selected"</c:if> value="${usrInformation.userId }">
								${usrInformation.userName }
							</option>
						</c:forEach>
					</select>
	    		</li>
	    			    		
	    		<li>
	    			<span>担保编号：</span>
	    			<input type="text" name="securityCode" id="securityCode"  value="${usrSecurity.securityCode }" />
	    		</li>
	    		
	    		<li>
	    			<span>担保属性：</span>
	    			<input type="text" name="securityRelation" id="securityRelation"  value="${usrSecurity.securityRelation }" />
	    		</li>	
	    		
	    		<li>
	    			<span>担保姓名：</span>
	    			<input type="text" name="securityName" id="securityName"  value="${usrSecurity.securityName }" />
	    		</li>
	    		
	    	</ul>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a class="easyui-linkbutton" type="button"  onclick="onclick_save();" >保存</a>
	    	<!-- 暂时未用 -->
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">关闭</a>
	    </div>
	    </div>
	</div>
</body>
</html>