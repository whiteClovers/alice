<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>
<title>还款方式管理</title>
<script type="text/javascript">
$(document).ready(function(){
	$('#saveBotton').on('click',function(){

			$.ajax({
					type:"post" ,
					/* contentType:'application/x-www-form-urlencoded; charset=UTF-8', */
					url:'save.do',
					data:$('#formEdit').serialize(), //{"customerId":document.getElemenetById('customerId').value , }
					success:function(data){
						if(data == '操作成功'){
							window.location.href = 'page.do' ;
						}else{
							alert(data) ;	
						}
					}
				});

	})
	
})
</script>
</head>



<body style="margin: 0;">
	<div class="easyui-panel" data-options="fit:true,border:false"; title="新增|修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id='formEdit'>
	    	<ul class="form_layout">    		
	    		<input type="hidden" name="repayMethodId" id="repayMethodId"  value="${ProRepayMethod.repayMethodId}" /> <br/>
	    		<li>
	    			<span style="width:90px">还款方式code：</span>
	    			<input type="text" name="repayMethodCode" id="repayMethodCode" value="${ProRepayMethod.repayMethodCode }" /> 
	    		</li> 
	    		<li>
	    			<span>还款方式：</span>
	    			<input type="text" name="repayMethod" id="repayMethod" value="${ProRepayMethod.repayMethod }" />
	    		</li> 
	    		<li>
	    			<span>利率：</span>
	    			<input type="text" name="monthRate" id="monthRate" value="${ProRepayMethod.monthRate }" />
	    		</li> 
	    		<li>
	    			<span>罚息率：</span>
	    			<input type="text" name="penaltyRate" id="penaltyRate" value="${ProRepayMethod.penaltyRate }" />
	    		</li> 
	    			
	    	</ul>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a class="easyui-linkbutton" type="button" id="saveBotton" >保存</a>
	    	<!-- 暂时未用 -->
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">关闭</a>
	    </div>
	    </div>
	</div>
</body>


</html>