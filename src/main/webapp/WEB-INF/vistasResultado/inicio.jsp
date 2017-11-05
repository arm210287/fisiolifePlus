<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
<title>FisioLife Plus</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="./assets/css/main.css" />
<link rel="stylesheet" href="./assets/css/menu.css" />
<link rel="stylesheet" href="./assets/jqwidgets/styles/jqx.base.css"
	type="text/css" />
<link rel="stylesheet" href="./assets/jqwidgets/styles/jqx.black.css"
	type="text/css" />

<!-- SmartMenus core CSS (required) -->
<link href="./assets/css/sm-core-css.css" rel="stylesheet"
	type="text/css" />

<!-- "sm-blue" menu theme (optional, you can use your own CSS, too) -->
<link href="./assets/css/sm-blue/sm-blue.css" rel="stylesheet"
	type="text/css" />


<!-- Scripts -->
<script src="./assets/js/jquery.min.js"></script>
<script src="./assets/js/skel.min.js"></script>
<script src="./assets/js/unslider.js"></script>
<script src="./assets/js/skel-viewport.min.js"></script>
<script src="./assets/js/util.js"></script>
<script src="./assets/js/jsCycle.js"></script>
<script src="./assets/js/main.js"></script>
<script src="./assets/js/menu.js"></script>
<!-- <script src="./assets/js/funcionesPaginasPrincipales.js"></script> -->
<script src="./assets/js/agenda.js"></script>

<script type="text/javascript" src="./assets/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxcore.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxbuttons.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxscrollbar.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxdata.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxdate.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxscheduler.js"></script>
<script type="text/javascript"
	src="./assets/jqwidgets/jqxscheduler.api.js"></script>
<script type="text/javascript"
	src="./assets/jqwidgets/jqxdatetimeinput.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxmenu.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxcalendar.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxtooltip.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxwindow.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxcheckbox.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxlistbox.js"></script>
<script type="text/javascript"
	src="./assets/jqwidgets/jqxdropdownlist.js"></script>
<script type="text/javascript"
	src="./assets/jqwidgets/jqxnumberinput.js"></script>
<script type="text/javascript"
	src="./assets/jqwidgets/jqxradiobutton.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxinput.js"></script>
<script type="text/javascript"
	src="./assets/jqwidgets/globalization/globalize.js"></script>
<script type="text/javascript"
	src="./assets/jqwidgets/globalization/globalize.culture.es-ES.js"></script>
<!-- SmartMenus jQuery plugin -->
	<script type="text/javascript" src="./assets/js/jquery.smartmenus.js">
</script>


