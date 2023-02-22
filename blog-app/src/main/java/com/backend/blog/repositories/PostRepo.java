package com.backend.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backend.blog.entities.Category;
import com.backend.blog.entities.Post;
import com.backend.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
//	we can create custom method using jpa:=  already defined in jpa documentataion
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	List<Post> findByTitleContaining(String title);

	
	//	this method is implemented using query(sql)
	@Query("select p from Post p where p.title like :key")
	List<Post> findByTitle(@Param("key") String title);
	
}
