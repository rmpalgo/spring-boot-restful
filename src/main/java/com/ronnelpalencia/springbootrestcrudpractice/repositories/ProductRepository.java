package com.ronnelpalencia.springbootrestcrudpractice.repositories;


import com.ronnelpalencia.springbootrestcrudpractice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByName(String name);
}
