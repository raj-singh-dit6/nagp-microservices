package com.nagp.msa.user.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagp.msa.user.dto.UserDto;
import com.nagp.msa.user.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	private final static Logger LOG = LoggerFactory.getLogger(UserService.class);

	
	@Autowired UserRepo userRepo;
	
	@Autowired ModelMapper modelMapper;

	@Override
	public UserDto getUser(Integer userId) {
		LOG.debug("inside UserServiceImpl.getUser method");
		return UserDto.toDto(modelMapper,userRepo.findById(userId).get());
	}

}
