package com.example.appBack.student.application.port;

import com.example.appBack.student.domain.Student;

public interface CreateStudentPort {
    Student create(Student student) throws Exception;
}
