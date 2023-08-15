package com.magnus.jpatraining.controller;

import com.magnus.jpatraining.manyToManyModel.StudentCollege;
import com.magnus.jpatraining.manyTomanyRepository.CourseRepository;
import com.magnus.jpatraining.manyTomanyRepository.StudentCollegeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ManyToManyController {

    @Autowired
    StudentCollegeRepository studentRepository_st;

    @Autowired
    CourseRepository courseRepository;

    @PostMapping("/studentCourse")
    public StudentCollege saveStudent(@RequestBody StudentCollege st){
     return studentRepository_st.save(st);
    }

    public List<StudentCollege> getStudents()
    {
return  studentRepository_st.findAll();
    }


}
