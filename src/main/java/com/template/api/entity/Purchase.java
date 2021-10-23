package com.template.api.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="purchases")
public class Purchase {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="userId", referencedColumnName="id")
	private User user;
	
	@NotNull
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="itemId", referencedColumnName="id")	
	private Item item;
	
	@Column(name="creation_date")
	@CreationTimestamp
	private Date creationDate;
	@Column(name="update_date")
	@UpdateTimestamp
	private Date updateDate;
}