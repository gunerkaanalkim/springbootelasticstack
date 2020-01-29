package com.kaanalkim.springbootelasticstack.model;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Author      : kaanalkim
 * Created On  : 29.01.2020
 **/
@Builder
@Entity(name = "Student")
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
}
