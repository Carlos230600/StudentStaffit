package com.example.appBack.Student.Entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.dom4j.Branch;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name="note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estudiantes_seq")
    @GenericGenerator(
            //name = "ausencias_seq",
            name = "estudiantes_seq",
            //strategy = "com.bosonit.staffit.shared.sequences.StringPrefixedSequenceIdGenerator",
            strategy = "com.example.appBack.Student.Entity.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "EST"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d")
            })
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private String id_notas;

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
    private Date creationDate;


    public Note(NoteDTO noteDTO){
        //id null
        Date fecha= new Date();
        this.id_student="";
        this.id_tiporegistro="";
        this.note=1;
        this.branch = branch.FRONT;
        this.materia="";
        this.comment="";
        this.creationDate=fecha;

        this.setDatos(noteDTO);
    }

    public void setDatos(NoteDTO noteDTO){
        //id null
        this.setId_student(noteDTO.getId_student());
        this.setId_tiporegistro(noteDTO.getId_tiporegistro());
        this.setNote(noteDTO.getNote());
        this.setBranch(noteDTO.getBranch());
        this.setMateria(noteDTO.getMateria());
        this.setComment(noteDTO.getComment());
        this.setCreationDate(noteDTO.getCreationDate());
    }

    private void setId_student(String id_student) {
        if(comprobarString(id_student))
        {
            this.id_student=id_student;
        }
    }

    private void setId_tiporegistro(String id_tiporegistro) {
        if(comprobarString(id_tiporegistro))
        {
            this.id_tiporegistro=id_tiporegistro;
        }
    }

    //Comprobacion
   private void setNote(float note){
        this.note=note;
   }


    private void setBranch(branch branch) {
        if(comprobarObjects(branch)){
            this.branch = branch;
        }
    }

    private void setMateria(String materia) {
        if(comprobarString(materia)){
            this.materia = materia;
        }
    }


    private void setComment(String comment) {
        if(comprobarString(comment)){
            this.comment = comment;
        }
    }

    private void setCreationDate(Date fecha) {
        if(comprobarFechas(fecha)){
            this.creationDate = fecha;
        }
    }

    private boolean comprobarString(String str)
    {
        try {
            if (str.trim().length() != 0 && str != null)
            {
                return true;
            }
        }catch (Exception e) { }
        return false;
    }

    private boolean comprobarFechas(Date fecha)
    {
        try {
            if (fecha != null) {
                return true;
            }

        }catch(Exception e){e.printStackTrace();}
        return false;
    }

    private boolean comprobarNumbers(Object num)
    {
        try
        {
            if(num != null && Double.parseDouble(num.toString()) > 0)
            {
                return true;
            }
        }
        catch (NumberFormatException e){}
        return false;
    }

    private boolean comprobarObjects(Object objeto)
    {
        try {
            if (objeto != null) {
                return true;
            }
        }catch(Exception e){ }
        return false;
    }
}
