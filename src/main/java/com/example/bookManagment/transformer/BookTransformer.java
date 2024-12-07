package com.example.bookManagment.transformer;

import com.example.bookManagment.dto.requestDto.BookRequest;

import java.awt.print.Book;

public class BookTransformer {

public static Book requestToEntity(BookRequest bookRequest){
    return Book;

}
}
