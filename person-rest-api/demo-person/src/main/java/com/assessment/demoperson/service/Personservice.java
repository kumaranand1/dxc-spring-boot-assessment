package com.assessment.demoperson.service;
import java.util.List;

import com.assessment.demoperson.Model.Person;

    
    public interface Personservice {

        public Person getPersonById(int id);
    
        public Person getPersonByname(String name);
    
        public Person getPersonByEmail(String email);
        
        public Person getPersonByaddress(String address);
        
    
        public Person createPerson(Person person);
    
        public Person updatePerson(Person person);
    
        public void deletePerson(int id);
    
        public List<Person> getAllPersons();
    
    }

