<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>FisioLife Plus</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="./assets/css/main.css" />
<link rel="stylesheet" href="./assets/css/menu.css" />


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
<script src="./assets/js/funcionesPaginasPrincipales.js"></script>
<!-- SmartMenus jQuery plugin -->
<script type="text/javascript" src="./assets/js/jquery.smartmenus.js"></script>


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
						<h1 class="style=float:right">
							<a href="#" title="cerrar sesion"><img alt="" src="./images/logout.png"></a>
						</h1>
						<h2 class="">
							<a>Bienvenido: ${nombreUsuario}</a>
						</h2>
						<!-- Sample menu definition -->
						<ul id="main-menu" class="sm sm-blue">
<%-- 							<c:if test = "${1==1}"> --%>
								<li><a href="#" >Inicio</a></li>

<%-- 							</c:if> --%>
							<li><a href="#">Agenda</a></li>
							<li><a href="#">Pacientes</a></li>
							<li><a href="#">Estadisticas</a>
								<ul>
									<li><a href="">Fidelizacion</a></li>
									<li><a href="">Semanal</a></li>
								</ul></li>
							<li><a href="#">Contabilidad</a>
								<ul>
									<li><a href="#" class="disabled">Facturas</a></li>
									<li><a href="#">Inventario</a></li>

									<!-- 									<li><a href="#" class="disabled">Disabled menu item</a></li> -->
									<li><a href="#">Balances</a>
										<ul>
											<li><a href="#">Trimestral</a></li>
											<li><a href="#">Semestral</a></li>
											<li><a href="#">Anual</a></li>

										</ul></li>
								</ul></li>
							<li><a href="">Notificaciones</a>
						</ul>

						</nav>


					</div>
				</div>
			</div>
		</div>
		<!-- CONTENIDO -->
		<div id="main">
			<div class="container"></div>
		</div>
	</div>

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
</body>
</html>
