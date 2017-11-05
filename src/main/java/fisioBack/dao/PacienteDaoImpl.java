package fisioBack.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;

import fisioBack.model.Login;
import fisioBack.model.Paciente;

@Repository("pacienteDao")
public class PacienteDaoImpl implements PacienteDao {

	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
	public List<String> listaPacientesCitas(Integer clinica,Integer idRol) {
		Session session = sessionFactory.openSession();
		String SQL_QUERY ="select "
				+ "ci.numero, "
				+ "ci.descripcion, "
				+ "ci.fecha, "
				+ "ci.fechaFin, "
				+ "pa.nombre, "
				+ "esp.tipo "
				+ "from "
				+ "fisioBack.model.Clinica as cli, "
				+ "fisioBack.model.Paciente as  pa, "
				+ "fisioBack.model.Especialidad as esp , "
				+ "fisioBack.model.EspecialidadPaciente as espPac, "
				+ "fisioBack.model.Login as lo, "
				+ "fisioBack.model.User as us, "
				+ "fisioBack.model.Cita as ci, "
				+ "fisioBack.model.Rol as r, "
				+ "fisioBack.model.CitaPaciente as cp "
				+ "where "
				+ "cli.idClinica = pa.fkClinica  "
				+ "and pa.idPaciente = espPac.fkPaciente "
				+ "and esp.idEspecialidad = espPac.fkEspecialidad  "
				+ "and lo.fkUsuario=us.idUsuario "
				+ "and us.fkClinica = cli.idClinica "
				+ "and ci.idCita=cp.fkCita "
				+ "and cp.fkPaciente=pa.idPaciente "
				+ "and r.idRol=us.rol "
				+ "and cli.idClinica=?"
				+ "and r.idRol=?";
		
		Query query =  session.createQuery(SQL_QUERY);
		query.setParameter(0,clinica);
		query.setParameter(1,idRol);
		List list = query.list();
		if(list!=null && list.size()>0){
			return list;
		}
		session.close();
		return null;
	}
}
