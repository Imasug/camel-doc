var app = new Vue({
	el : '#app',
	data : {
		context : {}
	}
});

$(function() {
	$.get("http://localhost:8080/camelContext", function(data) {
		var obj = new X2JS().xml_str2json(data);
		app.context = obj.beans.camelContext;
		console.log(app.data);
	});
});