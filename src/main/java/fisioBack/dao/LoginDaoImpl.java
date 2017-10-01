package fisioBack.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import fisioBack.model.Login;



@Repository("loginDao")
public class LoginDaoImpl extends AbstractDao<Integer, Login>implements LoginDao{

	public Login findById(int id) {
		return getByKey(id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Login> findAll(){
		Criteria crit = createEntityCriteria();
		crit.addOrder(Order.asc("id_login"));
		return (List<Login>)crit.list();
	}

	@Override
	public Login checkLogin(Login login) {
		Criteria criteriaLogin = createEntityCriteria();
		criteriaLogin.add(Restrictions.eq("nombre_usuario",login.getNombreUsuario()));
		criteriaLogin.add(Restrictions.eq("clave_usuario",login.getClaveUsuario()));
		return (Login) criteriaLogin.uniqueResult() ;
	}
	
}
