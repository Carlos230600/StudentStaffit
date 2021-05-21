package com.example.appBack.student.infraestructure.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CreateStudentController {

    private final CreateStudentController createStudentController;

    @PostMapping("/createstudent")
    public Student create(@RequestBody StudentInputDTO studentInputDTO) throws Exception{
        //Student student = studentInputDTO.student(new SaveStudent());
        Student student = new Student(studentInputDTO);
        return student;
    }

}
