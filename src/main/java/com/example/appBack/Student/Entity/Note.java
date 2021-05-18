package com.example.appBack.Student.Entity;

import lombok.*;
import org.dom4j.Branch;

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
public class Note {

    @NonNull
    @Column
    @Id
    private String id_notas;

    @NonNull
    @Column
    private String id_student;

    @NonNull
    @Column
    private String id_tiporegistro;

    @NonNull
    @Column
    private float note;

    @NonNull
    @Column
    private branch branch;

    @NonNull
    @Column
    private String materia;

    @NonNull
    @Column
    private String comment;

    @NonNull
    @Column
    private Date creationDate;

}
