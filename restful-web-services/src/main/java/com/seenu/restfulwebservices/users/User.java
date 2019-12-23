package com.seenu.restfulwebservices.users;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

// here ApiModel is the customizing User.class Description
@ApiModel("*****ITS ALL ABOUT DESCRIPTION OF USER*****")
public class User {
	private Integer id;
	
	//ApiModelProperty is only applicable for user variables only
	@ApiModelProperty(notes="kanisham rendu accharalu aina kottu")
	// here @size and @past Annotations only for validations
	@Size(min=2,message="name should have atleast 2 letters")
	private String name;
	
	@ApiModelProperty(notes="puttina roju kaccchithanga mundhudai undali")
	@Past
	private Date date;
	
	public User() {
	}
	
	public User(Integer id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
