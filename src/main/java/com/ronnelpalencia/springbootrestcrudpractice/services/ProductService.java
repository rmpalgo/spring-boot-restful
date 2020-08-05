package com.ronnelpalencia.springbootrestcrudpractice.services;

import com.ronnelpalencia.springbootrestcrudpractice.entity.Product;
import com.ronnelpalencia.springbootrestcrudpractice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Separating basic CRUD functionality from the Controller and adding it into
its own service
 */


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //Save One Product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    //Save Products
    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    //Get All Products
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    //Get One Product based on id
    public Product getProductById( int id ) {
        return productRepository.findById(id).orElse(null);
    }

    //Get Product based on Name
    public List<Product> getProductByName( String name ) {
        return productRepository.findByName(name);
    }

    //Delete Product
    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "product deleted || " + id;
    }

    //update Product
    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return productRepository.save(existingProduct);
    }

}
