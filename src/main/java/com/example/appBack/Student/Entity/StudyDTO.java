package com.example.appBack.Student.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudyDTO {

    @NotNull
    private String id_student;

    @NotNull
    private String id_materia;

    @NotNull
    private float note;

    @NotNull
    private String comment;

    @NotNull
    private Date initialDate;

    @NotNull
    private Date finish_date;

    public static StudyDTO getStudyDTO(Study study){
        return new StudyDTO(study.getId_student(),
                study.getId_materia(),
                study.getNote(),
                study.getComment(),
                study.getInitialDate(),
                study.getFinish_date());
    }

    //Implementar el metodo
    public static StudyDTO transformToStudyDTO(Object object){
        if(object.getClass().toString().equalsIgnoreCase("StudyOutputDTO")){

        }

        if(object.getClass().toString().equalsIgnoreCase("StudySearchDTO")){

        }

        if(object.getClass().toString().equalsIgnoreCase("StudyInputDTO")){

        }
        return null;
    }

    public static List<StudyDTO> getAllStudyDTO(List<Study> listStudy){
        List<StudyDTO> devolver = new ArrayList<>();
        listStudy.forEach(study -> devolver.add(getStudyDTO(study)));
        return devolver;
    }

}
