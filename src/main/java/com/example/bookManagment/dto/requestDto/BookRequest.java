package com.example.bookManagment.dto.requestDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


public class BookRequest {


    String name;

    String authorName;

    String authorEmail;

    int pages;
}
