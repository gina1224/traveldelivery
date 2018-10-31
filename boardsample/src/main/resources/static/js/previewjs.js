
var website='';
var url = '';
var type = '';
var contentType = '';
var success = '';

$(document).ready(function(){

	
	// Modal의 Submit 버튼 클릭
	$("#previewSubmit").click(function(){
		website = $("website").val();
		
		$.ajax({
		    url: "https://api.linkpreview.net?key=5b8ff1e532243c68df1093a93023d0960841f27224080&q=${website}",
		    type: "GET",
		    contentType: "application/json",
		    success: function(result){
		        console.log(result);
		    }
		});
		
		location.reload();
	});
	

});
