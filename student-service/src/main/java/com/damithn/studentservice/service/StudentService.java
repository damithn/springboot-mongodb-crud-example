package com.damithn.studentservice.service;

import com.damithn.studentservice.model.domain.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
//    List<StudentDTO> getStudents(StudentDTO studentDTO) throws Exception;

    StudentDTO getStudentsById(Integer studentId);
}
