package com.damithn.studentservice.repository;

import com.damithn.studentservice.model.domain.StudentDTO;
import com.damithn.studentservice.model.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<StudentEntity,Integer> {
}
