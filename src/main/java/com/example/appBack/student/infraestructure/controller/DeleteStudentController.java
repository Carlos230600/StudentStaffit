package com.example.appBack.student.infraestructure.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class DeleteStudentController {

    private DeleteByStudentPort deleteByStudentPort;

    @DeleteMapping("/deletestudent/{id}")
    public SimpleStudentOutputDTO create(@RequestBody StudentInputDTO studentInputDTO) throws Exception{
        //Student student = studentInputDTO.student(new SaveStudent());
        Student student = new Student(studentInputDTO);
        Student createdStudent = createStudentPort.create(student);
        return new SimpleStudentOutputDTO(createdStudent);
    }


}
