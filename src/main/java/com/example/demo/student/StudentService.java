package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> studentsList = List.of(new Student(1L, "Mike", 30, LocalDate.of(1991, 6, 5) ,"Mike@exampl.com"));
    
    public List<Student> getAllStudent() {
        System.out.println(studentsList);

        return studentsList;
    }


    public void createUser(Student newStudent) {
        System.out.println(newStudent);
    }
}
