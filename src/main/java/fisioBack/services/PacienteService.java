package fisioBack.services;


import java.util.List;

import fisioBack.bo.listaPacienteBO;

public interface PacienteService {

	
	List<String> listaPacienteClinicas(listaPacienteBO infoPaciente);
	List<String> listaDatosPacienteClinicas(listaPacienteBO infoPaciente);

	
}
