package io.mani.amigoproject.service;

import io.mani.amigoproject.dao.PersonDao;
import io.mani.amigoproject.model.Person;

public class PersonService {
private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
