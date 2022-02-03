package com.dxc.learning.authorrestapi.services;
import java.util.List;

import com.assessment.demoauthor.Model.Author;

    
    public interface Authorservice {

        public Author getAuthorById(int id);
    
        public Author getAuthorByname(String name);
    
        public Author getAuthorByEmail(String email);
        
        public Author getAuthorByaddress(String address);
        
    
        public Author createAuthor(Author author);
    
        public Author updateAuthor(Author author);
    
        public void deleteAuthor(int id);
    
        public List<Author> getAllAuthors();
    
    } 
