package com.codsoft.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEnrollment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EnrollmentID")
	private Long studentEnrollementId;
	
	
	private Student student;
	
	private Course course;
	
	private LocalDate enrollmentDate;
	
}
