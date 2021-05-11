package com.example.appBack.Student.Entity.Output;

import com.example.appBack.Student.Entity.Student;
import com.example.appBack.Student.Entity.StudentDTO;
import com.example.appBack.Student.Entity.branch;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentOutputDTO
{
    private String id;

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @NotNull
    private String correo;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date fecha_entrada;

    @NotNull
    private String ciudad;

    @NotNull
    private int horas_semanales;

    @NotNull
    private String especialidad;

    @NotNull
    private Boolean estado;

    //--------------------NUEVOS-----------------------
    @NotNull
    private String correo_trabajo;

    private String comentarios;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date fecha_finalizacion;

    @NotNull
    branch branch;

    public static StudentOutputDTO getStudentOutputDTO(Student student){
        return new StudentOutputDTO(student.getId(),
                student.getNombre(),
                student.getApellido(),
                student.getCorreo(),
                student.getFecha_entrada(),
                student.getCiudad(),
                student.getHoras_semanales(),
                student.getEspecialidad(),
                student.getEstado(),
                student.getCorreo_trabajo(),
                student.getComentarios(),
                student.getFecha_finalizacion(),
                student.getBranch());
    }

    public static List<StudentOutputDTO> getAllDTO(List<Student> listStudent){
        List<StudentOutputDTO> devolver = new ArrayList<>();
        listStudent.forEach(student -> devolver.add(getStudentOutputDTO(student)));
        return devolver;
    }
}
