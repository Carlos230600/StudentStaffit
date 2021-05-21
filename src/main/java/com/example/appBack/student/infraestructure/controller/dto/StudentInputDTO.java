package com.example.appBack.student.infraestructure.controller.dto;

import com.example.appBack.student.domain.noDatabase.BranchEnum;
import lombok.*;

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
    private String createdDate;
    private String terminationDate;


}
