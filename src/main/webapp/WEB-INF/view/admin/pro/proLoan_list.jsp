<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/admin/include/global.java.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>还款管理</title>
 <%@include file="/WEB-INF/view/admin/include/global.css.jsp"%>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
<script type="text/javascript">

	
	function onclick_query(){
		//var queryParams = $('#formCustomer').serialize() ;
		$('#dataGridLoan').datagrid({
			/* queryParams:{
				"name":$('#name').val()
			} */
			queryParams:$('#formQuery').serializeJSON()
		});
	}

 function formatOperateColumn(value, row) {
		return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\'' + row.loanId + '\')">&nbsp;</a>' +
			'<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteOne(\'' + row.loanId + '\')">&nbsp;</a>'
			;
	}
 function onclick_deleteRows(){
	 var rows = $("#dataGridLoan").datagrid('getSelections');//获取选中行的所有数据
	 var ids = new Array();//构造id的数组
	 for (var i = 0; i < rows.length; i++) {
         ids.push(rows[i].loanId);
     }
	 //alert(ids) ;
	 $.ajax({
		 type:'post' ,
		 url:'deleteRowsAj.do' ,
		 async:true,
		 data:{"ids":ids},//提交 id数组
		 success:function(data){
			 if(data == '' || data == null){
			 	onclick_query() ;
			 }else{
				 alert(data);
			 }
		 }	 
	 });	 
}
 
 function editRow(id) {
		
		window.location.href='edit.do?loanId=' + id ;
	}
 
	
	function deleteOne(id) {
		
		$.messager.confirm('Confirm','Are you sure you want to delete record?',function(r){
		    if (r){
		    	$.ajax({
					async:true, //是否异步
					type : "post",
					/* url : 'delete.action?customerId=' + id , */
					url:'delete.do',		
					data:{
						"loanId":id,
						//"pageIndex":pageIndex//,
						//"strPageIndex":$('#')
						
					},
					success : function(data) {
						if(data == '删除成功'  ){//成功
							$.messager.alert('提示','删除成功');
							onclick_query() ;
						}else{//失败
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
			<div style="padding: 6px;">
				<span>用户账号:</span> 
					<input type="text" name="userCode" id="userCode"  style="border: 1px solid #ccc"/>							
					<select id="dictionaryDetailCodeAuditStatus" class="easyui-combobox" name="dictionaryDetailCodeAuditStatus" style="width:200px;">
				  		<option value="">查询所有</option>
				   		<c:forEach items="${listAuditStatus}" var="list">
								<option value="${list.dictionaryDetailCode}">${list.dictionaryDetailLabel}</option>
						</c:forEach>
					</select>
					<select id="dictionaryDetailCodePayStatus" class="easyui-combobox" name="dictionaryDetailCodePayStatus" style="width:200px;">
				  		<option value="">查询所有</option>
				   		<c:forEach items="${listPayStatus}" var="list">
								<option value="${list.dictionaryDetailCode}">${list.dictionaryDetailLabel}</option>
						</c:forEach>	
					</select>
					<select id="dictionaryDetailCodeReleaseStatus" class="easyui-combobox" name="dictionaryDetailCodeReleaseStatus" style="width:200px;">
				  		<option value="">查询所有</option>
				   		<c:forEach items="${listReleaseStatus}" var="list">
								<option value="${list.dictionaryDetailCode}">${list.dictionaryDetailLabel}</option>
						</c:forEach>
					</select>
						<select id="repayMethodId" class="easyui-combobox" name="repayMethodId" style="width:200px;">
						<option value="">查询所有</option>
				   			<c:forEach items="${listProRepayMethod }" var="list">
											<option  value="${list.repayMethodId}">${list.repayMethod }</option>
							</c:forEach>
					</select> 
					
					
				
					
				
 				起始时间<input class="easyui-datetimebox" name="preDateTime" data-options="required:true,showSeconds:false" value="" style="width:150px">  
				结束时间<input class="easyui-datetimebox" name="aftDateTime" data-options="required:true,showSeconds:false" value="" style="width:150px">  
					
				<a href="#" class="easyui-linkbutton" style="width: 60px" onclick="onclick_query();">查询</a>
			</div>
		</form>
		

		<div>
			<a class="easyui-linkbutton" iconCls="icon-add" plain="true"
				href="edit.do">新增</a> <!-- <a class="easyui-linkbutton"
				iconCls="icon-edit" plain="true" onclick="editRow()">Edit User</a> -->
			<a class="easyui-linkbutton" iconCls="icon-remove" plain="true"
				onclick="onclick_deleteRows();" href="javascript:void(0);">删除</a>
		</div>
	</div>
	<!-- 修改id 和 url  -->
	<!-- singleSelect:true, 多选-->
		<table id='dataGridLoan' class="easyui-datagrid"
		data-options="url:'pageAjax.do' ,rownumbers:true,
			fit:true,toolbar:'#toolbar',singleSelect:false,collapsible:true,method:'post',pagination:'true',fitColumns:true">
		<thead>
			<tr>
			<th data-options="field:'ck',checkbox:true"></th>	
				<th	data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn">操作</th>
				<th data-options="field:'loanCode',width:80,align:'right'">借款code</th>
				<th data-options="field:'userCode',width:100">用户账号</th>
				<th data-options="field:'userName',width:100">用户名字</th>
				<th data-options="field:'repayMethod',width:80,align:'right'">还款方式</th>	
				<th data-options="field:'loanAmount',width:80,align:'right',sortable:true">借款金额</th>
				<th data-options="field:'actualAmount',width:80,align:'right',sortable:true">实际金额</th>		
				<th data-options="field:'serviceCharge',width:80,align:'right',sortable:true">手续费</th>
				<th data-options="field:'managementExpense',width:80,align:'right',sortable:true">管理费</th>
				<th data-options="field:'startDate',width:120,align:'right',sortable:true,formatter:formatDateTime">借款时间</th>
				<th data-options="field:'term',width:120,align:'right',sortable:true,formatter:formatDateTime">期限</th>
				<th data-options="field:'termLabel',width:80,align:'right',sortable:true">借多久</th>
				<th data-options="field:'period',width:80,align:'right',sortable:true">期数</th>
				<th data-options="field:'auditStatusLabel',width:80,align:'right'">审核状态</th>
				<th data-options="field:'payStatusLabel',width:80,align:'right'">还款状态</th>
				<th data-options="field:'releaseStatusLabel',width:80,align:'right'">放款状态</th>
			
			</tr>
		</thead>
	</table>



</body>
</html>