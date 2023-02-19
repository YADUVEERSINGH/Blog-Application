package com.backend.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.blog.entities.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
