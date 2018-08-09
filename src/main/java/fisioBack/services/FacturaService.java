package fisioBack.services;


import java.util.List;

import fisioBack.bo.listaFacturasPacientesBO;

public interface FacturaService {

	
	List<String> listaFacturasPacientes(listaFacturasPacientesBO infoFacturas);

	
}
