package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    private Integer id;
    private String name;
    private Integer bdd;
    private Integer ages;

}
