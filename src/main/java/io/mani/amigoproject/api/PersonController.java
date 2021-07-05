package io.mani.amigoproject.api;

import io.mani.amigoproject.model.Person;
import io.mani.amigoproject.service.PersonService;

public class PersonController {

private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    public void addPerson (Person person){
        personService.addPerson(person);
    }
}
