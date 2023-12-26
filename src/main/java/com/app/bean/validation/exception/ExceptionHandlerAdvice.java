package com.app.bean.validation.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

@Slf4j
@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(MissingRequestHeaderException.class)
    public String missingRequestHeaderException(MissingRequestHeaderException exception) {
        log.error("Error occurred : {}", exception.getMessage());
        return exception.getMessage();
    }

    @ExceptionHandler(HandlerMethodValidationException.class)
    public String handlerMethodValidationException(HandlerMethodValidationException exception) {
        log.error("Error occurred : {}", exception.getMessage());
        return exception.getMessage();
    }
}
