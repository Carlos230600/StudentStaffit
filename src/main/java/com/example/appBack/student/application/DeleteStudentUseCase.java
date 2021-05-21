package com.example.appBack.student.application;

import com.example.appBack.student.application.port.DeleteByStudentPort;
import com.example.appBack.student.infraestructure.repository.port.DeleteStudentPort;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteStudentUseCase implements DeleteByStudentPort {

    private final DeleteStudentPort deleteStudentPort;

    @Override
    public void deleteById(String idEstudiante) throws Exception {
        deleteStudentPort.deleteById(idEstudiante);
    }
}
