package com.kaanalkim.springbootelasticstack.service.impl;

import com.kaanalkim.springbootelasticstack.model.Student;
import com.kaanalkim.springbootelasticstack.repository.StudentRepository;
import com.kaanalkim.springbootelasticstack.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author      : kaanalkim
 * Created On  : 29.01.2020
 **/
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = this.studentRepository.findAll();

        log.info("{} students were found", students.size());

        return students;
    }
}
