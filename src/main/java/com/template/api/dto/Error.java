package com.template.api.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Error {
	public Error() {
		this.fecha = new Date();
	}
	
	private String messError;
	private Date fecha;
	private String uuidError;
}