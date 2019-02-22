<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/view/admin/include/global.java.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>还款方式管理</title>

<script type="text/javascript" src="/Alice/resource/admin/script/jquery.min.js" ></script>


<%@include file="/WEB-INF/view/admin/include/global.css.jsp"%>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
<title></title>

<style>
a:link {
	text-decoration: none;
}
</style>

<script type="text/javascript">

	
	function onclick_query(){
		//var queryParams = $('#formCustomer').serialize() ;
		$('#dataGridRepayMethod').datagrid({
			/* queryParams:{
				"name":$('#name').val()
			} */
			queryParams:$('#formQuery').serializeJSON()
		});
	}

 function formatOperateColumn(value, row) {
		return '<a href="javascript:void(0);" class="icon-edit" style="display:inline-block;width:40px;"  onclick="editRow(\'' + row.repayMethodId + '\')">&nbsp;</a>' +
			'<a href="javascript:void(0);" class="icon-remove" style="display:inline-block;width:40px;"  onclick="deleteOne(\'' + row.repayMethodId + '\')">&nbsp;</a>'
			;
	}
 function onclick_deleteRows(){
	 var rows = $("#dataGridRepayMethod").datagrid('getSelections');//获取选中行的所有数据
	 var ids = new Array();//构造id的数组
	 for (var i = 0; i < rows.length; i++) {
         ids.push(rows[i].repayMethodId);
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
		
		window.location.href='edit.do?repayMethodId=' + id ;
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
						"repayMethodId":id,
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
				<span>还款方式：</span> 
				<input type="text" name="repayMethod" id="repayMethod" style="border: 1px solid #ccc"/>		
				<a href="#" class="easyui-linkbutton" style="width: 60px" onclick="onclick_query();">查询</a>
			</div>
		
		</form>

		<div>
			<a class="easyui-linkbutton" iconCls="icon-add" plain="true"
				href="edit.do">新增</a>
			<a class="easyui-linkbutton" iconCls="icon-remove" plain="true"
				onclick="onclick_deleteRows();" href="javascript:void(0);">删除</a>
		</div>
	</div>

	<table id='dataGridRepayMethod' class="easyui-datagrid"
		data-options="url:'pageAjax.do' ,rownumbers:true,
			fit:true,toolbar:'#toolbar',singleSelect:false,collapsible:true,method:'post',pagination:'true',fitColumns:true">
		<thead>
			<tr>
				<th data-options="field:'ck',checkbox:true"></th>
				<th data-options="field:'operate_column',width:160,align:'center',formatter:formatOperateColumn">操作</th>
				<th data-options="field:'repayMethodId',width:100">还款方式id</th>
				<th data-options="field:'repayMethodCode',width:100">还款方式code</th>
				<th data-options="field:'repayMethod',width:100">还款方式</th>
				<th data-options="field:'monthRate',width:100">利率</th>
				<th data-options="field:'penaltyRate',width:100">罚息率</th>
			
			</tr>
		</thead>
	</table>




</body>
</html>