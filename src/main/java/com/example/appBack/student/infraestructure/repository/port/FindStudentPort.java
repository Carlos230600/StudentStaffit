package com.example.appBack.student.infraestructure.repository.port;

import com.example.appBack.student.domain.Student;
import com.example.appBack.student.infraestructure.controller.dto.StudentInputDTO;

import java.util.List;

public interface FindStudentPort {
    List<Student> findAll() throws Exception;
    List<Student> findBy(StudentInputDTO studentInputDTO) throws Exception;
    Student findById(String idStudent) throws Exception;

}
