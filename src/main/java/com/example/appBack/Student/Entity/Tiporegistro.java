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
public class Tiporegistro {

    @NonNull
    @Column
    @Id
    private String id_tipoRegistro;

    @NonNull
    @Column
    private String name;

    @NonNull
    @Column
    private Date last_update;

    @NonNull
    @Column
    private boolean activo;

}
