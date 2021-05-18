package com.example.appBack.Student.repositorio.note;

import com.example.appBack.Student.Entity.Note;
import com.example.appBack.Student.Entity.NoteDTO;
import java.util.List;

public interface ServicioNote {

    Note addNote(NoteDTO ndto);

    NoteDTO getNote(String id);

    NoteDTO deleteNote(String id);

    Note updateNote(String id, NoteDTO ndto);

    List<NoteDTO> getConsultaCampo(NoteDTO aConsultar);

    List<NoteDTO> getAll();


}
