package com.example.appBack.student.infraestructure.repository.port;

import com.example.appBack.student.domain.Student;
import com.example.appBack.student.domain.StudentJPA;
import com.example.appBack.student.infraestructure.controller.dto.StudentInputDTO;
import com.example.appBack.student.infraestructure.controller.dto.StudentOutputDTO;

import java.util.List;

public interface FindStudentPort {
    List<StudentJPA> findAll() throws Exception;
    StudentOutputDTO findById(String idStudent) throws Exception;

}
