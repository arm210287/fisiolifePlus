package fisioBack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fisioBack.bo.listaPacienteBO;
import fisioBack.services.PacienteService;
//import fisioBack.model.User;
//import fisioBack.model.UserProfile;

@Controller
public class PacienteController {

	@Autowired
	PacienteService pacienteService;

	@Autowired
	MessageSource messageSource;


	/***
	 * Metodo que retorna la lista de pacientes asociados por clinica
	 * @return
	 */
	@RequestMapping(value="/listaPacientes", method = RequestMethod.GET)
	public @ResponseBody  List<String> lista (@RequestParam ("clinica") Integer clinica,@RequestParam ("idRol") Integer idRol,
			@RequestParam ("idUsuario") Integer idUsuario,@RequestParam ("claveUsuario") String claveUsuario){
		
		listaPacienteBO infoPaciente = new listaPacienteBO();
		infoPaciente.setIdClinica(clinica);
		infoPaciente.setIdRol(idRol);
		infoPaciente.setClaveUsuario(claveUsuario);
		infoPaciente.setIdUsuario(idUsuario);
		
		List<String> listaPacientes = this.pacienteService.listaPacienteClinicas(infoPaciente);
		List<String> listaAgendaPacientes = new ArrayList<String>();
		if(listaPacientes!=null && listaPacientes.size()>0){
			listaAgendaPacientes=listaPacientes;
			return listaAgendaPacientes;
		}
		return listaAgendaPacientes;
	}

	/***
	 * Metodo que retorna la lista de los datos de los pacientes asociados por clinica
	 * @return
	 */
	@RequestMapping(value="/listaDatosPaciente", method = RequestMethod.GET)
	public @ResponseBody  List<String> lista (@RequestParam ("clinica") Integer clinica,@RequestParam ("idRol") Integer idRol,
			@RequestParam ("nombrePaciente") String nombrePaciente,@RequestParam ("correoElectronico") String correoElectronico,
			@RequestParam ("fechaDesde") String fechaDesde,@RequestParam ("fechaHasta") String fechaHasta){
		
		listaPacienteBO infoPaciente = new listaPacienteBO();
		infoPaciente.setIdClinica(clinica);
		infoPaciente.setIdRol(idRol);
		infoPaciente.setNombrePaciente(nombrePaciente);
		infoPaciente.setCorreoElectronico(correoElectronico);
		infoPaciente.setFechaDesde(fechaDesde);
		infoPaciente.setFechaHasta(fechaHasta);
		
		List<String> listaPacientes = this.pacienteService.listaDatosPacienteClinicas(infoPaciente);
		List<String> listaDatosPacientes = new ArrayList<String>();
		if(listaPacientes!=null && listaPacientes.size()>0){
			listaDatosPacientes=listaPacientes;
			return listaDatosPacientes;
		}
		return listaDatosPacientes;
	}
	
	/**
	 * This method handles login GET requests.
	 * If users is already logged-in and tries to goto login page again, will be redirected to list page.
	 */
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String loginPage(@RequestParam ("nombreUsuario") String nombreUsuario, @RequestParam("claveUsuario")String claveUsuario,ModelMap model) {
////		if (isCurrentAuthenticationAnonymous()) {
////			return "login";
////	    } else {
////	    	return "redirect:/list";  
////	    }
//		
//		Login login = new Login();
//		login.setNombreUsuario(nombreUsuario);
//		login.setClaveUsuario(claveUsuario);
//		String rolContectado ="";
//		 rolContectado = loginService.checkLogin(login);
//		if(rolContectado.equals("FRAN")||rolContectado.equals("FISIO")||rolContectado.equals("GERENT")){
//			model.addAttribute("nombreUsuario",login.getNombreUsuario());
//			model.addAttribute("rol",rolContectado);
//			return "inicio";
//		}
//		else{
//			model.addAttribute("accesoDenegado","S");
//			return "redirect:/index.jsp";
//		}
//		
//	}




}