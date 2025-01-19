package com.prosky.employeesBook.exception;

public class EmployeeBookException extends RuntimeException {
    public EmployeeBookException() {
    }

    public EmployeeBookException(String message) {
        super(message);
    }

    public EmployeeBookException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeBookException(Throwable cause) {
        super(cause);
    }

    public EmployeeBookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
