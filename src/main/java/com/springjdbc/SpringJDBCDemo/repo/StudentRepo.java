package com.springjdbc.SpringJDBCDemo.repo;

import com.springjdbc.SpringJDBCDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public void save(Student s) {

        String sql = "INSERT INTO student (rollno, name, marks) VALUES (?, ?, ?)";

        jdbc.update(sql, s.getRollno(), s.getName(), s.getMarks());
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}
