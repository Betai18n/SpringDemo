package com.springdemo.service;

import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired; 
import org.junit.Test;  

import org.junit.Test;

import com.springdemo.baseTest.SpringTestCase;
import com.springdemo.domain.User;
import com.springdemo.service.UserService;

public class UserServiceTest extends SpringTestCase {

    @Autowired  
    private UserService userService; 

    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }  
}
