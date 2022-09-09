package ch.cristiano.demo.adapter.soap;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import ch.cristiano.demo.adapter.soap.type.PersonType;
import ch.cristiano.demo.application.domain.Person;
import ch.cristiano.demo.application.port.in.PersonService;

@Stateless
@WebService
public class PersonWebservice {

    @Inject
    private PersonService personService;

    public PersonType getPersonById(Long id) {
        Person person = personService.readPersonById(id);
        PersonType personType = new PersonType().ofDomain(person);
        return personType;
    }

}
