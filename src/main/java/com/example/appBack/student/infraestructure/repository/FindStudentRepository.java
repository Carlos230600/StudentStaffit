package com.example.appBack.student.infraestructure.repository;

import com.example.appBack.student.domain.Student;
import com.example.appBack.student.infraestructure.controller.dto.StudentInputDTO;
import com.example.appBack.student.infraestructure.repository.jpa.StudentRepositoryJPA;
import com.example.appBack.student.infraestructure.repository.port.FindStudentPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class FindStudentRepository implements FindStudentPort {

    @Autowired
    StudentRepositoryJPA studentRepositoryJPA;

    @Override
    public List<Student> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Student> findBy(StudentInputDTO studentInputDTO) throws Exception {
        return null;
    }

    @Override
    public Student findById(String idStudent) throws Exception {
        return null;
    }
}
