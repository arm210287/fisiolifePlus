$(document).ready(function() {
	$("#dateTimeInput").jqxDateTimeInput(
			{ theme: "bootstrap",
			  formatString: "dd/MM/yyyy",
			  showTimeButton: true,
			  width: '430px',
			  culture: 'es-ES',
			  height: '35px' });
	
	 $("#jqxwindow").jqxWindow({ height: 150, width: 300, theme: 'summer', isModal: true, autoOpen: false });
     $("#submit").click(function () {
          $("#jqxwindow").jqxWindow('open');
      });
     $("#aceptarRegistro").click(function () {
         $("#jqxwindow").jqxWindow('close');
     });
	
 
});