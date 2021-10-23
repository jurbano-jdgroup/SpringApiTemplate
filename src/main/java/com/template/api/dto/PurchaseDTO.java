package com.template.api.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PurchaseDTO {
	private Long id;
	@NotNull
	private Long userId;
	@NotNull
	private Long itemId;
	private Date creationDate;
}