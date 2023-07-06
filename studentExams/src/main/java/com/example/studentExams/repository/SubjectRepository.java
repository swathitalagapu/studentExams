package com.example.studentExams.repository;

import com.example.studentExams.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    List<Subject> findByExamType(String examType);
}
