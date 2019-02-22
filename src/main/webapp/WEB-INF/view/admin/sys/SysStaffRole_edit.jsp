<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>

<script type="text/javascript" src="${ctxResource }/resource/admin/script/usr/usrInformation.js"></script>

<title>员工角色信息</title>

</head>
<body style="margin: 0;">
	<div class="easyui-panel" data-options="fit:true,border:false"; title="新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id='formEdit'>
	    	<ul class="form_layout">
	    		
	    			<input type="hidden" name="staffRoleId" id="staffRoleId" value="${sysStaffRole.staffRoleId }" />
	    		
	    		<li>
	    			<span>员工id：</span>
	    			<input type="text" name="staffId" id="staffId" value="${sysStaffRole.staffId }" />
	    		</li>
	    		<li>
	    			<span>角色id：</span>
	    			<input type="text" name="roleId" id="roleId" value="${sysStaffRole.roleId }" />
	    		</li>
	    			    		
	    		<%-- <li>
	    			<span>用户密码：</span>
	    			<input type="text" name="userPwd" id="userPwd"  value="${usrInformation.userPwd }" />
	    		</li>
	    		
	    		<li>
	    			<span>用户姓名：</span>
	    			<input type="text" name="userName" id="userName"  value="${usrInformation.userName }" />
	    		</li>	
	    		
	    		<li>
	    			<span>身份证：</span>
	    			<input type="text" name="userIdcard" id="userIdcard"  value="${usrInformation.userIdcard }" />
	    		</li>
	    		
	    		<li>
	    			<span>信用分：</span>
	    			<input type="text" name="userCredit" id="userCredit"  value="${usrInformation.userCredit }" />
	    		</li>
	    		
	    		<li>
	    			<span>注册时间：</span>
	    			<input type="text" name="userRegtime" id="userRegtime"  value="${usrInformation.userRegtime }" />
	    		</li>
	    		
	    		<li>
	    			<span>可用额度：</span>
	    			<input type="text" name="userAmount" id="userAmount"  value="${usrInformation.userAmount }" />
	    		</li> 
	    		
	    		<li>
	    			<span>手机号：</span>
	    			<input type="text" name="userTel" id="userTel"  value="${usrInformation.userTel }" />
	    		</li>
	    		
	    		<li>
	    			<span>邮箱：</span>
	    			<input type="text" name="userEmail" id="userEmail"  value="${usrInformation.userEmail }" />
	    		</li>
	    		
	    		<li>
	    			<span>用户地址：</span>
	    			<input type="text" name="userAddress" id="userAddress"  value="${usrInformation.userAddress }" />
	    		</li>
	    		
	    		<li>
	    			<span>黑名单：</span>
	    			<input type="text" name="userIsblacklist" id="userIsblacklist"  value="${usrInformation.userIsblacklist }" />
	    		</li>   		 --%>
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