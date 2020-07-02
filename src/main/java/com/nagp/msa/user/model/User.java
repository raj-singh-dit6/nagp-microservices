package com.nagp.msa.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="muser")
@NamedQuery(name="User.findAll", query="SELECT a from User a")
public class User {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id", unique=true)
	private Integer userId;
	@NotNull 
	private String name;
	private Integer age;
	private String email;
	

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
