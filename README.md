# CQRS Axon Mongo RabbitMQ Starter

A ready-to-run Spring Boot CQRS/DDD service using Axon Framework, RabbitMQ (for distributed messaging), and MongoDB (for state storage)—**no Axon Server required**.

## Features

- CQRS pattern with Axon Framework
- RabbitMQ for command/event messaging (dockerized)
- MongoDB for product state (dockerized)
- QueryHandlers for product by ID and list all products
- REST API for create/list/get products

## Quick Start

### 1. Start Docker Services

```bash
docker-compose up -d
```

- MongoDB: [localhost:27017](mongodb://root:example@localhost:27017/)
- RabbitMQ: [localhost:5672](amqp://user:password@localhost:5672/)
- RabbitMQ UI: [http://localhost:15672](http://localhost:15672) (user/password)

### 2. Build and Run Spring Boot App

```bash
./mvnw spring-boot:run
```
or
```bash
mvn spring-boot:run
```

### 3. REST API

- **Create Product:** `POST /products`
  ```json
  { "name": "Test Product", "price": 99.99 }
  ```
- **Get by ID:** `GET /products/{id}`

- **List all:** `GET /products`

---

## CQRS Flow

- Commands → Aggregate → Events → EventHandler (MongoDB state)  
- Queries → QueryHandler → MongoDB

---

## Extending

Add more commands, events, queries, and handlers for more functionality.

---

## License

MIT