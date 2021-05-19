package com.example.appBack.Student.Entity.Search;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MateriaSearchDTO{

    private String id;

    private com.example.appBack.Student.Entity.branch branch;

    private String description;

    private String name;

}
