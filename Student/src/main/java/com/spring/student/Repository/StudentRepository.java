package com.spring.student.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.student.Model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {
	List<Student> findAllBySchoolId(Integer schoolId);
}
