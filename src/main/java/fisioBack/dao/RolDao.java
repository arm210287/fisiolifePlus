package fisioBack.dao;

import java.util.List;

import fisioBack.model.Rol;

public interface RolDao {

	List<Rol> findAll();
	
	Rol findByType(String type);
	
	Rol findById(int id);
}
