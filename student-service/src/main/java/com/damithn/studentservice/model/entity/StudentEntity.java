package com.damithn.studentservice.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Students")
public class StudentEntity {

    @Id
    private long id;

    private Integer studentId;

    private String studentName;

    private String age;
}
