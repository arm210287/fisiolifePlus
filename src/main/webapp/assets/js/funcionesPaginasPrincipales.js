$(document).ready(function() {
	$('.mi-slider').unslider();

});

function load(numeroPag) {
	$("#slider").load("./vistas/pagina" + numeroPag + ".html");
};

function loadCita(numeroPag) {
	$("#contenido").load("./vistas/citaOnline.jsp");
};

function logout(){
	$("#body").load("index.jsp");

}



