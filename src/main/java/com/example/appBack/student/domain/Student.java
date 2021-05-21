package com.example.appBack.student.domain;

import com.example.appBack.student.domain.noDatabase.BranchEnum;
import lombok.*;

import java.util.Date;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String idStudent;
    private String name;
    private String surname;
    private String companyEmail;
    private String personalEmail;
    private String city;
    private Integer numHoursWeek;
    private String coments;
    private BranchEnum branchEnum;
    private Boolean active;
    private Date createdDate;
    private Date terminationDate;
    private StudentJPA studentJpa;


    public Student(StudentJPA studentJPA) {
        if(studentJpa == null) return;

        this.studentJpa = studentJpa;

        this.setIdStudent(studentJPA.getIdStudent());
        this.setName(studentJPA.getName());
        this.setSurname(studentJPA.getSurname());
        this.setCompanyEmail(studentJPA.getCompanyEmail());
        this.setPersonalEmail(studentJPA.getPersonalEmail());
        this.setCity(studentJPA.getCity());
        this.setNumHoursWeek(studentJPA.getNum_hours_week());
        this.setComents(studentJPA.getComents());
        this.setBranchEnum(studentJPA.getBranchEnum());
        this.setActive(studentJPA.getActive());
        this.setCreatedDate(studentJPA.getCreatedDate());
        this.setTerminationDate(studentJPA.getTerminationDate());
    }

    public void update(Student newStudent) {
        this.setIdStudent(newStudent.getIdStudent());
        this.setName(newStudent.getName());
        this.setSurname(newStudent.getSurname());
        this.setCompanyEmail(newStudent.getCompanyEmail());
        this.setPersonalEmail(newStudent.getPersonalEmail());
        this.setCity(newStudent.getCity());
        this.setNumHoursWeek(newStudent.getNumHoursWeek());
        this.setComents(newStudent.getComents());
        this.setBranchEnum(newStudent.getBranchEnum());
        this.setActive(newStudent.getActive());
        this.setCreatedDate(newStudent.getCreatedDate());
        this.setTerminationDate(newStudent.getTerminationDate());
    }


}
