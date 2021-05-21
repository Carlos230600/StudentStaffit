package com.example.appBack.student.application;

import com.example.appBack.student.application.port.CreateStudentPort;
import com.example.appBack.student.domain.Student;
import com.example.appBack.student.infraestructure.repository.port.SaveStudentPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateStudentUseCase implements CreateStudentPort{

    private SaveStudentPort createStudentPort;

    @Override
    public Student create(Student student) throws Exception {
        return createStudentPort.save(student);
    }


}
