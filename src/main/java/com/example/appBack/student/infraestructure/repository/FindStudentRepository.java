package com.example.appBack.student.infraestructure.repository;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.example.appBack.student.domain.Student;
import com.example.appBack.student.domain.StudentJPA;
import com.example.appBack.student.infraestructure.controller.dto.StudentInputDTO;
import com.example.appBack.student.infraestructure.controller.dto.StudentOutputDTO;
import com.example.appBack.student.infraestructure.repository.jpa.StudentRepositoryJPA;
import com.example.appBack.student.infraestructure.repository.port.FindStudentPort;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
@AllArgsConstructor
public class FindStudentRepository implements FindStudentPort {

    @Autowired
    StudentRepositoryJPA studentRepositoryJPA;

    @Override
    public List<StudentJPA> findAll() throws Exception {
        List<StudentJPA> lista = studentRepositoryJPA.findAll();
        if(lista.isEmpty()) {
            return null;
        }
        return lista;
    }


    @Override
    public StudentOutputDTO findById(String idStudent) throws Exception {
        if(studentRepositoryJPA.findById(idStudent).isEmpty()){
            return null;
        }
        return new StudentOutputDTO(new Student(studentRepositoryJPA.findById(idStudent).get()));
    }
}
