package fisioBack.services;

import java.util.List;

import fisioBack.model.Login;



public interface LoginService {

	Login findById(int id);

	List<Login> findAll();
	
	Login checkLogin(Login login);
	
}
