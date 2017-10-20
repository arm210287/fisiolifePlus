<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cita Online</title>
<link rel="stylesheet" href="./assets/css/formularioCitaOnline.css" /></head>

<body>
<div class="container_registro">

    <form id="signup">

        <div class="header">
        
            <h3>Cita Online</h3>
            
        </div>
        
        <div class="sep"></div>

        <div class="inputs">
<!--         style="text-transform:uppercase" -->
            <input type="text" placeholder="Nombre"  autofocus/>Nombre
            <input type="text" placeholder="Apellidos" autofocus/>
            <input type="text" placeholder="Telefono" autofocus />
        	<input type="datetime-local" placeholder="Hora"  autofocus />

            
            <a id="submit" href="#">Agendar</a>
        
        </div>

    </form>

</div>
</body>
</html>