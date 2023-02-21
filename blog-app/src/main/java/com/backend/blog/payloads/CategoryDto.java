package com.backend.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	private Integer categoryId;
	
	@NotBlank
	@Size(min=4, message = "min length sdould be 4 char")
	private String categoryTitle;
	
	@NotBlank
	@Size(min=10, message = "min length sdould be 10 char")
	private String categoryDescription;

}
