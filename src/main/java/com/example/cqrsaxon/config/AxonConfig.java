package com.example.cqrsaxon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.axonframework.config.Configuration;
import org.axonframework.eventhandling.EventBus;
import org.axonframework.spring.messaging.event.SpringEventBus;

@Configuration
public class AxonConfig {
    @Bean
    public EventBus eventBus() {
        return new SpringEventBus();
    }

    // RabbitMQ configuration here
}