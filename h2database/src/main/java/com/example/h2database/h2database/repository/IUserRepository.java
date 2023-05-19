package com.example.h2database.h2database.repository;

import com.example.h2database.h2database.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends CrudRepository<Users, Long> {

    public List<Users> findByTitle(String title);
}
