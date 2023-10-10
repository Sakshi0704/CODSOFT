package com.codsoft.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class StudentEnrollment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enrollmentID")
	private Long studentEnrollementId;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@Column(name = "studentID")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@Column(name = "courseID")
	private Course course;
	
	private LocalDate enrollmentDate;
	
}
