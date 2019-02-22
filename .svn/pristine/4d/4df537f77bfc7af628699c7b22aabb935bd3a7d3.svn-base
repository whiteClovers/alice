<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>投资记录</title>
    <%@include file="/WEB-INF/view/admin/include/global.java.jsp"%>
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1.0"/>
    <meta name="format-detection" content="telephone=no, email=no"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/front/css/common.css" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resource/front/css/index.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/front/css/personalCenter.css" type="text/css">
    <!--插件样式表-->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/front/lib/css/dropload.css" type="text/css">
   	<%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
   	<c:set var="LrepayId" value="${proRepayPlan.repayCode}"></c:set>
 	<style>
 		.ci_title2 >td {
           	/* width: 33%;
            float: left; */
            width:auto;
            text-align: center;
            line-height: 0.78rem;
            font-size: 0.32rem;
        }
        .ci_title2 {
            background: #f3f3f3;
            /* height: 0.78rem;
            width: 100%; */
            border-top: 1px solid #cccccc;
            border-bottom: 1px solid #cccccc;
            color: black;
        } 
        td{text-align:center}
 	</style>

<script type="text/javascript">

Date.prototype.toLocaleString = function() {
    return this.getFullYear() + "年" + (this.getMonth() + 1) + "月" + this.getDate() + "日 " + this.getHours() + "点" + this.getMinutes() + "分" + this.getSeconds() + "秒";
};


	

$(document).ready(function(){
	$('#repayCheck').on('click',function(){
		
			 $.ajax({
					type:"post" ,			
					url:'pageAjax.do',
					  /* data:$('#repayForm').serialize(), */
					  data:{
						"PpaidPrincipal":$('#PpaidPrincipal').val(),
						"PpaidInterest":$('#PpaidInterest').val(),
						"PpaidFine":$('#PpaidFine').val(),
						"repayId":'${proRepayPlan.repayId}'
						} ,
					success:function(data){
						
						window.location.href="${pageContext.request.contextPath}/front/FrontNotRepaymentsController/page.do"
						
					}
				}); 

	})
	
})


 </script>
</head>
<body>
<div class="wrap investmentRecord_page">
    <section class="container" style="background: #fff;">
        <header class="header investment_title" style="display: none;">
            <a href="personal.html">
                <i class="icon"></i>
            </a>
            <span>投资记录</span>
            <a href="personal.html">
                <i class="icon"></i>
            </a>
        </header>
        <section class="tabs">
            <ul class="tabs_nav clearFix" id="tabs_nav">
                <li class=" list_item"><span></span></li>
                <li class="active list_item"><a href="">还款中<span></span></a></li>
                <li class=" list_item"></span></li>
            </ul>
      <%--       <ul class="tabs_sub_nav clearFix">
                <li class="list_item "><a href="${pageContext.request.contextPath}/front/FrontRepaymentsController/page.do">当前需要还款的订单信息</a></li>
                <li class="list_item"><a href="${pageContext.request.contextPath}/front/FrontNotRepaymentsController/page.do">当前未还款的期数</a></li>
                <li class="list_item"><a href="${pageContext.request.contextPath}/front/FrontOverRepaymentsController/page.do">当前已逾期的期数</a></li>
            </ul> --%>
            <div class="top_bar"></div>
        </section>
  		 <section class="tabs_wrap" id="tabs_wrap">
            <div id="information" >
            				目前订单信息
            				<div style='margin-top:20px'> 
            				
			 				还款计划编号: ${proRepayPlan.repayCode } </br>
			 				借款编号 : ${proRepayPlan.loanCode }</br>
			 				期号:${proRepayPlan.termNumber }</br>
			 				本期开始时间: ${ proRepayPlan.eachStartDate.toLocaleString()}</br>
			 				理论还款时间:  ${ proRepayPlan.theoryRepayDate.toLocaleString()}</br>
			 			
			 				需还本金:${ proRepayPlan.needPrincipal} </br>
			 				需还利息:${proRepayPlan.interest } </br>
			 				需还罚息:${proRepayPlan.fine } </br>
			 				逾期天数 :${proRepayPlan.overDays } </br>
			 				已还本金: ${proRepayPlan.paidPrincipal }</br>
			 				已还利息:${ proRepayPlan.paidInterest} </br>
			 				已还罚息:	${proRepayPlan.paidFine } </br>
			 				每期还款状态:${proRepayPlan.payEachStatusLabel }</br>
			 				</div>
			 				<form id="repayForm">
			 				请输入要还款的本金<input type="text" id="PpaidPrincipal" name="PpaidPrincipal"></br>
			 				请输入要还款的利息<input type="text" id="PpaidInterest" name="PpaidInterest"></br>
			 				请输入要还款的罚息<input type="text" id="PpaidFine" name="PpaidFine">	</br>
			 				
			 				<button type="button" id="repayCheck" style="width:200px;height:200px">Click Me!</button>
			 			
			 				</form>
            
            </div>

        </section> 
    </section>
</div>
 <script type="text/javascript">

 </script>
</body>
       
</html>
