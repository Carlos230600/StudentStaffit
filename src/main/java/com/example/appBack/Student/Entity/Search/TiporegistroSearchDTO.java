package com.example.appBack.Student.Entity.Search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TiporegistroSearchDTO {

    private String id_Tiporegistro;

    private String name;

    private Date last_update;

    private boolean activo;

}
