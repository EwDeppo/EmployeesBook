package com.prosky.employeesBook.exception.handler;

import com.prosky.employeesBook.exception.EmployeeBookException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdviceExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public String handleException(Exception exception) {
        return exception.getMessage();
    }

    @ExceptionHandler(value = {EmployeeBookException.class})
    public String handleException(EmployeeBookException exception) {
        return exception.getMessage();
    }
}
