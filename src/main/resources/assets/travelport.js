$(document).ready(function() {
    $.ajax({
    	type: "GET",
    	dataType: "json",
        url: "http://localhost:8080/message",
        success: function(data){     
        	$('.message-content').append("<h2>"+data['message']+"</h2>");
         }
    });
});