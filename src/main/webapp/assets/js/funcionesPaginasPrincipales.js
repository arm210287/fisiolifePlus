$(document).ready(function() {
	//banner de fotos
	$('.mi-slider').unslider(); 
	//mapa con ubicacione
	$('#map').load("./vistas/mapa.html");

});

function load(numeroPag) {
	$("#slider").load("./vistas/pagina" + numeroPag + ".html");
};

function loadCita() {
	$("#slider").load("./vistas/citaOnline.html");
};

function loadContacto() {
	$("#slider").load("./vistas/formularioContacto.html");
};


function logout() {
	$("#body").load("index.jsp");

}

function login() {
	$('#mensaje').load('login', "nombreUsuario=" + $('#nombreUsuario').val(),
			"claveUsuario=" + $('#claveUsuario').val());
}

  

