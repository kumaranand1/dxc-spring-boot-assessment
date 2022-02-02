package com.assessment.demoperson.repository;


import com.assessment.demoperson.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
