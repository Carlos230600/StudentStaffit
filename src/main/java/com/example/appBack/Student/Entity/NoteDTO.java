package com.example.appBack.Student.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteDTO {

    @NonNull
    private String id_student;

    @NonNull
    private String id_tiporegistro;

    @NonNull
    private float note;

    @NonNull
    private branch branch;

    @NonNull
    private String materia;

    @NonNull
    private String comment;

    @NonNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date creationDate;


    public static NoteDTO getNoteDTO(Note note){
        return new NoteDTO(note.getId_student(),
                note.getId_tiporegistro(),
                note.getNote(),
                note.getBranch(),
                note.getMateria(),
                note.getComment(),
                note.getCreationDate());
    }


    //Implementar el metodo
    public static NoteDTO transformToNoteDTO(Object object){
        if(object.getClass().toString().equalsIgnoreCase("NoteOutputDTO")){

        }

        if(object.getClass().toString().equalsIgnoreCase("NoteSearchDTO")){

        }

        if(object.getClass().toString().equalsIgnoreCase("NoteInputDTO")){

        }
        return null;
    }


    public static List<NoteDTO> getAllNoteDTO(List<Note> listNote){
        List<NoteDTO> devolver = new ArrayList<>();
        listNote.forEach(note -> devolver.add(getNoteDTO(note)));
        return devolver;
    }

}
