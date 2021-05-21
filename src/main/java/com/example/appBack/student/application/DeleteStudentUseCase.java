package com.example.appBack.student.application;

import com.example.appBack.student.application.port.DeleteByStudentPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteStudentUseCase implements DeleteByStudentPort {

    @Autowired
    private final DeleteByStudentPort deleteByStudentPort;

    @Override
    public void deleteById(String idEstudiante) throws Exception {
        deleteByStudentPort.deleteById(idEstudiante);
    }
}
