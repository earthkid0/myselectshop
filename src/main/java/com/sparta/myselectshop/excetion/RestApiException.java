package com.sparta.myselectshop.excetion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Getter
@AllArgsConstructor
public class RestApiException {
    private String errorMessage;
    private int statusCode;

}
