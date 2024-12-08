package com.example.bookManagment.dto.responseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
public class PersonResponse {

    String name;
    String surname;
    String mobileNo;
    int age;
}
