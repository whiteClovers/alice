<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- <%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %> --%>
<script type="text/javascript" src="/Alice/resource/admin/third/jquery/jquery.min.js"></script>
 <script type="text/javascript" src="/Alice/resource/admin/third/easyui/jquery.easyui.min.js"></script> 
<script type="text/javascript" src="/Alice/resource/admin/third/easyui/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="/Alice/resource/admin/third/jquery/jquery.serializejson.js"></script>
<script type="text/javascript" src="/Alice/resource/admin/js/common/common.js"></script>

 <link rel="stylesheet" type="text/css" href="/Alice/resource/admin/third/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="/Alice/resource/admin/third/easyui/themes/icon.css">
<title>Insert title here</title>
<script type="text/javascript">
	function remake(){
		
		window.location.href = 'list.do';
	}
	
	function save(){
		$.ajax({
			type:"post",
			url:'saveAjax.do',
			data:$('#form').serialize(),
			success:function(data){
				alert(data)
				if(data=="操作成功"){
					window.location.href = 'list.do';
				}else{
					alert(data.message)
				}
			}
		});
	}
</script>
</head>
<body>
	<form  id="form">
		<input type="hidden" name="menuId" id="menuId" value="${sysMenu.menuId }" />
		模块ID：<input type="text" name="moduleId" id="moduleId" value="${sysMenu.moduleId }" />
		菜单名称：<input type="text" name="menuName" id="menuName" value="${sysMenu.menuName }" />
		菜单地址：<input type="text" name="menuUrl" id="menuUrl" value="${sysMenu.menuUrl }" /><br/>
		<input type="button" value="提交" onclick="save();"/> 
		<input type="button" value="取消" onclick="remake();"/>
	</form>
</body>
</html>