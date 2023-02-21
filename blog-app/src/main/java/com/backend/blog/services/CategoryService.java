package com.backend.blog.services;

import java.util.List;

import com.backend.blog.payloads.CategoryDto;

public interface CategoryService {
	
//	create
	CategoryDto createCategory(CategoryDto categoryDto);
	
//	update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
//	get
	CategoryDto getCategory(Integer categoryId);
	
//	delete
	void deleteCategory(Integer categoryId);
	
//	get all
	List<CategoryDto> getAllCategory();
}
