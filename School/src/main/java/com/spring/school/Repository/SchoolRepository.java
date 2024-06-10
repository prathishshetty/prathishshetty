package com.spring.school.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.school.Model.School;

@Repository
public interface SchoolRepository extends MongoRepository<School, Integer> {

}
