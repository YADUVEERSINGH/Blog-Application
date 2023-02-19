package com.backend.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.blog.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
