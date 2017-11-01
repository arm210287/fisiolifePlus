$(document).ready(function() {
	$('.mi-slider').unslider();

});

function load(numeroPag) {
	$("#slider").load("./vistas/pagina" + numeroPag + ".html");
};

function loadCita() {
	$("#contenido").load("./vistas/citaOnline.jsp");
};

function logout() {
	$("#body").load("index.jsp");

}

function login() {
	$('#mensaje').load('login', "nombreUsuario=" + $('#nombreUsuario').val(),
			"claveUsuario=" + $('#claveUsuario').val());
}

function loadContacto() {
	$("#contenido").load("./vistas/formularioContacto.jsp");
};