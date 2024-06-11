package com.diarradev.userandadmin.service;

import com.diarradev.userandadmin.dto.UserDto;
import com.diarradev.userandadmin.model.User;

public interface UserService {

	User save(UserDto userDto);
}
