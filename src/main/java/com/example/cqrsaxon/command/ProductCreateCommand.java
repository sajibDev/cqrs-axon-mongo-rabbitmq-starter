package com.example.cqrsaxon.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateCommand {
    @TargetAggregateIdentifier
    private String productId;
    private String name;
    private double price;
}