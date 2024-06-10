package com.spring.student.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Student {
	
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private String emailId; 	
	private Integer schoolId;	

}
