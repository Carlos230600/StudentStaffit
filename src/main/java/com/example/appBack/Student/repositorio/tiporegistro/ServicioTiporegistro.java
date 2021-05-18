package com.example.appBack.Student.repositorio.tiporegistro;

import com.example.appBack.Student.Entity.Tiporegistro;
import com.example.appBack.Student.Entity.TiporegistroDTO;
import java.util.List;

public interface ServicioTiporegistro {
    Tiporegistro addTiporegistro(TiporegistroDTO tiporegistroDTO);

    TiporegistroDTO getTiporegistro(String id);

    TiporegistroDTO deleteTiporegistro(String id);

    Tiporegistro updateTiporegistro(String id, TiporegistroDTO tiporegistroDTO);

    List<TiporegistroDTO> getConsultaCampo(TiporegistroDTO aConsultar);

    List<TiporegistroDTO> getAll();

}
