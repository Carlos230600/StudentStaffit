package com.example.appBack.student.application.port;

import com.example.appBack.student.domain.Student;
import com.example.appBack.student.domain.noDatabase.SaveStudent;

public interface UpdateStudentPort {
    Student update(String idStudent, SaveStudent newEstudiante) throws Exception;
}
