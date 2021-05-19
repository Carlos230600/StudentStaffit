package com.example.appBack.Student.repositorio.study;

import com.example.appBack.Student.Entity.Study;
import com.example.appBack.Student.Entity.StudyDTO;

import java.util.List;

public interface ServicioStudy{

    Study addStudy(StudyDTO studyDTO);

    StudyDTO getStudy(String id);

    StudyDTO deleteStudy(String id);

    Study updateStudy(String id, StudyDTO studyDTO);

    List<StudyDTO> getConsultaCampo(StudyDTO aConsultar);

    List<StudyDTO> getAll();

}
