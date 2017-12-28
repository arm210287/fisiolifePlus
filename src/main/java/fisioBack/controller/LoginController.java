package fisioBack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fisioBack.bo.InfoLogin;
import fisioBack.model.Login;
//import fisioBack.model.User;
//import fisioBack.model.UserProfile;
import fisioBack.services.LoginService;

@Controller
//@SessionAttributes("roles")
public class LoginController {

	@Autowired
	LoginService loginService;

	@Autowired
	MessageSource messageSource;



	/**
	 * This method handles login GET requests.
	 * If users is already logged-in and tries to goto login page again, will be redirected to list page.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPage(@RequestParam ("nombreUsuario") String nombreUsuario, @RequestParam("claveUsuario")String claveUsuario,ModelMap model) {
//		if (isCurrentAuthenticationAnonymous()) {
//			return "login";
//	    } else {
//	    	return "redirect:/list";  
//	    }
		
		Login login = new Login();
		login.setNombreUsuario(nombreUsuario);
		login.setClaveUsuario(claveUsuario);
		InfoLogin infoLogin = new InfoLogin();
		infoLogin = loginService.checkLogin(login);
		if(infoLogin.getRol()!=null){
			if(infoLogin.getRol().equals("FRAN")||infoLogin.getRol().equals("FISIO")||infoLogin.getRol().equals("GERENT")){
				model.addAttribute("nombreUsuario",login.getNombreUsuario());
				model.addAttribute("rol",infoLogin.getRol());
				model.addAttribute("idRol",infoLogin.getIdRol());
				model.addAttribute("clinica",infoLogin.getClinica());
				return "inicio";
			}
			else{
				model.addAttribute("accesoDenegado","S");
				return "redirect:/index.jsp";
			}
			
		}
		return "redirect:/index.jsp";

	}

	/**
	 * This method handles logout requests.
	 * Toggle the handlers if you are RememberMe functionality is useless in your app.
	 */
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
			new SecurityContextLogoutHandler().logout(request, response, auth);
//			persistentTokenBasedRememberMeServices.logout(request, response, auth);
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "redirect:/index";
	}

	
	@RequestMapping(value="/lista", method = RequestMethod.POST)
	public @ResponseBody  String lista (){

		return "registration";
	}



}