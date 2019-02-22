<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/view/admin/include/global.java.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/WEB-INF/view/admin/include/global.css.jsp"%>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
<title></title>

<style>
a:link {
	text-decoration: none;
}
</style>

<script>
	function onclick_query() {
		//var queryParams = $('#formCustomer').serialize() ;
		$('#dataGridUsrSecurity').datagrid({
			/* queryParams:{
				"name":$('#name').val()
			} */
			queryParams : $('#formQuery').serializeJSON()
		});
	}

	function onclick_deleteRows() {
		var rows = $("#dataGridUsrSecurity").datagrid('getSelections');//获取选中行的所有数据
		var ids = new Array();//构造id的数组
		for (var i = 0; i < rows.length; i++) {
			ids.push(rows[i].securityId);
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
				+ row.securityId
				+ '\')">&nbsp;</a>'
				+ '<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteOne(\''
				+ row.securityId + '\')">&nbsp;</a>';
	}

	function editRow(id) {
		window.location.href = 'edit.do?securityId=' + id;
	}

	function deleteOne(id) {
		$.messager.confirm('Confirm',
				'Are you sure you want to delete record?', function(r) {
					if (r) {
						$.ajax({
							async : true, //是否异步
							type : "post",
							url : 'deleteAj.do?securityId=' + id,
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
			<span>用户名:</span>
					<select name="userId">
						<option value="">-</option>
						<c:forEach items="${listUsrSecurityView }" var="usrSecurityView">
							<option value="${usrSecurityView.userId }">
								${usrSecurityView.userName }
							</option>
						</c:forEach>
					</select>
				<span>担保编号:</span> 
					<input name="securityCode" id="securityCode"  style="border: 1px solid #ccc"> 
				<span>担保属性:</span> 
					<input name="securityRelation" id="securityRelation"  style="border: 1px solid #ccc"> 
				<span>担保姓名:</span>
					<input name="securityName" id="securityName"  style="border: 1px solid #ccc"> 
				<a href="#" class="easyui-linkbutton" style="width: 60px" onclick="onclick_query();">查询</a>
			</div>
		</form>
		</form>

		<div>
			<a class="easyui-linkbutton" iconCls="icon-add" plain="true"
				href="edit.do">新增</a> <a class="easyui-linkbutton"
				iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
			<a class="easyui-linkbutton" iconCls="icon-remove" plain="true"
				onclick="onclick_deleteRows();" href="javascript:void(0);">删除</a>
		</div>
	</div>
	<!-- 修改id 和 url  -->
	<table id='dataGridUsrSecurity' class="easyui-datagrid"
		data-options="url:'pageAjax.do' ,
			fit:true,toolbar:'#toolbar',singleSelect:true,collapsible:true,method:'post',pagination:'true',fitColumns:true">
		<thead>
			<tr>
				<th data-options="field:'ck',checkbox:true"></th>
				<th data-options="field:'userName',width:60,align:'center'">用户名</th>
				<th data-options="field:'securityCode',width:60,align:'center'">担保编号</th>
				<th data-options="field:'securityRelation',width:60,align:'center'">担保属性</th>
				<th data-options="field:'securityName',width:60,align:'center'">担保姓名</th>
				<th	data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn">操作</th>
			</tr>
		</thead>
	</table>

</body>

</html>