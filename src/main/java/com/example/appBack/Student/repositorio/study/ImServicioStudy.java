package com.example.appBack.Student.repositorio.study;

import com.example.appBack.Student.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class ImServicioStudy implements ServicioStudy{

    @Autowired
    StudyRepository studyRepository;


    @Override
    public Study addStudy(StudyDTO studyDTO) {
        try {

            if(!compararFechas(new Study(studyDTO)))
            {
                return null;
            }

            Study newStudy = new Study(studyDTO);
            studyRepository.saveAndFlush(newStudy);
            return newStudy;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public StudyDTO getStudy(String id) {
        Optional<Study> study = studyRepository.findById(id);
        if(!study.isEmpty()) {
            return StudyDTO.getStudyDTO(study.get());
        }
        return null;
    }

    @Override
    public StudyDTO deleteStudy(String id) {
        if(studyRepository.existsById(id)==true) {
            Study study = studyRepository.getOne(id);
            studyRepository.deleteById(id);
            return StudyDTO.getStudyDTO(study);
        }
        return null;
    }


    @Override
    public Study updateStudy(String id, StudyDTO studyDTO) {
       Study study = studyRepository.findById(id).get();
       study.setDatos(studyDTO);
       return study;
    }

    @Override
    public List<StudyDTO> getConsultaCampo(StudyDTO aConsultar) {
        //return studyRepository.getQueryEquals(aConsultar);
        return null;
    }

    @Override
    public List<StudyDTO> getAll() {
        List<Study> lista = studyRepository.findAll();
        if(lista.isEmpty()) {
            return null;
        }else{
            return StudyDTO.getAllStudyDTO(lista);
        }
    }


    private boolean compararFechas(Study study)
    {
        try{
            Date fecha1 = study.getInitialDate();
            Date fecha2 = study.getFinish_date();

            if(fecha1 != null && fecha2 == null){
                return true;
            }
            if(fecha1 != null && fecha2 != null){
                return fecha1.before(fecha2);
            }

            return fecha1.before(fecha2);
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
