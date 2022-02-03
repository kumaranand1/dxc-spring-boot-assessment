package com.dxc.learning.authorrestapi.repository;
import com.assessment.demoAuthor.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
