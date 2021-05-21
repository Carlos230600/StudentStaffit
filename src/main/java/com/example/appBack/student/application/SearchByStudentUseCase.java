package com.example.appBack.student.application;

import com.example.appBack.student.application.port.SearchByStudentPort;
import com.example.appBack.student.domain.Student;
import com.example.appBack.student.infraestructure.controller.dto.StudentOutputDTO;
import com.example.appBack.student.infraestructure.repository.port.FindStudentPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SearchByStudentUseCase implements SearchByStudentPort {

    FindStudentPort searchByStudentPort;

    @Override
    public StudentOutputDTO searchEstudianteById(String idEstudiante) throws Exception {
        return searchByStudentPort.findById(idEstudiante);
    }
}
