package com.example.appBack.Student.Entity.Input;

import com.example.appBack.Student.Entity.Materia;
import com.example.appBack.Student.Entity.branch;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MateriaInputDTO {

    @NotNull
    private com.example.appBack.Student.Entity.branch branch;

    @NotNull
    private String description;

    @NotNull
    private String name;

    public MateriaInputDTO(Materia materia){
        this.branch=materia.getBranch();
        this.description=materia.getDescription();
        this.name=materia.getName();
    }

}
