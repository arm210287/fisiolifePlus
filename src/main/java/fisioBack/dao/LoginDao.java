package fisioBack.dao;



import fisioBack.Bo.InfoLogin;
import fisioBack.model.Login;

public interface LoginDao {

	InfoLogin checkLogin (Login login);
}
