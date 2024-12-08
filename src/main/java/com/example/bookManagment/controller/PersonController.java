package com.example.bookManagment.controller;

import com.example.bookManagment.dto.requestDto.PersonRequest;
import com.example.bookManagment.dto.responseDto.PersonResponse;
import com.example.bookManagment.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;
    @PostMapping("/add")

    public ResponseEntity addPerson(@RequestBody PersonRequest personRequest){
        PersonResponse response=personService.addPerson(personRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
