package com.example.bookManagment.transformer;

import com.example.bookManagment.dto.requestDto.CustomerRequest;
import com.example.bookManagment.dto.responseDto.CustomerResponse;
import com.example.bookManagment.models.Customer;

public class CustomerTransformer {

    public static Customer requestToEntity(CustomerRequest customerRequest){
        return Customer.builder()
                .name(customerRequest.getName())
                .email(customerRequest.getEmail())
                .mobileNo(customerRequest.getMobileNo())
                .build();
    }
    public static CustomerResponse entityToResponse(Customer customer){
        return CustomerResponse.builder()
                .name(customer.getName())
                .mobileNo(customer.getMobileNo())
                .email(customer.getEmail())
                .build();
    }
}
