package com.example.cqrsaxon.repository;

import com.example.cqrsaxon.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}