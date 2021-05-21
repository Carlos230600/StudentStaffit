package com.example.appBack.student.application;

import com.example.appBack.student.application.port.CreateStudentPort;
import com.example.appBack.student.domain.Student;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateStudentUseCase implements CreateStudentPort{

    @Autowired
    private CreateStudentPort createStudentPort;

    @Override
    public Student create(Student student) throws Exception {
        return createStudentPort.create(student);
    }


}
