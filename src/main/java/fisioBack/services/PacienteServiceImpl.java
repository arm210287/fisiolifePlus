package fisioBack.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fisioBack.dao.PacienteDao;


@Service("pacienteService")
@Transactional
public class PacienteServiceImpl implements PacienteService{
	
	@Autowired
	PacienteDao dao;

	@Override
	public List<String> listaPacienteClinicas(Integer clinica,Integer idRol) {
		return dao.listaPacientesCitas(clinica,idRol);
	}



}
