package com.example.appBack.student.application;

import com.example.appBack.student.application.port.SearchByStudentPort;
import com.example.appBack.student.domain.Student;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SearchByStudentUseCase implements SearchByStudentPort {

    @Autowired
    SearchByStudentPort searchByStudentPort;

    @Override
    public Student searchEstudianteById(String idEstudiante) throws Exception {
        return searchByStudentPort.searchEstudianteById(idEstudiante);
    }
}
