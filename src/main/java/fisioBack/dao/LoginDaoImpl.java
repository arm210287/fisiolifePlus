package fisioBack.dao;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import fisioBack.bo.InfoLogin;
import fisioBack.model.Login;

@Repository("loginDao")
public class LoginDaoImpl extends HibernateUtil implements LoginDao{

	@Override
    public InfoLogin checkLogin(Login login){
			Session session = this.sessionFactory.openSession();
			InfoLogin infoLogin = new InfoLogin();
			String SQL_QUERY ="select "
					+ "r.tipo, "
					+ "u.fkClinica, "
					+ "r.idRol "
					+ "from "
					+ "fisioBack.model.Login as l,"
					+ "fisioBack.model.Rol as r,"
					+ "fisioBack.model.User as u"
					+ " where l.nombreUsuario=? and l.claveUsuario=? and l.fkUsuario= u.idUsuario and u.rol=r.idRol";
			Query query =  session.createQuery(SQL_QUERY);
			query.setParameter(0,login.getNombreUsuario());
			query.setParameter(1,login.getClaveUsuario());
			
			List<Object> result = (List<Object>) query.list(); 
			Iterator itr = result.iterator();
			while(itr.hasNext()){
			   Object[] obj = (Object[]) itr.next();
			   //now you have one array of Object for each row
			   infoLogin.setRol(String.valueOf(obj[0])); // don't know the type of column CLIENT assuming String 
			   infoLogin.setClinica(String.valueOf(obj[1]));
			   infoLogin.setIdRol(String.valueOf(obj[2]));//SERVICE assumed as int
			   //same way for all obj[2], obj[3], obj[4]
			}


			session.close();
			return infoLogin;              
       }
}
