package fisioBack.dao;



import java.util.List;

import fisioBack.bo.listaPacienteBO;


public interface PacienteDao {

	List<String> listaPacientesCitas(listaPacienteBO infoPaciente);
	List<String> listaDatosPacientesCitas(listaPacienteBO infoPaciente);

}
