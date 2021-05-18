package com.example.appBack.Student.repositorio.materia;

import com.example.appBack.Student.Entity.Materia;
import com.example.appBack.Student.Entity.MateriaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ImServicioMateria implements ServicioMateria{

    @Autowired
    MateriaRepository materiaRepository;


    // Implmentar control de errores: Duplicados...
    @Override
    public Materia addMateria(MateriaDTO mdto) {
        try {

             Materia nuevaMateria = new Materia(mdto);
             materiaRepository.saveAndFlush(nuevaMateria);

             /*return ResponseEntity.ok("Insertado");
             }
             catch (Exception e)
             {
             return ResponseEntity.ok("VALOR NULL");
             */return null;
             }catch (Exception e){}
        return null;
    }

    @Override
    public MateriaDTO getMateria(String id) {
        Optional<Materia> materia = materiaRepository.findById(id);
        if(!materia.isEmpty()) {
            return MateriaDTO.getMateriaDTO(materia.get());
        }
        return null;
    }

    @Override
    public MateriaDTO deleteMateria(String id) {
        if(materiaRepository.existsById(id)==true) {
            Materia materia = materiaRepository.getOne(id);
            materiaRepository.deleteById(id);
            return MateriaDTO.getMateriaDTO(materia);
        }
        return null;
    }

    // Implmentar la funcionalidad
    @Override
    public Materia updateMateria(String id, MateriaDTO sdto) {
        return null;
    }

    @Override
    public List<MateriaDTO> getConsultaCampo(MateriaDTO aConsultar) {
        //return studentRepository.getQueryEquals(aConsultar);
       // return materiaRepository.getQueryLike(aConsultar);
        return null;
    }

    @Override
    public List<MateriaDTO> getAll() {
        List<Materia> lista = materiaRepository.findAll();
        if(lista.isEmpty()) {
            return null;
        }else{
            return MateriaDTO.getAllMateriaDTO(lista);
        }
    }
}
