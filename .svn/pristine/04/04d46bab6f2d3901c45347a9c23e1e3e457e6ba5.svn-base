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
 <script>
 	function queryShow(){
			  $.ajax({
				url:'pageAjax.do',
				type:'post',
				dataType:'json',
				data:{		
				},
				success:function(data){
					 
					$.each(data.list ,function(index,item){
					 	 $('#information').append(
					 			 	"<div style='margin-top:20px'> "+
					 				"借款单号:"+ item.loanCode +"</br>"+
					 				"还款方式 :"+ item.repayMethod+"</br>"+
					 				"借款金额 :"+item.loanAmount+"</br>"+
					 				"实际金额:"+ item.actualAmount +"</br>"+
					 				"审核状态:"+ item.auditStatusLabel+"</br>"+
					 				"期数:"+ item.period+"</br>"+
					 				"期限 :"+ item.termLabel+"</br>"+
					 				"手续费:"+ item.serviceCharge+"</br>"+
					 				"管理费:"+ item.managementExpense+"</br>"+
					 				"<a href='javascript:void(0)' onclick=del('"+item.loanId+"')>取消申请</a></br>"+
					 				"</div>"
					 	 );  				
					}); 
				} 		 
			
		}); 
	}
	function del(loanId){
 		$.ajax({
 			type:'post',
 			url:'delete.do',
 			data:{"loanId" : loanId},
 			success:function(data){
 				if(data == '删除成功'){
 					alert("取消成功");
 					queryShow();
 				}else{
 					alert("取消失败");
 				}
 			}
 		});
 	}

 /* 	function query(){
		$.ajax({
			url:'pageAjax.do',
			type:'post',
			dataType:'json',
			data:{
				"name":$('#name').val()
			},
			success:function(data){
				$('#table1 tbody').html('');
				$.each(data.list ,function(index,item){
					$('#table1').append("<tr><td>"+item.loanCode+"</td><td>"+item.auditStatusLabel+
						"</td><td><a href='javascript:void(0)' onclick=edit('"+item.loanId+
								"')>确认借款</a>  <a href='javascript:void(0)' onclick=del('"
							+item.loanId+"')>取消借款</a></td></tr>");
				});
			} 

			
		});
	}
 	
 	function edit(loanId){
 		$.ajax({
 			type:'post',
 			url:'edit.do',
 			data:{"loanId":loanId},
 			success:function(data){
 				if(data == ''|| data == null){
 					alert("借款成功");
 					query();
 				}else{
 					alert(data)
 				}
 			}
 		});
 	}
 	
  */
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
                <li class="active list_item"><a  href="${pageContext.request.contextPath}/front/FrontApplicationController/page.do">申请中<span></span></a></li>
                <li class=" list_item"><a href="${pageContext.request.contextPath}/front/FrontRepaymentsController/page.do">还款中<span></span></a></li>
                <li class=" list_item"><a href="<%=request.getContextPath()%>/front/FrontReimbursementController/page.do">已还款<span id="count"></span></a></li>
            </ul>
            <ul class="tabs_sub_nav clearFix">
                <li class="list_item "><a id="query" href="${pageContext.request.contextPath}/front/FrontApplicationController/page.do">申请中</a></li>
                <li class="list_item"><a href="${pageContext.request.contextPath}/front/FrontNotApplicationController/page.do">申请未通过</a></li>
                <li class="list_item"><a href="${pageContext.request.contextPath}/front/FrontApprovalApplicationController/page.do">申请已通过</a></li>
            </ul>
            <ul class="tabs_sub_nav clearFix">
          
           	</ul>
            <div class="top_bar"></div>
        </section>
        
       <section class="tabs_wrap" id="tabs_wrap">
            <div id="information" >
            
            
            </div>

        </section> 
    </section>
</div>

</body>
 <script type="text/javascript">
 queryShow();
 </script>
</html>
