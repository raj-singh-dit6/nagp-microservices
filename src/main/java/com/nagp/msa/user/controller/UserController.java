package com.nagp.msa.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.msa.user.dto.UserDto;
import com.nagp.msa.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private final static Logger LOG = LoggerFactory.getLogger(UserController.class);

	@Autowired UserService userService;
	
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getUser(@PathVariable Integer userId) {
		LOG.debug("inside UserController.getUser method");
		return new ResponseEntity<>(userService.getUser(userId), HttpStatus.OK);
	}

}
