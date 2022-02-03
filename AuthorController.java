package com.dxc.learning.authorrestapi.controllers;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Null;

import com.dxc.learning.demoauthor.DTO.AuthorDTO;
import com.dxc.learning.demoauthor.Model.Author;
import com.dxc.learning.demoauthor.repository.AuthorRepository;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authorcontroller {
  
  ModelMapper modelMapper = new ModelMapper();
AuthorDTO authorDTO = modelMapper.map(newAuthor(null), AuthorDTO.class);

  private final AuthorRepository repository;

  Authorcontroller(AuthorRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/authors")
 public List<Author> all() {
    return repository.findAll();
  }

  @PostMapping("/Authors")
public  Author newAuthor(@RequestBody author newAuthor) {
  newAuthor.setDob(LocalDate);
    return repository.save(newAuthor);
  }

  private LocalDate LocalDate() {
    return null;
  }

  @GetMapping("/authors/{id}")
 public Author one(@PathVariable Integer id) {

    return repository.findById(id)
        .orElseThrow(() -> new AuthorNotFoundException(id));
  }

  @PutMapping("/persons/{id}")
  public Author replacePerson(@RequestBody Author newAuthor, @PathVariable Integer id) {

    return repository.findById(id)
        .map(author -> {
          author.setName(newAuthor.getName());
          author.setEmail(newAuthor.getEmail());
          author.setDob(LocalDate);
          author.setAddress(newAuthor.getAddress());
          return repository.save(author);
        })
        .orElseGet(() -> {
          newAuthor.setId(id);
          return repository.save(newPerson);
        });
  }

  @DeleteMapping("/Authors/{id}")
 public void deleteAuthor(@PathVariable Integer id) {
    repository.deleteById(id);
  }
} 
