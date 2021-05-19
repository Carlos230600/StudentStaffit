package com.example.appBack.Student.controller;

import com.example.appBack.Student.Entity.Study;
import com.example.appBack.Student.Entity.StudyDTO;
import com.example.appBack.Student.repositorio.study.ServicioStudy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class StudyController{

    @Autowired
    ServicioStudy servicioStudy;

    @PostMapping("/addStudy")
    public ResponseEntity addStudy(@RequestBody StudyDTO studyDTO)
    {
        try {
            Study study = servicioStudy.addStudy(studyDTO);
            return ResponseEntity.ok(study);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }
    }

    @GetMapping("/getStudy/{id}")
    public StudyDTO getStudyById(@PathVariable String id){return servicioStudy.getStudy(id);}

    @GetMapping("/getAllStudy")
    public List<StudyDTO> getAllStudy(){
        return servicioStudy.getAll();
    }

    @DeleteMapping("/deleteStudy/{id}")
    public ResponseEntity deleteStudyById(@PathVariable String id){
        try {
            StudyDTO studyDTO = servicioStudy.deleteStudy(id);
            return ResponseEntity.ok(studyDTO);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }

    }

    @PutMapping("/updateStudy/{id}")
    public ResponseEntity updateStudy(@PathVariable String id, @RequestBody StudyDTO studyDTO)
    {
        try {
            Study study = servicioStudy.updateStudy(id,studyDTO);
            return ResponseEntity.ok(study);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }
    }

    @GetMapping("/getStudy")
    public List<StudyDTO> getStudyConsulta(@RequestBody StudyDTO studyDTO)
    {
        try {
            List<StudyDTO> lista = servicioStudy.getConsultaCampo(studyDTO);
            return lista;
        }catch (Exception e){
            return null;
        }
    }
}
