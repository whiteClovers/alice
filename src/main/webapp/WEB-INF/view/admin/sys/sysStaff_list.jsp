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
		$('#dataGridSysRole').datagrid({
			/* queryParams:{
				"name":$('#name').val()
			} */
			queryParams : $('#formQuery').serializeJSON()
		});
	}

	function onclick_deleteRows() {
		var rows = $("#dataGridSysRole").datagrid('getSelections');//获取选中行的所有数据
		var ids = new Array();//构造id的数组
		for (var i = 0; i < rows.length; i++) {
			ids.push(rows[i].avoidRepeatId);
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
				+ row.staffId
				+ '\')">&nbsp;</a>'
				+ '<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteOne(\''
				+ row.staffId + '\')">&nbsp;</a>';
	}

	function editRow(id) {
		window.location.href = 'edit.do?staffId=' + id;
	}

	function deleteOne(id) {
		$.messager.confirm('Confirm',
				'Are you sure you want to delete record?', function(r) {
					if (r) {
						$.ajax({
							async : true, //是否异步
							type : "post",
							url : 'deleteAj.do?staffId=' + id,
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
				<!-- <span>用户编号:</span> 
					<input name="userCode" id="userCode"  style="border: 1px solid #ccc"> --> 
				<span>员工编号:</span> 
					<input name="staffCode" id="staffCode"  style="border: 1px solid #ccc"> 
				<span>员工姓名:</span> 
					<input name="staffName" id="staffName"  style="border: 1px solid #ccc"> 
				<span>员工性别:</span> 
					<input name="staffGender" id="staffGender"  style="border: 1px solid #ccc"> 
				<span>员工电话:</span> 
					<input name="staffMoblie" id="staffMoblie"  style="border: 1px solid #ccc"> 
				<span>员工地址:</span> 
					<input name="staffAddress" id="staffAddress"  style="border: 1px solid #ccc"> 
				<!-- <span>身份证:</span> 
					<input name="staffIdcard" id="staffIdcard"  style="border: 1px solid #ccc"> 
				<span>用户地址:</span> 
					<input name="userAddress" id="userAddress"  style="border: 1px solid #ccc"> 
				<span>黑名单:</span>  -->
					<!-- <input name="userIsblacklist" id="userIsblacklist"  style="border: 1px solid #ccc">  -->
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
	<table id='dataGridSysRole' class="easyui-datagrid"
		data-options="url:'pageAjax.do' ,
			fit:true,toolbar:'#toolbar',singleSelect:true,collapsible:true,method:'post',pagination:'true',fitColumns:true">
		<thead>
			<tr>
				<!-- <th data-options="field:'ck',checkbox:true"></th>
				<th data-options="field:'userCode',width:60,align:'center'">用户编号</th>
				<th data-options="field:'userPwd',width:60,align:'center'">用户密码</th> -->
				<th data-options="field:'staffCode',width:60,align:'center'">员工编号</th>
				<th data-options="field:'staffName',width:60,align:'center'">员工姓名</th>
				<th data-options="field:'staffGender',width:60,align:'center'">员工性别</th>
				<th data-options="field:'staffBirthday',width:60,align:'center'">员工生日</th>
				<th data-options="field:'staffMoblie',width:60,align:'center'">员工电话</th>
				<th data-options="field:'staffAddress',width:60,align:'center'">员工地址</th>
				<th data-options="field:'staffStatus',width:60,align:'center'">员工状态</th>
				<th data-options="field:'pwdLogin',width:60,align:'center'">登录密码</th>
				<th data-options="field:'staffInfo',width:60,align:'center'">员工信息</th>
				<!-- <th data-options="field:'staffIdcard',width:60,align:'center'">身份证</th>
				<th data-options="field:'userCredit',width:60,align:'center'">信用分</th>
				<th data-options="field:'userRegtime',width:60,align:'center',sortable:true,formatter:formatDateTime">注册时间</th>
				<th data-options="field:'userAmount',width:60,align:'center'">可用额度</th>
				<th data-options="field:'userTel',width:60,align:'center'">用户电话</th>
				<th data-options="field:'userEmail',width:60,align:'center'">邮箱</th>
				<th data-options="field:'userAddress',width:60,align:'center'">用户地址</th>
				<th data-options="field:'userIsblacklist',width:60,align:'center'">黑名单</th> -->
				<th	data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn">操作</th>
			</tr>
		</thead>
	</table>

</body>

</html>