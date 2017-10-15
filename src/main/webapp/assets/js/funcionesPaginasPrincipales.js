$(document).ready(function() {
	$('.mi-slider').unslider();

});

function load(numeroPag) {
	$("#slider").load("./vistas/pagina" + numeroPag + ".html");
};

function logout(){
	$("#body").load("index.jsp");

}



