package com.example.studentExams.service;

import com.example.studentExams.dto.StudentMarks;
import com.example.studentExams.entity.Student;
import com.example.studentExams.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);

    }

    public List<StudentMarks> getMarksByRollNo(int studentId) {
//        Optional<Student> student = studentRepository.findById(studentId);
//        if (student.isPresent()) {
            List<StudentMarks> studentMarks = studentRepository.getMarksByRollNo(studentId);
            System.out.println(studentMarks);
            return studentMarks;
        }
//        return null;
//    }
//
//    public StudentMarks getParticularStudent(int studentId) {
//        Optional<Student> student= studentRepository.findById(studentId);
//        if(student.isPresent()) {
//            return student;
//        }else{
//            return null;
//        }
//    }
}