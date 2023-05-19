package com.geekster.Instagram.repository;

import com.geekster.Instagram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<Post,Long> {
}
