package fisioBack.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fisioBack.dao.LoginDao;
import fisioBack.model.Login;


@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDao dao;
	
	public Login findById(int id) {
		return dao.findById(id);
	}

	public List<Login> findAll() {
		return dao.findAll();
	}

	@Override
	public Login checkLogin(Login login) {
		return dao.checkLogin(login);
	}
}
