package com.example.appBack.Student.controller;

import com.example.appBack.Student.Entity.Note;
import com.example.appBack.Student.Entity.NoteDTO;
import com.example.appBack.Student.repositorio.note.ServicioNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NoteController {

    @Autowired
    ServicioNote servicioNote;


    @PostMapping("/addNote")
    public ResponseEntity addNote(@RequestBody NoteDTO noteDTO)
    {
        try {
            Note note = servicioNote.addNote(noteDTO);
            return ResponseEntity.ok(note);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }
    }

    @GetMapping("getNote/{id}")
    public NoteDTO getNoteDTO(@PathVariable String id){
        return servicioNote.getNote(id);
    }

    @DeleteMapping("deleteNote/{id}")
    public ResponseEntity deleteNoteById(@PathVariable String id){
        try {
            NoteDTO noteDTO = servicioNote.deleteNote(id);
            return ResponseEntity.ok(noteDTO);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping("/updateNote/{id}")
    public ResponseEntity updateNote(@PathVariable String id, @RequestBody NoteDTO noteDTO)
    {
        try {
            Note note = servicioNote.updateNote(id,noteDTO);
            return ResponseEntity.ok(note);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e);
        }
    }

}
