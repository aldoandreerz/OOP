package com.juaracoding.oop;

public class Product {

    int productId;
    String productName;
    double price;
    String description;
    String imageUrl;

    public Product(int productId, String productName, double price, String description, String imageUrl) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    //addCart
    public void detailProduct() {
        System.out.println(productId);
        System.out.println(productName);
        System.out.println(price);
        System.out.println(description);
        System.out.println(imageUrl);
    }

}

