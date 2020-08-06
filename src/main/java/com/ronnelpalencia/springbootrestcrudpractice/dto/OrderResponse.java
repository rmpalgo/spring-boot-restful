package com.ronnelpalencia.springbootrestcrudpractice.dto;

public class OrderResponse {

    private String name;
    private String productName;
    private int price;

    public OrderResponse() {
    }

    public OrderResponse(String name, String productName, int price) {
        this.name = name;
        this.productName = productName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
