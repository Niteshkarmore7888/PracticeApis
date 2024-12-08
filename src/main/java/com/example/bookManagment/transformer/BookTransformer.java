package com.example.bookManagment.transformer;

import com.example.bookManagment.dto.requestDto.BookRequest;
import com.example.bookManagment.dto.responseDto.BookResponse;
import com.example.bookManagment.models.Book;


public class BookTransformer {

public static Book requestToEntity(BookRequest bookRequest){
    return Book.builder()
            .name(bookRequest.getName())
            .authorName(bookRequest.getAuthorName())
            .authorEmail(bookRequest.getAuthorEmail())
            .pages(bookRequest.getPages())
            .build();

}
public static BookResponse entityToResponse(Book book){
    return BookResponse.builder()
            .name(book.getName())
            .authorName(book.getAuthorName())
            .authorEmail(book.getAuthorEmail())
            .pages(book.getPages())
            .build();
}
}
