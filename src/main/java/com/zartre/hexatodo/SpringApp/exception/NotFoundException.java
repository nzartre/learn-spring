package com.zartre.hexatodo.SpringApp.exception;

public class NotFoundException extends Exception {
    public NotFoundException(String msg, Throwable err) {
        super(msg, err);
    }
}
