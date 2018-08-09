$(document).ready(function() {
	
	//rango de fechas de consulta/carga la fecha del dia actual
	$("#fechaDesde").jqxDateTimeInput(
			{ theme: "summer",
			  formatString: "dd/MM/yyyy",
			  showTimeButton: false,
			  width: '105px',
			  culture: 'es-ES',
			  height: '25px' });
	
	$("#fechaHasta").jqxDateTimeInput(
			{ theme: "summer",
			  formatString: "dd/MM/yyyy",
			  showTimeButton: false,
			  width: '120px',
			  culture: 'es-ES',
			  height: '25px' });		
	
	//mensajes de alerta
	 $("#jqxwindow").jqxWindow({ height: 150, width: 300, theme: 'summer', isModal: true, autoOpen: false });
});
/***
 * Validaciones
 */

function validaciones(){
	if(($("#nombreRazonSocial").val()=="" || $("#nombreRazonSocial").val()=="undefined")
			&& ($("#numero").val()=="" || $("#numero").val()=="undefined")
			&& ($("#importe").val()=="" || $("#importe").val()=="undefined")){
				$("#jqxwindow").jqxWindow('open');
				return false;
	}
	return true;
};

/***
 * Valida que el formulario sea correcto para consultar
 */
function formluarioValido(){
	//validaciones
	if(validaciones()) datosFacturasGrid();
}

/***
 * Consulta los datos de los pacientes por clinica
 */
function datosFacturasGrid(){
				  
	//llamada ajax para recuperar cantidad de registros y datos del paciente
	  $.getJSON(
			  'listaFacturasPacientes',
			  "clinica="+$("#idClinicaGeneral").val()
			  +"&fechaDesde="+$("#fechaDesde").val()
			  +"&fechaHasta="+$("#fechaHasta").val()
			  +"&nombreRazonSocial="+$("#nombreRazonSocial").val()
			  +"&importe="+$("#importe").val()
			  +"&numero="+$("#numero").val(),
              
			  function(obj) {
			   var data = new Array();
		
						//recorre cantidad de pacientes y asigna sus datos
						for (var i = 0; i < obj.length; i++) {
						    var row = {};
						    row["nombre"] 		  =		obj[i][0];
						    row["primerApellido"] = 	obj[i][1];	    
						    row["fecha"] 		  =		obj[i][2];
						    row["numero"] 		  = 	obj[i][3];
						    row["importe"] 		  =	    obj[i][4],
						    row["iva"] 			  = 	obj[i][5];
						    row["correoElectrónico"] = 	obj[i][6];
						    row["ultimaActualización"]= obj[i][7];
						    row["observaciones"] =		obj[i][8];
						    data[i] = row;
						}
				  
				

				// carga datos para la grid
					cargarDatosFacturas(data);
              }
	  	);
	
// asigna datos a la grid para luego pintarla
function cargarDatosFacturas(data){	  
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
	    source: dataAdapter,
	    sortable: true,
        pageable: true,
        autoheight: true,
        selectionmode: 'singlecell',
	    columns: [
	        { text: 'Nombre'  	  		  , datafield: 'nombre'				, width: 100 },
	        { text: 'Apellido'			  , datafield: 'primerApellido'		, width: 130 },
	        { text: 'Fecha'	  			  , datafield: 'fecha'				, width: 120, cellsalign: 'right' },
	        { text: 'Número'			  , datafield: 'numero'				, width: 100, cellsalign: 'right', cellsformat: 'c2' },
	        { text: 'Importe'			  , datafield: 'importe'			, width: 100, cellsalign: 'right', cellsformat: 'c2' },
	        { text: 'Iva' 				  , datafield: 'iva'				, width: 130, cellsalign: 'right', cellsformat: 'c2' },
	        { text: 'Correo Electrónico'  , datafield: 'correoElectrónico'	, width: 160, cellsalign: 'right', cellsformat: 'c2' },
	        { text: 'Última Actualización', datafield: 'ultimaActualización', width: 130, cellsalign: 'right', cellsformat: 'c2' },
	        { text: 'Observaciones'		  , datafield: 'observaciones'		, width: 228, cellsalign: 'right', cellsformat: 'c2' }
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
	    
	    localizationobj.percentsymbol= "%";
	    localizationobj.currencysymbol= "$";
	    localizationobj.currencysymbolposition= "anterior";
	    localizationobj.decimalseparator= ".";
	    localizationobj.thousandsseparator= ",";
	    localizationobj.pagergotopagestring= "Ir a pag=";
	    localizationobj.pagershowrowsstring= "Mostrar filas=";
	    localizationobj.pagerrangestring= " de ";
	    localizationobj.pagerpreviousbuttonstring= "previo";
	    localizationobj.pagernextbuttonstring= "siguiente";
	    localizationobj.groupsheaderstring= "Arrastre una columna para que se agrupe por ella";
	    localizationobj.sortascendingstring= "Ordenar Acs";
	    localizationobj.sortdescendingstring= "Ordenar Des";
	    localizationobj.sortremovestring= "Quitar orden";
	    localizationobj.groupbystring= "Agrupar por esta columna";
	    localizationobj.groupremovestring= "Quitar de grupos";
	    localizationobj.filterclearstring= "Limpiar";
	    localizationobj.filterstring= "Filtro";
	    localizationobj.filtershowrowstring= "Mostrar filas donde=";
	    localizationobj.filtershowrowdatestring= "Mostrar filas donde fecha=";
	    localizationobj.filterorconditionstring= "O";
	    localizationobj.filterandconditionstring= "Y";
	    localizationobj.filterselectallstring= "(Seleccionar Todo)";
	    localizationobj.filterchoosestring= "Por favor seleccione:";
	    localizationobj.filterstringcomparisonoperators= ['vacio', 'no vacio', 'contenga', 'contenga(coicidir Mayusculas/Minusculas)',
	    'no contenga', 'no contenga(coincidir Mayusculas/Minusculas)', 'inicia con', 'inicia con(coicidir Mayusculas/Minusculas)',
	    'termina con', 'termina con(coicidir Mayusculas/Minusculas)', 'igual', 'igual(coicidir Mayusculas/Minusculas)', 'null', 'no null'];
	    localizationobj.filternumericcomparisonoperators= ['=', '!=', '<', '<=', '>', '>=', 'null', 'no null'];
	    localizationobj.filterdatecomparisonoperators= ['=', '!=', '<', '<=', '>', '>=', 'null', 'no null'];
	    localizationobj.filterbooleancomparisonoperators= ['=', '!='];
	    localizationobj.validationstring= "Valor no valido";
	    localizationobj.emptydatastring= "No hay registros que mostrar";
	    localizationobj.filterselectstring= "Seleccione un Filtro";
	    localizationobj.loadtext= "Cargando…";
	    localizationobj.clearstring= "Limpiar";
	    localizationobj.todaystring= "hoy"; 
	    
	    
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
}
