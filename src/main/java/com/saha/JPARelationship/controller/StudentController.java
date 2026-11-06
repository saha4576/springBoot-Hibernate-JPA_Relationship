package com.saha.JPARelationship.controller;

import com.saha.JPARelationship.model.Department;
import com.saha.JPARelationship.model.Student;
import com.saha.JPARelationship.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestBody("/api/student")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<String> createStudent(
            @RequestBody Student student,
            @RequestParam Long deptId) {

        studentService.createStudent(student, deptId);
        return ResponseEntity.ok("DONE");
    }

    @PostMapping("/withDepartment")
    public ResponseEntity<String> createStudent(
            @RequestBody Student student,
            @RequestParam String deptName) {

        studentService.createStudent(student, deptName);
        return ResponseEntity.ok("DONE");
    }


}
