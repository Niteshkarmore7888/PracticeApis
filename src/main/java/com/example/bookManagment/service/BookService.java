package com.example.bookManagment.service;

import com.example.bookManagment.dto.requestDto.BookRequest;
import com.example.bookManagment.dto.responseDto.BookResponse;
import com.example.bookManagment.models.Book;
import com.example.bookManagment.repository.BookRepository;
import com.example.bookManagment.transformer.BookTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public BookResponse addBook(BookRequest bookRequest) {

        Book book= BookTransformer.requestToEntity(bookRequest);
        Book savedBook=bookRepository.save(book);
        return BookTransformer.entityToResponse(savedBook);
    }
}
