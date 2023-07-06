package com.example.studentExams.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentMarks {
    private int studentId;
    private int id;
    private int rollNo;
    private int english;
    private int maths;
    private int science;
    private int social;
    private String examType;
}
