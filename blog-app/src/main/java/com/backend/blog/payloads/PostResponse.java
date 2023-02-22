package com.backend.blog.payloads;

import java.util.List;

import org.springframework.data.domain.jaxb.SpringDataJaxb.PageDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostResponse {
	
	private List<PostDto> content;
	private int pageNumber;
	private int pageSize;
	private int totalPages;
	private long totalElemnets;
	private Boolean lastPage;

}
