package com.example.tutoria002.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutoria002.models.Student;
import com.example.tutoria002.services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @GetMapping
    public ResponseEntity<ArrayList<Student>> getAll(){
        return ResponseEntity.ok(studentServices.getAllStudents());
    }

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student ){
        return ResponseEntity.ok(studentServices.save(student));
    }

    @PutMapping
    public ResponseEntity<Student> update(@RequestBody Student student ){
        return ResponseEntity.ok(studentServices.update(student));
    }
    
}
