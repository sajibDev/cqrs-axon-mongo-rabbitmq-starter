package com.example.cqrsaxon.controller;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final CommandGateway commandGateway;
    private final QueryGateway queryGateway;

    public ProductController(CommandGateway commandGateway, QueryGateway queryGateway) {
        this.commandGateway = commandGateway;
        this.queryGateway = queryGateway;
    }

    @PostMapping
    public void createProduct(@RequestBody CreateProductCommand command) {
        commandGateway.send(command);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {
        return queryGateway.query(new FindProductQuery(id), ResponseTypes.instanceOf(Product.class)).join();
    }

    @GetMapping
    public List<Product> listProducts() {
        return queryGateway.query(new ListProductsQuery(), ResponseTypes.multipleInstancesOf(Product.class)).join();
    }
}