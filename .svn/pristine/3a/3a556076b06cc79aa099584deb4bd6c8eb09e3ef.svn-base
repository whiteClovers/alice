<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1.0" />
    <meta name="format-detection" content="telephone=no, email=no" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/front/css/common.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/front/css/invest.css">
    <%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
    <title>审核认证</title>
    <style>
        #ci_wrap {
            width: 100%;
            height: 85%;
            overflow: auto;
        }
        .ci_img {
            width: 0.4rem;
            height: 0.4rem;
            vertical-align: middle;
            margin-left: 0.1rem;
        }
        #ci_wrap .table_wrap {
            width: 100%;
            background: #ffffff;
        }
        #ci_wrap table {
            width: 95%;
            margin: 0 auto;
            text-align: center;
            border-collapse: collapse;
        }
        #ci_wrap .ci_title {
            height: 1.18rem;
            width: 100%;
            text-align: center;
            line-height: 1.18rem;
            background: #ffffff;
            font-size: 0.38rem;
        }
        #ci_wrap .ci_title >img {
            vertical-align: middle;
        }
        #ci_wrap .ci_title2 {
            background: #f3f3f3;
            height: 0.78rem;
            width: 100%;
            border-top: 1px solid #cccccc;
            border-bottom: 1px solid #cccccc;
            color: black;
        }
        #ci_wrap .ci_title2 >li {
            width: 33%;
            float: left;
            text-align: center;
            line-height: 0.78rem;
            font-size: 0.32rem;
        }
        .bottom_border {
            border-bottom: 1px solid #cccccc;
        }
    </style>
    <script></script>
</head>
<body style="background: #FFFFFF">
<!--  公共头部 -->
<section id="sp_common_header" class="sp_common_title" style="display:none;">
    <a href="javascript:history.go(-1)">
        <i class="icon"></i>
    </a>
    <span>审核认证</span>
</section>
<!--   内容   -->
<section id="ci_wrap">
    <div class="ci_title">
        <span>审核部门认证信息</span><img class="ci_img" src="<%=request.getContextPath()%>/resource/front/img1/certification.png" alt="">
    </div>
    <!-- <ul class="ci_title2 clearfix">
        <li>审核项目</li>
        <li>状态</li>
        <li>操作</li>
    </ul> -->
    <div class="table_wrap">
        <table cellspacing="1" cellpadding="15">
        	<thead>
	        	<tr class="ci_title2">
	        		<td>审核项目</td>
	        		<td>状态</td>
	        		<td>操作</td>
	    		</tr>
    		</thead>
    		<tbody>
    			<tr>
		            <td>loan_code</td>
		            <td>审核通过</td>
		            
		            <td><a href="/Alice/front/IndexController/page.do">确认借款</a> <!-- 点击后修改pay_status -->
		            <a href="/Alice/front/IndexController/page.do">取消借款</a></td> <!-- 点击后删除该借款请求 -->
            	</tr>
            </tbody>
        </table>
    </div>
</section>

</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/resource/front/lib/js/jquery-2.1.4.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resource/front/js/wapframwork.js"></script>
<script type="text/javascript">
    
</script>

<!--头部-->
<script src="<%=request.getContextPath()%>/resource/front/lib/js/RainbowBridge.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    setTitle(".sp_common_title", {'title':'审核认证'});
</script>
</html>