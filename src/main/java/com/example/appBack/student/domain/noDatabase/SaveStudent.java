package com.example.appBack.student.domain.noDatabase;

import com.example.appBack.student.domain.Student;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class SaveStudent extends Student {
    public SaveStudent(Student student) {update(student);}
}
