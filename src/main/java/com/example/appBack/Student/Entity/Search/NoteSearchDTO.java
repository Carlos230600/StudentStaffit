package com.example.appBack.Student.Entity.Search;

import com.sun.istack.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class NoteSearchDTO {

    public String idNote;

    private String idStudent;

    private String idTipoRegistro;

    private float note;

    private com.example.appBack.Student.Entity.branch branch;

    private String idMateria;

    private String coment;

    private Date creationDate;

}
