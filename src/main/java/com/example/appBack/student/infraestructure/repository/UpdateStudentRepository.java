package com.example.appBack.student.infraestructure.repository;

import com.example.appBack.student.application.port.UpdateStudentPort;
import com.example.appBack.student.domain.Student;
import com.example.appBack.student.domain.noDatabase.SaveStudent;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@AllArgsConstructor
public class UpdateStudentRepository implements UpdateStudentPort {
    @Override
    public Student update(String idStudent, SaveStudent newEstudiante) throws Exception {
        return null;
    }
}
