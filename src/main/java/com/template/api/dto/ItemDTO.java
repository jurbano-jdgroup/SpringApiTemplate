package com.template.api.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ItemDTO {
	private Long id;
	private String name;
	private String description;
	private Date creationDate;
}