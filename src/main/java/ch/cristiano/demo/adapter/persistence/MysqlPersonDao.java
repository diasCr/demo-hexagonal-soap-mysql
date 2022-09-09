package ch.cristiano.demo.adapter.persistence;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.cristiano.demo.adapter.persistence.entity.PersonEntity;
import ch.cristiano.demo.application.domain.Person;
import ch.cristiano.demo.application.port.out.PersonDao;

@RequestScoped
public class MysqlPersonDao implements PersonDao {

    @PersistenceContext(name = "personPU")
    private EntityManager entityManager;

    @Override
    public void persistPerson(Person person) {
        PersonEntity newPerson = new PersonEntity(person.getId(), person.getFirstname(), person.getLastname(),
                person.getAge());

        this.entityManager.persist(newPerson);
        this.entityManager.flush();
    }

}
