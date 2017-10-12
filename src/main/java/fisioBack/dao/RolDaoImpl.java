//package fisioBack.dao;
//
//import java.util.List;
//
//import org.hibernate.Criteria;
//import org.hibernate.criterion.Order;
//import org.hibernate.criterion.Restrictions;
//import org.springframework.stereotype.Repository;
//
//import fisioBack.model.Rol;
//
//
//
//@Repository("rolDao")
//public class RolDaoImpl extends AbstractDao<Integer, Rol>implements RolDao{
//
//	public Rol findById(int id) {
//		return getByKey(id);
//	}
//
//	public Rol findByType(String type) {
//		Criteria crit = createEntityCriteria();
//		crit.add(Restrictions.eq("type", type));
//		return (Rol) crit.uniqueResult();
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<Rol> findAll(){
//		Criteria crit = createEntityCriteria();
//		crit.addOrder(Order.asc("type"));
//		return (List<Rol>)crit.list();
//	}
//	
//}
