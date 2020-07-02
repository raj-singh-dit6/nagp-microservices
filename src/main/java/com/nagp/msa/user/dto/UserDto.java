package com.nagp.msa.user.dto;

import org.modelmapper.ModelMapper;

import com.nagp.msa.user.model.User;

public class UserDto {
	
	private String name;
	private Integer age;
	private String email;

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

	public static UserDto toDto(ModelMapper modelMapper, User user){
		return modelMapper.map(user, UserDto.class);
	}

	public static User toEntity(ModelMapper modelMapper, UserDto UserDto){
		return modelMapper.map(UserDto, User.class);
	}
}
