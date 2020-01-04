package com.seenu.Rest_Simple_Demo.student;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
	
	//@JsonIgnore   // this is useful for excluding the fields of student class ->but, not suggestible y because its a static filtering
	public Integer id;
	public String name;
	public String address;
	
	public Student() {
	}
	
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
