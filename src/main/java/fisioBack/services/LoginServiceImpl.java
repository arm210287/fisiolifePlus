package fisioBack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fisioBack.bo.InfoLogin;
import fisioBack.dao.LoginDao;
import fisioBack.model.Login;


@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDao dao;

	@Override
	public InfoLogin checkLogin(Login login) {
		return dao.checkLogin(login);
	}
}
