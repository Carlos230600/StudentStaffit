package com.example.appBack.Student.Entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Description;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name="materia")
public class Materia {

    @NonNull
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
    private String id;

    @NonNull
    private branch branch;

    @NonNull
    private String description;

    @NonNull
    private String name;


    public Materia(MateriaDTO materiaDTO){
        //id null
        this.branch = branch.FRONT;//studentDTO.getBranch();
        this.description = "";
        this.name = "";

        this.setDatos(materiaDTO);
    }

    public void setDatos(MateriaDTO materiaDTO){
        //id null
        this.setBranch(materiaDTO.getBranch());
        this.setDescription(materiaDTO.getDescription());
        this.setName(materiaDTO.getName());
    }

    /**Nuevos Metodos Añadidos**/
    private void setBranch(branch branch) {
        if(comprobarObjects(branch)){
            this.branch = branch;
        }
    }

    private void setDescription(String description) {
        if(comprobarString(description)){
            this.description = description;
        }
    }

    private void setName(String name) {
        if(comprobarString(name)){
            this.name = name;
        }
    }

    private boolean comprobarString(String str){
        try{
            if (str.trim().length() != 0 && str != null) {
                return true;
            }
        }catch (Exception e) { }
        return false;
    }

    private boolean comprobarNumbers(Object num){
        try{
            if(num != null && Double.parseDouble(num.toString()) > 0){
                return true;
            }
        }
        catch (NumberFormatException e){}
        return false;
    }

    private boolean comprobarObjects(Object objeto) {
        try {
            if (objeto != null) {
                return true;
            }
        }catch(Exception e){}
        return false;
    }

}
