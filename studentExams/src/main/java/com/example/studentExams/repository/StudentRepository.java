package com.example.studentExams.repository;

import com.example.studentExams.dto.StudentMarks;
import com.example.studentExams.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query("SELECT new com.example.studentExams.dto.StudentMarks(s.rollNo,sb.id,s.id, sb.english, sb.maths, sb.science, sb.social, sb.examType) FROM Student s JOIN s.subjects sb where sb.id =:id")
    public List<StudentMarks> getMarksByRollNo(@Param("id") int studentId);
}
