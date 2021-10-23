package com.template.api.dto;

import lombok.Data;

@Data
public class ResponseDTO {
	private Object response;
	private Error error;

	public ResponseDTO() {
		error = new Error();
	}
}