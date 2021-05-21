package com.example.appBack.student.infraestructure.repository;

import com.example.appBack.student.domain.Student;
import com.example.appBack.student.domain.StudentJPA;
import com.example.appBack.student.infraestructure.repository.jpa.StudentRepositoryJPA;
import com.example.appBack.student.infraestructure.repository.port.SaveStudentPort;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class SaveStudentRepository implements SaveStudentPort {

    @Autowired
    private final StudentRepositoryJPA studentRepositoryJpa;

    @Override
    public Student save(Student student) throws Exception {
        StudentJPA studentJpa = null;
        studentJpa.setDatos(student);
        if(student.getIdStudent() != null) studentJpa.setIdStudent(student.getIdStudent());
        studentRepositoryJpa.save(studentJpa);
        return new Student(studentJpa);
    }
}
