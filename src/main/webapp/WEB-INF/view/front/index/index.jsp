<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1.0"/>
    <meta name="format-detection" content="telephone=no, email=no"/>
    <meta name="Keywords" content="投呗,光彩玖玖,互联网金融平台,武汉p2p公司,武汉投资理财,个人投资理财,小额投资理财,武汉网贷公司">
    <meta name="description" content="“投呗”手机官网，本平台拥有5亿注册资本，账户险、银行存管共同保障用户资金。理财热线：400-001-7899"/>
    <title>借呗-Alice</title>
    
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/front/css/common.css"/>
  <%--  ${ctxResource }/resource/admin/js/common/common.js --%>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resource/front/css/index.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/front/lib/css/layer.css" type="text/css">
    <script src="<%=request.getContextPath()%>/resource/front/lib/js/jquery-2.1.4.js" type="text/javascript" charset="utf-8"></script>
    <script src="<%=request.getContextPath()%>/resource/front/lib/js/jquery.base64.js"></script>
    <script src="<%=request.getContextPath()%>/resource/front/lib/js/layer.js"></script>
    <script src="<%=request.getContextPath()%>/resource/front/js/wapframwork.js" type="text/javascript" charset="utf-8"></script>

<style type="text/css">

.slide{
background-color: yellow;

}
.slide span{
	margin-left: 202px;
	font-size:24px;
}

</style>

</head>
<body style="position: relative;overflow: hidden;background: #f2f2f0;">
<div class="wrap">
    <section class="container index">
        <!--0807 v1.2 star-->
        <header class="header">
            <a href="notification.html"><i class="icon" id="homeNews"></i></a>
            <span>Alice借呗</span>
            <a href="/Alice/front/LoginController/page.do"><i class="icon"></i></a>
        </header>
        <!--0807 v1.2 end-->
        <section style="height: 100%;overflow: auto;">
            <div id="slide" class="slide index-slide" style="">
                <!-- 轮播图片数量可自行增减 -->
                <div class="quota">
              	 <!--  <span>最高可借：</span></br>
              	  <strong>9000</strong></br>
              	  <span>总额度：</span></br>
              	  <strong style="font-size: 12px;">9000</strong> -->
              	  <span class="">最高可借</span></br>
              	  <span class="">9000</span></br>
              	  
                </div>
                
            </div>
            <!--0807 v1.2 star-->
            <ul class="sub_nav clearfix">
                <li><a href="/Alice/front/updatePersonInfo/page.do"><img src="<%=request.getContextPath()%>/resource/front/img/ptsja.png"><span>开通借呗</span></a></li>
                <li><a href="/Alice/front/FrontLoanController/page.do"><img src="<%=request.getContextPath()%>/resource/front/img/ewma.png"><span>借款入口</span></a></li>
	  	   <%-- <li><a href="javascript:;" id="inviteBtn"><img src="<%=request.getContextPath()%>/resource/front/img/ewma.png"><span>借款入口</span></a></li> --%>
                <li id="newer"><a href="noviceRaiders.html"><img src="<%=request.getContextPath()%>/resource/front/img/xsgla.png"><span>新手攻略</span></a></li>
                <li style="display: none"><a href="invest.html?tab=3"><img src="<%=request.getContextPath()%>/resource/front/img/rmtza.png"><span>热门投资</span></a>
                </li>
                <%-- <li id="shoppingMall"><a href="javascript:;"><img src="<%=request.getContextPath()%>/resource/front/img/jfsca.png"><span>积分商城</span></a></li> --%>
            </ul>
            <!--0807 v1.2 end-->
            <!--新手部分-->
            <section class="newer_list" style="padding-bottom: 0.5rem;background: #fff" id="newer_list">
                <div class="newer">
                   <!--  <div class="newer_title">安心理财 稳健收益</div> -->
                    <div class="row-bot">
                        <div class="center-shadow">
                            <div class="carousel-container">
                                <div id="carousel" class="carousel">
                                </div>
                            </div>
                        </div>
                    </div>
                    <ul class="text_wrap clearfix" id="textDesc">
                        <li><span class="Period"></span><span>全部待还</span><strong>0.00</strong></li>
                        <li><span class="Amount red"></span><span>借款记录</span></li>
                        <li><span class="EachAmount"></span><span>起投金额</span></li>
                    </ul>
                   <div class="newer_detail">
                        <a class="invest_btn" href="invest.html?tab=1">立即还款</a>
                    </div>
                    <a href="javascript:;" class="download_icon" id="goAppBtn"><img src="<%=request.getContextPath()%>/resource/front/img/app1.png"></a>
                </div>
                <p class="slogan"><i class="icon"></i>账户安全由人保财险和广东华兴银行共同保障</p>
            </section>
        </section>
        <!--	页面底部部分-->
        <ul class="footer">
            <li class="footer-item">
                <a href="index.html" class="">
                    <i class="icon icon_index active"></i>
                    <p class="icon_title" style="color: #f23029">首页</p>
                </a>
            </li>
            <li class="footer-item">
                <a href="/Alice/front/FrontPersonalController/page.do" class="">
                    <i class="icon icon_my"></i>
                    <p class="icon_title">我的</p>
                </a>
            </li>
        </ul>
    </section>
</div>
<!--占屏广告-->
<div class="modal advertisementModal" id="advertisementModal" style="display:none;">
    <div class="advertisement">
        <a href="javascript:;" class="closeAdvertisementModal" onclick="$('#advertisementModal').hide();"></a>
        <a href="javascript:;" id="advertisementUrl"><img src="" style="display: block;width: 100%;" onerror="$('#advertisementModal').hide();"></a>
    </div>
</div>
</body>
<!--小能 start-->
<script src="<%=request.getContextPath()%>/resource/front/js/indexHeader.js"></script>
<script type="text/javascript" src="http://dl.ntalker.com/js/xn6/ntkfstat.js?siteid=kf_9092" charset="utf-8"></script>
<!--小能 end-->
<!--插件-->
<script src="<%=request.getContextPath()%>/resource/front/js/jquery.featureCarousel.js" type="text/javascript" charset="utf-8"></script>
<!--index-->
<script src="<%=request.getContextPath()%>/resource/front/js/index.js?v=1.2.2"></script>
</html>