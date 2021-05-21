package com.example.appBack.student.infraestructure.controller;

import com.example.appBack.student.application.port.DeleteByStudentPort;
import com.example.appBack.student.domain.Student;
import com.example.appBack.student.infraestructure.controller.dto.StudentInputDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class DeleteStudentController {

    private DeleteByStudentPort deleteByStudentPort;

    @DeleteMapping("/deletestudent/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") String idEstudiante) throws Exception{
        deleteByStudentPort.deleteById(idEstudiante);
        return new ResponseEntity<>("Student Deleted", HttpStatus.OK);
    }



}
