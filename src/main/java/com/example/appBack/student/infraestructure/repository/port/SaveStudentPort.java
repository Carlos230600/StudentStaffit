package com.example.appBack.student.infraestructure.repository.port;

import com.example.appBack.student.domain.Student;

public interface SaveStudentPort {
    Student save(Student student) throws Exception;
}
