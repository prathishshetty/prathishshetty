package com.spring.student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.student.Model.Student;
import com.spring.student.Repository.StudentRepository;

@Service
public class StudentServiceImpl  {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void saveStdent(Student student) {
		studentRepository.save(student);
	}
	
	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}
	
	public List<Student> findAllStudentBySchool(Integer schoolId) {
		return studentRepository.findAllBySchoolId(schoolId);
	}
	
	

}
