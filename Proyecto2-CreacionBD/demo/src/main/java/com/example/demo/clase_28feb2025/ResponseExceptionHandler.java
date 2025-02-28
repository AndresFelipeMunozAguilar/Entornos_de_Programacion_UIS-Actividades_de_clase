package com.example.demo.clase_28feb2025;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.slf4j.Logger;
import java.util.Date;

public class ResponseExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(ResponseExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> manejarTodasExcepciones(Exception e) {

        ExceptionResponse exceptionResponse = new ExceptionResponse(
                new Date(),
                "Ocurrió un error",
                e.getMessage());

        return new ResponseEntity<>(
                exceptionResponse,
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
