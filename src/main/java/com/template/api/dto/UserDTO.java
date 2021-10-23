package com.template.api.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
	private Long id;
	private String name;
	private String surname;
	private Date creationDate;
}