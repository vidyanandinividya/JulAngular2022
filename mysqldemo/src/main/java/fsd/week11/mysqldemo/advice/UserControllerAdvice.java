package fsd.week11.mysqldemo.advice;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import fsd.week11.mysqldemo.exception.DuplicateEmailException;
import fsd.week11.mysqldemo.exception.EmptyInputException;

@RestControllerAdvice
public class UserControllerAdvice extends ResponseEntityExceptionHandler{
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInput(EmptyInputException ex)
	{
		return new ResponseEntity<String>("Input Field is Empty Please look into this",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(DuplicateEmailException.class)
	public ResponseEntity<String> handleDuplicateEmail(DuplicateEmailException ex)
	{
		return new ResponseEntity<String>("Email id Exists Please look into this",HttpStatus.BAD_REQUEST);
	}
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		return new ResponseEntity<Object>("Please change Http method type",HttpStatus.NOT_FOUND);
	}
	

}
