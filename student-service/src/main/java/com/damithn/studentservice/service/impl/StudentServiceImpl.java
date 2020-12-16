package com.damithn.studentservice.service.impl;

import com.damithn.studentservice.model.domain.StudentDTO;
import com.damithn.studentservice.model.entity.StudentEntity;
import com.damithn.studentservice.repository.StudentRepository;
import com.damithn.studentservice.service.StudentService;
import com.damithn.studentservice.transformer.StudentTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentTransformer studentTransformer;

//    @Override
//    public List<StudentDTO> getStudents(StudentDTO studentDTO) throws Exception {
//        if (studentDTO == null) {
//            throw new Exception();
//        }
//        List<StudentEntity> studentEntities = studentRepository.findAll();
//
//        List<StudentDTO> studentDTOS = studentTransformer.studentEntityToStudentDTO(studentEntities);
//
//        return studentDTOS;
//    }

    @Override
    public StudentDTO getStudentsById(Integer studentId) {
        Optional<StudentEntity> studentEntity = studentRepository.findById(studentId);

        StudentDTO studentDTO = studentTransformer.studentEntityToStudentDTO(studentEntity);

        return studentDTO;
    }


}
