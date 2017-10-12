package fisioBack.dao;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;

import fisioBack.model.Login;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {

	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
    public boolean checkLogin(Login login){
			System.out.println("In Check login");
			Session session = sessionFactory.openSession();
			boolean userFound = true;
			//Query using Hibernate Query Language
			String SQL_QUERY ="from fisioBack.model.Login as o where o.nombreUsuario=? and o.claveUsuario=?";
			Query query =  session.createQuery(SQL_QUERY);
			query.setParameter(0,login.getNombreUsuario());
			query.setParameter(1,login.getClaveUsuario());
			List list = query.list();
			if(list!=null && list.size()>0){
				userFound=false;
			}

			session.close();
			return userFound;              
       }
}
