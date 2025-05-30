package com.example.first.controller;

import com.example.first.model.Student;
import com.example.first.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    final StudentService ss;

    public StudentController(StudentService ss) {
        this.ss = ss;
    }

    @GetMapping
    public List<Student> getStudents() {
        return ss.getAllStudents();
    }

    @PostMapping
    public void addStudent(@RequestBody Student s) {
        ss.addStudents(s); // ✅ Fix method name
    }

    @DeleteMapping("/{rno}")
    public void deleteStudent(@PathVariable Integer rno) {
        ss.deleteByRno(rno); // ✅ Fix method name
    }
}
