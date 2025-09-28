package com.example.cqrsaxon.handler;

import org.axonframework.queryhandling.QueryHandler;
import com.example.cqrsaxon.query.FindProductQuery;
import com.example.cqrsaxon.query.ListProductsQuery;

public class ProductQueryHandler {

    @QueryHandler
    public Product handle(FindProductQuery query) {
        // Handle query
        return null;
    }

    @QueryHandler
    public List<Product> handle(ListProductsQuery query) {
        // Handle query
        return new ArrayList<>();
    }
}