package com.damithn.studentservice.controller;

import com.damithn.studentservice.model.domain.StudentDTO;
import com.damithn.studentservice.model.entity.StudentEntity;
import com.damithn.studentservice.repository.StudentRepository;
import com.damithn.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/student")
    public List<StudentEntity> getAllStudents() throws Exception {
        return studentRepository.findAll();
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable(name = "studentId") Integer studentId) throws Exception {
        return ResponseEntity.ok().body(studentService.getStudentsById(studentId));
    }
}
