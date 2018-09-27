package loginDAO.dao;

import loginDAO.model.Person;

import java.util.List;

public interface PersonDAO {

	void insert(Person person);

	List<Person> getAllPersons();

	Person findById(int id);

	Person findByEmail(String email);

	void deletePerson(Person person);

	void updatePerson(Person person);

}
