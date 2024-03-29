package com.jp;

import java.io.Serializable;

public class SerializableStudent implements Serializable {
	
	String name;
	String email;
	int rollNo;
	public SerializableStudent(String name, String email, int rollNo) {
		super();
		this.name = name;
		this.email = email;
		this.rollNo = rollNo;
	}
	public SerializableStudent() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "SerializableStudent [name=" + name + ", email=" + email + ", rollNo=" + rollNo + "]";
	}
	public void display() {
		System.out.println("from student object");
	}
	

}
