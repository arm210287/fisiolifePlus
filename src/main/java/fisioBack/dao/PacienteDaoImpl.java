package fisioBack.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import fisioBack.bo.listaPacienteBO;

@Repository("pacienteDao")
public class PacienteDaoImpl extends HibernateUtil implements PacienteDao {
	/***
	 *Metodo que consulta en la BD el listado de pacientes agendados. 
	 */
	@Override
	public List<String> listaPacientesCitas(listaPacienteBO infoPaciente) {
		Session session = this.sessionFactory.openSession();
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
				+ "and lo.idLogin=us.idLogin "
				+ "and us.fkClinica = cli.idClinica "
				+ "and ci.idCita=cp.fkCita "
				+ "and cp.fkPaciente=pa.idPaciente "
				+ "and cli.idClinica=?"
				+ "and r.idRol=?"
				+ "and lo.claveUsuario=?"
				+ "and us.idUsuario=?";
		
		Query query =  session.createQuery(SQL_QUERY);
		query.setParameter(0,infoPaciente.getIdClinica());
		query.setParameter(1,infoPaciente.getIdRol());
		query.setParameter(2,infoPaciente.getClaveUsuario());
		query.setParameter(3,infoPaciente.getIdUsuario());
		List list = query.list();
		if(list!=null && list.size()>0){
			return list;
		}
		session.close();
		return null;
	}
	
	@Override
	/***
	 * Metodo que busca en BD el listado de pacientes registrados
	 */
	public List<String> listaDatosPacientesCitas(listaPacienteBO infoPaciente) {
		Session session = this.sessionFactory.openSession();
		String SQL_QUERY ="select DISTINCT  "
				+ "pa.nombre, "
				+ "pa.segundoNombre, "
				+ "pa.apellido, "
				+ "pa.segundoApellido, "
				+ "pa.edad, "
				+ "pa.fechaNacimiento, "
				+ "pa.correo, "
				+ "pa.fechaRegistro, "
				+ "pa.fechaUltActual, "
				+ "pa.observaciones "
				+ "from "
				+ "fisioBack.model.Clinica as cli, "
				+ "fisioBack.model.Paciente as  pa, "
				+ "fisioBack.model.Rol as r "
				+ "where "
				+ "cli.idClinica = pa.fkClinica  "
				+ "and cli.idClinica=? ";
			
		
		if(infoPaciente.getNombrePaciente()!=null && infoPaciente.getNombrePaciente()!=""){
			SQL_QUERY+= " and pa.nombre like :nombre ";

		}
		if(infoPaciente.getCorreoElectronico()!=null && infoPaciente.getCorreoElectronico()!=""){
			SQL_QUERY+= " and pa.correo like :correo ";

		}

		Query query =  session.createQuery(SQL_QUERY);
		query.setParameter(0,infoPaciente.getIdClinica());
		if(infoPaciente.getNombrePaciente()!=null && infoPaciente.getNombrePaciente()!="")
			query.setParameter("nombre","%"+infoPaciente.getNombrePaciente()+"%");
		if(infoPaciente.getCorreoElectronico()!=null && infoPaciente.getCorreoElectronico()!="")
			query.setParameter("correo","%"+infoPaciente.getCorreoElectronico()+"%");
		
		List list = query.list();
		if(list!=null && list.size()>0){
			return list;
		}
		session.close();
		return null;
	}
}
