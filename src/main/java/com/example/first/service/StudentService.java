package com.example.first.service;

import com.example.first.model.Student;
import com.example.first.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public void addStudents(Student student) {
        repo.save(student);
    }

    public void deleteByRno(Integer rno) {
        repo.deleteById(rno);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
