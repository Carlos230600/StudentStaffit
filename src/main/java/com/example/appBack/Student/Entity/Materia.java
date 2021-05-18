package com.example.appBack.Student.Entity;

import lombok.*;
import org.springframework.context.annotation.Description;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Materia {

    @NonNull
    @Column
    @Id
    private String id;

    @NonNull
    @Column
    private branch branch;

    @NonNull
    @Column
    private String description;

    @NonNull
    @Column
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
