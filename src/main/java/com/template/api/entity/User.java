package com.template.api.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String name;
	@NotBlank
	private String surname;
	
	@CreationTimestamp
	private Date creationDate;
	@UpdateTimestamp
	private Date updateDate;
}