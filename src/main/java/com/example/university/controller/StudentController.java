package com.example.university.controller;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.university.service.*;
import com.example.university.model.*;

@RestController
public class StudentController {

    @Autowired
    private StudentJpaService studentJpaService;

    @GetMapping("/students")
    public ArrayList<Student> getStudents() {
        return studentJpaService.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable("studentId") int studentId) {
        return studentJpaService.getStudentById(studentId);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentJpaService.addStudent(student);
    }

    @PutMapping("/students/{studentId}")
    public Student updateStudent(@PathVariable("studentId") int studentId, @RequestBody Student student) {
        return studentJpaService.updateStudent(studentId, student);
    }

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable("studentId") int studentId) {
        studentJpaService.deleteStudent(studentId);
    }

    @GetMapping("/students/{studentId}/courses")
    public List<Course> getStudentCourses(@PathVariable("studentId") int studentId) {
        return studentJpaService.getStudentCourses(studentId);
    }
}