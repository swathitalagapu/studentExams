package com.example.studentExams.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id
    private int id;
    @Column
    private String stuName;
    @Column
    private int rollNo;
    @Column
    private String section;

    @OneToMany(targetEntity = Subject.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private List<Subject> subjects;
}