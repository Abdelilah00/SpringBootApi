////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.configuration.Exception;

import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

/*
@Order(Ordered.HIGHEST_PRECEDENCE)
*/
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleHttpMessageNotWritable(HttpMessageNotWritableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        try {
            if (ex.getCause() instanceof JsonMappingException && ex.getCause().getCause() instanceof EntityNotFoundException) {
                ApiError apiError = new ApiError();
                apiError.setStatus(INTERNAL_SERVER_ERROR);
                apiError.setMessage(ex.getCause().getCause().getMessage());
                return buildResponseEntity(apiError);
            }
        } catch (Exception exception) {
            return super.handleHttpMessageNotWritable(ex, headers, status, request);
        }
        return null;
    }

  /*  @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity<Object> handleException(EntityNotFoundException ex) {
        ApiError apiError = new ApiError();
        apiError.setStatus(NOT_FOUND);
        apiError.setMessage("Entity Not found");
        return buildResponseEntity(apiError);
    }*/

    @ExceptionHandler(UserFriendlyException.class)
    protected ResponseEntity<Object> handleException(UserFriendlyException ex) {
        ApiError apiError = new ApiError();
        apiError.setStatus(EXPECTATION_FAILED);
        apiError.setMessage(ex.getMessage());
        return buildResponseEntity(apiError);
    }

    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}
