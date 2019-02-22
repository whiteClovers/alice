<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>

<script type="text/javascript" src="${ctxResource }/resource/admin/script/usr/usrEconomy.js"></script>
<style type="text/css">

.userId{
	width:173px;
}

</style>
<title>还款管理</title>
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
	    		<input type="hidden" name="loanId" id="loanId"  value="${proLoanView.loanId}" /> <br/>	
	    		<li>
	    			<span>用户账号：</span>
	    		<input type="text" name="userId" id="userId" value="${proLoanView.userId }" /> <br/>
	    		</li>
	    		<li>
	    			<span>借款code：</span>
	    		<input type="text" name="loanCode" id="loanCode" value="${proLoanView.loanCode }" /> <br/>
	    		</li>	    		
	    		<li>
	    			<span>用户名:</span>
				<select id="repayMethodId" class="easyui-combobox" name="repayMethodId" style="width:200px;">
	   				<c:forEach items="${ListProRepayMethod }" var="list">
						<option <c:if test='${proLoanView.repayMethodId== list.repayMethodId}'>selected="selected"</c:if> value="${list.repayMethodId}">${list.repayMethod }</option>
					</c:forEach><br/>
				</select> 
			    </li>
				<li>
				<span>借款金额：</span>
				<input type="text" name="loanAmount" id="loanAmount" value="${proLoanView.loanAmount }" /> <br/>
				</li>
					<li>
				<span>实际金额：</span>
				<input type="text" name="actualAmount" id="actualAmount" value="${proLoanView.actualAmount }" /> <br/>
				</li>
				<li>
				<span>借款时间：</span>
				<input class="easyui-datetimebox" name="startDate" data-options="required:true,showSeconds:false" value="<fmt:formatDate value='${proLoanView.startDate}'/>" style="width:150px">  
				</li>
				<li>
				<span>期限：</span>
				<input class="easyui-datetimebox" name="aftDateTime" data-options="required:true,showSeconds:false" value="<fmt:formatDate value='${proLoanView.term}'/>" style="width:150px">  
				</li>
				<span>借多久：</span>
				<input type="text" name="actualAmount" id="actualAmount" value="${proLoanView.termLabel }" /> <br/>
				</li>
				<li>
	    			<span>期数：</span>
	    			<input type="text" name="period" id="period" value="${proLoanView.period }" />
	    		</li> 
					<li>
					<span>审核状态：</span>
				
				<select id="auditStatus" class="easyui-combobox" name="auditStatus" style="width:200px;">
		   				<c:forEach items="${listAuditStatus }" var="list">
									<option<c:if test='${proLoanView.auditStatus== list.dictionaryDetailCode}'>selected="selected"</c:if> value="${list.dictionaryDetailCode}">${list.dictionaryDetailLabel }</option>
						</c:forEach>
				</select>
				</li>
		
	    		<li>
	    			<span>手续费：</span>
	    			<input type="text" name="serviceCharge" id="serviceCharge" value="${proLoanView.serviceCharge}" /> <br/>
	    		</li>	
	    		
	    		<li>
	    			<span>管理费：</span>
	    			<input type="text" name="managementExpense" id="managementExpense" value="${proLoanView.managementExpense}" /> <br/>
	    		</li>
	    		
	    		<li>
	    		<span>还款状态：</span>
	    			<select id="payStatus" class="easyui-combobox" name="payStatus" style="width:200px;">
   						<c:forEach items="${listPayStatus }" var="list">
							<option <c:if test='${proLoanView.payStatus== list.dictionaryDetailCode}'>selected="selected"</c:if> value="${list.dictionaryDetailCode}">${list.dictionaryDetailLabel }</option>
						</c:forEach>
					</select>
	    		</li>
	    		<li>
	    		<span>放款状态：</span>
	    			<select id="payStatus" class="easyui-combobox" name="releaseStatus" style="width:200px;">
   						<c:forEach items="${listReleaseStatus }" var="list">
							<option <c:if test='${proLoanView.releaseStatus== list.dictionaryDetailCode}'>selected="selected"</c:if> value="${list.dictionaryDetailCode}">${list.dictionaryDetailLabel }</option>
						</c:forEach>
					</select>
	    		</li>	    		
	    	</ul>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<!-- <a class="easyui-linkbutton" type="button"  onclick="onclick_save();" >保存</a> -->
	    	<a class="easyui-linkbutton" type="button"  id="saveBotton"   >保存</a>
	    	<!-- 暂时未用 -->
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">关闭</a>
	    </div>
	    </div>
	</div>
</body>






</html>