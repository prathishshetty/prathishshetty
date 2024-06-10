package com.spring.school.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "School")
public class School {
	
	@Id
	private Integer id;
	private String schoolName;
	private String schoolEmail;
	
}
