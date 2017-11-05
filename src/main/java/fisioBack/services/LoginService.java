package fisioBack.services;


import fisioBack.Bo.InfoLogin;
import fisioBack.model.Login;



public interface LoginService {

	
	InfoLogin checkLogin(Login login);
	
}
