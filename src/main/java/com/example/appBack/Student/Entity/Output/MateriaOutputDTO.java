package com.example.appBack.Student.Entity.Output;

import com.example.appBack.Student.Entity.Materia;
import com.example.appBack.Student.Entity.branch;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MateriaOutputDTO {

    private String id;

    private branch branch;

    private String description;

    private String name;

    public MateriaOutputDTO(Materia materia){
        this.id=materia.getId();
        this.branch=materia.getBranch();
        this.description=materia.getDescription();
        this.name=materia.getName();
    }


}
