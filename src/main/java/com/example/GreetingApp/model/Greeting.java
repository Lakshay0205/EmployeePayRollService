package com.example.GreetingApp.model;

import javax.annotation.processing.Generated;

import jakarta.persistence.*;

@Entity
public class Greeting {

    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;

    // Default constructor
    public Greeting() {}

    // Constructor
    public Greeting(String message) {
        this.message = message;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}