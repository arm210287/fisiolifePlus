package fisioBack.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.dialect.InformixDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fisioBack.bo.listaFacturasPacientesBO;
import fisioBack.services.FacturaService;


@Controller
public class FacturaController {

	@Autowired
	FacturaService facturaService;

	@Autowired
	MessageSource messageSource;


	/***
	 * Metodo que retorna la lista de facturas asociadas a pacientes  por clinica
	 * @return
	 */
	@RequestMapping(value="/listaFacturasPacientes", method = RequestMethod.GET)
	public @ResponseBody  List<String> lista (
			@RequestParam ("clinica") Integer clinica,
			@RequestParam ("fechaDesde") String fechaDesde,
			@RequestParam ("fechaHasta") String fechaHasta,
			@RequestParam ("nombreRazonSocial") String nombreRazonSocial,
			@RequestParam ("numero") String numero,
			@RequestParam ("importe") String importe
			){
		
		listaFacturasPacientesBO infoFactura = new listaFacturasPacientesBO();
		infoFactura.setFechaDesde(fechaDesde);
		infoFactura.setFechaHasta(fechaHasta);
		infoFactura.setIdClinica(clinica);
		infoFactura.setImporte(importe);
		infoFactura.setNombreRazonSocial(nombreRazonSocial);
		infoFactura.setNumero(numero);

		List<String> listaFacturasPacientes = this.facturaService.listaFacturasPacientes(infoFactura);
		List<String> listaDatosFactutas = new ArrayList<String>();
		if(listaFacturasPacientes!=null && listaFacturasPacientes.size()>0){
			listaDatosFactutas=listaFacturasPacientes;
			return listaDatosFactutas;
		}
		return listaDatosFactutas;
	}



}