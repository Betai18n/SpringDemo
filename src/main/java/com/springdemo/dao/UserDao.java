package com.springdemo.dao;

import com.springdemo.domain.User;

public interface UserDao {

    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);  

}
