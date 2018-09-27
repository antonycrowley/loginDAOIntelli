package loginDAO.dao;

import loginDAO.model.City;

import java.util.List;


//DAO (Data Access Object) Patron de diseño
public interface CityDAO {
	List<City> findAllByStateId(int stateId);
}
