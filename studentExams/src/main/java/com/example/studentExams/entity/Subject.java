package com.example.studentExams.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Subject {
    @Id
    private int id;
    @Column
    private int english;
    @Column
    private int maths;
    @Column
    private int science;
    @Column
    private int social;
    @Column
    private String examType;
}