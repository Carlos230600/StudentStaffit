package com.example.appBack.Student.repositorio;

import com.example.appBack.Student.Entity.Student;
import com.example.appBack.Student.Entity.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.common.util.impl.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.util.*;
import java.util.concurrent.RecursiveTask;
import java.util.logging.Logger;

@Component
@Slf4j
public class ImServicioStudent implements ServicioStudent
{
    @Autowired
    StudentRepository studentRepository;

    private ArrayList<String> campos = new ArrayList<String>();

    @Override
    public Student addStudent(StudentDTO sdto)
    {
        try {

        if(!compararFechas(sdto)){
            //Fechas incorrectas
           log.debug("Fechas Incorrectas");
        }

        if(sdto.getCorreo()!=null){
            //Correo Existente
           log.debug("Correo Existente");
        }

        if(sdto.getNombre()!=null && sdto.getApellido()!=null){
           log.debug("Nombre y Apellidos existentes");
        }

            Student nuevoStudent = new Student(sdto);
            studentRepository.saveAndFlush(nuevoStudent);

            return nuevoStudent;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public StudentDTO getStudent(String id)
    {
        Optional<Student> estudiante = studentRepository.findById(id);
        if(!estudiante.isEmpty())
        {
            return StudentDTO.getStudentDTO(estudiante.get());
        }

        return null;
    }

    @Override
    public List<StudentDTO> getAll(){
        List<Student> lista = studentRepository.findAll();
        if(lista.isEmpty()) {
            return null;
        }else {
            return StudentDTO.getAllDTO(lista);
        }
    }

    @Override
    public StudentDTO deleteStudent(String id){
        if(studentRepository.existsById(id)==true) {
            Student student = studentRepository.getOne(id);
            studentRepository.deleteById(id);
            return StudentDTO.getStudentDTO(student);
        }
        return null;
    }

    @Override
    public Student updateStudent(String id, StudentDTO sdto){
        try {
        if(!studentRepository.existsById(id))
        {
           return null;
        }

        Student nuevoStudent = studentRepository.findById(id).get();
        nuevoStudent.setDatos(sdto);
        sdto = StudentDTO.getStudentDTO(nuevoStudent);

        if(!compararFechas(sdto))
        {
            //Fechas Incorrectas
               log.debug("Fechas incorrectas");
        }


        if(sdto.getCorreo()!=null)
        {
            //Correo Existente
                log.debug("Correo Existente");
        }


        if(sdto.getNombre()!=null && sdto.getApellido()!=null)
        {
            //Nombre y Apellidos Existentes
                log.debug("Nombre y Apellidos existentes");
        }


        studentRepository.saveAndFlush(nuevoStudent);
        return nuevoStudent;

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<StudentDTO> getConsultaCampo(StudentDTO aConsultar)
    {
        //return studentRepository.getQueryEquals(aConsultar);
        // studentRepository.getQueryLike(aConsultar);
        return null;
    }

    private boolean compararFechas(StudentDTO sdto)
    {
        try{
            Date fecha1 = sdto.getFecha_entrada();
            Date fecha2 = sdto.getFecha_finalizacion();

            if(fecha1 != null && fecha2 == null){
                return true;
            }
            if(fecha1 != null && fecha2 != null){
                return fecha1.before(fecha2);
            }

            return fecha1.before(fecha2);
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
