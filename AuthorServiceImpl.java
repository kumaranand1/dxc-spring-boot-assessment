package com.dxc.learning.authorrestapi.services;
import java.util.List;
import com.dxc.learning.demoauthor.Model.Author;
import com.dxc.learning.demoauthor.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorserviceImpl  implements Authorservice {

    @Autowired
    private AuthorRepository authorRepository;

    
    @Override
    public Author getAuthorById(int id) {
        return authorRepository.findById(id).orElseThrow();
    }

    @Override
    public Author getAuthorByname(String name) {
        return null;
    }

    @Override
    public Author getAuthorByEmail(String email) {

        return null;
    }
    @Override
    public Person getAuthorByaddress(String address) {

        return null;
    }


    @Override
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(int id) {
        Author author = getAuthorById(id);
        authorRepository.delete(author);

    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

}
