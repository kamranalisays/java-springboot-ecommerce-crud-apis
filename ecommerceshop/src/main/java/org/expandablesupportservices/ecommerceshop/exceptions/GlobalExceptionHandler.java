package org.expandablesupportservices.ecommerceshop.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<?> NoDataFoundException(NoDataFoundException ex){
	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		
	}

}
