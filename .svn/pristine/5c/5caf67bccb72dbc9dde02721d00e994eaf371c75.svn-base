


function onclick_save(){
	/* $.ajax({
		type:"post" ,
		url:'saveAj.action',
		data:{
				"customerId":$('#customerId').val(),
				"code":$('#code').val(),
				"name":$('#name').val()
			},
		success:function(data){
			if(data == ''){
				window.location.href = 'page.action' ;
			}else{
				alert(data) ;
			}
			
		}
	}); */
	$.ajax({
		type:"post" ,
		url:'saveAj.do',
		data:$('#formEdit').serialize(),
		success:function(data){
			if(data == ''){
				window.location.href = 'page.do' ;
			}else{
				alert(data) ;
			}
			
		}
	});
}


