package com.example.studentExams.service;

import com.example.studentExams.entity.Student;
import com.example.studentExams.entity.Subject;
import com.example.studentExams.repository.StudentRepository;
import com.example.studentExams.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    SubjectRepository subjectRepository;


    public Student createStudent(Student student) {
        return studentRepository.save(student);

    }

    public Student getStudentDetails( int studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    public Map<String, Object> getStudentMarks( int studentId) {
        Map<String, Object> result = new HashMap<>();
        Student student = studentRepository.findById(studentId).orElse(null);
        if (student != null) {
            List<Subject> subjects = student.getSubjects();
            int totalMarks = 0;
            for (Subject subject : subjects) {
                totalMarks += subject.getEnglish() + subject.getMaths() + subject.getScience() + subject.getSocial();
            }
            int averageMarks = totalMarks / subjects.size();
            result.put("student", student);
            result.put("totalMarks", totalMarks);
            result.put("averageMarks", averageMarks);
        }
        return result;
    }

    public List<Student> getAllStudentsDetails() {
        return studentRepository.findAll();
    }

    public Student getClassTopper(){
        return studentRepository.getClassTopper();
    }


}








