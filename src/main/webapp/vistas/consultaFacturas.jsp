<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
<title>FisioLife Plus</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="./assets/jqwidgets/styles/jqx.bootstrap.css" type="text/css" />
<link rel="stylesheet" href="./assets/css/formularioConsultas.css" />
<!-- <script type="text/javascript" src="./assets/js/jquery-1.11.1.min.js"></script> -->
<link rel="stylesheet" href="./assets/jqwidgets/styles/jqx.base.css"	type="text/css" />
<script type="text/javascript" src="./assets/jqwidgets/jqxcore.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxdata.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxbuttons.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxscrollbar.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxmenu.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxlistbox.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxdropdownlist.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxgrid.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxgrid.selection.js"></script> 
<script type="text/javascript" src="./assets/jqwidgets/jqxgrid.columnsresize.js"></script> 
<script type="text/javascript" src="./assets/jqwidgets/jqxgrid.filter.js"></script> 
<script type="text/javascript" src="./assets/jqwidgets/jqxgrid.sort.js"></script> 
<script type="text/javascript" src="./assets/jqwidgets/jqxgrid.pager.js"></script> 
<script type="text/javascript" src="./assets/jqwidgets/jqxgrid.grouping.js"></script> 
<script type="text/javascript" src="./assets/jqwidgets/jqxwindow.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/globalization/globalize.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/globalization/globalize.culture.es-ES.js"></script>
<script type="text/javascript" src="./assets/jqwidgets/jqxgrid.edit.js"></script> 
<script type="text/javascript" src="./assets/js/gridFacturasResultados.js"></script>
<script type="text/javascript" src="./assets/js/utilidades.js"></script>
<script type="text/javascript" src="./assets/js/traduccionGrid.js"></script>



<body>
<!-- filtro de busqueda -->
<div id="signup" class="grid_100">
    <div class="header">
	        <h3>Consulta Facturas</h3>
	 </div>
	     <!-- Recoge variables de URL -->
    	<%
			String idClinica = request.getParameter("clinica");
			String idRol = request.getParameter("idRol");

		%>
		
		<!-- variables almacenadas -->
		<input id="idClinicaGeneral" type="hidden" value=<%=idClinica%> />
		<input id="idRolGeneral" type="hidden" value=<%=idRol%> />
		
    <form id="">
    	<!-- campos de filtro -->
		<div class ="grid_100">
		
				<div class="grid_20 fl">
					<label>Nombre/Razón Social:</label>
	           	 	<input id="nombreRazonSocial" type="text" placeholder=""  autofocus/>
	           	 </div>
	           	 <div class="grid_15 fl">
					<label>Número:</label>
	           	 	<input id="numero" type="text" placeholder=""  autofocus/>
	           	 </div>
	           	 <div class="grid_15 fl p1">
					<label>Importe:</label>
	           	 	<input id="importe" type="text" placeholder=""  autofocus/>
	           	 </div>
	           	 <div class ="grid_25 fl">
           	 		<div class ="grid_50 fr">
           	 			<label>Fecha Hasta</label>
           	 		 	<input id="fechaHasta"/>
           	 		 </div>	
           	 		 <div class ="grid_50 fr">
           	 		 	<label>Fecha Desde</label>
           		 		<input id="fechaDesde"/>
           	 		 </div>
           		</div>
	           	 
	     </div>
	     
	     <!-- Botones -->
	  
		  <div class="inputs grid_100 fr">
		       <div class ="fr">	
		          <a id="submit" href="#" onclick="formluarioValido();">Buscar</a>
		    	</div>
          	</div>
    </form>
     
</div>

<!-- resultados -->
<div id="resultados"  class="mt1 grid_100">
	<div id="jqxgrid"></div>
</div>

<!-- mensajes de alerta -->
<div id='jqxwindow' display="none">
            <div>
               Campos Requeridos </div>
            <div>
               <h2>Debe Seleccionar al menos alguno de los campos para poder consultar</h2>
                <br />
                <input type="button" style="" value="Aceptar" id="aceptarRegistro" />
            </div>
</div>
</body>
</html>