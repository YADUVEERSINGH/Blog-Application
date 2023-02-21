package com.backend.blog.services;

import java.util.List;

import com.backend.blog.entities.Post;
import com.backend.blog.payloads.PostDto;

public interface PostService {

//	create
	  PostDto createPost(PostDto postDto, Integer postId, Integer categoryId);
	  
//	  update
	  PostDto updatePost(PostDto postDto, Integer postId);
	  
//	  delete
	  void deletePost(Integer postId);
	  
//	  get all posts
	  List<PostDto> getAllPost();
	  
//	  get Single post
	  PostDto getPostById(Integer postId);
	  
//	  get all post by category
	  List<PostDto> getPostsByCategory(Integer categoryId);
	
//	  get all post by user
	  List<PostDto> getPostByUser(Integer userId);
	  
//	  search posts
	  List<PostDto> searchPosts(String keyword);
}
