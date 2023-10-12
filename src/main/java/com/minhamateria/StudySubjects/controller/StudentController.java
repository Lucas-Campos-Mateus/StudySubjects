package com.minhamateria.StudySubjects.controller;

import com.minhamateria.StudySubjects.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public ResponseEntity getAllStudent (){
        var allStudent = repository.findAllByActiveTrue();
        return ResponseEntity.ok(allStudent);
    }
}
