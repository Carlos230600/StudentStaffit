package com.example.appBack.Student.repositorio.study;

import com.example.appBack.Student.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudyRepository extends JpaRepository<Study,String> {

}
