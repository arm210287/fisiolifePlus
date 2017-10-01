package fisioBack.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fisioBack.dao.RolDao;
import fisioBack.model.Rol;


@Service("rolService")
@Transactional
public class RolServiceImpl implements RolService{
	
	@Autowired
	RolDao dao;
	
	public Rol findById(int id) {
		return dao.findById(id);
	}

	public Rol findByType(String type){
		return dao.findByType(type);
	}

	public List<Rol> findAll() {
		return dao.findAll();
	}
}
