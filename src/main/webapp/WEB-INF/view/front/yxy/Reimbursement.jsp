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

    function queryShow(){
    	
			  $.ajax({
				url:'pageAjax.do',
				type:'post',
				dataType:'json',
				data:{		
				},
				success:function(data){
					 
					$.each(data.list ,function(index,item){
				 		$.each(item,function(index2,item2){
				 			 	 $('#information').append(
				 		 	"<div style='margin-top:20px'> "+
			 				"还款计划编号:"+ item2.repayCode +"</br>"+
			 				"借款编号 :"+ item2.loanCode+"</br>"+
			 				"期号:"+item2.termNumber+"</br>"+	
			 				"本期开始时间:"+ new Date( item2.eachStartDate ).toLocaleString()+"</br>"+
			 				"理论还款时间:" + new Date( item2.theoryRepayDate ).toLocaleString()+"</br>"+
			 				"实际还款时间:"+ item2.actualRepayDate+"</br>"+
			 				"需还本金:"+ item2.needPrincipal+"</br>"+
			 				"需还利息:"+ item2.interest+"</br>"+
			 				"需还罚息:"+ item2.fine+"</br>"+
			 				"逾期天数 :"+ item2.overDays+"</br>"+
			 				"已还本金:"+ item2.paidPrincipal+"</br>"+
			 				"已还利息:"+ item2.paidInterest+"</br>"+
			 				"已还罚息:"+ item2.paidFine+"</br>"+
			 				"每期还款状态:"+ item2.payEachStatusLabel+"</br>"+		 
			 				"<a href='javascript:void(0)' onclick=del('"+item2.repayId+"')>删除此条记录</a></br>"+
			 				"</div>"				
				 	 );   	
							
							
						}); 
							
					}); 
				} 		 
		}); 
	}
    function del(repayId){
    	alert("zhe");
 		$.ajax({
 			type:'post',
 			url:'delete.do',
 			data:{"repayId" : repayId},
 			success:function(data){
 				if(data == '删除成功'){
 					 queryShow();
 				}else{
 					alert("删除失败");
 				}
 			}
 		});
	}
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
                <li class=" list_item"><a href="${pageContext.request.contextPath}/front/FrontApplicationController/page.do">申请中<span></span></a></li>
                <li class="	list_item"><a href="${pageContext.request.contextPath}/front/FrontRepaymentsController/page.do">还款中<span></span></a></li>
                <li class=" active list_item"><a href="<%=request.getContextPath()%>/front/FrontReimbursementController/page.do">已还款<span id="count"></span></a></li>
            </ul>
            <ul class="tabs_sub_nav clearFix">
                <li class="list_item "><a href="<%=request.getContextPath()%>/front/FrontReimbursementController/page.do">当前已还款的期数</a></li>
                <li class="list_item"><a href="<%=request.getContextPath()%>/front/FrontAlreadyReimbursementController/page.do">当前已还款的订单</a></li>
               
            </ul>
            <div class="top_bar"></div>
        </section>
  		 <section class="tabs_wrap" id="tabs_wrap">
            <div id="information" >
            
            
            </div>

        </section> 
    </section>
</div>
 <script type="text/javascript">
 queryShow();
 </script>
</body>
       
</html>
