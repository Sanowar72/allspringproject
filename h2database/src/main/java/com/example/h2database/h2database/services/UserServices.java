package com.example.h2database.h2database.services;

import com.example.h2database.h2database.model.Users;
import com.example.h2database.h2database.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    IUserRepository userRepository;

    public Iterable<Users> getll() {
       Iterable<Users> user= userRepository.findAll();
       return user;
    }

    public String addusers(List<Users> users) {
        Iterable<Users> addusers= userRepository.saveAll(users);
        if(addusers!=null){
            return "users Added Successfully";
        }
        return "not added";
    }

    public String deletebyid(Long id) {
        userRepository.deleteById(id);
        return "Successfully deleted";
    }

    public Optional<Users> userbyid(Long id) {
        return userRepository.findById(id);
    }

    public List<Users> findbytitle(String title) {
        return userRepository.findByTitle(title);
    }
}
