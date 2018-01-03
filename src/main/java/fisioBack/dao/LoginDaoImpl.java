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
					+ "l.claveUsuario, "
					+ "u.idUsuario, "
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
			   infoLogin.setRol(String.valueOf(obj[0])); //tipo de rol
			   infoLogin.setClinica(String.valueOf(obj[1]));//clinica a la que esta registrado
			   infoLogin.setClaveUsuario(String.valueOf(obj[2]));//clave usuario
			   infoLogin.setIdUsuario(String.valueOf(obj[3]));//id usuario
			   infoLogin.setIdRol(String.valueOf(obj[4]));//id rol
			}


			session.close();
			return infoLogin;              
       }
}
