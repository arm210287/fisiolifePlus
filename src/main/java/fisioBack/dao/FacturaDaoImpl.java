package fisioBack.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import fisioBack.bo.listaFacturasPacientesBO;

@Repository("facturaDao")
public class FacturaDaoImpl extends HibernateUtil implements FacturaDao {

	
	@Override
	/***
	 * Metodo que busca en BD el listado de facturas asociadas a pacientes registrados
	 */
	public List<String> listaFacturasPacientes(listaFacturasPacientesBO infoFactura) {
		Session session = this.sessionFactory.openSession();
		String SQL_QUERY ="select DISTINCT  "
				+ "pa.nombre, "
				+ "pa.apellido, "
				+ "fa.fechaFactura, "
				+ "fa.numero, "
				+ "fa.importe, "
				+ "fa.iva, "
				+ "pa.correo, "
				+ "pa.fechaUltActual, "
				+ "pa.observaciones "
				+ "from "
				+ "fisioBack.model.Clinica as cli, "
				+ "fisioBack.model.Paciente as  pa, "
				+ "fisioBack.model.Factura as fa,  "
				+ "fisioBack.model.FacturaPaciente as faPa "
				+ "where "
				+ "fa.fkClinica      =  cli.idClinica    "
				+ "and fa.idFactura  =  faPa.fkFactura   "
				+ "and pa.idPaciente =  faPa.fkPaciente  "
				+ "and cli.idClinica=? ";
			
		
		if(infoFactura.getNombreRazonSocial()!=null && infoFactura.getNombreRazonSocial()!="")
			SQL_QUERY+= " and pa.nombre like :nombre ";
		
		if(infoFactura.getNumero()!=null && infoFactura.getNumero()!="")
			SQL_QUERY+= " and fa.numero =:numero ";
		
		if(infoFactura.getImporte()!=null && infoFactura.getImporte()!="")
			SQL_QUERY+= " and fa.importe =:importe ";
		

		Query query =  session.createQuery(SQL_QUERY);
		query.setParameter(0,infoFactura.getIdClinica());
		if(infoFactura.getNombreRazonSocial()!=null && infoFactura.getNombreRazonSocial()!="")
			query.setParameter("nombre","%"+infoFactura.getNombreRazonSocial()+"%");
		if(infoFactura.getNumero()!=null && infoFactura.getNumero()!="")
			query.setParameter("numero",infoFactura.getNumero());
		if(infoFactura.getImporte()!=null && infoFactura.getImporte()!="")
			query.setParameter("importe",infoFactura.getImporte());
		
		List list = query.list();
		if(list!=null && list.size()>0){
			return list;
		}
		session.close();
		return null;
	}
}

		
