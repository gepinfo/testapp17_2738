package com.geppetto.testapp17.dao;

import com.geppetto.testapp17.model.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import java.util.Optional;

public interface PersonDao {

    Person createPerson(Person person);

    void deletePerson(String id);

    Page<Person> getAllPerson(Pageable pageable);

    Optional<Person> updatePerson(String id);

    Optional<Person> getPersonById(String id);

}

