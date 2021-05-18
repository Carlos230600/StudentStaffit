package com.example.appBack.Student.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MateriaDTO {

    @NonNull
    private branch branch;

    @NonNull
    private String description;

    @NonNull
    private String name;


    public static MateriaDTO getMateriaDTO(Materia materia){
        return new MateriaDTO(materia.getBranch(),materia.getDescription(),materia.getName());
    }

    //Implementar el metodo
    public static StudentDTO transformToStudentDTO(Object object){
        if(object.getClass().toString().equalsIgnoreCase("StudentOutputDTO")){

        }

        if(object.getClass().toString().equalsIgnoreCase("StudentSearchDTO")){

        }

        if(object.getClass().toString().equalsIgnoreCase("StudentInputDTO")){

        }
        return null;
    }


    public static List<MateriaDTO> getAllMateriaDTO(List<Materia> listMateria){
        List<MateriaDTO> devolver = new ArrayList<>();
        listMateria.forEach(materia -> devolver.add(getMateriaDTO(materia)));
        return devolver;
    }

}

