package com.spring.school.Servicve;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.school.Client.StudentClient;
import com.spring.school.Model.FullSchoolResponse;
import com.spring.school.Model.School;
import com.spring.school.Repository.SchoolRepository;

@Service
public class SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	@Autowired
	private StudentClient client;
	
	public void saveSchool(School school) {
		schoolRepository.save(school);
	}
	
	public List<School> findAllSchool() {
		return schoolRepository.findAll();
	}
	
	public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(
                        School.builder()
                                .schoolName("NOT_FOUND")
                                .schoolEmail("NOT_FOUND")
                                .build()
                );
        var students = client.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getSchoolName())
                .email(school.getSchoolEmail())
                .students(students)
                .build();
    }
}
