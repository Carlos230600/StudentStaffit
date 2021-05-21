package com.example.appBack.student.infraestructure.controller;

import com.example.appBack.student.application.port.CreateStudentPort;
import com.example.appBack.student.domain.Student;
import com.example.appBack.student.domain.StudentJPA;
import com.example.appBack.student.infraestructure.controller.dto.StudentInputDTO;
import com.example.appBack.student.infraestructure.controller.dto.StudentOutputDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CreateStudentController {

    private final CreateStudentPort createStudentPort;

    @PostMapping("/createstudent")
    public StudentOutputDTO create(@RequestBody StudentJPA studentJPA) throws Exception{
        Student student = new Student(studentJPA);
        Student createdStudent = createStudentPort.create(student);
        return new StudentOutputDTO(createdStudent);
    }


}
