package com.example.customer.exceptionhandlings;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@RestController
public class ExceptionHandlingObject extends ResponseEntityExceptionHandler {
		@ExceptionHandler
		public ResponseEntity<ExceptionObject> exceptionHandler(Exception ex,WebRequest request){
			ExceptionObject eo = new ExceptionObject(new Date(),ex.getMessage(),request.getDescription(false));
			return new ResponseEntity<>(eo,HttpStatus.NOT_FOUND);
		}
		
		
		@ExceptionHandler(CustomerNotFound.class)
		public ResponseEntity<ExceptionObject> UserexceptionHandler(CustomerNotFound ex,WebRequest request){
			ExceptionObject eo = new ExceptionObject(new Date(),ex.getMessage(),request.getDescription(false));
			return new ResponseEntity<>(eo,HttpStatus.NOT_FOUND);
		}
}
