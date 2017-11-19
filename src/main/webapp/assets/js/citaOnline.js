$(document).ready(function() {
	$("#dateTimeInput").jqxDateTimeInput(
			{ theme: "bootstrap",
			  formatString: "dd/MM/yyyy hh:mm:ss",
			  showTimeButton: true,
			  width: '430px',
			  culture: 'es-ES',
			  height: '35px' });

});