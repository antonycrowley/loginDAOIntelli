package loginDAO.dao;

import loginDAO.model.State;

import java.util.List;

public interface StateDAO {
	List<State> getAllStates();
	State findById(int id);

}
