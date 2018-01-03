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
<script src="./assets/js/agendaGeneral.js"></script>

<script type="text/javascript" src="./assets/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxcore.js"></script>
<script type="text/javascript"
	src="./assets/jqwidgets/jqxdatetimeinput.js"></script>
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

	<div id="agenda" class='default'>
		<!-- Recoge valores que viajan por la URL -->
		<%
			String idClinica = request.getParameter("clinica");
			String idRol = request.getParameter("idRol");
			String idUsuario = request.getParameter("idUsuario");
			String claveUsuario = request.getParameter("claveUsuario");

		%>
		
		<!-- variables almacenadas -->
		<input id="idClinicaGeneral" type="hidden" value=<%=idClinica%> />
		<input id="idRolGeneral" type="hidden" value=<%=idRol%> />
		<input id="idUsuarioGeneral" type="hidden" value=<%=idUsuario%> />
		<input id="claveUsuarioGeneral" type="hidden" value=<%=claveUsuario%> />
		
		<!-- carga la agenda segun el ROL y la Clinica en cuestion -->
		<div id="scheduler"></div>
	</div>


</body>
</html>
