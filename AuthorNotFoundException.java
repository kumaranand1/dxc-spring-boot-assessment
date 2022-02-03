
package com.dxc.authorrestapi.controller;

public class AuthorNotFoundException extends RuntimeException {

    AuthorNotFoundException(Integer id) {
        super("could not find author" + id);
    }

}