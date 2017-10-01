<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>FisioLife Plus</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="./assets/css/main.css" />


<!-- Scripts -->
<script src="./assets/js/jquery.min.js"></script>
<script src="./assets/js/skel.min.js"></script>
<script src="./assets/js/unslider.js"></script>
<script src="./assets/js/skel-viewport.min.js"></script>
<script src="./assets/js/util.js"></script>
<script src="./assets/js/jsCycle.js"></script>
<script src="./assets/js/main.js"></script>
<script src="./assets/js/funcionesPaginasPrincipales.js"></script>
<script src="./assets/js/login.js"></script>


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
									<a href="index.jsp" class="current-page-item">Inicio</a> 
									<a onclick="load(1);return false;" href="#">Quienes Somos</a> 
									<a onclick="load(2);return false;" href="#">Servicios</a>
									<a onclick="load(3);return false;" href="#">Tarifas</a> 
									<a href="#">Cita Online</a>
									<a href="#">Contacto</a>
									
									<div id="bar">
								        <div id="container">
								            <!-- Login Starts Here -->
								            <div id="loginContainer">
												 <a href="" id="loginButton" onclick=""><img  alt="" src="./images/login.png"></a>
<!-- 								                <div style="clear:both"></div> -->
								                <div id="loginBox">       
								                <c:url var="loginUrl" value="/login" />         
								                    <form id="loginForm" action="${loginUrl}" method="post">
								                        <fieldset id="body">
								                            <fieldset>
								                                <input type="text" name="nombreUsuario" id="nombreUsuario" placeholder="usuario" />
								                            </fieldset>
								                            <fieldset>
								                                <input type="password" name="claveUsuario" id="claveUsuario" placeholder="contrase�a"/>
								                            </fieldset>
								                            <input type="submit" id="login" value="Entrar" />
								                            <label for="checkbox"><input type="checkbox" id="checkbox" />Recuerdame</label>
								                               <label><a href="#">olvidaste tu contraseña?</a></label>  
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
	
		<div id="banner-wrapper">
			<div class="container">

				<div id="slider" class="mi-slider">
					<ul>
						<li><img alt="" src="./images/fisio1.jpg" width="1200px"
							height="380px"></li>
						<li><img alt="" src="./images/fisio2.jpg" width="1200px"
							height="380px"></li>
						<li><img alt="" src="./images/fisio3.jpg" width="1200px"
							height="380px"></li>
						<li><img alt="" src="./images/fisio4.jpg" width="1200px"
							height="380px"></li>
						<li><img alt="" src="./images/fisio5.jpg" width="1200px"
							height="380px"></li>

					</ul>
				</div>

			</div>
		</div>
		<div id="main">
			<div class="container">
				<div class="row main-row">
					<div class="4u 12u(mobile)">

						<section>
							<h2>Encuentranos!</h2>
							<div id="map">
								<iframe
									src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3038.842180119404!2d-3.7373687849540373!3d40.39019027936817!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd42278d17e2c2f7%3A0xd8a5890ce435c3f2!2sAv.+de+Ntra.+Sra.+de+Valvanera%2C+2%2C+28025+Madrid!5e0!3m2!1ses!2ses!4v1483902066682"
									width="400" height="300" frameborder="0" style="border: 0"
									allowfullscreen></iframe>
							</div>
						</section>

					</div>
					<div class="4u 12u(mobile)">

						<section>
							<h2>Horarios</h2>
							<table border="1" id="mitabla">
								<tr>
									<th>D�a</th>
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
					<div class="4u 12u(mobile)">

						<section>
							<h2>Cita online sin registrarte?</h2>
							<div>
								<div class="row">
									<div class="6u 12u(mobile)">
										<ul class="link-list">
											<li><a href="#">pincha aqui</a></li>
										</ul>
									</div>
									<div class="6u 12u(mobile)">
										<ul class="link-list">
											<li><a href="#"></a></li>
										</ul>
									</div>
								</div>
							</div>
						</section>

					</div>
				</div>
				<!-- 					<div class="row main-row"> -->
				<!-- 						<div class="6u 12u(mobile)"> -->

				<!-- 							<section> -->
				<!-- 								<h2>An assortment of pictures and text</h2> -->
				<!-- 								<p>Duis neque nisi, dapibus sed mattis quis, rutrum et accumsan. -->
				<!-- 								Suspendisse nibh. Suspendisse vitae magna eget odio amet mollis -->
				<!-- 								justo facilisis quis. Sed sagittis mauris amet tellus gravida -->
				<!-- 								lorem ipsum dolor sit amet consequat blandit lorem ipsum dolor -->
				<!-- 								sit amet consequat sed dolore.</p> -->
				<!-- 								<ul class="big-image-list"> -->
				<!-- 									<li> -->
				<!-- 										<a href="#"><img src="images/pic3.jpg" alt="" class="left" /></a> -->
				<!-- 										<h3>Magna Gravida Dolore</h3> -->
				<!-- 										<p>Varius nibh. Suspendisse vitae magna eget et amet mollis justo -->
				<!-- 										facilisis amet quis consectetur in, sollicitudin vitae justo. Cras -->
				<!-- 										Maecenas eu arcu purus, phasellus fermentum elit.</p> -->
				<!-- 									</li> -->
				<!-- 									<li> -->
				<!-- 										<a href="#"><img src="images/pic4.jpg" alt="" class="left" /></a> -->
				<!-- 										<h3>Magna Gravida Dolore</h3> -->
				<!-- 										<p>Varius nibh. Suspendisse vitae magna eget et amet mollis justo -->
				<!-- 										facilisis amet quis consectetur in, sollicitudin vitae justo. Cras -->
				<!-- 										Maecenas eu arcu purus, phasellus fermentum elit.</p> -->
				<!-- 									</li> -->
				<!-- 									<li> -->
				<!-- 										<a href="#"><img src="images/pic5.jpg" alt="" class="left" /></a> -->
				<!-- 										<h3>Magna Gravida Dolore</h3> -->
				<!-- 										<p>Varius nibh. Suspendisse vitae magna eget et amet mollis justo -->
				<!-- 										facilisis amet quis consectetur in, sollicitudin vitae justo. Cras -->
				<!-- 										Maecenas eu arcu purus, phasellus fermentum elit.</p> -->
				<!-- 									</li> -->
				<!-- 								</ul> -->
				<!-- 							</section> -->

				<!-- 						</div> -->
				<!-- 						<div class="6u 12u(mobile)"> -->

				<!-- 							<article class="blog-post"> -->
				<!-- 								<h2>Just another blog post</h2> -->
				<!-- 								<a class="comments" href="#">33 comments</a> -->
				<!-- 								<a href="#"><img src="images/pic6.jpg" alt="" class="top blog-post-image" /></a> -->
				<!-- 								<h3>Magna Gravida Dolore</h3> -->
				<!-- 								<p>Aenean non massa sapien. In hac habitasse platea dictumst. -->
				<!-- 								Maecenas sodales purus et nulla sodales aliquam. Aenean ac -->
				<!-- 								porttitor metus. In hac habitasse platea dictumst. Phasellus -->
				<!-- 								blandit turpis in leo scelerisque mollis. Nulla venenatis -->
				<!-- 								ipsum nec est porta rhoncus. Mauris sodales sed pharetra -->
				<!-- 								nisi nec consectetur. Cras elit magna, hendrerit nec -->
				<!-- 								consectetur in, sollicitudin vitae justo. Cras amet aliquet -->
				<!-- 								Aliquam ligula turpis, feugiat id fermentum malesuada, -->
				<!-- 								rutrum eget turpis. Mauris sodales sed pharetra nisi nec -->
				<!-- 								consectetur. Cras elit magna, hendrerit nec consectetur -->
				<!-- 								in sollicitudin vitae.</p> -->
				<!-- 								<footer class="controls"> -->
				<!-- 									<a href="#" class="button">Continue Reading</a> -->
				<!-- 								</footer> -->
				<!-- 							</article> -->

				<!-- 						</div> -->
				<!-- 					</div> -->
				<!-- 				</div> -->
				<!-- 			</div> -->
				<!-- 			<div id="footer-wrapper"> -->
				<!-- 				<div class="container"> -->
				<!-- 					<div class="row"> -->
				<!-- 						<div class="8u 12u(mobile)"> -->

				<!-- 							<section> -->
				<!-- 								<h2>How about a truckload of links?</h2> -->
				<!-- 								<div> -->
				<!-- 									<div class="row"> -->
				<!-- 										<div class="3u 12u(mobile)"> -->
				<!-- 											<ul class="link-list"> -->
				<!-- 												<li><a href="#">Sed neque nisi consequat</a></li> -->
				<!-- 												<li><a href="#">Dapibus sed mattis blandit</a></li> -->
				<!-- 												<li><a href="#">Quis accumsan lorem</a></li> -->
				<!-- 												<li><a href="#">Suspendisse varius ipsum</a></li> -->
				<!-- 												<li><a href="#">Eget et amet consequat</a></li> -->
				<!-- 											</ul> -->
				<!-- 										</div> -->
				<!-- 										<div class="3u 12u(mobile)"> -->
				<!-- 											<ul class="link-list"> -->
				<!-- 												<li><a href="#">Quis accumsan lorem</a></li> -->
				<!-- 												<li><a href="#">Sed neque nisi consequat</a></li> -->
				<!-- 												<li><a href="#">Eget et amet consequat</a></li> -->
				<!-- 												<li><a href="#">Dapibus sed mattis blandit</a></li> -->
				<!-- 												<li><a href="#">Vitae magna sed dolore</a></li> -->
				<!-- 											</ul> -->
				<!-- 										</div> -->
				<!-- 										<div class="3u 12u(mobile)"> -->
				<!-- 											<ul class="link-list"> -->
				<!-- 												<li><a href="#">Sed neque nisi consequat</a></li> -->
				<!-- 												<li><a href="#">Dapibus sed mattis blandit</a></li> -->
				<!-- 												<li><a href="#">Quis accumsan lorem</a></li> -->
				<!-- 												<li><a href="#">Suspendisse varius ipsum</a></li> -->
				<!-- 												<li><a href="#">Eget et amet consequat</a></li> -->
				<!-- 											</ul> -->
				<!-- 										</div> -->
				<!-- 										<div class="3u 12u(mobile)"> -->
				<!-- 											<ul class="link-list"> -->
				<!-- 												<li><a href="#">Quis accumsan lorem</a></li> -->
				<!-- 												<li><a href="#">Sed neque nisi consequat</a></li> -->
				<!-- 												<li><a href="#">Eget et amet consequat</a></li> -->
				<!-- 												<li><a href="#">Dapibus sed mattis blandit</a></li> -->
				<!-- 												<li><a href="#">Vitae magna sed dolore</a></li> -->
				<!-- 											</ul> -->
				<!-- 										</div> -->
				<!-- 									</div> -->
				<!-- 								</div> -->
				<!-- 							</section> -->

				<!-- 						</div> -->
				<!-- 						<div class="4u 12u(mobile)"> -->

				<!-- 							<section> -->
				<!-- 								<h2>Something of interest</h2> -->
				<!-- 								<p>Duis neque nisi, dapibus sed mattis quis, rutrum accumsan sed. -->
				<!-- 								Suspendisse eu varius nibh. Suspendisse vitae magna eget odio amet -->
				<!-- 								mollis justo facilisis quis. Sed sagittis mauris amet tellus gravida -->
				<!-- 								lorem ipsum dolor sit amet consequat blandit.</p> -->
				<!-- 								<footer class="controls"> -->
				<!-- 									<a href="#" class="button">Oh, please continue ....</a> -->
				<!-- 								</footer> -->
				<!-- 							</section> -->

				<!-- 						</div> -->
				<!-- 					</div> -->
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
			</div>
		</div>
	</div>

</body>
</html> 