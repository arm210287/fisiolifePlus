package fisioBack.dao;

import java.util.List;

import fisioBack.model.Login;

public interface LoginDao {

	List<Login> findAll();
	
	Login findById(int id);
	
	Login checkLogin (Login login);
}
