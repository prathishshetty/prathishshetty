package com.spring.school.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.school.Model.Student;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {
	
	 @GetMapping("/school/{school-id}")
	public
	    List<Student> findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId);


}
