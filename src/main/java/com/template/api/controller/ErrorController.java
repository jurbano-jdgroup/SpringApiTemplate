package com.template.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.template.api.dto.ResponseDTO;

public class ErrorController {
	private static Logger logger = LoggerFactory.getLogger(ErrorController.class);
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public ResponseDTO handleValidationExceptions(Exception ex) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.getError().setMessError(ex.getMessage());
		responseDTO.getError().setUuidError(generateUUID(ex));
		return responseDTO;
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseDTO handleJSONError(HttpMessageNotReadableException ex) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.getError().setMessError(ex.getMessage());
		responseDTO.getError().setUuidError(generateUUID(ex));
		return responseDTO;
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseDTO handleValidationExceptions(MethodArgumentNotValidException ex) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.getError().setMessError(ex.getMessage());
		responseDTO.getError().setUuidError(generateUUID(ex));
		return responseDTO;
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(BindException.class)
	public ResponseDTO handleValidationExceptions(BindException ex) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.getError().setMessError(ex.getMessage());
		responseDTO.getError().setUuidError(generateUUID(ex));
		return responseDTO;
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MissingRequestHeaderException.class)
	public ResponseDTO handleValidationExceptions(MissingRequestHeaderException ex) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.getError().setMessError(ex.getMessage());
		responseDTO.getError().setUuidError(generateUUID(ex));
		return responseDTO;
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseDTO handleValidationExceptions(MethodArgumentTypeMismatchException ex) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.getError().setMessError(ex.getMessage());
		responseDTO.getError().setUuidError(generateUUID(ex));
		return responseDTO;
	}
	
	public String generateUUID(Object exception) {
		String uuidError = java.util.UUID.randomUUID().toString();
		logger.info(uuidError, exception);
		return uuidError;
	}
}