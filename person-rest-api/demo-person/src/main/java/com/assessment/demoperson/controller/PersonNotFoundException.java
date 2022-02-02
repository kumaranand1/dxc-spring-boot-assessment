package com.assessment.demoperson.controller;

public class PersonNotFoundException extends RuntimeException {
    PersonNotFoundException(Integer id) {
        super("Could not find Person " + id);
    
}
}
