package com.diarradev.userandadmin.service;

import com.diarradev.userandadmin.dto.UserDto;
import com.diarradev.userandadmin.model.User;
import com.diarradev.userandadmin.repositories.UserRepository;

public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	@Override
	public User save(UserDto userDto) {
		User user = new User(userDto.getEmail(), userDto.getPassword(), userDto.getRole(), userDto.getFullname());
		return userRepository.save(user);
	}

}
