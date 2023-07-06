package com.example.studentExams.controller;

import com.example.studentExams.dto.StudentMarks;
import com.example.studentExams.entity.Student;
import com.example.studentExams.repository.StudentRepository;
import com.example.studentExams.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student) {
        Student student1 = studentService.createStudent(student);
        return student1;

    }
    @GetMapping("/getParticularStudent/{studentId}")
    public ResponseEntity<List<StudentMarks>> getParticularStudent(@PathVariable int studentId){
        List<StudentMarks> studentMarks =studentService.getMarksByRollNo(studentId);
        return new ResponseEntity<>(studentMarks, HttpStatus.OK);
    }
}