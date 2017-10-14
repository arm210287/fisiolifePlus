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
    public String checkLogin(Login login){
			Session session = sessionFactory.openSession();
			boolean userFound = true;
			String resultadoRol ="";
			//Query using Hibernate Query Language
			String SQL_QUERY ="select r.tipo from "
					+ "fisioBack.model.Login as l,"
					+ "fisioBack.model.Rol as r,"
					+ "fisioBack.model.User as u"
					+ " where l.nombreUsuario=? and l.claveUsuario=? and l.fkUsuario= u.idUsuario and u.rol=r.idRol";
			Query query =  session.createQuery(SQL_QUERY);
			query.setParameter(0,login.getNombreUsuario());
			query.setParameter(1,login.getClaveUsuario());
			List list = query.list();
			if(list!=null && list.size()>0){
				resultadoRol=list.get(0).toString();
			}

			session.close();
			return resultadoRol;              
       }
}
