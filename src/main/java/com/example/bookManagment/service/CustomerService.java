package com.example.bookManagment.service;

import com.example.bookManagment.dto.requestDto.CustomerRequest;
import com.example.bookManagment.dto.responseDto.CustomerResponse;
import com.example.bookManagment.models.Customer;
import com.example.bookManagment.repository.CustomerRepository;
import com.example.bookManagment.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public CustomerResponse addCustomer(CustomerRequest customerRequest) {

        Customer customer= CustomerTransformer.requestToEntity(customerRequest);
        Customer savedCustomer=customerRepository.save(customer);
        return CustomerTransformer.entityToResponse(savedCustomer);
    }
}
