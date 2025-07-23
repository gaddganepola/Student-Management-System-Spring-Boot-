package com.springjdbc.SpringJDBCDemo.repo;

import com.springjdbc.SpringJDBCDemo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    public void save(Student s) {
        System.out.println("student saved");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
