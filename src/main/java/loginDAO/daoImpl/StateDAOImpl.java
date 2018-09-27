package loginDAO.daoImpl;


import loginDAO.dao.HibernateSession;
import loginDAO.dao.StateDAO;
import loginDAO.model.State;
import org.hibernate.Session;

import javax.persistence.TypedQuery;
import java.util.List;

public class StateDAOImpl implements StateDAO {
	
private static final String GET_ALL_STATES = "FROM State";

	public List<State> getAllStates() {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<State> query = session.createQuery(GET_ALL_STATES);
		List<State> list = query.getResultList();
		session.close();
		return list;
	}

	public State findById(int id) {
		State state = (State)HibernateSession.getObjectByPrimaryKey(State.class, id);
		return state;
	}

}
