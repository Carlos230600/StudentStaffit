package com.example.appBack.Student.repositorio.tiporegistro;

import com.example.appBack.Student.Entity.Tiporegistro;
import com.example.appBack.Student.Entity.TiporegistroDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TiporegistroRepository extends JpaRepository<Tiporegistro,String> {

    /*List<TiporegistroDTO> getQueryEqualsTiporegistroDTO consulta);

    List<TiporegistroDTO> getQueryLike(TiporegistroDTO consulta);

    //@Query("Select U FROM tipoRegistro where id = :identificador")
    List<Tiporegistro> findById(String id);*/

}
