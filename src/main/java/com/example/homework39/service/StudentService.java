package com.example.homework39.service;

import com.example.homework39.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {
    public List<Student> getStudents() {
        List<Student> students = List.of(
            new Student("John", "Doe", 20, 1, 1),
            new Student("Jane", "Smith", 21, 2, 1),
            new Student("Jack", "Doen", 22, 3, 5)
        );
        return students;
    }

}
