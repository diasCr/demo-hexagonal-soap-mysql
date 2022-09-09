package ch.cristiano.demo.application.service;

import java.util.List;

import javax.inject.Inject;

import ch.cristiano.demo.application.domain.Person;
import ch.cristiano.demo.application.port.in.PersonService;
import ch.cristiano.demo.application.port.out.PersonDao;

public class DefaultPersonService implements PersonService {

    @Inject
    private PersonDao personDao;

    @Override
    public void create(Person person) {
        personDao.persistPerson(person);
    }

    @Override
    public Person readPersonById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Person> readAllPersons() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(Person person) {
        // TODO Auto-generated method stub
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
    }
}
