package com.example.appBack.Student.Entity.Output;

import com.example.appBack.Student.Entity.Tiporegistro;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TiporegistroOutputDTO {

    private String id_Tiporegistro;

    private String name;

    private Date last_update;

    private boolean activo;


    public TiporegistroOutputDTO(Tiporegistro tiporegistro){
        this.id_Tiporegistro=tiporegistro.getId_tipoRegistro();
        this.name=tiporegistro.getName();
        this.last_update=tiporegistro.getLast_update();
        this.activo=tiporegistro.isActivo();
    }

}
