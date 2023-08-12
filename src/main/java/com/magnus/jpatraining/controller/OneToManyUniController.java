package com.magnus.jpatraining.controller;

import com.magnus.jpatraining.oneToManyUniModel.Student;
import com.magnus.jpatraining.oneToManyUniModel.University;
import com.magnus.jpatraining.oneTomanyUniRepository.StudentRepository;
import com.magnus.jpatraining.oneTomanyUniRepository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class OneToManyUniController {

    @Autowired
    UniversityRepository universityRepository;


    @GetMapping("/saveData")
    public void saveData(){
        Student st = new Student("001");
        Student st1 = new Student("002");

        List<Student> studentList = Arrays.asList(st,st1);

        University university =  new University("Osmania",studentList);
        universityRepository.save(university);


    }

    @GetMapping("/getData/{id}")
    public ResponseEntity<University> getData(@PathVariable Long id){

        return  new ResponseEntity<University>(universityRepository.findById(id).get(), HttpStatus.OK);


    }
}
