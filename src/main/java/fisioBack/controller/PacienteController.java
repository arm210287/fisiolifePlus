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
	public @ResponseBody  List<String> lista (@RequestParam ("clinica") Integer clinica){
		List<String> listaPacientes = this.pacienteService.listaPacienteClinicas(clinica);
		List<String> listaAgendaPacientes = new ArrayList<String>();
		if(listaPacientes!=null && listaPacientes.size()>0){
			listaAgendaPacientes=listaPacientes;
			return listaAgendaPacientes;
		}
		return null;
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