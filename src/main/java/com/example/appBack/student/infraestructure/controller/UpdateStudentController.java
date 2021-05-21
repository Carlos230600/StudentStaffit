package com.example.appBack.student.infraestructure.controller;

import com.example.appBack.student.application.port.UpdateStudentPort;
import com.example.appBack.student.domain.Student;
import com.example.appBack.student.domain.noDatabase.SaveStudent;
import com.example.appBack.student.infraestructure.controller.dto.StudentInputDTO;
import com.example.appBack.student.infraestructure.controller.dto.StudentOutputDTO;
import com.example.appBack.student.infraestructure.repository.port.FindStudentPort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UpdateStudentController {

    private final UpdateStudentPort updateStudentPort;
    private final FindStudentPort findStudentPort;


/*
    @PutMapping("/api/student/{id}")
    public StudentOutputDTO update(@RequestBody StudentInputDTO studentInputDto, @PathVariable("id") String id) throws Exception{
        Student student = findStudentPort.findById(id);
        SaveStudent saveEstudiante = studentInputDto.student(new SaveStudent(student));
        Student updatedStudent = updateStudentPort.update(id, saveEstudiante);
        return new StudentOutputDTO(updatedStudent);
    }
*/

}
