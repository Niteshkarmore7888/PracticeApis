package com.example.bookManagment.transformer;

import com.example.bookManagment.dto.requestDto.PersonRequest;
import com.example.bookManagment.dto.responseDto.PersonResponse;
import com.example.bookManagment.models.Person;

public class PersonTransformer {
    public static Person requestToEntity(PersonRequest personRequest) {
        return Person.builder()
                .name(personRequest.getName())
                .surname(personRequest.getSurname())
                .email(personRequest.getEmail())
                .mobileNo(personRequest.getMobileNo())
                .age(personRequest.getAge())
                .build();
    }
    public static PersonResponse entityToResponse(Person person){
        return PersonResponse.builder()
                .name(person.getName())
                .surname(person.getSurname())
                .mobileNo(person.getMobileNo())
                .age(person.getAge())
                .build();

    }
}
