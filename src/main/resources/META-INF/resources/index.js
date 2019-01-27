var app = new Vue({
	el : '#app',
	data : {
		routes : {}
	}
});

$(function() {
	$.get("http://localhost:8080/camelContext", function(data) {
		app.routes = data;
		console.log(JSON.stringify(app.routes, undefined, 2));
	});
});