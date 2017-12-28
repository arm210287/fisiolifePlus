package fisioBack.dao;



import fisioBack.bo.InfoLogin;
import fisioBack.model.Login;

public interface LoginDao {

	InfoLogin checkLogin (Login login);
}
