package com.example.appBack.student.infraestructure.controller.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentOutputDTO {

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
    private String createdDate;
    private String terminationDate;



    public StudentOutputDTO(Student student) {
        this.setIdStudent(student.getIdStudent());
        this.setName(student.getName());
        this.setSurname(student.getSurname());
        this.setCompanyEmail(student.getCompanyEmail());
        this.setPersonalEmail(student.getPersonalEmail());
        this.setCity(student.getCity());
        this.setNumHoursWeek(student.getNumHoursWeek());
        this.setComents(student.getComents());
        this.setBranchEnum(student.getBranchEnum());
        this.setActive(student.getActive());
        this.setCreatedDate(student.getCreatedDate());
        this.setTerminationDate(student.getTerminationDate());
    }


}
