package com.application.library.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="publishers")
public class Publisher {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;
	  
	  @Column(name="name", length=50, nullable=false, unique=true)
	  private String name;
	  
	  @ManyToMany(mappedBy="publishers")
	  private  Set<Book> books = new HashSet<Book>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Publisher() {
		super();
	}
	  
	  

}
