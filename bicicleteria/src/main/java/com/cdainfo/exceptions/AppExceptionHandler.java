package com.cdainfo.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cdainfo.bicicleteria.repository.ErrorMessage;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value= {Exception.class})
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request){
		
		String errorMessageDescription = ex.getLocalizedMessage();
		
		if (errorMessageDescription == null) errorMessageDescription = ex.toString();
		
		ErrorMessage errorMessage= new ErrorMessage(new Date(), ex.getLocalizedMessage());
		
		return new ResponseEntity<>(
				errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(value= {NullPointerException.class})
	public ResponseEntity<Object> handleNullPointerException(NullPointerException ex, WebRequest request){
		
		String errorMessageDescription = ex.getLocalizedMessage();
		
		if (errorMessageDescription == null) errorMessageDescription = ex.toString();
		
		ErrorMessage errorMessage= new ErrorMessage(new Date(), ex.getLocalizedMessage());
		
		return new ResponseEntity<>(
				errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(value= {BicicletaServiceException.class})
	public ResponseEntity<Object> handleBicicletaServiceException(BicicletaServiceException ex, WebRequest request){
		
		String errorMessageDescription = ex.getLocalizedMessage();
		
		if (errorMessageDescription == null) errorMessageDescription = ex.toString();
		
		ErrorMessage errorMessage= new ErrorMessage(new Date(), ex.getLocalizedMessage());
		
		return new ResponseEntity<>(
				errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
}
