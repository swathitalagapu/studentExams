package com.example.studentExams.controller;

import com.example.studentExams.entity.Subject;
import com.example.studentExams.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/subjects"})
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @PostMapping("/student/{studentId}/subject")
    public ResponseEntity<Subject> AddSubjects(@PathVariable int studentId, @RequestBody Subject subject){
        Subject sub = subjectService.createSubject(studentId, subject);
        return new ResponseEntity<Subject>(subject , HttpStatus.OK);
    }


    @GetMapping("/getAllMarksByExamType/{examType}")
    public List<Subject> getAllMarksByExamType(@PathVariable String examType){
        return subjectService.getAllMarksByExamType(examType);
    }

    @GetMapping("/getAllSubjects")
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

}
