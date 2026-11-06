package com.saha.JPARelationship.controller;

import com.saha.JPARelationship.model.Department;
import com.saha.JPARelationship.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@RestController
@RestMapping("/api/department")
public class DepartmentController {

    DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<String> createDepartment(
            @RequestBody Department department) {

        departmentService.createDepartment(department);
        return ResponseEntity.ok("DONE");
    }

    @PostMapping("/withStudent")
    public ResponseEntity<String> createDepartment(
            @RequestBody Department department,
            @RequestParam String studentName
    ) {

        departmentService.createDepartment(department, studentName);
        return ResponseEntity.ok("DONE");
    }
}
