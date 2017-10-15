<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registro Paciente</title>
<link rel="stylesheet" href="./assets/css/registroPaciente.css" /></head>

<body>
<div class="container_registro">

    <form id="signup">

        <div class="header">
        
            <h3>Registro Paciente</h3>
            
        </div>
        
        <div class="sep"></div>

        <div class="inputs">
<!--         style="text-transform:uppercase" -->
            <input type="text" placeholder="Nombre"  autofocus/>
            <input type="text" placeholder="Apellidos" autofocus/>
            <input type="text" placeholder="DNI" autofocus />
    		<input type="date" placeholder="Fecha de Nacimiento" autofocus />        
            <input type="email" placeholder="e-mail" autofocus />
            <input type="text" placeholder="Telefono" autofocus />
        	<input type="text" placeholder="Direccion" autofocus />
        	<textarea type="text" placeholder="Observaciones" autofocus></textarea>
            
<!--             <div class="checkboxy"> -->
<!--                 <input name="cecky" id="checky" value="1" type="checkbox" /><label class="terms"></label> -->
<!--             </div> -->
            
            <a id="submit" href="#">Registrar</a>
        
        </div>

    </form>

</div>
</body>
</html>