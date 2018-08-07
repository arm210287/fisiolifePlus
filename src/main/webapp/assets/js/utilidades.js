$(document).ready(function() {
	
	/***
	 * Mensajes de alerta
	 */
	 $("#jqxwindow").jqxWindow({ height: 150, width: 300, theme: 'summer', isModal: true, autoOpen: false });
     
	 $("#iniciarBusqueda").click(function () {
          $("#jqxwindow").jqxWindow('open');
      });
     $("#aceptarRegistro").click(function () {
         $("#jqxwindow").jqxWindow('close');
     });
	
 
});