package com.damithn.studentservice.transformer;

import com.damithn.studentservice.model.domain.StudentDTO;
import com.damithn.studentservice.model.entity.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StudentTransformer {
    public StudentEntity studentDTOToEntity(StudentDTO studentDTO) {
        StudentEntity studentEntity = new StudentEntity();
        return studentEntity;
    }

    public StudentDTO studentEntityToStudentDTO(Optional<StudentEntity> studentEntity){
        StudentDTO studentDTO =new StudentDTO();
        return studentDTO;
    }

}
