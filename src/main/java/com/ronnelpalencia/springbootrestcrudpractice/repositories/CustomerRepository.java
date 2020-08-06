package com.ronnelpalencia.springbootrestcrudpractice.repositories;

import com.ronnelpalencia.springbootrestcrudpractice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
