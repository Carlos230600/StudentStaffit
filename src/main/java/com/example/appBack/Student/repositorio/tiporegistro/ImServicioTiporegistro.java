package com.example.appBack.Student.repositorio.tiporegistro;

import com.example.appBack.Student.Entity.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class ImServicioTiporegistro implements ServicioTiporegistro{

    @Autowired
    TiporegistroRepository tiporegistroRepository;

    @Override
    public Tiporegistro addTiporegistro(TiporegistroDTO tiporegistroDTO) {
        try{

            Tiporegistro newTiporegistro = new Tiporegistro(tiporegistroDTO);
            tiporegistroRepository.saveAndFlush(newTiporegistro);
            return newTiporegistro;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public TiporegistroDTO getTiporegistro(String id) {
        Optional<Tiporegistro> tiporegistro = tiporegistroRepository.findById(id);
        if(!tiporegistro.isEmpty()) {
            return TiporegistroDTO.getTiporegistroDTO(tiporegistro.get());
        }
        return null;
    }

    @Override
    public TiporegistroDTO deleteTiporegistro(String id) {

        try{

            if(tiporegistroRepository.existsById(id)==true) {
                Tiporegistro tiporegistro =tiporegistroRepository.getOne(id);

                if(tiporegistro.getNota().isEmpty()){
                    tiporegistroRepository.deleteById(id);
                    return TiporegistroDTO.getTiporegistroDTO(tiporegistro);
                }else{
                    log.debug("No es posible borrar, nota asociada.");
                }
            }

            return null;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Tiporegistro updateTiporegistro(String id, TiporegistroDTO tiporegistroDTO) {
       Tiporegistro tiporegistro2 = tiporegistroRepository.findById(id).get();
       tiporegistro2.setDatos(tiporegistroDTO);
       return tiporegistro2;
    }

    @Override
    public List<TiporegistroDTO> getConsultaCampo(TiporegistroDTO aConsultar) {
        //return studentRepository.getQueryEquals(aConsultar);
        // return materiaRepository.getQueryLike(aConsultar);
        return null;
    }

    @Override
    public List<TiporegistroDTO> getAll() {
        List<Tiporegistro> lista = tiporegistroRepository.findAll();
        if(lista.isEmpty()) {
            return null;
        }else{
            return TiporegistroDTO.getAllTipoRegistroDTO(lista);
        }
    }
}
