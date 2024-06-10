package com.spring.school.Model;

import java.util.List;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {
	
	private String name;
	private String email;
	List<Student> students;

}
