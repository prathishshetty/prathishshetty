package com.spring.school.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.spring.school.Model.FullSchoolResponse;
import com.spring.school.Model.School;
import com.spring.school.Servicve.SchoolService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("/api/v1/school")
public class SchoolController {

	@Autowired
	private SchoolService schoolService;

	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void addSchool(@RequestBody School school) {
		schoolService.saveSchool(school);
	}

	@GetMapping("/getSchool")
	public ResponseEntity<List<School>> findAllSchool() {
		return ResponseEntity.ok(schoolService.findAllSchool());
	} 

	@GetMapping("/with-students/{school-id}")
	public ResponseEntity<FullSchoolResponse> findAllSchools(
			@PathVariable("school-id") Integer schoolId
			) {
		return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
	}

}
