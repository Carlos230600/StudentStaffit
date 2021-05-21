package com.example.appBack.student.infraestructure.controller.dto;

import com.example.appBack.student.domain.Student;
import com.example.appBack.student.domain.StudentJPA;
import com.example.appBack.student.domain.noDatabase.BranchEnum;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class StudentInputDTO {

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



    public Student InputToDTO(){
       return new Student("0",this.getName(),this.getSurname(),this.getCompanyEmail(),this.getPersonalEmail(),
                this.getCity(),this.getNumHoursWeek(),this.getComents(),this.getBranchEnum(),this.getActive(),
                this.getCreatedDate(),this.getTerminationDate(),new StudentJPA());

    }

}
