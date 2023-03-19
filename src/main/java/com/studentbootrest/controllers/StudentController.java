package com.studentbootrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentbootrest.entities.Student;
import com.studentbootrest.services.StudentService;

@RestController
public class StudentController {
    
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){
        try{
            return ResponseEntity.ok().body((List<Student>) service.getAllStudents());
        }
        catch(Exception e){
            return ResponseEntity.noContent().build();
        }
    }

}
