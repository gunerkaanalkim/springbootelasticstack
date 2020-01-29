package com.kaanalkim.springbootelasticstack.service;

import com.kaanalkim.springbootelasticstack.model.Student;

import java.util.List;

/**
 * Author      : kaanalkim
 * Created On  : 29.01.2020
 **/
public interface StudentService {
    List<Student> findAll();
}
