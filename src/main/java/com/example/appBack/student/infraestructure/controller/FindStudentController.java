package com.example.appBack.student.infraestructure.controller;

import com.example.appBack.student.domain.Student;
import com.example.appBack.student.domain.StudentJPA;
import com.example.appBack.student.infraestructure.controller.dto.StudentOutputDTO;
import com.example.appBack.student.infraestructure.repository.port.FindStudentPort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
public class FindStudentController {

    private FindStudentPort findStudentPort;

    @GetMapping("/findStudent/{id}")
    public StudentOutputDTO getStudentById(@PathVariable String id) throws Exception
    {
        return findStudentPort.findById(id);
    }

    @GetMapping("/findAllStudent")
    public List<StudentJPA> getAllStudents(){
        try {
            return findStudentPort.findAll();
        }
        catch (Exception e)
        {
            return null;
        }
    }

}

