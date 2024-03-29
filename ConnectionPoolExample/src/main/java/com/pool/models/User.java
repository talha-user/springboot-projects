package com.pool.models;

public class User {
	private int id;
	private String name;
	private String status;
	
	public User(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", status=" + status + "]";
	}


	

}
