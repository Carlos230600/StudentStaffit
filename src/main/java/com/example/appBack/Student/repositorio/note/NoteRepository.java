package com.example.appBack.Student.repositorio.note;

import com.example.appBack.Student.Entity.Note;
import com.example.appBack.Student.Entity.NoteDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NoteRepository extends JpaRepository<Note,String> {
}
