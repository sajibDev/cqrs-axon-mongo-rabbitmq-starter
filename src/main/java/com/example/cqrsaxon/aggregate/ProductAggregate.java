package com.example.cqrsaxon.aggregate;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventhandling.EventSourcingHandler;
import org.axonframework.modelling.command.Aggregate;
import org.axonframework.modelling.command.AggregateIdentifier;

@Aggregate
public class ProductAggregate {

    @AggregateIdentifier
    private String productId;

    @CommandHandler
    public ProductAggregate(ProductCreateCommand command) {
        // Handle command
    }

    @EventSourcingHandler
    public void on(ProductCreatedEvent event) {
        this.productId = event.getProductId();
        // Handle event
    }
}