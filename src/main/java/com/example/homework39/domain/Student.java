package com.example.homework39.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Student {
    private String name;
    private String surname;
    private int age;
    private int id;
    private int courseId;
}
