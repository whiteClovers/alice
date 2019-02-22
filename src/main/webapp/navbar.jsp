<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/admin/include/global.java.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/view/admin/include/global.css.jsp"%>
<%@include file="/WEB-INF/view/admin/include/global.js.jsp"%>
<title>首页</title>

<style type="text/css">
.menu.main {
	width: 100%;
	margin-left: -8px;
	border-style: none;
	/*  padding: 0px; */
}

.menu.main li {
	padding-left: 16px;
	list-style: none;
	width: 100%;
	height: 40px;
	line-height: 40px;
	border-bottom: 1px solid #e1e1e8;
}
</style>

<script>
	//		 $(window).resize(function () {  
	//       $('#tabs').tabs({  
	//           width: $("#tabs").parent().width(),  
	//           height: "auto"  
	//       });  
	//   })  

	var index = 0;

	function addTab(obj) {
		index++;
		$('#tabs')
				.tabs(
						'add',
						{
							title : obj.attr('tab-title'),
							//content:'<div style="height:1000px">a</div>',
							content : '<iframe name="indextab" scrolling="auto" src="'
									+ obj.attr('href')
									+ '" frameborder="0" style="width:100%;height:99%;"></iframe>',
							closable : true
						});
	}

	function removePanel() {
		var tab = $('#tabs').tabs('getSelected');
		if (tab) {
			var index = $('#tabs').tabs('getTabIndex', tab);
			$('#tabs').tabs('close', index);
		}
	}

	$(function() {
		$('.menu li').click(function() {
			addTab($(this));
		});
	});
</script>
</head>

<body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="height: 60px; background: #B3DFDA; padding: 10px">north
		region</div>
	<div data-options="region:'west',split:true,title:'West'"
		style="width: 150px;">
		<div class="easyui-accordion" data-options="fit:true,border:false">
			<!-- cjz -->
			<div title="基础模块" data-options="selected:true" style="padding: 0px;">
				<ul class="menu main">
					<li tab-title='防黑管理' href='admin/bas/avoidblack/page.do'>防黑管理</li>
					<li tab-title='组织管理' href='admin/bas/avoidrepeat/page.do'>防重管理</li>
					<li tab-title='数据字典管理' href='admin/bas/datadictionary/page.do'>数据字典管理</li>
					<li tab-title='数据字典详情管理' href='admin/bas/datadictionarydetail/page.do'>数据字典详情管理</li>
				</ul>
			</div>
			
			<!-- yxy -->
			<div title="产品模块" style="padding: 0px;">
				<ul class="menu main">
					<li tab-title='还款管理' href='admin/pro/proLoan/page.do'>还款管理</li>
					<li tab-title='还款方式管理' href='admin/pro/proRepayMethod/page.do'>还款方式管理</li>
					<li tab-title='还款计划管理' href='admin/pro/proRepayPlan/page.do'>还款计划管理</li>
				</ul>
			</div>
			<!-- cwq -->
			<div title="用户模块" style="padding: 10px">
				<ul class="menu main">
					<li tab-title='用户信息管理' href='admin/usr/usrInformation/page.do'>用户信息管理</li>
					<li tab-title='担保人管理' href='admin/usr/usrSecurity/page.do'>担保人管理</li>
					<li tab-title='经济情况管理' href='admin/usr/usrEconomy/page.do'>经济情况管理</li>
					<li tab-title='银行卡管理' href='admin/usr/usrBankcard/page.do'>银行卡管理</li>

				</ul> 
			</div>

			<div title="系统模块" style="padding: 10px">
				<ul class="menu main">
					<!-- dhq -->
					<li tab-title='菜单管理' href='admin/sys/menu/list.do'>菜单管理</li>
					<li tab-title='模块管理' href='admin/sys/module/list.do'>模块管理</li>
					<li tab-title='角色菜单管理' href='admin/sys/roleMenu/list.do'>角色菜单管理</li>
					<!-- hzw -->
					<li tab-title='角色管理' href='admin/sys/sysRole/page.do'>角色管理</li>
					<li tab-title='员工管理' href='admin/sys/sysStaff/page.do'>员工管理</li>
					<li tab-title='员工角色管理' href='admin/sys/sysStaffRole/page.do'>员工角色管理</li>
				</ul>
			</div>

		</div>

	</div>
	<!--<div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div>-->
	<!--<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">south region</div>-->
	<div data-options="region:'center'">

		<div id="tabs" class="easyui-tabs" fit="true" border="false">
			<div title="欢迎使用" style="padding: 20px; overflow: hidden;" id="home">
				<h1>Welcome to aliceLoan!</h1>
			</div>
		</div>
	</div>
</body>

</html>