package com.example.appBack.Student.controller;

import com.example.appBack.Student.Entity.Tiporegistro;
import com.example.appBack.Student.Entity.TiporegistroDTO;
import com.example.appBack.Student.repositorio.tiporegistro.ServicioTiporegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TiporegistroController {

    @Autowired
    ServicioTiporegistro servicioTiporegistro;

    @PostMapping("/addTiporegistro")
    public ResponseEntity addTiporegistro(@RequestBody TiporegistroDTO tiporegistroDTO)
    {
        try {
            Tiporegistro tiporegistro = servicioTiporegistro.addTiporegistro(tiporegistroDTO);
            return ResponseEntity.ok(tiporegistro);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }
    }

    @GetMapping("/getTiporegistro/{id}")
    public TiporegistroDTO getTiporegistroById(@PathVariable String id){return servicioTiporegistro.getTiporegistro(id);}

    @GetMapping("/getTiporegistro")
    public List<TiporegistroDTO> getAllTiporegistro(){
        return servicioTiporegistro.getAll();
    }

    @DeleteMapping("/deleteTiporegistro/{id}")
    public ResponseEntity deleteTiporegistroById(@PathVariable String id){
        try {
            TiporegistroDTO tiporegistroDTO = servicioTiporegistro.deleteTiporegistro(id);
            return ResponseEntity.ok(tiporegistroDTO);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }

    }

    @PutMapping("/updateTiporegistro/{id}")
    public ResponseEntity updateTiporegistro(@PathVariable String id, @RequestBody TiporegistroDTO tiporegistroDTO)
    {
        try {
            Tiporegistro tiporegistro = servicioTiporegistro.updateTiporegistro(id,tiporegistroDTO);
            return ResponseEntity.ok(tiporegistro);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }
    }

    @GetMapping("/getTiporegistroConsulta")
    public List<TiporegistroDTO> getTiporegistroConsulta(@RequestBody TiporegistroDTO tiporegistroDTO)
    {
        try {
            List<TiporegistroDTO> lista = servicioTiporegistro.getConsultaCampo(tiporegistroDTO);
            return lista;
        }
        catch (Exception e)
        {
            return null;
        }
    }

}
