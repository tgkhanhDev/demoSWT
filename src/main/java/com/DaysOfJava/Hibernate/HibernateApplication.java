package com.DaysOfJava.Hibernate;

import com.DaysOfJava.Hibernate.entity.Student;
import com.DaysOfJava.func.funcs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return runner -> {
//			createStudent(studentDAO);
			new funcs().getVehical(0);

//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudents(studentDAO);
		};

	}

}
