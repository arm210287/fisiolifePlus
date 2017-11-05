<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<title>FisioLife Plus</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="./assets/css/main.css" />
<!-- <link rel="stylesheet" href="./assets/css/formulario.css" /> -->
</head>


<!-- Scripts -->
<script src="./assets/js/jquery.min.js"></script>
<script src="./assets/js/jquery-ui.min.js"></script>
<script src="./assets/js/skel.min.js"></script>
<script src="./assets/js/unslider.js"></script>
<script src="./assets/js/skel-viewport.min.js"></script>
<script src="./assets/js/util.js"></script>
<script src="./assets/js/jsCycle.js"></script>
<script src="./assets/js/main.js"></script>
<script src="./assets/js/funcionesPaginasPrincipales.js"></script>
<script src="./assets/js/login.js"></script>

<script type="text/javascript" src="./assets/jqwidgets/jqxcore.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxdatetimeinput.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxbuttons.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxscrollbar.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxdata.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxdate.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxscheduler.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxscheduler.api.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxdatetimeinput.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxmenu.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxcalendar.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxtooltip.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxwindow.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxcheckbox.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxlistbox.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxdropdownlist.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxnumberinput.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxradiobutton.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxinput.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/globalization/globalize.js"></script>
<script type="text/javascript"src="./assets/jqwidgets/globalization/globalize.culture.es-ES.js"></script>
<!-- SmartMenus jQuery plugin -->
<script type="text/javascript" src="./assets/js/jquery.smartmenus.js"></script>

</head>
<body>
	<div id="page-wrapper">
		<div id="header-wrapper">
			<div class="container">
				<div class="row">
					<div class="12u">

						<header id="header">
							<nav id="nav">
								<div class="logo">
									<img alt="" src="./images/fisioLogo3.png">
								</div>
								<a href="index.jsp" class="current-page-item">Inicio</a> <a
									onclick="load('1');return false;" href="#">Quienes Somos</a> <a
									onclick="load('2'); return false;" href="#">Servicios</a> <a
									onclick="load('3'); return false;" href="#">Tarifas</a> <a
									onclick="loadCita(); return false;" href="#">Cita Online</a> <a
									onclick="loadContacto(); return false;" href="#">Contacto</a>

								<div id="bar">
									<div id="container">
										<!-- Login Starts Here -->
										<div id="Form">
											<a href="" id="loginButton" onclick=""><img alt=""
												src="./images/login.png"></a>
											<div id="loginBox">
												<c:url var="loginUrl" value="/login" />
												<form id="loginForm" action="${loginUrl}" method="post">
													<fieldset id="body">
														<fieldset>
															<input type="text" name="nombreUsuario" id="nombreUsuario"
																placeholder="usuario" />
														</fieldset>
														<fieldset>
															<input type="password" name="claveUsuario"	id="claveUsuario"
															 placeholder="contraseña" />
															
														</fieldset>

														<input type="submit" id="login" value="Entrar" /> <label><a
															href="#"><span>olvidaste tu contraseña?</span></a></label>
													</fieldset>
												</form>
											</div>
										</div>
										<!-- Login Ends Here -->
									</div>
								</div>
							</nav>
						</header>

					</div>
				</div>
			</div>
		</div>
		<div id="contenido">
			<div id="banner-wrapper">
				<div class="container">

					<div id="slider" class="mi-slider">
						<ul>
							<li><img alt="" src="./images/BANNER 1.png" width="1200px"
								height="380px"></li>
							<li><img alt="" src="./images/BANNER 2.png" width="1200px"
								height="380px"></li>
							<li><img alt="" src="./images/BANNER 3.png" width="1200px"
								height="380px"></li>
						</ul>
					</div>

				</div>
			</div>
			<div id="main">
				<div class="container">
					<div id ="contenido_encuentra_hora">
					
					<div class="row main-row">
						<div class="4u 12u(mobile)">
								<h2>Encuentranos!</h2>
								<section>	
									<div id="map">
									</div>
								</section>							

						</div>
						<div class="4u 12u">
							<h2>Horarios</h2>
							<section>
								<table border="1" id="mitabla">
									<tr>
										<th>Día</th>
										<th>Hora</th>
									</tr>
									<tbody>
										<tr>
											<td>Lunes a Viernes</td>
											<td>10:00h a 21:00h</td>
										</tr>
										<tr>
											<td>Martes</td>
											<td>10:00h a 21:00h</td>
										</tr>
										<tr>
											<td>Miercoles</td>
											<td>10:00h a 21:00h</td>
										</tr>
										<tr>
											<td>Jueves</td>
											<td>10:00h a 21:00h</td>
										</tr>
										<tr>
											<td>Viernes</td>
											<td>10:00h a 21:00h</td>
										</tr>
										<tr>
											<td>Sabados</td>
											<td>11:00h a 19:00h</td>
										</tr>
									</tbody>
								</table>
							</section>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
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
</html>
