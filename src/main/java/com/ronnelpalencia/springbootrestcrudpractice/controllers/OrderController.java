package com.ronnelpalencia.springbootrestcrudpractice.controllers;

import com.ronnelpalencia.springbootrestcrudpractice.dto.OrderRequest;
import com.ronnelpalencia.springbootrestcrudpractice.dto.OrderResponse;
import com.ronnelpalencia.springbootrestcrudpractice.entity.Customer;
import com.ronnelpalencia.springbootrestcrudpractice.repositories.CustomerRepository;
import com.ronnelpalencia.springbootrestcrudpractice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request) {
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }


}
