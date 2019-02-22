<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/view/admin/include/global.java.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/view/admin/include/global.css.jsp"%>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
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
		<input type="hidden"  name="moduleId" value="${sysModule.moduleId }" />
		模块名称：<input type="text" name="moduleName" value="${sysModule.moduleName }" />
		</br>
		<input type="button" value="提交" onclick="save();"/> 
		<input type="button" value="取消" onclick="remake();"/>
	</form>
</body>
</html>