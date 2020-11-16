package com.bspdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bspdev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
