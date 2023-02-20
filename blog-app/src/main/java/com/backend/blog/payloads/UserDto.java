package com.backend.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	/* We add only those fields which are taken from user */
	private int id;
	
	@NotEmpty
	@Size(min=4, message="Username must be min of 4 characters !!")
	private String name;
	
	@Email(message = "Email address is not valid")
	private String email;
	
	@NotEmpty
	@Size(min=3, max=10, message="Password should be min of 3 chars and max 10 chars")
	private String password;
	
	@NotEmpty
	private String about;
}
