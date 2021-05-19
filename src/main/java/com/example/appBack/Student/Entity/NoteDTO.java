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

    @NotNull
    private String id_student;

    @NotNull
    private String id_tiporegistro;

    @NotNull
    private float note;

    @NotNull
    private branch branch;

    @NotNull
    private String materia;

    @NotNull
    private String comment;

    @NotNull
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
