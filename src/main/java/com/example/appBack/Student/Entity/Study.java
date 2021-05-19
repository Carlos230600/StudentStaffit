package com.example.appBack.Student.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name="study")
public class Study {

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
    private String id_study;

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



    public Study(StudyDTO studyDTO){
        //id null
        Date fecha = new Date();
        this.id_student="";
        this.id_materia="";
        this.note=1;
        this.comment="";
        this.initialDate=fecha;
        this.finish_date=fecha;

        this.setDatos(studyDTO);
    }

    public void setDatos(StudyDTO studyDTO){
        //id null
        this.setId_student(studyDTO.getId_student());
        this.setId_materia(studyDTO.getId_materia());
        this.setNote(studyDTO.getNote());
        this.setComment(studyDTO.getComment());
        this.setInitialDate(studyDTO.getInitialDate());
        this.setFinish_date(studyDTO.getFinish_date());
    }

    private void setId_student(String id_student) {
        if(comprobarString(id_student))
        {
            this.id_student=id_student;
        }
    }

    private void setId_materia(String id_materia) {
        if(comprobarString(id_materia)){
            this.id_materia = id_materia;
        }
    }

    //Comprobacion
    private void setNote(float note){
        this.note=note;
    }

    private void setComment(String comment) {
        if(comprobarString(comment)){
            this.comment = comment;
        }
    }

    private void setInitialDate(Date fecha) {
        if(comprobarFechas(fecha)){
            this.initialDate = fecha;
        }
    }

    private void setFinish_date(Date fecha) {
        if(comprobarFechas(fecha)){
            this.initialDate = fecha;
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
