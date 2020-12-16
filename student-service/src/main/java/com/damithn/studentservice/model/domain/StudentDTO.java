package com.damithn.studentservice.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    @Id
    private long id;

    @NotBlank(message = "Id is mandatory")
    private Integer studentId;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 10)
    private String studentName;

    private String age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
