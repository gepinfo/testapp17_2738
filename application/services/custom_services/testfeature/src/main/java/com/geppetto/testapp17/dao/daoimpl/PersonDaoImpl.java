package com.geppetto.testapp17.dao.daoimpl;

import com.geppetto.testapp17.repository.PersonRepository;
import com.geppetto.testapp17.dao.PersonDao;

import com.geppetto.testapp17.model.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
* Implementation of the {@link PersonDao} interface.
* Provides methods to interact with the {@link PersonRepository} for CRUD operations on {@link Person } entities.
*/
@Service
public class PersonDaoImpl implements PersonDao {

    private final PersonRepository personRepository;
    /**
     * Constructs a new {@code PersonDaoImpl} with the specified repository.
     *
     * @param personRepository The repository used for accessing {@link Person} entities. Must not be {@code null}.
     */
    public PersonDaoImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    /**
     * Creates new person.
     *
     * @param person The {@link Person} entity to create. Must not be {@code null}.
     * @return The created {@link Person} entity.
     */
    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }


    /**
     * Deletes person by its ID.
     *
     * @param id The ID of the person to delete. Must not be {@code null}.
     */
    @Override
    public void deletePerson(String id) {
        personRepository.deleteById(id);
    }


     /**
     * Retrieves all person from the repository.
     *
     * @return A list of all {@link Person} entities.
     */
    @Override
    public Page<Person> getAllPerson(Pageable pageable) {
        return personRepository.findAll(pageable);
    }


    /**
     * Retrieves person by its ID for update purposes.
     *
     * @param id The ID of the person to retrieve. Must not be {@code null}.
     * @return An {@link Optional} containing the person if found, or an empty {@code Optional} if not.
     */
    @Override
    public Optional<Person> updatePerson(String id) {
        return personRepository.findById(id);
    }


    /**
     * Retrieves person by its ID.
     *
     * @param id The ID of the person to retrieve. Must not be {@code null}.
     * @return An {@link Optional} containing the person if found, or an empty {@code Optional} if not.
     */
    @Override
    public Optional<Person> getPersonById(String id) {
        return personRepository.findById(id);
    }


}


