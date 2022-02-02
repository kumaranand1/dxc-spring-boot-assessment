package com.assessment.demoperson.service;

import java.util.List;
import com.assessment.demoperson.Model.Person;
import com.assessment.demoperson.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonserviceImpl  implements Personservice {

    @Autowired
    private PersonRepository personRepository;

    
    @Override
    public Person getPersonById(int id) {
        return personRepository.findById(id).orElseThrow();
    }

    @Override
    public Person getPersonByname(String name) {
        return null;
    }

    @Override
    public Person getPersonByEmail(String email) {

        return null;
    }
    @Override
    public Person getPersonByaddress(String address) {

        return null;
    }


    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(int id) {
        Person person = getPersonById(id);
        personRepository.delete(person);

    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

}