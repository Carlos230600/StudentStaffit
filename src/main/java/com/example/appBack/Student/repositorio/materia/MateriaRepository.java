package com.example.appBack.Student.repositorio.materia;

import com.example.appBack.Student.Entity.Materia;
import com.example.appBack.Student.Entity.MateriaDTO;
import com.example.appBack.Student.Entity.Student;
import com.example.appBack.Student.Entity.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MateriaRepository extends JpaRepository<Materia,String> {
/*
    //List<StudentDTO> getQueryEquals(StudentDTO consulta);

    List<MateriaDTO> getQueryLike(MateriaDTO consulta);

    //@Query("Select U FROM Student where nombre = :nombre and apellido = :apellido")
    List<Materia> findByNombreAndApellido(String nombre, String apellido);

    //@Query("Select U FROM Student where correo = :correo")
    List<Materia> findByCorreo(String correo);*/

}
