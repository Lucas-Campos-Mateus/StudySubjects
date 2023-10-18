package com.minhamateria.StudySubjects.controller;

import com.minhamateria.StudySubjects.domain.model.ElectiveSubject;
import com.minhamateria.StudySubjects.domain.repository.ElectiveSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/elective_subject")
public class ElectiveSubjectController {

    @Autowired
    private ElectiveSubjectRepository repository;

    @GetMapping
    public ResponseEntity getAllElectiveSubject (){
        var allElectiveSubject = repository.findAllByActiveTrue();
        return ResponseEntity.ok(allElectiveSubject);
    }
}
