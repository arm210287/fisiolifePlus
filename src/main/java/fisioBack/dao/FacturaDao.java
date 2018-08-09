package fisioBack.dao;



import java.util.List;

import fisioBack.bo.listaFacturasPacientesBO;


public interface FacturaDao {

	List<String> listaFacturasPacientes(listaFacturasPacientesBO infoFactura);

}
