<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/admin/include/global.java.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@include file="/WEB-INF/view/admin/include/global.css.jsp" %>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp" %>

<script type="text/javascript" src="${ctxResource }/resource/admin/script/bas/customer.js"></script>

<title>Insert title here</title>

</head>
<body style="margin: 0;">
	<div class="easyui-panel" data-options="fit:true,border:false"; title="数据字典详情新增|数据字典详情修改" style="width:100%;">
		<div style="padding:10px 60px 20px 10px">
	    <form id='formEdit'>
	    	<ul class="form_layout">
	    		<input type="hidden" name="dictionaryDetailId" id="dictionaryDetailId" value="${dataDictionaryDetail.dictionaryDetailId }" />
	    		<li>
	    			<span>数据字典id：</span>
	    			<%-- <input type="text" name="dataDictionaryId" id="dataDictionaryId" value="${dataDictionaryDetail.dataDictionaryId }" /> --%>
	    			<select class="easyui-combobox">
						<option name="dataDictionaryId" id="dataDictionaryId" value="">-</option>
						<c:forEach items="${listDataDictionary }" var="dataDictionary">
							<option name="dataDictionaryId" id="dataDictionaryId"  
								<c:if test="${dataDictionary.dataDictionaryId==dataDictionaryDetail.dataDictionaryId}">selected="selected"</c:if>
								value="${dataDictionary.dataDictionaryId }">${dataDictionary.dataDictionaryLabel }</option>
						</c:forEach>
					</select>
	    			
	    			
	    			
	    			
	    			
	    		</li>
	    		<li>
	    			<span>字典详情code：</span>
	    			<input type="text" name="dictionaryDetailCode" id="dictionaryDetailCode" value="${dataDictionaryDetail.dictionaryDetailCode }" />
	    		</li>	    		
	    		<li>
	    			<span>字典详情label：</span>
	    			<input type="text" name="dictionaryDetailLabel" id="dictionaryDetailLabel"  value="${dataDictionaryDetail.dictionaryDetailLabel }" />
	    		</li>
	    		<li>
	    			<span>字典详情number：</span>
	    			<input type="text" name="dictionaryDetailNumber" id="dictionaryDetailNumber"  value="${dataDictionaryDetail.dictionaryDetailNumber }" />
	    		</li>	    		
	    	</ul>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a class="easyui-linkbutton" type="button"  onclick="onclick_save();" >保存</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">关闭</a>
	    </div>
	    </div>
	</div>
</body>
</html>