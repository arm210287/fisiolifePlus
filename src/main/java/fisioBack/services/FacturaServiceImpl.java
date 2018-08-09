package fisioBack.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fisioBack.bo.listaFacturasPacientesBO;
import fisioBack.dao.FacturaDao;


@Service("facturaService")
@Transactional
public class FacturaServiceImpl implements FacturaService{
	
	@Autowired
	FacturaDao dao;

	@Override
	public List<String> listaFacturasPacientes(listaFacturasPacientesBO infoFactura) {
		return dao.listaFacturasPacientes(infoFactura);
	}




}
