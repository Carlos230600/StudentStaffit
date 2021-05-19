package com.example.appBack.Student.Entity.Input;

import com.example.appBack.Student.Entity.Tiporegistro;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TiporegistroInputDTO {

    private String name;

    private Date last_update;

    private boolean activo;

    public TiporegistroInputDTO(Tiporegistro tiporegistro){
        this.name=tiporegistro.getName();
        this.last_update=tiporegistro.getLast_update();
        this.activo=tiporegistro.isActivo();
    }


}
