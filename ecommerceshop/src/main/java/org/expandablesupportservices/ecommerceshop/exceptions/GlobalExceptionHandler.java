package org.expandablesupportservices.ecommerceshop.exceptions;

import org.expandablesupportservices.ecommerceshop.error.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> UnknownException(Exception ex , WebRequest webRequest){
			
		ErrorResponse errorResponse=new ErrorResponse( 
				HttpStatus.INTERNAL_SERVER_ERROR.value(), 
				HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
				ex.getMessage(),
				webRequest.getDescription(false));
	
		return new ResponseEntity<>(errorResponse,	HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

	
	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<?> NoDataFoundException(NoDataFoundException ex){
	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		
	}
	
	

}
