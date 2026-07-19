package com.dormproject.smartDormProject.entity;

public class ResponseBox {
    private String message;
    private Integer statusCode;
    
    public ResponseBox(String message, Integer statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }
    public ResponseBox() {
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Integer getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    @Override
    public String toString() {
        return "ResponseBox {message=" + message + ", statusCode=" + statusCode + "}";
    }

    
}
