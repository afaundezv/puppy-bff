package com.mobdev.afaundez.puppybff.infrastructure;

import com.mobdev.afaundez.puppybff.domain.exceptions.PuppyError;
import feign.FeignException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice(annotations = RestController.class)
public class PuppyControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<PuppyError> CatchFeignException(FeignException e) {
        PuppyError puppyError = new PuppyError("error", "Not exist this breed in our repository... Sorry bro", e.status());
        return new ResponseEntity<>(puppyError, HttpStatus.NOT_FOUND);
    }
}
