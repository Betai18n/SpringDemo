package com.springdemo.service;

import com.springdemo.domain.User;

public interface UserService {
    User selectUserById(Integer userId);  
}