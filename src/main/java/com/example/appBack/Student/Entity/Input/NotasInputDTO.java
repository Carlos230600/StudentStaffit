package com.example.appBack.Student.Entity.Input;

import com.example.appBack.Student.Entity.NoteDTO;
import com.example.appBack.Student.Entity.branch;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotasInputDTO {

    @NotNull
    private String idStudent;

    @NotNull
    private String idTipoRegistro;

    private float note;

    @NotNull
    private branch branch;

    private String idMateria;

    private String coment;

    private Date creationDate;


    public NoteDTO getNotaDTO(){
        return new NoteDTO(this.idStudent,
                this.idTipoRegistro,
                this.note,
                this.branch,
                this.idMateria,
                this.coment,
                this.creationDate);
    }

    public NotasInputDTO getNotaInputDTO(NoteDTO noteDTO){
        return new NotasInputDTO(noteDTO.getId_student(),
                noteDTO.getId_tiporegistro(),
                noteDTO.getNote(),
                noteDTO.getBranch(),
                noteDTO.getMateria(),
                noteDTO.getComment(),
                noteDTO.getCreationDate());
    }

}
