package com.example.cqrsaxon.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
    @Id
    private String productId;
    private String name;
    private double price;

    // Getters and Setters
}