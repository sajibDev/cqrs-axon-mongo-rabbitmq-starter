package com.example.cqrsaxon.handler;

import org.axonframework.eventhandling.EventHandler;
import com.example.cqrsaxon.event.ProductCreatedEvent;

public class ProductEventHandler {

    @EventHandler
    public void on(ProductCreatedEvent event) {
        // Handle event
    }
}