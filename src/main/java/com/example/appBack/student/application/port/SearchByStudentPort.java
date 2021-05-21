package com.example.appBack.student.application.port;

import com.example.appBack.student.infraestructure.controller.dto.StudentOutputDTO;

public interface SearchByStudentPort {

    StudentOutputDTO searchEstudianteById(String idEstudiante) throws Exception;

}
