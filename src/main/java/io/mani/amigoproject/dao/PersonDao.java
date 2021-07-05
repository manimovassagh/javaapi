package io.mani.amigoproject.dao;

import io.mani.amigoproject.model.Person;

import java.util.UUID;

public interface PersonDao {

    int insertPerson (UUID id, Person person);
    default  int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
