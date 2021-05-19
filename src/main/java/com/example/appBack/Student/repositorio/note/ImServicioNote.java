package com.example.appBack.Student.repositorio.note;

import com.example.appBack.Student.Entity.Note;
import com.example.appBack.Student.Entity.NoteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ImServicioNote implements ServicioNote {

    @Autowired
    NoteRepository noteRepository;

    @Override
    public Note addNote(NoteDTO ndto) {
        try {
            Note newNote = new Note(ndto);
            noteRepository.saveAndFlush(newNote);
            return newNote;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public NoteDTO getNote(String id) {
        Optional<Note> note = noteRepository.findById(id);
        if(!note.isEmpty()) {
            return NoteDTO.getNoteDTO(note.get());
        }
        return null;
    }

    @Override
    public NoteDTO deleteNote(String id) {
        if(noteRepository.existsById(id)==true) {
            Note note = noteRepository.getOne(id);
            noteRepository.deleteById(id);
            return NoteDTO.getNoteDTO(note);
        }
        return null;
    }

    @Override
    public Note updateNote(String id, NoteDTO ndto) {
        Note nota2 = noteRepository.findById(id).get();
        nota2.setDatos(ndto);
        return nota2;
    }

    @Override
    public List<NoteDTO> getConsultaCampo(NoteDTO aConsultar) {
        // return noteRepository.getQueryLike(aConsultar);
        return null;
    }

    @Override
    public List<NoteDTO> getAll() {
        List<Note> lista = noteRepository.findAll();
        if(lista.isEmpty()) {
            return null;
        }else{
            return NoteDTO.getAllNoteDTO(lista);
        }
    }


}
