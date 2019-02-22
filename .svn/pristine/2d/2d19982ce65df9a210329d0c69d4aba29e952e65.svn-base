<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/view/admin/include/global.java.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

 <%@include file="/WEB-INF/view/admin/include/global.css.jsp"%>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
<title>菜单管理</title>
<style>
a:link {
	text-decoration: none;
}
</style>
<script >
	
	
	function deleteOne(menuId){
		$.messager.confirm('Confirm','Are you sure want to delete record?',function(r){
			if(r){
				$.ajax({
					url:'delete.do',
					type:'post',
					data:{
						"menuId":menuId,
					},
					success:function(data){
						if(data=="删除成功"){
							
							onclick_query();
						}else{
							alert(data.message);
						}
					}
				});
			}
		});
	}
	
	function deleteRows(){
		var rows = $("#tableMenu").datagrid('getSelections');//获取选中行的所有数据
		var ids = new Array();
		for(var i = 0; i < rows.length; i++){
			ids.push(rows[i].menuId);
		}
		alert(ids);
		$.ajax({
			type:'post',
			url:'deleteRowsAjax.do',
			data:{
				"ids":ids
			},
			success:function(data){
				if(data==''|| data==null){
					onclick_query();
				}else{
					alert(data);
				}
			}
		});
	}
	
	
	function onclick_query(){
		$('#tableMenu').datagrid({
			queryParams:$('#formQuery').serializeJSON()
		});
	} 
	
	
	function formatOperateColumn(value, row){
		return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\'' + row.menuId + '\')">&nbsp;</a>' +
		'<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteOne(\'' + row.menuId + '\')">&nbsp;</a>';
	}
	
	function editRow(menuId){
		window.location.href='edit.do?menuId='+ menuId;
	}
	
	/* function insert(){
		window.location.href='edit.do';
	} */
</script>
</head>
<body>

		<div id="toolbar">
		<form id="formQuery">
			<div style="padding:6px;">
				<span>菜单名:</span>
				<input id="menuName" name="menuName" style="border:1px solid #ccc">
				<a class="easyui-linkbutton" style="width:60px" onclick="onclick_query()">查询</a>
			</div>
			
			
			<div>
				<a class="easyui-linkbutton" iconCls="icon-add" plain="true" href="edit.do">新增</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="deleteRows()">删除</a>
			</div>
		</form>
		</div>
		<table id='tableMenu' class="easyui-datagrid" title="菜单管理" 
			data-options="url:'listAjax.do' ,
			fit:true,toolbar:'#toolbar',collapsible:true,method:'post',pagination:'true',fitColumns:true">
			
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th data-options="field:'menuId',width:180,align:'center'">菜单ID</th>
					<th data-options="field:'moduleId',width:200,align:'center'">模块ID</th>
					<th data-options="field:'menuName',width:180,align:'center'">菜单名称</th>
					<th data-options="field:'menuUrl',width:80,align:'center'">菜单地址</th>
					<th data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn">操作</th>
				</tr>
			</thead>
		</table>
</body>
</html>