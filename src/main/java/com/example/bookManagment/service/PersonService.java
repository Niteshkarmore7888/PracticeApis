package com.example.bookManagment.service;

import com.example.bookManagment.dto.requestDto.PersonRequest;
import com.example.bookManagment.dto.responseDto.PersonResponse;
import com.example.bookManagment.models.Person;
import com.example.bookManagment.repository.PersonRepository;
import com.example.bookManagment.transformer.PersonTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    public PersonResponse addPerson(PersonRequest personRequest) {
        Person person= PersonTransformer.requestToEntity(personRequest);
        Person savedPerson=personRepository.save(person);
        return PersonTransformer.entityToResponse(savedPerson);
    }
}
