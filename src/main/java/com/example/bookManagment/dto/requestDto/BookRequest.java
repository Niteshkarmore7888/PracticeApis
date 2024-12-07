package com.example.bookManagment.dto.requestDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


public class BookRequest {

    int id;

    String name;

    String authorName;

    String authorEmail;

    int pages;
}
