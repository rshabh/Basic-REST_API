package com.example.first.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    
    private String name;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rno;

    Student(){};

    public Student(String name, Integer rno){
        this.name = name;
        this.rno = rno;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getRno(){
        return this.rno;
    }

    public void setRno(Integer rno){
        this.rno = rno;
    }



}
