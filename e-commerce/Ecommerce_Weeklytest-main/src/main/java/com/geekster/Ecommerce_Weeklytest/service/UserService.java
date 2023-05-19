package com.geekster.Ecommerce_Weeklytest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.Ecommerce_Weeklytest.model.User;
import com.geekster.Ecommerce_Weeklytest.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo UserRepository;

    public User getUserById(Integer userId) {
        User user=UserRepository.findById(userId).get();
        return user;
    }

}
