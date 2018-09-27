package loginDAO.daoImpl;

import loginDAO.dao.CityDAO;
import loginDAO.dao.HibernateSession;
import loginDAO.model.City;
import org.hibernate.Session;

import javax.persistence.TypedQuery;
import java.util.List;

public class CityDAOImpl implements CityDAO {
	
private static final String FIND_BY_STATE = "FROM City WHERE Id_State = :stateId";
	
	public List<City> findAllByStateId(int stateId) {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<City> query = session.createQuery(FIND_BY_STATE);
		query.setParameter("stateId", stateId);
		List<City> list = query.getResultList();
		session.close();
		return list;
	}

}
