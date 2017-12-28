package fisioBack.services;


import fisioBack.bo.InfoLogin;
import fisioBack.model.Login;



public interface LoginService {

	
	InfoLogin checkLogin(Login login);
	
}
