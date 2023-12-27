package com.app.bean.validation.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

/**
 * @author Ashwani Kumar
 * Created on 27/12/23.
 */
@Slf4j
@RestControllerAdvice
public class ExceptionHandlerAdvice {

    /*
     * If header is missed in the request. This handler will execute.
     * */
    @ExceptionHandler(MissingRequestHeaderException.class)
    public String handleMissingRequestHeaderException(MissingRequestHeaderException exception) {
        log.error("Error occurred : {}", exception.getMessage());
        return exception.getMessage();
    }

    /*
     * If Pattern Validation failed.
     * */
    @ExceptionHandler(HandlerMethodValidationException.class)
    public String handlerMethodValidationException(HandlerMethodValidationException exception) {
        log.error("Error occurred : {}", exception.getMessage());
        return exception.getMessage();
    }

    /*
     * If jakarta validations like NotNull, NotEmpty fails on any field of Cart
     * */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        log.error("Error occurred : {}", exception.getMessage());
        return exception.getMessage();
    }
}
