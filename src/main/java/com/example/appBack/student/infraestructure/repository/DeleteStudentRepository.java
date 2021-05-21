package com.example.appBack.student.infraestructure.repository;

import com.example.appBack.student.infraestructure.repository.jpa.StudentRepositoryJPA;
import com.example.appBack.student.infraestructure.repository.port.DeleteStudentPort;
import com.example.appBack.student.infraestructure.repository.port.FindStudentPort;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@AllArgsConstructor
@Repository
public class DeleteStudentRepository implements DeleteStudentPort {

    StudentRepositoryJPA studentRepositoryJpa;
    FindStudentPort findStudentPort;

    @Override
    public void deleteById(String idEstudiante) throws Exception {
        studentRepositoryJpa.deleteById(findStudentPort.findById(idEstudiante).getIdStudent());
    }
}
