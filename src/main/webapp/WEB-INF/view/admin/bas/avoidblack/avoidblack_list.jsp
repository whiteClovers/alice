<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/admin/include/global.java.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/view/admin/include/global.css.jsp"%>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
<title>防黑表管理</title>
<style>
.datagrid-pager{
	height:50px;
}
</style>
<script type="text/javascript">
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
			ids.push(rows[i].avoidBlackId);
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
				+ row.avoidBlackId
				+ '\')">&nbsp;</a>'
				+ '<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteOne(\''
				+ row.avoidBlackId + '\')">&nbsp;</a>';
	}

	function editRow(id) {
		window.location.href = 'edit.do?avoidBlackId=' + id;
	}

	function deleteOne(id) {
		$.messager.confirm('Confirm',
				'Are you sure you want to delete record?', function(r) {
					if (r) {
						$.ajax({
							async : true, //是否异步
							type : "post",
							url : 'deleteAj.do?avoidBlackId=' + id,
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
<body style="margin-top: -20px;">
	<div id="toolbar">
		<form id="formQuery">
			<div style="padding: 6px;">
				<span>防黑编号:</span> 
					<input name="avoidBlackCode" id="avoidBlackCode"  style="border: 1px solid #ccc"> 
				<span>银行名字:</span> 
					<input name="bankName" id="bankName" style="height: 20px; border: 1px solid #ccc"> 
				<span>用户身份证:</span> 
					<input name="userIdcard" id="userIdcard"  style="border: 1px solid #ccc"> 
				<a href="#" class="easyui-linkbutton" style="width: 60px" onclick="onclick_query();">查询</a>
			</div>
		</form>
		<div>
			<a class="easyui-linkbutton" iconCls="icon-add" plain="true"
				href="edit.do">新增</a> <a href="#" class="easyui-linkbutton"
				iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
			<a class="easyui-linkbutton" iconCls="icon-remove" plain="true"
				type="button" onclick="onclick_deleteRows();"
				href="javascript:void(0);">删除</a>
		</div>
	</div>

	<br />
	<table id='dataGridCustomer' class="easyui-datagrid" title="防黑表管理"
		data-options="rownumbers:true,toolbar:'#toolbar',url:'pageAjax.do',fit:true,method:'post', pagination:true,fitColumns:true">
		<thead>
			<tr>
				<th data-options="field:'ck',checkbox:true,align:'center'"></th>
				<th data-options="field:'avoidBlackId',width:80,align:'center'">防黑ID</th>
				<th data-options="field:'avoidBlackCode',width:100,sortable:true,align:'center'">防黑编号</th>
				<th data-options="field:'bankName',width:100,sortable:true,align:'center'">银行名字</th>
				<th data-options="field:'userIdcard',width:100,sortable:true,align:'center'">用户身份证</th>
				<th data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn,align:'center'">操作</th>
			</tr>
		</thead>
	</table>


</body>




</html>