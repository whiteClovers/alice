
$(function(){
	
	$.ajaxSetup({
		timeout : 1000, //超时时间设置，单位毫秒
		beforeSend: function() {
			// 禁用按钮防止重复提交
			$("#buttonSave").attr({
				disabled: "disabled"
			});
		},
		complete: function() {
			$("#buttonSave").removeAttr("disabled");
		},
		error: function(data) {
			console.info("error: " + data.responseText);
		}
	 })
	
})
