package ch.cristiano.demo.adapter.soap.type;

import ch.cristiano.demo.application.domain.Person;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonType {

    public Long id;
    public String firstname;
    public String lastname;

    public PersonType ofDomain(Person person) {
        PersonType personType = new PersonType();
        personType.firstname = person.getFirstname();
        personType.lastname = person.getLastname();
        return personType;
    }
}
