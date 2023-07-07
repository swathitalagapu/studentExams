package com.example.studentExams.controller;

import com.example.studentExams.entity.Student;
import com.example.studentExams.entity.Subject;
import com.example.studentExams.repository.StudentRepository;
import com.example.studentExams.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/{studentId}")
    public Student getStudentDetails(@PathVariable int studentId) {
        return studentService.getStudentDetails(studentId);
    }

    @GetMapping("student/{studentId}/marks")
    public Map<String, Object> getStudentMarks(@PathVariable int studentId) {
        return studentService.getStudentMarks(studentId);
    }

    @GetMapping("/getAllStudentDetails")
    public List<Student> getAllStudentsDetails() {
        return studentService.getAllStudentsDetails();
    }

    @GetMapping("/getClassTopper")
    public Student getClassTopper() {
        return studentService.getClassTopper();
    }


}