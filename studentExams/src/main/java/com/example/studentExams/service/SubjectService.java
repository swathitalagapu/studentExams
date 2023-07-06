package com.example.studentExams.service;

import com.example.studentExams.dto.StudentMarks;
import com.example.studentExams.entity.Student;
import com.example.studentExams.entity.Subject;
import com.example.studentExams.repository.StudentRepository;
import com.example.studentExams.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    StudentRepository studentRepository;

    public List<Subject> getAllMarksByExamType(String examType) {
        return subjectRepository.findByExamType(examType);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Subject createSubject(int studentId, Subject subject) {

        Subject subject1 = studentRepository.findById(studentId).map(student -> {
            int subjectId = subject.getId();
//           int sub = subject.getEnglish() + subject.getMaths() + subject.getScience() + subject.getSocial();
//           int avg = sub/4;
            return subjectRepository.save(subject);
        }).orElseThrow(() -> new RuntimeException("no data" + studentId));

        return subject1;
    }

    public List<StudentMarks> getMarksByRollNo(int studentId) {
//        public List<StudentMarks> getMarksByRollNo(int studentId) {
        Optional<Student> student = studentRepository.findById(studentId);
        if (student.isPresent()) {
        List<StudentMarks> studentMarks = studentRepository.getMarksByRollNo(studentId);
        System.out.println(studentMarks);
        return studentMarks;
    }
        return null;
    }

}
