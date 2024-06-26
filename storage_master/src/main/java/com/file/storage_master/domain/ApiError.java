package com.file.storage_master.domain;

import org.springframework.http.HttpStatus;

public class ApiError {

    private HttpStatus status;
    private String message;

    public ApiError() {}

    public ApiError(HttpStatus status) {
        this.message = "Technical Error Occurred";
        this.status = status;
    }

    public ApiError(HttpStatus status, Throwable ex) {
        this.status = status;
        this.message = ex.getMessage();
    }

    public HttpStatus getStatus() { return status; }

    public String getMessage() { return message; }
}