</head>
<body>
	<div id="page-wrapper">
		<div id="header-wrapper">
			<div class="container">
				<div class="row">
					<div class="12u">
						<nav class="nav" role="navigation"> <!-- Mobile menu toggle button (hamburger/x icon) -->
						<input id="main-menu-state" type="checkbox" /> <label
							class="main-menu-btn" for="main-menu-state"> <span
							class="main-menu-btn-icon"></span>
						</label>

						<h2 class="nav-brand">
							<a href="#"><img alt="" src="./images/fisioLogo3.png"></a>
						</h2>
						<c:url var="logoutUrl" value="/logout" />

						<p class="style=float:right">
							<a href="index.jsp" title="cerrar sesion"><img alt=""
								src="./images/logout.png"></a>
						</p>
						<p class="">
							<a>Bienvenido: ${nombreUsuario}</a>
						</p>
						
						<!-- clinica/idRol del usuario conectado -->
		
						<c:set var="idClinica" scope="session" value="${clinica}" />
						<c:set var="idRol" scope="session" value="${idRol}" />
						<input id="clinica" type="hidden" value="${idClinica}"/>
						<input id="idRol" type="hidden" value="${idRol}"/>
						
						<!-- Sample menu definition -->
						<ul id="main-menu" class="sm sm-blue">
							<c:set var="rol" scope="session" value="${rol}" />

							<li><a href="#" onclick="loadMenu('I');return false;">Inicio</a></li>
							<c:choose>
								<c:when test="${rol eq 'FISIO' or rol eq 'FRAN'}">
									<li><a href="#">Clinicas</a>
										<ul>
											<li><a href="#" class="disabled">Vista Alegre</a></li>
											<li><a href="#" class="disabled">Cuzco</a></li>
											<li><a href="#" class="disabled">Mostoles</a></li>
										</ul></li>
								</c:when>
								<c:otherwise>
									<li><a href="#">Clinicas</a>
										<ul>
											<li><a href="#" onclick="loadMenu('Ag',1,3);return false;">Vista Alegre</a></li>
											<li><a href="#" onclick="loadMenu('Ag',2,3);return false;">Cuzco</a></li>
											<li><a href="#" onclick="loadMenu('Ag',3,3);return false;">Mostoles</a></li>
										</ul></li>
								</c:otherwise>
							</c:choose>
							<li><a href="#" onclick="loadMenu('Ag');return false;">Agenda</a></li>
							<li><a href="#">Pacientes</a>
								<ul>
									<li><a href="#" onclick="loadMenu('A');return false;">Añadir</a></li>
									<li><a href="#">Consultar</a></li>
								</ul></li>
							<li><a href="#">Estadisticas</a>
								<ul>
									<c:choose>
										<c:when test="${rol eq 'FISIO'}">
											<li><a href="#" class="disabled">Fidelizacion</a></li>
											<li><a href="#" class="disabled">Semanal</a></li>
										</c:when>
										<c:otherwise>
											<li><a href="#">Fidelizacion</a></li>
											<li><a href="#">Semanal</a></li>
										</c:otherwise>
									</c:choose>
								</ul></li>
							<li><a href="#">Contabilidad</a>
								<ul>
									<c:choose>
										<c:when test="${rol eq 'FISIO'}">
											<li><a href="#" class="disabled">Facturas</a></li>
											<li><a href="#" class="disabled">Inventario</a></li>
											<li><a href="#" class="disabled">Balances</a>
												<ul>
													<li><a href="#" class="disabled">Trimestral</a></li>
													<li><a href="#" class="disabled">Semestral</a></li>
													<li><a href="#" class="disabled">Anual</a></li>

												</ul></li>
										</c:when>
										<c:otherwise>
											<li><a href="#">Facturas</a></li>
											<li><a href="#">Inventario</a></li>
											<li><a href="#">Balances</a>
												<ul>
													<li><a href="#">Trimestral</a></li>
													<li><a href="#">Semestral</a></li>
													<li><a href="#">Anual</a></li>

												</ul></li>
										</c:otherwise>
									</c:choose>
								</ul></li>
							<li><a href="#">Notificaciones</a>
						</ul>
						</nav>


					</div>
				</div>
			</div>
		</div>
		<!-- CONTENIDO -->
		<div id="main">
			<div class="container">
				<div id="opcionesMenu">
					<!-- AGENDA -->
					<div id="agenda" class='default'>
						<div id="scheduler"></div>

					</div>
					<!-- 					 <input type="button" value="Click Me" id='myButton' /> -->
				</div>

			</div>
		</div>
	</div>


</body>
<!-- PIE DE LA PAGINA -->
<footer>

<div class="row">
	<div class="12u">

		<div id="copyright">
			&copy; FisioLife Plus <a href="#"></a>
		</div>
		<div style="width: 8%; margin: 0 auto;">
			<a href="https://www.facebook.com/FisioLifeVistaAlegre/"> <img
				alt="" src="./images/facebook.png"></a> <a
				href="https://www.instagram.com/fisiolifeva/"><img alt=""
				src="./images/instagram.jpg"></a> <a
				href="https://www.twitter.com/fisiolifeva"><img alt=""
				src="./images/twitter.png"></a>
		</div>

	</div>
</div>
</footer>
</html>
