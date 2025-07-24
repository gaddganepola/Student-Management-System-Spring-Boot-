package com.springjdbc.SpringJDBCDemo.service;

import com.springjdbc.SpringJDBCDemo.model.Student;
import com.springjdbc.SpringJDBCDemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public Student getStudentById(int rollno) {
        return repo.findStudent(rollno);
    }

    public void addStudent(Student s) {
        repo.save(s);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void deleteStudent(int rollno) {
        repo.delete(rollno);
    }
}
