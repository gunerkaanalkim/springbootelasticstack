package com.kaanalkim.springbootelasticstack.repository;

import com.kaanalkim.springbootelasticstack.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author      : kaanalkim
 * Created On  : 29.01.2020
 **/
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
