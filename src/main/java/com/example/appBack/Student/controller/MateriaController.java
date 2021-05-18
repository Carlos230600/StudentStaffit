package com.example.appBack.Student.controller;

import com.example.appBack.Student.Entity.Materia;
import com.example.appBack.Student.Entity.MateriaDTO;
import com.example.appBack.Student.repositorio.materia.ServicioMateria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MateriaController {

    @Autowired
    ServicioMateria servicioMateria;

    @PostMapping("/addMateria")
    public ResponseEntity addMateria(@RequestBody MateriaDTO materiaDTO)
    {
        try {
            Materia materia = servicioMateria.addMateria(materiaDTO);
            return ResponseEntity.ok(materia);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }
    }

    @GetMapping("getMateria/{id}")
    public MateriaDTO getMateriaDTO(@PathVariable String id){
        return servicioMateria.getMateria(id);
    }

    @DeleteMapping("deleteMateria/{id}")
    public ResponseEntity deleteMateriaById(@PathVariable String id){
        try {
            MateriaDTO materiaDTO = servicioMateria.deleteMateria(id);
            return ResponseEntity.ok(materiaDTO);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping("/updateMateria/{id}")
    public ResponseEntity updateMateria(@PathVariable String id, @RequestBody MateriaDTO materiaDTO)
    {
        try {
            Materia materia= servicioMateria.updateMateria(id,materiaDTO);
            return ResponseEntity.ok(materia);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }
    }




}
