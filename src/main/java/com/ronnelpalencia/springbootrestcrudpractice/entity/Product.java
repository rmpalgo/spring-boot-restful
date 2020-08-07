package com.ronnelpalencia.springbootrestcrudpractice.entity;



import javax.persistence.*;


@Entity
public class Product {

    @Id
    private int id;
    private String productName;
    private int inventory;
    private double price;

    public Product() {
    }

    public Product(int id, String name, int inventory, double price) {
        this.id = id;
        this.productName = name;
        this.inventory = inventory;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
