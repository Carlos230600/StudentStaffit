package com.example.appBack.Student.Entity;

import lombok.*;

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
public class Study {

    @NonNull
    @Id
    @Column
    private String id_study;

    @NonNull
    @Column
    private String id_student;

    @NonNull
    @Column
    private String id_materia;

    @NonNull
    @Column
    private float note;

    @NonNull
    @Column
    private String comment;

    @NonNull
    @Column
    private Date initialDate;

    @Column
    @NonNull
    private Date finish_date;


}
