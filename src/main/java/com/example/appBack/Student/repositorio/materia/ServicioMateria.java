package com.example.appBack.Student.repositorio.materia;

import com.example.appBack.Student.Entity.Materia;
import com.example.appBack.Student.Entity.MateriaDTO;
import com.example.appBack.Student.Entity.Student;
import com.example.appBack.Student.Entity.StudentDTO;

import java.util.List;

public interface ServicioMateria {

    Materia addMateria(MateriaDTO mdto);

    MateriaDTO getMateria(String id);

    MateriaDTO deleteMateria(String id);

    Materia updateMateria(String id, MateriaDTO mdto);

    List<MateriaDTO> getConsultaCampo(MateriaDTO aConsultar);

    List<MateriaDTO> getAll();

}
