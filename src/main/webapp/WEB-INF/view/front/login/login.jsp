<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
    <meta content="投呗登录,投呗注册" name="Keywords">
    <meta content="“投呗”用户登录入口，新用户注册可领理财红包。投呗平台交易安全有保障，是您投资理财的不二选择！" name="description">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1.0"/>
    <meta name="format-detection" content="telephone=no, email=no"/>
    <meta property="wb:webmaster" content="xxxxxxx"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resource/front/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resource/front/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resource/front/lib/css/layer.css"/>
    <script src="<%=request.getContextPath()%>/resource/front/lib/js/jquery-2.1.4.js" type="text/javascript" charset="utf-8"></script>
    <script src="<%=request.getContextPath()%>/resource/front/js/wapframwork.js" type="text/javascript" charset="utf-8"></script>
    
<style type="text/css">
.Verify{
	display: block;
	height: auto;
	max-width: 100%;
	position: relative;
}

</style>
    
<script type="text/javascript">
/* $(document).ready(function(){
	$('#loginBotton').on('click',function(){	
		$.ajax({
			type:'post',
			url:'login.do',
			data:{
				"user":$('#user').val(),
		    	"pwd":$('#pwd').val()
			},
			success:(function(data){
				alert(data);
			})
		})
		
	})
}) */

$(function(){
	 $('#loginBotton').on('click', function () {
		 $.ajax({
				type:"post" ,
				async : true,
				url:'login.do',
				data:{
					userTel:$('#userTel').val(),
		 			pwd:$('#pwd').val(),
		 			checkcode:$('#checkcode').val()
				},
				dataType:'json',
				success:function(data){
					if(data == "1"){
						window.location.href = '/Alice/front/IndexController/page.do' ;
					}else if(data == "0"){
						alert("登入失败")
					}
					else if(data == "2"){
						alert("账号多次登录 已被锁定  请等待7秒后在继续")
					}
					else if(data == "3"){
						alert("已解除锁定 输入账号密码进行登录")
					}
				}
			});
	  });
})
$(document).ready(function(){
	$("#Verify").click(function(){
		var time=new Date().getTime();
		/* $("#Verify").src="/AliceRe/front/IndexController/getVerify.do?"+time; */
		$("#Verify").attr("src","/Alice/front/IndexController/getVerify.do?"+time);
	});
});

</script> 
</head>
<body>
<div class="login_bg">
    <img src="<%=request.getContextPath()%>/resource/front/img/login_bg.png">
    <div>
        <div class="login_title" style="display: none;">
            <a href="index.html">
                <i class="icon"></i>
            </a>
            <a href="/Alice/front/RegisterController/page.do">
                <span>注册</span>
            </a>
        </div>
        <!--登录内容部分-->
        <div class="login_content">
            <div class="username">
                <!--<i class="icon icon_user"></i>-->
                <input  type="text" id="userTel" name="userTel" placeholder="用户名/手机号"/>
            </div>
            <div class="password">
                <!--<i class="icon icon_pwd"></i>-->
               <input type="password" id="pwd" name="pwd" placeholder="密码"/>
                <input type="text" id="checkcode" name="checkcode" placeholder="验证码" name="checkcode"/>
                
                <img class="Verify" id="Verify" src="/Alice/front/IndexController/getVerify.do" />
                <img class="icon_eye" src="<%=request.getContextPath()%>/resource/front/img/bkj.png"/>
            </div>
            <span id="loginBotton" class="btn login_btn">登录</span>
            <p class="forget_btn">
                <a href="forgetPwd.html">忘记密码?</a>
            </p>
            <div class="thirdPartyLoginWrap">
                <ul class="clearfix">
                    <li id="wechatBtn"><a href="javascript:;" class="wechat"><img src="<%=request.getContextPath()%>/resource/front/img/loginwxa.png"></a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
</body>

<%-- <script src="<%=request.getContextPath()%>/resource/front/lib/js/layer.js" type="text/javascript" charset="utf-8"></script> --%>
<!--头部-->
<script src="<%=request.getContextPath()%>/resource/front/lib/js/RainbowBridge.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    setTitle(".login_title", {'title': '登录'});
</script>
<%-- <script src="<%=request.getContextPath()%>/resource/front/js/loading.js"></script>
<script src="<%=request.getContextPath()%>/resource/front/js/weChatConfig.js"></script> --%>
<!--微信第三方登录openid-->
<script src="<%=request.getContextPath()%>/resource/front/js/indexWechat.js"></script>
<%-- <script src="<%=request.getContextPath()%>/resource/front/js/login.js?v=1.2.2" type="text/javascript" charset="utf-8"></script> --%>
<script>
    $(".thirdPartyLoginWrap").on("click", "li", function () {
        weChatLoginFn(wechatLoginObj);
    });
</script>
</html>