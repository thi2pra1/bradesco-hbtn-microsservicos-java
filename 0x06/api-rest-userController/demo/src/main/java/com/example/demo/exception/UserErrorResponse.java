package com.example.demo.exception;

public class UserErrorResponse {

    private int status;
    private String message;

    // Default constructor
    public UserErrorResponse() {
    }

    // Constructor with parameters
    public UserErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    // Getters and Setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
