<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>

<script type="text/javascript" src="${ctxResource }/resource/admin/script/bas/customer.js"></script>

<title>Insert title here</title>

</head>
<body style="margin: 0;">
	<div class="easyui-panel" data-options="fit:true,border:false"; title="防重表新增|防重表修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id='formEdit'>
	    	<input type="hidden" name="avoidRepeatId" id="avoidRepeatId" value="${avoidRepeat.avoidRepeatId }" />
	    	<ul class="form_layout">
	    		<li>
	    			<span>防重编号：</span>
	    			<input type="text" name="avoidCode" id="avoidCode" value="${avoidRepeat.avoidCode }" />
	    		</li>
	    		<li>
	    			<span>还款状态：</span>
	    			<input type="text" name="repeatLoanStatus" id="repeatLoanStatus"  value="${avoidRepeat.repeatLoanStatus }" />
	    		</li>
	    		<li>
	    			<span>身份证：</span>
	    			<input type="text" name="userIdcard" id="userIdcard"  value="${avoidRepeat.userIdcard }" />
	    		</li>	    		
	    	</ul>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a class="easyui-linkbutton" type="button"  onclick="onclick_save();" >保存</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">关闭</a>
	    </div>
	    </div>
	</div>
</body>
</html>