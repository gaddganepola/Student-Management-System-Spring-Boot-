package com.springjdbc.SpringJDBCDemo;

import com.springjdbc.SpringJDBCDemo.model.Student;
import com.springjdbc.SpringJDBCDemo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Student s1 = context.getBean(Student.class);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s1);

		List<Student> students = service.getAllStudents();
		System.out.println(students);

	}

}
