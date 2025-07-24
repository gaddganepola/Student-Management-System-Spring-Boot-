package com.springjdbc.SpringJDBCDemo.repo;

import com.springjdbc.SpringJDBCDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public void save(Student s) {

        String sql = "INSERT INTO student (rollno, name, marks) VALUES (?, ?, ?)";

        int rows = jdbc.update(sql, s.getRollno(), s.getName(), s.getMarks());
        System.out.println(rows + " effected");
    }

    public List<Student> findAll() {

        String query = "SELECT * FROM student";

        RowMapper<Student> mapper = (rs, rowNum) -> {
                Student s = new Student();
                s.setRollno(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
        };

        return jdbc.query(query, mapper);
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}
