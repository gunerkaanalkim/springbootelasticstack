package com.kaanalkim.springbootelasticstack.controller;

import com.kaanalkim.springbootelasticstack.model.Student;
import com.kaanalkim.springbootelasticstack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author      : kaanalkim
 * Created On  : 29.01.2020
 **/
@RestController
@RequestMapping("student")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        List<Student> students = this.studentService.findAll();

        return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
    }
}
