<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>安全中心</title>
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1.0"/>
    <meta name="format-detection" content="telephone=no, email=no"/>
    <link rel="stylesheet" href="/Alice/resource/front/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="/Alice/resource/front/css/index.css"/>
    
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
        个人资料
    </p>
    <a href="javascript:;" id="account">
        <div class="item_content" >
            <span>账号</span>
            <!--<span>缺少用户名字段</span>-->
        </div>
    </a>
    <a href="change_phone.html" id="mobile">
        <div class="item_content">
            <span>绑定手机</span>
            <!-- <span>15912345678</span>
             <span class="setting_status">未设置</span>
             <i class="icon_right"></i>-->
        </div>
    </a>
    <p class="item_title">
        认证信息
    </p>
    <a href="javascript:;" id="realname">
        <div class="item_content">
            <span>真实姓名</span>
            <!-- <span>张三</span>
             <span class="setting_status">设置</span>
             <i class="icon_right"></i>-->
        </div>
    </a>
    <a href="javascript:;" id="datacid">
        <div class="item_content">
            <span>身份证号</span>
            <!--<span id="datacid">15912345678</span>
              <span class="setting_status">未设置</span>
              <i class="icon_right"></i>-->
        </div>
    </a>
    <p class="item_title">
        密码保护
    </p>
    <a href="modify_password.html#1">
        <div class="item_content">
            <span>登录密码</span>
            <span class="setting_status">修改</span>
            <i class="icon_right"></i>
        </div>
    </a>
    <div>
        <div class="item_content last_itemContent">
            <span>交易密码</span>
            <a href="find_tranpassword.html" id="find_password"><span class="setting_status">找回</span></a>
            <a href="modify_password.html#2"><span class="setting_status1">修改</span></a>
            <i class="icon_right"></i>
        </div>
    </div>
</div>
<div class="safecenter_prompt">
    <p>客服热线：400-001-7899</p>
    <p class="service_time">服务时间：9:00-18:00</p>
    <p class="prompt_info">温馨提示：理财有风险，投资需谨慎</p>
</div>
</body>

<script src="../js/safe_center.js"></script>
<script src="../lib/js/RainbowBridge.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    setTitle(".safecenter_title", {'title':'安全中心',"theme":"1"});
</script>
</html>
