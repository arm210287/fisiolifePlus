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
<script type="text/javascript" src="./assets/js/gridHistoriasPacienteResultados.js"></script>


<body>
<!-- filtro de busqueda -->
<div id="signup" class="grid_100">
    <div class="header">
	        <h3>Consulta Historias Pacientes</h3>
	 </div>
    <form id="">
    	<!-- campos de filtro -->
		<div class ="grid_100">
		
				<div class="grid_25 fl">
					<label>Nombre del Paciente:</label>
	           	 	<input  type="text" placeholder=""  autofocus/>
	           	 </div>
	           	
	           	 <div class="grid_25 fl">
	           	 	<label>Especialidad Atendida:</label>
	           	 	<input  type="text" placeholder=""  autofocus/>
	           	 </div>
	           	 <div class="grid_25 fl"> 
	           	 	<label>Repeticiones del Tratamiento:</label>
	           	 	<input  type="text" placeholder=""  autofocus/>
	           	 </div>	 	 
	           	 
	           	  <div class ="grid_25 fr">
           	 		<div class ="grid_50 fr">
           	 			<label>Fecha Hasta</label>
           	 		 	<input id="fecha_hasta"/>
           	 		 </div>	
           	 		 <div class ="grid_50 fr">
           	 		 	<label>Fecha Desde</label>
           		 		<input id="fecha_desde"/>
           	 		 </div>
           		</div>
	     </div>
	     
	     <!-- Botones -->
	  
		  <div class="inputs grid_100 fr">
		       <div class ="fr">	
		          <a id="submit" href="#">Buscar</a>
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
               Mensaje </div>
            <div>
               <h2>Se ha registrado exitosamente</h2>
                <br />
                <input type="button" style="" value="Aceptar" id="aceptarRegistro" />
            </div>
</div>
</body>
</html>