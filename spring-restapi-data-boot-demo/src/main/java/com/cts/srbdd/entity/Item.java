package com.cts.srbdd.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	Long itemId;
	
	@Column(name="itemName",nullable=false)
	@NotBlank(message="name cannot be blank")
	String name;
	
	@Column(name="itemPrice")
	@NotNull(message="price is mandatory field.")
	Double price;
	
	@Column(name="pkgDate",nullable=false)
	@DateTimeFormat(iso = ISO.DATE)
	@NotNull(message = "Packaging Date is a mandatory field")
	@PastOrPresent(message = "Packaging Date can not be a future date")
	LocalDate packageDate;

	public Item(Long itemId, @NotBlank(message = "name cannot be blank") String name,
			@NotNull(message = "price is mandatory field.") Double price,
			@NotNull(message = "Packaging Date is a mandatory field") @PastOrPresent(message = "Packaging Date can not be a future date") LocalDate packageDate) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.packageDate = packageDate;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getPackageDate() {
		return packageDate;
	}

	public void setPackageDate(LocalDate packageDate) {
		this.packageDate = packageDate;
	}
	
     
}
