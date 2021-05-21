package com.example.appBack.student.application.port;

import com.example.appBack.student.domain.Student;

public interface SearchByStudentPort {

    Student searchEstudianteById(String idEstudiante) throws Exception;

}
