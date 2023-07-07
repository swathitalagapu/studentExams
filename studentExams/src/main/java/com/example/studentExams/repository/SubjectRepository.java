package com.example.studentExams.repository;

import com.example.studentExams.dto.StudentSubjectDTO;
import com.example.studentExams.entity.Student;
import com.example.studentExams.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    List<Subject> findByExamType(String examType);

}
