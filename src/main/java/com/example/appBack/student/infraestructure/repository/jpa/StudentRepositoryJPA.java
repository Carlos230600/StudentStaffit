package com.example.appBack.student.infraestructure.repository.jpa;

import com.example.appBack.student.domain.StudentJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoryJPA extends JpaRepository<StudentJPA, String> { }
