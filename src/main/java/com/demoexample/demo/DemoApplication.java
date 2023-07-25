package com.demoexample.demo;

import com.demoexample.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//@GetMapping
//	public String hello(){
//		return "Hello World";
//	}
//	@GetMapping
//	public List<Student> hello(){
//		return List.of(
//				new Student(
//						1L,
//						"Mudheera",
//						"mudheera@gmail.com",
//						LocalDate.of(2000, Month.JULY,5),
//						21
//				)
//		);
//	}
}
