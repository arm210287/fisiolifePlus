<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
<title>FisioLife Plus</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="./assets/jqwidgets/styles/jqx.base.css"	type="text/css" />
<link rel="stylesheet" href="./assets/jqwidgets/styles/jqx.bootstrap.css" type="text/css" />
<link rel="stylesheet" href="./assets/css/formularioCitaOnline.css" />
<script type="text/javascript" src="./assets/jqwidgets/jqxwindow.js"></script>
<script src="./assets/js/registrar.js"></script>

<body>
<div class="container_registro">

    <form id="signup">

        <div class="header">
        
            <h3>Registro Especialdad</h3>
            
        </div>
        
        <div class="sep"></div>

        <div class="inputs">
            <input type="text" placeholder="Nombre"  autofocus/>
        	<textarea type="text" placeholder="Descripcion" autofocus></textarea>        
        	<div id="dateTimeInput" ></div>         
            <a id="submit" href="#">Registrar</a>
        
        </div>
		<div id='jqxwindow' display="none">
            <div>
               Mensaje </div>
            <div>
               <h2>Se ha registrado exitosamente</h2>
                <br />
                <input type="button" style="" value="Aceptar" id="aceptarRegistro" />
            </div>
        </div>
    </form>

</div>
</body>
</html>