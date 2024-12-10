package com.geppetto.testapp17.service;

import com.geppetto.testapp17.dto.PersonDto;
import org.springframework.data.domain.Page;

public interface PersonService {

    PersonDto  createPerson(PersonDto personDto);

    String  deletePerson(String id);

    Page<PersonDto>  getAllPerson(int page, int size);

    PersonDto  updatePerson(PersonDto personDto);

    PersonDto  getPersonById(String id);

}
