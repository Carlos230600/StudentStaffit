package com.example.appBack.Student.repositorio.materia;

import com.example.appBack.Student.Entity.Materia;
import com.example.appBack.Student.Entity.MateriaDTO;
import com.example.appBack.Student.Entity.Student;
import com.example.appBack.Student.Entity.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MateriaRepository extends JpaRepository<Materia,String> {

}
