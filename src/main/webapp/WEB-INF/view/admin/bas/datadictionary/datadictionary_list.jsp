<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/view/admin/include/global.java.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/WEB-INF/view/admin/include/global.css.jsp"%>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
<title>数据字典管理</title>

<style>
a:link {
	text-decoration: none;
}
</style>

<script>
	function onclick_query() {
		//var queryParams = $('#formCustomer').serialize() ;
		$('#dataGridCustomer').datagrid({
			/* queryParams:{
				"name":$('#name').val()
			} */
			queryParams : $('#formQuery').serializeJSON()
		});
	}

	function onclick_deleteRows() {
		var rows = $("#dataGridCustomer").datagrid('getSelections');//获取选中行的所有数据
		var ids = new Array();//构造id的数组
		for (var i = 0; i < rows.length; i++) {
			ids.push(rows[i].dataDictionaryId);
		}
		//alert(ids) ;
		$.ajax({
			type : 'post',
			url : 'deleteRowsAj.do',
			async : true,
			data : {
				"ids" : ids
			},//提交 id数组
			success : function(data) {
				if (data == '' || data == null) {
					onclick_query();
				} else {
					alert(data);
				}
			}

		});

	}

	function formatOperateColumn(value, row) {
		return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\''
				+ row.dataDictionaryId
				+ '\')">&nbsp;</a>'
				+ '<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteOne(\''
				+ row.dataDictionaryId + '\')">&nbsp;</a>';
	}

	function editRow(id) {
		window.location.href = 'edit.do?dataDictionaryId=' + id;
	}

	function deleteOne(id) {
		$.messager.confirm('Confirm',
				'Are you sure you want to delete record?', function(r) {
					if (r) {
						$.ajax({
							async : true, //是否异步
							type : "post",
							url : 'deleteAj.do?dataDictionaryId=' + id,
							success : function(data) {
								if (data == '' || data == null) {//成功
									$.messager.alert('提示', '删除成功');
									onclick_query();
								} else {//失败
									alert(data.message);
								}
							}
						});
					}
				});
	}
</script>
</head>

<body>
	<div id="toolbar">
		<form id="formQuery">
			<form id="formQuery">
			<div style="padding: 6px;">
				<span>数据字典编号:</span> 
					<input name="dataDictionaryCode" id="dataDictionaryCode"  style="border: 1px solid #ccc"> 
				<span>数据字典lable:</span> 
					<input name="dataDictionaryLabel" id="dataDictionaryLabel" style="height: 20px; border: 1px solid #ccc"> 
				<a href="#" class="easyui-linkbutton" style="width: 60px" onclick="onclick_query();">查询</a>
			</div>
		</form>
		</form>

		<div>
			<a class="easyui-linkbutton" iconCls="icon-add" plain="true" href="edit.do">新增</a> <a class="easyui-linkbutton"
				iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
			<a class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="onclick_deleteRows();" href="javascript:void(0);">删除</a>
		</div>
	</div>
	<!-- 修改id 和 url  -->
	<table id='dataGridCustomer' class="easyui-datagrid" title="数据字典管理"
		data-options="url:'pageAjax.do' ,
			fit:true,toolbar:'#toolbar',collapsible:true,method:'post',pagination:'true',fitColumns:true">
		<thead>
			<tr>
				<th data-options="field:'ck',checkbox:true"></th>
				<th data-options="field:'dataDictionaryId',width:180,align:'center'">数据字典ID</th>
				<th data-options="field:'dataDictionaryCode',width:60,align:'center'">数据字典编号</th>
				<th data-options="field:'dataDictionaryLabel',width:60,align:'center'">数据字典lable</th>
				<th data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn">操作</th>
			</tr>
		</thead>
	</table>

</body>

</html>