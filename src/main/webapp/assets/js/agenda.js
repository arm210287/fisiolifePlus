$(document).ready(function() {
//	   $("#scheduler").jqx-scheduler(
//		       { width: '120px', height: '35px', theme: 'black' }
//		       );
	cargaAgenda();
});
function cargaAgenda() {
	var appointments = new Array();

	var appointment1 = {
		id : "id1",
		description : "George brings projector for presentations.",
		location : "",
		subject : "Quarterly Project Review Meeting",
		calendar : "Room 1",
		start : new Date(2017, 10, 23, 9, 0, 0),
		end : new Date(2017, 10, 23, 16, 0, 0)
	}

	var appointment2 = {
		id : "id2",
		description : "",
		location : "",
		subject : "IT Group Mtg.",
		calendar : "Room 2",
		start : new Date(2017, 10, 24, 10, 0, 0),
		end : new Date(2017, 10, 24, 15, 0, 0)
	}

	var appointment3 = {
		id : "id3",
		description : "",
		location : "",
		subject : "Course Social Media",
		calendar : "Room 3",
		start : new Date(2017, 10, 27, 11, 0, 0),
		end : new Date(2017, 10, 27, 13, 0, 0)
	}

	var appointment4 = {
		id : "id4",
		description : "",
		location : "",
		subject : "New Projects Planning",
		calendar : "Room 2",
		start : new Date(2017, 10, 23, 16, 0, 0),
		end : new Date(2017, 10, 23, 18, 0, 0)
	}

	var appointment5 = {
		id : "id5",
		description : "",
		location : "",
		subject : "Interview with James",
		calendar : "Room 1",
		start : new Date(2017, 10, 25, 15, 0, 0),
		end : new Date(2017, 10, 25, 17, 0, 0)
	}

	var appointment6 = {
		id : "id6",
		description : "",
		location : "",
		subject : "Interview with Nancy",
		calendar : "Room 4",
		start : new Date(2017, 10, 26, 14, 0, 0),
		end : new Date(2017, 10, 26, 16, 0, 0)
	}
	appointments.push(appointment1);
	appointments.push(appointment2);
	appointments.push(appointment3);
	appointments.push(appointment4);
	appointments.push(appointment5);
	appointments.push(appointment6);

	// prepare the data
	var source = {
		dataType : "array",
		dataFields : [ {
			name : 'id',
			type : 'string'
		}, {
			name : 'description',
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
            dayViewString: "D�a",
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
            editDialogTitleString: "Termin bearbeiten",
            editDialogCreateTitleString: "Crear Cita",
            contextMenuEditAppointmentString: "Termin bearbeiten",
            contextMenuCreateAppointmentString: "Crear Cita",
            editDialogSubjectString: "Nombre",
            editDialogLocationString: "Direccion",
            editDialogFromString: "Desde",
            editDialogToString: "Hasta",
            editDialogAllDayString: "Den ganzen Tag",
            editDialogExceptionsString: "Ausnahmen",
            editDialogResetExceptionsString: "Zurücksetzen auf Speichern",
            editDialogDescriptionString: "Bezeichnung",
            editDialogResourceIdString: "Cabina",
            editDialogStatusString: "Status",
            editDialogColorString: "Estado",
            editDialogColorPlaceHolderString: "Seleccione",
            editDialogTimeZoneString: "Zona Horaria",
            editDialogSelectTimeZoneString: "Seleccione",
            editDialogSaveString: "Guardar",
            editDialogDeleteString: "Borrar",
            editDialogCancelString: "Cancelar",
            editDialogRepeatString: "Wiederholen",
            editDialogRepeatEveryString: "Wiederholen alle",
            editDialogRepeatEveryWeekString: "woche(n)",
            editDialogRepeatEveryYearString: "Jahr (en)",
            editDialogRepeatEveryDayString: "Tag (e)",
            editDialogRepeatNeverString: "Nie",
            editDialogRepeatDailyString: "Täglich",
            editDialogRepeatWeeklyString: "Wöchentlich",
            editDialogRepeatMonthlyString: "Monatlich",
            editDialogRepeatYearlyString: "Jährlich",
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
			location : "location",
			subject : "subject",
			resourceId : "calendar"
		},
		views : [ 'dayView', 'weekView', 'monthView' ]
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


function loadMenu(opcion) {
	if (opcion == 'A') {
		// $.ajax({
		// type: "POST",
		// url: "/fisiolifePlus/lista/",
		// data: "",
		// success: function(response){
		// $('#opcionesMenu').html(response);
		// $('#name').val('');
		// $('#education').val('');
		// },
		// error: function(e){
		// alert('Error: ' + e);
		//
		// }
		// })

		$("#opcionesMenu").load("./vistas/registration.jsp");
	} else if (opcion == 'I' || opcion == 'Ag') {
		$("#opcionesMenu").load("./vistas/agenda.jsp");

	}
}
