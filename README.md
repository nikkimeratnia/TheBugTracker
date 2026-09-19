# TheBugTracker

A web-based bug tracking application built with Spring Boot.

## Overview

TheBugTracker is a web application for managing bug reports and associating them with users.

The project is being developed as a hands-on Spring Boot project to practice dependency injection, layered architecture, Spring Data JPA, Hibernate, entity relationships, HTTP request handling, and PostgreSQL database integration.

## Technologies

- Java 25
- Spring Boot
- Spring Framework
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Thymeleaf
- HTML
- Git & GitHub
- IntelliJ IDEA

## Current Features

- User and Bug entities
- PostgreSQL database integration
- JPA/Hibernate persistence
- User-to-Bug relationship
- Repository layer using Spring Data JPA
- Service layer
- Controller layer
- Constructor-based Dependency Injection
- HTTP request handling with Spring MVC
- Bug listing endpoint
- Sign-up page
- Basic HTML web pages
- Environment-based database password configuration

## Project Structure

The application follows a simple layered architecture:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
JPA / Hibernate
    ↓
PostgreSQL