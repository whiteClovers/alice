<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/view/admin/include/global.java.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>安全中心</title>
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1.0"/>
    <meta name="format-detection" content="telephone=no, email=no"/>
    <link rel="stylesheet" href="/Alice/resource/front/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="/Alice/resource/front/css/index.css"/>
    <%@include file="/WEB-INF/view/admin/include/global.css.jsp"%>
	<%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
<script type="text/javascript">
$(document).ready(function(){
	$('#saveBotton').on('click',function(){
		
			$.ajax({
					 async:true,
					type:"post" ,
					/* contentType:'application/x-www-form-urlencoded; charset=UTF-8', */
					url:'save.do',
					data:$('#formEdit').serialize(), 
					dataType:'json',
					success:function(data){
						alert('进入了success方法');
						if(data == '借款成功'){
							alert('进入了success跳转方法');
							document.location.href = '${pageContext.request.contextPath}/front/FrontApplicationController/page.do' ;
							return false ;
						}else{
							alert(data) ;	
						}
						
					},
                    error: function(data) {
                    	//alert(data);
                      alert("怎么会进入错误的方法呢");
                      document.location.href = '${pageContext.request.contextPath}/front/FrontApplicationController/page.do' ;
                  		return false ;
                  		
                  		
                    }
					
				});

	})
	
})
</script>


<style type="text/css">

.button{
  display: inline-block;
  *display: inline;
  zoom: 1;
  padding: 6px 20px;
  margin: 0;
  cursor: pointer;
  border: 1px solid #bbb;
  overflow: visible;
  font: bold 13px arial, helvetica, sans-serif;
  text-decoration: none;
  white-space: nowrap;
  color: #555;
  


}

/* Colored buttons styles */

.button.green, .button.red, .button.blue {
  color: #fff;
  text-shadow: 0 1px 0 rgba(0,0,0,.2);
  
  background-image: -webkit-gradient(linear, left top, left bottom, from(rgba(255,255,255,.3)), to(rgba(255,255,255,0)));
  background-image: -webkit-linear-gradient(top, rgba(255,255,255,.3), rgba(255,255,255,0));
  background-image: -moz-linear-gradient(top, rgba(255,255,255,.3), rgba(255,255,255,0));
  background-image: -ms-linear-gradient(top, rgba(255,255,255,.3), rgba(255,255,255,0));
  background-image: -o-linear-gradient(top, rgba(255,255,255,.3), rgba(255,255,255,0));
  background-image: linear-gradient(top, rgba(255,255,255,.3), rgba(255,255,255,0));
}



.button.blue{
  background-color: #269CE9;
  border-color: #269CE9;
}

.button.blue:hover{
  background-color: #70B9E8;
}

.button.blue:active{
  background: #269CE9;
}

/* */


</style>


</head>
<body>
<div class="safecenter_title" style="display:none;">
    <a href="setting.html">
        <i class="icon"></i>
    </a>
    <span>安全中心</span>
</div>
<div class="safecenter_content">
    <p class="item_title">
     申请借贷
    </p>
    <form id='formEdit'>
    <div class="item_content">
    <span>还款方式</span>
    <select id="repayMethod" class="easyui-combobox" name="repayMethod" style="width:200px;">
				
				 <c:forEach items="${listRepayMethod}" var="list">
				<option value="${list.dictionaryDetailCode}">${list.dictionaryDetailLabel}</option>
				</c:forEach>
	</select>
    </div>
        <div class="item_content">
            <span>借款金额</span>
          <input type="text" name ="loanAmount" >
        </div> 
       
    </a>
     <div class="item_content">
   			  <span>期数</span>
    	<select id="period" class="easyui-combobox" name="period" style="width:200px;">
			
			 <c:forEach items="${listPeriod}" var="list">
					<option value="${list.dictionaryDetailCode}">${list.dictionaryDetailLabel}</option>
			</c:forEach>
		</select>
	</div>
     <div class="item_content">
   			  <span>期限</span>
    	<select id="termLabel" class="easyui-combobox" name="termLabel" style="width:200px;">
			
			 <c:forEach items="${listPeriodTime}" var="list">
					<option value="${list.dictionaryDetailLabel}">${list.dictionaryDetailLabel}</option>
			</c:forEach>
		</select>
	</div>
        <div class="item_content" >
            <span style="width:100px">手续费 0.5%</span>
        </div>	
        <div class="item_content" >
            <span style="width:100px">管理费 0.5%</span>
        </div>
    
  
   </form>
    <button class="large blue button" id="saveBotton" style="width:200px;margin-left:70px;margin-top:80px">申请</button>
</div>








</body>



</html>
