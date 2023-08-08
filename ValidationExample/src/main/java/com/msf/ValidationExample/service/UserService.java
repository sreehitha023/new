package com.msf.ValidationExample.service;

import com.msf.ValidationExample.dto.UserRequest;
import com.msf.ValidationExample.entity.User;
import com.msf.ValidationExample.exception.UserNotFoundException;

import java.util.List;

public interface UserService {
    User saveUser(UserRequest userRequest);
    List<User> getALlUsers();
    User getUser(int id) throws UserNotFoundException;
}
