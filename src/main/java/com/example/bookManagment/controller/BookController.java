package com.example.bookManagment.controller;

import com.example.bookManagment.dto.requestDto.BookRequest;
import com.example.bookManagment.dto.responseDto.BookResponse;
import com.example.bookManagment.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;


    @PostMapping("/add")
    public ResponseEntity addBook(@RequestBody BookRequest bookRequest){
        BookResponse response=bookService.addBook(bookRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }





}
