package com.example.appBack.Student.Entity.Output;

import com.example.appBack.Student.Entity.Note;
import com.example.appBack.Student.Entity.branch;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NoteOutputDTO {

    @NotNull
    public String idNote;

    @NotNull
    private String idStudent;

    @NotNull
    private String idTipoRegistro;

    private float note;

    @NotNull
    private com.example.appBack.Student.Entity.branch branch;

    private String idMateria;

    private String coment;

    private Date creationDate;


    public NoteOutputDTO getNoteOuputDTO(Note note){
        return new NoteOutputDTO(note.getId_notas(),
                note.getId_student(),
                note.getId_tiporegistro(),
                note.getNote(),
                note.getBranch(),
                note.getMateria(),
                note.getComment(),
                note.getCreationDate());
    }


}
