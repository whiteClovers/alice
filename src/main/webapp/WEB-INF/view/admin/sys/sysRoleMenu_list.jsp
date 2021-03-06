<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/view/admin/include/global.java.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <%@include file="/WEB-INF/view/admin/include/global.css.jsp"%>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
<title>模块管理</title>
<style>
a:link {
	text-decoration: none;
}
</style>
<script type="text/javascript">
	
	
	function deleteOne(roleMenuId){
		$.messager.confirm('Confirm','Are you sure want to delete record?',function(r){
			if(r){
				$.ajax({
					url:'delete.do',
					type:'post',
					data:{
						"roleMenuId":roleMenuId,
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
		var rows = $("#tableRoleMenu").datagrid('getSelections');//获取选中行的所有数据
		var ids = new Array();
		for(var i = 0; i < rows.length; i++){
			ids.push(rows[i].roleMenuId);
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
		$('#tableRoleMenu').datagrid({
			queryParams:$('#formQuery').serializeJSON()
		});
	} 
	
	
	function formatOperateColumn(value, row){
		return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\'' + row.roleMenuId + '\')">&nbsp;</a>' +
		'<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteOne(\'' + row.roleMenuId + '\')">&nbsp;</a>';
	}
	
	function editRow(roleMenuId){
		window.location.href='edit.do?roleMenuId='+ roleMenuId;
	}
	
	function insert(){
		window.location.href='edit.do';
	}
</script>
</head>
<body>

	<div id="toolbar">
		<form id="formQuery">
			<div style="padding:6px;">
				<span>菜单ID:</span>
				<input id="menuId" name="menuId" style="border:1px solid #ccc">
				<span>角色ID:</span>
				<input id="roleId" name="roleId" style="border:1px solid #ccc">
				<input type="button" value="查询" class="easyui-linkbutton" style="width:60px" onclick="onclick_query();"/>
			</div>
			<div>
				<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="insert();">新增</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="deleteRows()">删除</a>
			</div>
		</form>
	</div>
		<table id='tableRoleMenu' class="easyui-datagrid" title="客户管理"
			data-options="url:'listAjax.do' ,
			fit:true,toolbar:'#toolbar',collapsible:true,method:'post',pagination:'true',fitColumns:true">
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th data-options="field:'roleMenuId',width:180,align:'center'">角色菜单ID</th>
					<th data-options="field:'menuId',width:180,align:'center'">菜单ID</th>
					<th data-options="field:'roleId',width:180,align:'center'">角色ID</th>
					<th data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn">操作</th>
				</tr>
			</thead>
		</table>
</body>
</html>