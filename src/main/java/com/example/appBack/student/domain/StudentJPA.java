package com.example.appBack.student.domain;

import com.example.appBack.student.domain.noDatabase.BranchEnum;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;
import org.hibernate.annotations.Parameter;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")
public class StudentJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estudiantes_seq")
    @GenericGenerator(
            name = "estudiantes_seq",
            strategy = "com.example.appBack.Student.Entity.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
                    @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "EST"),
                    @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d")
            })
    @NotNull
    @Column(name = "id_student")
    String idStudent;

    @NotNull
    @Column(name = "name", nullable = false)
    String name;

    @NotNull
    @Column(name = "surname", nullable = false)
    String surname;

    @NotNull
    @Column(name = "company_email", nullable = false)
    String companyEmail;

    @NotNull
    @Column(name = "personal_email", nullable = false)
    String personalEmail;

    @NotNull
    @Column(name = "city", nullable = false)
    String city;

    @NotNull
    @Column(name = "num_hours_week", nullable = false)
    Integer num_hours_week;

    @NotNull
    @Column(name = "coments")
    String coments;

    @NotNull
    @Column(name = "branch", nullable = false)
    BranchEnum branchEnum;

    @NotNull
    @Column(name = "active", nullable = false)
    Boolean active;

    @NotNull
    @Column(name = "created_date", nullable = false)
    Date createdDate;

    @NotNull
    @Column(name = "termination_date")
    Date terminationDate;


    public void setDatos(StudentJPA studentJPA){
        //id null
        this.setName(studentJPA.getName());
        this.setSurname(studentJPA.getSurname());
        this.setCompanyEmail(studentJPA.getCompanyEmail());
        this.setPersonalEmail(studentJPA.getPersonalEmail());
        this.setCity(studentJPA.getCity());
        this.setNum_hours_week(studentJPA.getNum_hours_week());
        this.setComents(studentJPA.getComents());
        this.setActive(studentJPA.getActive());
        this.setCreatedDate(studentJPA.getCreatedDate());
        this.setTerminationDate(studentJPA.getTerminationDate());
    }


    public void setDatos(Student student){
        //id null
        this.setName(student.getName());
        this.setSurname(student.getSurname());
        this.setCompanyEmail(student.getCompanyEmail());
        this.setPersonalEmail(student.getPersonalEmail());
        this.setCity(student.getCity());
        this.setNum_hours_week(student.getNumHoursWeek());
        this.setComents(student.getComents());
        this.setActive(student.getActive());
        this.setCreatedDate(student.getCreatedDate());
        this.setTerminationDate(student.getTerminationDate());
    }


    private void setName(String name) {
        if(comprobarString(name))
        {
            this.name = name;
        }
    }

    private void setSurname(String surname) {
        if(comprobarString(surname))
        {
            this.surname = surname;
        }
    }

    private void setCompanyEmail(String email) {
        if(comprobarString(email))
        {
            this.companyEmail = email;
        }
    }

    private void setPersonalEmail(String email) {
        if(comprobarString(email))
        {
            this.personalEmail = email;
        }
    }


    private void setCity(String city) {
        if(comprobarString(city))
        {
            this.city = city;
        }
    }

    private void setNum_hours_week(Integer num_hours_week) {
        if(comprobarNumbers(num_hours_week)){
            this.num_hours_week = num_hours_week;
        }
    }

    private void setActive(Boolean active) {
        if(comprobarObjects(active)) {
            this.active = active;
        }
    }

    private void setComents(String comnents) {
        if(comprobarString(comnents))
        {
            this.coments = comnents;
        }
    }

    private void setCreatedDate(Date createdDate) {
        if(comprobarFechas(createdDate)){
            this.createdDate = createdDate;
        }
    }

    private void setTerminationDate(Date terminationDate) {
        if(comprobarFechas(terminationDate)){
            this.terminationDate = terminationDate;
        }
    }

    private boolean comprobarString(String str)
    {
        try {
            if (str.trim().length() != 0 && str != null)
            {
                return true;
            }
        }catch (Exception e) { }
        return false;
    }

    private boolean comprobarFechas(Date fecha)
    {
        try {
            if (fecha != null) {
                return true;
            }

        }catch(Exception e){e.printStackTrace();}
        return false;
    }

    private boolean comprobarNumbers(Object num)
    {
        try
        {
            if(num != null && Double.parseDouble(num.toString()) > 0)
            {
                return true;
            }
        }
        catch (NumberFormatException e){}
        return false;
    }

    private boolean comprobarObjects(Object objeto)
    {
        try {
            if (objeto != null) {
                return true;
            }
        }catch(Exception e){ }
        return false;
    }


}
