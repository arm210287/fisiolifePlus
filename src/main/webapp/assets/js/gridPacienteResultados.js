$(document).ready(function() {
	//datos de la tabla de resultado
	datosGrid();
	
	//rango de fechas de consulta/carga la fecha del dia actual
	$("#fecha_desde").jqxDateTimeInput(
			{ theme: "summer",
			  formatString: "dd/MM/yyyy",
			  showTimeButton: false,
			  width: '105px',
			  culture: 'es-ES',
			  height: '25px' });
	
	$("#fecha_hasta").jqxDateTimeInput(
			{ theme: "summer",
			  formatString: "dd/MM/yyyy",
			  showTimeButton: false,
			  width: '105px',
			  culture: 'es-ES',
			  height: '25px' });	
	
	//mensajes de alerta
	 $("#jqxwindow").jqxWindow({ height: 150, width: 300, theme: 'summer', isModal: true, autoOpen: false });
});

function datosGrid(){
	// prepare the data
	var data = new Array();
	var firstNames =
	[
	    "Andrew", "Nancy", "Shelley", "Regina", "Yoshi", "Antoni", "Mayumi", "Ian", "Peter", "Lars", "Petra", "Martin", "Sven", "Elio", "Beate", "Cheryl", "Michael", "Guylene"
	];
	var lastNames =
	[
	    "Fuller", "Davolio", "Burke", "Murphy", "Nagase", "Saavedra", "Ohno", "Devling", "Wilson", "Peterson", "Winkler", "Bein", "Petersen", "Rossi", "Vileid", "Saylor", "Bjorn", "Nodier"
	];
	var productNames =
	[
	    "Black Tea", "Green Tea", "Caffe Espresso", "Doubleshot Espresso", "Caffe Latte", "White Chocolate Mocha", "Cramel Latte", "Caffe Americano", "Cappuccino", "Espresso Truffle", "Espresso con Panna", "Peppermint Mocha Twist"
	];
	var priceValues =
	[
	    "2.25", "1.5", "3.0", "3.3", "4.5", "3.6", "3.8", "2.5", "5.0", "1.75", "3.25", "4.0"
	];
	for (var i = 0; i < 1000; i++) {
	    var row = {};
	    var productindex = Math.floor(Math.random() * productNames.length);
	    var price = parseFloat(priceValues[productindex]);
	    var quantity = 1 + Math.round(Math.random() * 10);
	    row["primerNombre"] = firstNames[Math.floor(Math.random() * firstNames.length)];
	    row["primerApellido"] = lastNames[Math.floor(Math.random() * lastNames.length)];
	    row["edad"] = lastNames[Math.floor(Math.random() * lastNames.length)];
	    row["fechaNacimiento"] = lastNames[Math.floor(Math.random() * lastNames.length)];
	    row["correoElectrónico"] = lastNames[Math.floor(Math.random() * lastNames.length)];
	    row["especialidad"] = "";
	    row["fechaRegistro"] = "";
	    row["ultimaActualización"] = "";
	    row["observaciones"] ="";
	    data[i] = row;
	}
	var source =
	{
	    localdata: data,
	    datatype: "array"
	};
	var dataAdapter = new $.jqx.dataAdapter(source, {
	    loadComplete: function (data) { },
	    loadError: function (xhr, status, error) { }    
	});
	var cellsrenderer = function (row, columnfield, value, defaulthtml, columnproperties) {
        if (value < 20) {
            return '<span style="margin: 4px; float: ' + columnproperties.cellsalign + '; color: #0000ff;">' + value + '</span>';
        }
        else {
            return '<span style="margin: 4px; float: ' + columnproperties.cellsalign + '; color: #008000;">' + value + '</span>';
        }
    }
	
  
	//Propiedades para paginacion/risize 
	$("#jqxgrid").jqxGrid(
	{
		width: 1200,  
        pageable: true,
        autoheight: true,
	    source: dataAdapter,
	    sortable: true,
	    columns: [
	        { text: 'Primer Nombre'  	  , datafield: 'primerNombre'		, width: 100 },
	        { text: 'Segundo Nombre'	  , datafield: 'segundoNombre'		, width: 110 },
	        { text: 'Primer Apellido'	  , datafield: 'primerApellido'		, width: 100 },
	        { text: 'Segundo Apellido'	  , datafield: 'segundoApellido'	, width: 120, cellsalign: 'right' },
	        { text: 'Edad'				  , datafield: 'edad'				, width: 100, cellsalign: 'right', cellsformat: 'c2' },
	        { text: 'Fecha de Nacimiento' , datafield: 'fechaNacimiento'	, width: 130, cellsalign: 'right', cellsformat: 'c2' },
	        { text: 'Correo Electrónico'  , datafield: 'correoElectrónico'	, width: 140, cellsalign: 'right', cellsformat: 'c2' },
	        { text: 'Fecha Registro'	  , datafield: 'fechaRegistro'		, width: 100, cellsalign: 'right', cellsformat: 'c2' },
	        { text: 'Última Actualización', datafield: 'ultimaActualización', width: 130, cellsalign: 'right', cellsformat: 'c2' },
	        { text: 'Observaciones'		  , datafield: 'observaciones'		, width: 170, cellsalign: 'right', cellsformat: 'c2' }
	    ]
	});
	
	//Traduccion
	  var localizationobj = {};
	    localizationobj.pagergotopagestring = "Ir a:";
	    localizationobj.pagershowrowsstring = "Páginas:";
	    localizationobj.pagerrangestring = " Rango ";
	    localizationobj.pagernextbuttonstring = "siguiente";
	    localizationobj.pagerpreviousbuttonstring = "anterior";
	    localizationobj.sortascendingstring = "Ordenar Ascendiente";
	    localizationobj.sortdescendingstring = "Ordenar Descendiente";
	    localizationobj.sortremovestring = "Ordenar Eliminando";
	    localizationobj.firstDay = 1;
	    localizationobj.percentsymbol = "%";
	    localizationobj.currencysymbol = "€";
	    localizationobj.currencysymbolposition = "antes";
	    localizationobj.decimalseparator = ",";
	    localizationobj.thousandsseparator = ".";
	    var days = {
	        // full day names
	        names: ["Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"],
	        // abbreviated day names
	        namesAbbr: ["Dom", "Lun", "Mar", "Mier", "Jue", "Vie", "Sab"],
	        // shortest day names
	        namesShort: ["Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sa"]
	    };
	    localizationobj.days = days;
	    var months = {
	        // full month names (13 months for lunar calendards -- 13th month should be "" if not lunar)
	        names: ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", ""],
	        // abbreviated month names
	        namesAbbr: ["En", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dec", ""]
	    };
	    localizationobj.months = months;
	    // apply localization.
	    $("#jqxgrid").jqxGrid('localizestrings', localizationobj);

}

