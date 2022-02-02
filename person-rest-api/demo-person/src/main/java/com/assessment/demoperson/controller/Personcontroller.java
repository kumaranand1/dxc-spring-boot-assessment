package com.assessment.demoperson.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Null;

import com.assessment.demoperson.DTO.PersonDTO;
import com.assessment.demoperson.Model.Person;
import com.assessment.demoperson.repository.PersonRepository;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Personcontroller {
  
  ModelMapper modelMapper = new ModelMapper();
PersonDTO personDTO = modelMapper.map(newPerson(null), PersonDTO.class);

  private final PersonRepository repository;

  Personcontroller(PersonRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/persons")
 public List<Person> all() {
    return repository.findAll();
  }

  @PostMapping("/persons")
public  Person newPerson(@RequestBody Person newPerson) {
  newPerson.setDob(LocalDate.now());
    return repository.save(newPerson);
  }

  private LocalDate LocalDate() {
    return null;
  }

  @GetMapping("/persons/{id}")
 public Person one(@PathVariable Integer id) {

    return repository.findById(id)
        .orElseThrow(() -> new PersonNotFoundException(id));
  }

  @PutMapping("/persons/{id}")
  public Person replacePerson(@RequestBody Person newPerson, @PathVariable Integer id) {

    return repository.findById(id)
        .map(person -> {
          person.setName(newPerson.getName());
          person.setEmail(newPerson.getEmail());
          person.setDob(LocalDate.now());
          person.setAddress(newPerson.getAddress());
          return repository.save(person);
        })
        .orElseGet(() -> {
          newPerson.setId(id);
          return repository.save(newPerson);
        });
  }

  @DeleteMapping("/persons/{id}")
 public void deletePerson(@PathVariable Integer id) {
    repository.deleteById(id);
  }
}