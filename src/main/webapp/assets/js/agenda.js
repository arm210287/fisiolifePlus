$(document).ready(function() {
	datosAgenda();
	
});

function datosAgenda(){
	var appointments = new Array();

	//llamada a la lista de pacientes por clinica
	  $.getJSON(
			  'listaPacientes',
			  "clinica="+$("#clinica").val()+"&idRol="+$("#idRol").val()
			  +"&idUsuario="+$("#idUsuario").val()+"&claveUsuario="+$("#claveUsuario").val(),
              function(obj) {
                    for (var i=0; i<obj.length; i++) {
                    	//creamos la cita
                    		var appointment= {
                    			id : "id"+i,
                    			description : obj[i][1],
                    			telefono:"",
                    			location : "",
                    			subject : obj[i][4],
                    			calendar : obj[i][5],
                    			start : obj[i][2],
                    			end : obj[i][3],
                    		}
                    	
                    	//creamos el listado de citas por paciente
                    	appointments.push(appointment);
                    }
                  //datos agenda
              	  cargaAgenda(appointments);
              }
			  
	  	);
	  

}
function cargaAgenda(appointments) {
	// prepare the data
	var source = {
		dataType : "array",
		dataFields : [ {
			name : 'id',
			type : 'string'
		}, {
			name : 'description',
			type : 'string'
		},{
			name : 'telefono',
			type : 'string'
		}, {
			name : 'location',
			type : 'string'
		}, {
			name : 'subject',
			type : 'string'
		}, {
			name : 'calendar',
			type : 'string'
		}, {
			name : 'start',
			type : 'date'
		}, {
			name : 'end',
			type : 'date'
		} ],
		id : 'id',
		localData : appointments
	};
	var adapter = new $.jqx.dataAdapter(source);
	$("#scheduler").jqxScheduler({
		date : new $.jqx.date(2017, 11, 23),
		width : 1250,
		height : 800,
		source : adapter,
		view : 'weekView',
		showLegend : true,
		ready : function() {
			$("#scheduler").jqxScheduler('ensureAppointmentVisible', 'id1');
		},
		//TRADUCCION 
        localization: {
            // separator of parts of a date (e.g. '/' in 11/05/1955)
            '/': "/",
            // separator of parts of a time (e.g. ':' in 05:44 PM)
            ':': ":",
            // the first day of the week (0 = Sunday, 1 = Monday, etc)
            firstDay: 1,
            days: {
                // full day names
                names: ["Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"],
                // abbreviated day names
                namesAbbr: ["Dom", "Lun", "Mar", "Mier", "Jue", "Vie", "Sab"],
                // shortest day names
                namesShort: ["Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sa"]
            },
            months: {
                // full month names (13 months for lunar calendards -- 13th month should be "" if not lunar)
                names: ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", ""],
                // abbreviated month names
                namesAbbr: ["Ene", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic", ""]
            },
            // AM and PM designators in one of these forms:
            // The usual view, and the upper and lower case versions
            //      [standard,lowercase,uppercase]
            // The culture does not use AM or PM (likely all standard date formats use 24 hour time)
            //      null
            AM: ["AM", "am", "AM"],
            PM: ["PM", "pm", "PM"],
            eras: [
            // eras in reverse chronological order.
            // name: the name of the era in this culture (e.g. A.D., C.E.)
            // start: when the era starts in ticks (gregorian, gmt), null if it is the earliest supported era.
            // offset: offset in years from gregorian calendar
            { "name": "A.D.", "Inicio": null, "offset": 0 }
            ],
            twoDigitYearMax: 2029,
            patterns: {
                // short date pattern
                d: "M/d/yyyy",
                // long date pattern
                D: "dddd, MMMM dd, yyyy",
                // short time pattern
                t: "h:mm tt",
                // long time pattern
                T: "h:mm:ss tt",
                // long date, short time pattern
                f: "dddd, MMMM dd, yyyy h:mm tt",
                // long date, long time pattern
                F: "dddd, MMMM dd, yyyy h:mm:ss tt",
                // month/day pattern
                M: "MMMM dd",
                // month/year pattern
                Y: "yyyy MMMM",
                // S is a sortable format that does not vary by culture
                S: "yyyy\u0027-\u0027MM\u0027-\u0027dd\u0027T\u0027HH\u0027:\u0027mm\u0027:\u0027ss",
                // formatting of dates in MySQL DataBases
                ISO: "yyyy-MM-dd hh:mm:ss",
                ISO2: "yyyy-MM-dd HH:mm:ss",
                d1: "dd.MM.yyyy",
                d2: "dd-MM-yyyy",
                d3: "dd-MMMM-yyyy",
                d4: "dd-MM-yy",
                d5: "H:mm",
                d6: "HH:mm",
                d7: "HH:mm tt",
                d8: "dd/MMMM/yyyy",
                d9: "MMMM-dd",
                d10: "MM-dd",
                d11: "MM-dd-yyyy"
            },
            backString: "Vorhergehende",
            forwardString: "Nächster",
            toolBarPreviousButtonString: "Vorhergehende",
            toolBarNextButtonString: "Nächster",
            emptyDataString: "Nokeine Daten angezeigt",
            loadString: "Cargando...",
            clearString: "Limpiar",
            todayString: "Hoy",
            dayViewString: "Dia",
            weekViewString: "Semana",
            monthViewString: "Mes",
            timelineDayViewString: "Zeitleiste Day",
            timelineWeekViewString: "Zeitleiste Woche",
            timelineMonthViewString: "Zeitleiste Monat",
            loadingErrorMessage: "Die Daten werden noch geladen und Sie können eine Eigenschaft nicht festgelegt oder eine Methode aufrufen . Sie können tun, dass, sobald die Datenbindung abgeschlossen ist. jqxScheduler wirft die ' bindingComplete ' Ereignis, wenn die Bindung abgeschlossen ist.",
            editRecurringAppointmentDialogTitleString: "Bearbeiten Sie wiederkehrenden Termin",
            editRecurringAppointmentDialogContentString: "Wollen Sie nur dieses eine Vorkommen oder die Serie zu bearbeiten ?",
            editRecurringAppointmentDialogOccurrenceString: "Vorkommen bearbeiten",
            editRecurringAppointmentDialogSeriesString: "Bearbeiten Die Serie",
            editDialogTitleString: "Editar Cita",
            editDialogCreateTitleString: "Crear Cita",
            contextMenuEditAppointmentString: "Editar Cita",
            contextMenuCreateAppointmentString: "Crear Cita",
            editDialogSubjectString: "Nombre",
            editDialogLocationString: "Direccion",
            editDialogFromString: "Desde",
            editDialogToString: "Hasta",
            editDialogAllDayString: "Todo el d�a",
            editDialogExceptionsString: "Error",
            editDialogResetExceptionsString: "Error en las espesificaciones",
            editDialogDescriptionString: "Observaciones",
            editDialogResourceIdString: "Especialidad",
            editDialogStatusString: "Continuidad",
            editDialogColorString: "Estado",
            editDialogColorPlaceHolderString: "Seleccione",
            editDialogTimeZoneString: "Zona Horaria",
            editDialogSelectTimeZoneString: "Seleccione",
            editDialogSaveString: "Guardar",
            editDialogDeleteString: "Borrar",
            editDialogCancelString: "Cancelar",
            editDialogRepeatString: "Repetir",
            editDialogRepeatEveryString: "Wiederholen alle",
            editDialogRepeatEveryWeekString: "woche(n)",
            editDialogRepeatEveryYearString: "Jahr (en)",
            editDialogRepeatEveryDayString: "Tag (e)",
            editDialogRepeatNeverString: "Nunca",
            editDialogRepeatDailyString: "Diario",
            editDialogRepeatWeeklyString: "Semanal",
            editDialogRepeatMonthlyString: "Mensual",
            editDialogRepeatYearlyString: "Anual",
            editDialogRepeatEveryMonthString: "Mes (n)",
            editDialogRepeatEveryMonthDayString: "D�a",
            editDialogRepeatFirstString: "erste",
            editDialogRepeatSecondString: "zweite",
            editDialogRepeatThirdString: "dritte",
            editDialogRepeatFourthString: "vierte",
            editDialogRepeatLastString: "letzte",
            editDialogRepeatEndString: "Ende",
            editDialogRepeatAfterString: "Nach",
            editDialogRepeatOnString: "Am",
            editDialogRepeatOfString: "von",
            editDialogRepeatOccurrencesString: "Eintritt (e)",
            editDialogRepeatSaveString: "Vorkommen Speichern",
            editDialogRepeatSaveSeriesString: "Guardar",
            editDialogRepeatDeleteString: "Borrado",
            editDialogRepeatDeleteSeriesString: "Series löschen",
            editDialogStatuses:
            {
                free: "Diario",
                tentative: "Semanal",
                busy: "Mensual",
                outOfOffice: "Anual"
            }
        },
        //EDITAR EL DIALOGO PARA CREAR CITA
        editDialogCreate: function (dialog, fields, editAppointment) {
            // oculta los campos
            fields.repeatContainer.hide();
            fields.timeZoneContainer.hide();
            fields.allDayContainer.hide();
            fields.locationContainer.hide();
            
            //edita titulo de los campos
            fields.resourceLabel.html("Especialidad");

            // add custom print button.
            printButton = $("<button style='margin-left: 5px; float:right;'>Imprimir</button>");
            fields.buttons.append(printButton);
            printButton.jqxButton({ theme: this.theme });
            printButton.click(function () {
                var appointment = editAppointment;
                if (!appointment)
                    return;

                var appointmentContent =
                    "<table class='printTable'>" +
                        "<tr>" +
                            "<td class='label'>Nombre</td>" +
                            "<td>" + fields.subject.val() + "</td>" +
                        "</tr>" +
                        "<tr>" +
                            "<td class='label'>Desde</td>" +
                            "<td>" + fields.from.val() + "</td>" +
                        "</tr>" +
                        "<tr>" +
                            "<td class='label'>Hasta</td>" +
                            "<td>" + fields.to.val() + "</td>" +
                        "</tr>" +
                        "<tr>" +
                            "<td class='label'>Especialidad</td>" +
                            "<td>" + fields.resource.val() + "</td>" +
                        "</tr>"
                   + "</table>";

                var newWindow = window.open('', '', 'width=800, height=500'),
                document = newWindow.document.open(),
                pageContent =
                    '<!DOCTYPE html>\n' +
                    '<html>\n' +
                    '<head>\n' +
                       '<meta charset="utf-8" />\n' +
                       '<title>FisioLife Plus Vista Alegre</title>\n' +
                        '<style>\n' +
                         '.printTable {\n' +
                            'border-color: #aaa;\n' +
                            '}\n' +
                         '.printTable .label {\n' +
                            'font-weight: bold;\n' +
                            '}\n' +
                         '.printTable td{\n' +
                            'padding: 4px 3px;\n' +
                            'border: 1px solid #DDD;\n' +
                            'vertical-align: top;\n' +
                            '}\n' +
                       '</style>' +
                   '</head>\n' +
                  '<body>\n' + appointmentContent + '\n</body>\n</html>';
                try
                {
                    document.write(pageContent);
                    document.close();
                }
                catch (error) {
                }
                newWindow.print();
            });
        },
        /**
         * called when the dialog is opened. Returning true as a result disables the built-in handler.
         * @param {Object} dialog - jqxWindow's jQuery object.
         * @param {Object} fields - Object with all widgets inside the dialog.
         * @param {Object} the selected appointment instance or NULL when the dialog is opened from cells selection.
         */
        editDialogOpen: function (dialog, fields, editAppointment) {
            if (!editAppointment && printButton) {
                printButton.jqxButton({ disabled: true });
            }
            else if (editAppointment && printButton) {
                printButton.jqxButton({ disabled: false });
            }
        },
        /**
         * called when the dialog is closed.
         * @param {Object} dialog - jqxWindow's jQuery object.
         * @param {Object} fields - Object with all widgets inside the dialog.
         * @param {Object} the selected appointment instance or NULL when the dialog is opened from cells selection.
         */
        editDialogClose: function (dialog, fields, editAppointment) {
        },
        /**
        * called when a key is pressed while the dialog is on focus. Returning true or false as a result disables the built-in keyDown handler.
        * @param {Object} dialog - jqxWindow's jQuery object.
        * @param {Object} fields - Object with all widgets inside the dialog.
        * @param {Object} the selected appointment instance or NULL when the dialog is opened from cells selection.
        * @param {jQuery.Event Object} the keyDown event.
        */
        editDialogKeyDown: function (dialog, fields, editAppointment, event) {

        },

		resources : {
			colorScheme : "scheme05",
			dataField : "calendar",
			source : new $.jqx.dataAdapter(source)
		},
		appointmentDataFields : {
			from : "start",
			to : "end",
			id : "id",
			description : "description",
			telephone:"telefono",
			location : "location",
			subject : "subject",
			resourceId : "calendar"
		},
		views:
			[
			{ type: "dayView", showWeekends: true, timeRuler: { scaleStartHour: 9, scaleEndHour: 21 } },
			{ type: "weekView", showWeekends: true, timeRuler: { scaleStartHour: 9, scaleEndHour: 21 } },
			'monthView'
			]
	});
	
//EVENTOS DE LA AGENDA
    $("#scheduler").on('appointmentDelete', function (event) {
        var args = event.args;
        var appointment = args.appointment;
        console.log("appointmentDelete se elimino : "+appointment.subject);
    });

    $("#scheduler").on('appointmentAdd', function (event) {
        var args = event.args;
        var appointment = args.appointment;
        console.log("appointmentAdd is raised");
    });

    $("#scheduler").on('appointmentDoubleClick', function (event) {
        var args = event.args;
        var appointment = args.appointment;
        // appointment fields
        // originalData - the bound data.
        // from - jqxDate object which returns when appointment starts.
        // to - jqxDate objet which returns when appointment ends.
        // status - String which returns the appointment's status("busy", "tentative", "outOfOffice", "free", "").
        // resourceId - String which returns the appointment's resouzeId
        // hidden - Boolean which returns whether the appointment is visible.
        // allDay - Boolean which returns whether the appointment is allDay Appointment.
        // resiable - Boolean which returns whether the appointment is resiable Appointment.
        // draggable - Boolean which returns whether the appointment is resiable Appointment.
        // id - String or Number which returns the appointment's ID.
        // subject - String which returns the appointment's subject.
        // location - String which returns the appointment's location.
        // description - String which returns the appointment's description.
        // tooltip - String which returns the appointment's tooltip.

        $("#log").html("appointmentDoubleClick is raised");
    });

    $("#scheduler").on('cellClick', function (event) {
        var args = event.args;
        var cell = args.cell;
       
        console.log("cellClick is raised");
    });

    $("#scheduler").on('cellDoubleClick', function (event) {
        var args = event.args;
        var cell = args.cell;
       
        console.log("cellDoubleClick is raised");
    });
    
    $("#scheduler").on('contextMenuOpen', function (event) {
        var args = event.args;
        var menu = args.menu;
        var appointment = args.appointment;
       
        console.log("contextMenuOpen is raised");
    });
    
    $("#scheduler").on('contextMenuClose', function (event) {
        var args = event.args;
        var menu = args.menu;
        var appointment = args.appointment;
       
        console.log("contextMenuClose is raised");
    });
    
    $("#scheduler").on('contextMenuItemClick', function (event) {
        var args = event.args;
        var menu = args.menu;
        var appointment = args.appointment;
        var item = args.item;
       
        console.log("contextMenuItemClick is raised");
    });
    
    $("#scheduler").on('viewChange', function (event) {
        var args = event.args;
        var from = args.from;
        var to = args.to;
        var date = args.date;
        console.log("viewChange is raised");
    });

    $("#scheduler").on('dateChange', function (event) {
        var args = event.args;
        var from = args.from;
        var to = args.to;
        var date = args.date;
        console.log("dateChange is raised");
    });
    
    $("#scheduler").on('contextMenuCreate', function (event) {
        var args = event.args;
        var menu = args.menu;
        var appointment = args.appointment;
        var item = args.item;
       
        console.log("contextMenuCreate is raised");
    });
    
    $("#scheduler").on('editRecurrenceDialogOpen', function (event) {
        var args = event.args;
        var dialog = args.dialog;
        var appointment = args.appointment;
       
        console.log("editRecurrenceDialogOpen is raised");
    });
    
    $("#scheduler").on('editRecurrenceDialogClose', function (event) {
        var args = event.args;
        var dialog = args.dialog;
        var appointment = args.appointment;
       
        console.log("editRecurrenceDialogClose is raised");
    });
    
   $("#scheduler").on('editDialogCreate', function (event) {
        var args = event.args;
        var dialog = args.dialog;
        var appointment = args.appointment;
        var fields = args.fields;
        
        console.log("editDialogCreate is raised");
    });
    
    $("#scheduler").on('editDialogOpen', function (event) {
        var args = event.args;
        var dialog = args.dialog;
        var appointment = args.appointment;
        var fields = args.fields;
        
        console.log("editDialogOpen is raised");
    });
    
   $("#scheduler").on('editDialogClose', function (event) {
        var args = event.args;
        var dialog = args.dialog;
        var appointment = args.appointment;
        var fields = args.fields;
        
        console.log("editDialogClose is raised");
    });
    
    
    $("#scheduler").on('appointmentChange', function (event) {
        var args = event.args;
        var appointment = args.appointment;
        // appointment fields
        // originalData - the bound data.
        // from - jqxDate object which returns when appointment starts.
        // to - jqxDate objet which returns when appointment ends.
        // status - String which returns the appointment's status("busy", "tentative", "outOfOffice", "free", "").
        // resourceId - String which returns the appointment's resouzeId
        // hidden - Boolean which returns whether the appointment is visible.
        // allDay - Boolean which returns whether the appointment is allDay Appointment.
        // resiable - Boolean which returns whether the appointment is resiable Appointment.
        // draggable - Boolean which returns whether the appointment is resiable Appointment.
        // id - String or Number which returns the appointment's ID.
        // subject - String which returns the appointment's subject.
        // location - String which returns the appointment's location.
        // description - String which returns the appointment's description.
        // tooltip - String which returns the appointment's tooltip.

        console.log("appointmentChange is raised");
    });    
    
        $("#scheduler").on('appointmentClick', function (event) {
        var args = event.args;
        var appointment = args.appointment;
        // appointment fields
        // originalData - the bound data.
        // from - jqxDate object which returns when appointment starts.
        // to - jqxDate objet which returns when appointment ends.
        // status - String which returns the appointment's status("busy", "tentative", "outOfOffice", "free", "").
        // resourceId - String which returns the appointment's resouzeId
        // hidden - Boolean which returns whether the appointment is visible.
        // allDay - Boolean which returns whether the appointment is allDay Appointment.
        // resiable - Boolean which returns whether the appointment is resiable Appointment.
        // draggable - Boolean which returns whether the appointment is resiable Appointment.
        // id - String or Number which returns the appointment's ID.
        // subject - String which returns the appointment's subject.
        // location - String which returns the appointment's location.
        // description - String which returns the appointment's description.
        // tooltip - String which returns the appointment's tooltip.

        console.log("appointmentClick is raised");
    });    
    
        $("#scheduler").on('appointmentDoubleClick', function (event) {
        var args = event.args;
        var appointment = args.appointment;
        // appointment fields
        // originalData - the bound data.
        // from - jqxDate object which returns when appointment starts.
        // to - jqxDate objet which returns when appointment ends.
        // status - String which returns the appointment's status("busy", "tentative", "outOfOffice", "free", "").
        // resourceId - String which returns the appointment's resouzeId
        // hidden - Boolean which returns whether the appointment is visible.
        // allDay - Boolean which returns whether the appointment is allDay Appointment.
        // resiable - Boolean which returns whether the appointment is resiable Appointment.
        // draggable - Boolean which returns whether the appointment is resiable Appointment.
        // id - String or Number which returns the appointment's ID.
        // subject - String which returns the appointment's subject.
        // location - String which returns the appointment's location.
        // description - String which returns the appointment's description.
        // tooltip - String which returns the appointment's tooltip.

        console.log("appointmentDoubleClick is raised");
    });   

}

/***
 * Opciones del menu y acciones disponibles
 */
function loadMenu(opcion,idClinica,idRol,idUsuario,claveUsuario) {
	//registro paciente
	if (opcion == 'A') {
		$("#opcionesMenu").load("./vistas/registration.jsp");
	
		//inicio o opcion agenda	
	} else if (opcion == 'I' || opcion == 'Ag') {
		$("#opcionesMenu").load("./vistas/agenda.jsp","clinica="+idClinica+"&idRol="+idRol+"&idUsuario="+idUsuario+"&claveUsuario="+claveUsuario);
	
		//configuracion:crear especialista
	} else if (opcion=='CE'){
		$("#opcionesMenu").load("./vistas/crearEspecialista.jsp");
		
	//configuracion: crear especialidad
	} else if (opcion=='CESP'){
		$("#opcionesMenu").load("./vistas/crearEspecialidad.jsp");
	
	}
	//paciente: consulta
	 else if (opcion=='ConsPac'){
			$("#opcionesMenu").load("./vistas/consultaPaciente.jsp","clinica="+idClinica+"&idRol="+idRol);
		
		}
	
	//paciente: consulta historias
	 else if (opcion=='ConsHistoriaPac'){
			$("#opcionesMenu").load("./vistas/consultaHistoriasPaciente.jsp");
		
		}
	
	//facturas: consulta
	 else if (opcion=='ConsFactura'){
			$("#opcionesMenu").load("./vistas/consultaFacturas.jsp");
		
		}

}

