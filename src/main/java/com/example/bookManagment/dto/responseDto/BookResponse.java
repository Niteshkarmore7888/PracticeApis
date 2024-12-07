package com.example.bookManagment.dto.responseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class BookResponse {

    String name;
    String authorName;
    String authorEmail;
    int pages;
}
