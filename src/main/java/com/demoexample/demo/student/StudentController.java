package com.demoexample.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
    @GetMapping
	public List<Student> getStudents(){
		return List.of(
				new Student(
						1L,
						"Mudheera",
						"mudheera@gmail.com",
						LocalDate.of(2000, Month.JULY,5),
						21
				)
		);
	}
}
